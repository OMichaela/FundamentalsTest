package plant_entities;

public abstract class Plant {

	private final String name;
	private double height;
	
	public Plant(String name) {
		this.name = name;
	}
	
	public Plant(String name, double height) {
		this(name); this.height = height;
	}
	
	public String getName() {
		return name;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
}
