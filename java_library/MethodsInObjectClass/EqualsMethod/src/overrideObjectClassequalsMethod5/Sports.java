package overrideObjectClassequalsMethod5;

public class Sports {
	public String name;
	public String type;
	public String place;
	public int players;
	public Sports() {}
	public Sports(String name, String type, String place, int players) 
	{
		this.name = name;
		this.type = type;
		this.place = place;
		this.players = players;
	}
	public String toString()
	{
		String res = "Sports Name is : "+this.name+", its Type is : "+this.type+", Number of Players are : "+this.players+" and place is : "+this.place;
		return res;
	}
	public boolean equals(Object obj)
	{
		Sports s = (Sports) obj;
		return this.place == s.place;
	}
}
