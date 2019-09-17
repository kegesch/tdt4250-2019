package no.tdt4250.conversion.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

import org.osgi.service.component.annotations.*;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardServletPattern;

@Component
@HttpWhiteboardServletPattern("/conversion/*")
public class ConversionServlet extends HttpServlet implements Servlet {

	private static final long serialVersionUID = 1L;
	
	private 

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fromUnit = request.getParameter("from");
		String toUnit = request.getParameter("to");
		double value = Double.parseDouble(request.getParameter("value"));
		
		response.setContentType("text/plain");
		PrintWriter writer = response.getWriter();
		writer.print(value);
	}

}