package overrideObjectClassequalsMethod2;

public class Building {
	public String name;
	public String face;
	public int years;
	public int cost;
	public int floors;
	public int area;
	public int lifts;
	public int bedrooms;
	public Building() {}
	public Building(String name, String face, int years, int cost, int floors, int area, int lifts, int bedrooms) 
	{
		this.name = name;
		this.face = face;
		this.years = years;
		this.cost = cost;
		this.floors = floors;
		this.area = area;
		this.lifts = lifts;
		this.bedrooms = bedrooms;
	}
	public String toString() 
	{
		return "Building [name=" + name + ", face=" + face + ", years=" + years + ", cost=" + cost + ", floors="
				+ floors + ", area=" + area + ", lifts=" + lifts + ", bedrooms=" + bedrooms + "]";
	}
	public boolean equals(Object obj) 
	{
		Building b = (Building) obj;
		return this.years == b.years;
	}
	
}
