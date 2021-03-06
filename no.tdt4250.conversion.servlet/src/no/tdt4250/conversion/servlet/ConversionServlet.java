package no.tdt4250.conversion.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

import org.osgi.service.component.annotations.*;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardServletPattern;

import no.tdt4250.conversion.api.Conversion;
import no.tdt4250.conversion.api.ConversionRepository;
import no.tdt4250.conversion.api.ConversionResult;
import no.tdt4250.conversion.api.Converter;

@Component
@HttpWhiteboardServletPattern("/conversion/*")
public class ConversionServlet extends HttpServlet implements Servlet {

	private static final long serialVersionUID = 1L;

	private Converter converter;
	private ConversionRepository conversions = new ConversionRepository();
	
	@Reference
	public void setConverter(Converter converter) {
		System.out.println("Using converter " + converter.getClass().getName());
		this.converter = converter;
		this.converter.setRepository(conversions);
	}
	
	@Reference(
			cardinality = ReferenceCardinality.MULTIPLE,
			policy = ReferencePolicy.DYNAMIC,
			bind = "addConversion",
			unbind = "removeConversion"
	)
	public void addConversion(Conversion conversion) {
		System.out.println("Added Conversion: " +  conversion.getFromUnit().getName() + "-" + conversion.getToUnit().getName());
		System.out.println(conversions);
		conversions.addConversion(conversion);
	}
	
	public void removeConversion(Conversion conversion) {
		System.out.println("Removed Conversion");
		conversions.removeConversion(conversion);
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameterMap().containsKey("from") && 
				request.getParameterMap().containsKey("to") &&
				request.getParameterMap().containsKey("value")) {
			String fromUnit = request.getParameter("from");
			String toUnit = request.getParameter("to");
			double value = Double.parseDouble(request.getParameter("value"));
			ConversionResult convertedValue = converter.convertValue(value, fromUnit, toUnit);
			response.setContentType("text/plain");
			PrintWriter writer = response.getWriter();
			if(convertedValue.isSuccess()) {
				writer.print("Converted Value: " + convertedValue.getConvertedValue() + convertedValue.getToUnit().getSymbol());
			} else {
				response.sendError(404, "Could not convert value!");
			}
		} else {
			response.sendError(400, "Please specify parameters 'from', 'to' and 'value'.");
		}
	}

}