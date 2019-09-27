package no.tdt4250.conversion.api;

public abstract class BaseUnit implements Unit {
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Unit) {
			Unit other = (Unit) obj;
			return getName().equals(other.getName()) && getSymbol().equals(other.getSymbol());
		} 
		return false;
	}
}
