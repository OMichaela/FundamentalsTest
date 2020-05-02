package animal_entities;
import  plant_entities.*; 

import java.util.Set;

public class Herbivore extends Animal {
	
	private Set<Plant> plantDiet;

	public Herbivore(String name) {
		super(name);
	}
	
	public Herbivore(String name, double weight, double height, double length) {
		super(name,weight,height,length);
	}
	
	public Set<Plant> getPlantDiet(){
		return plantDiet;
	}
	
	public void setPlantDiet(Set<Plant> plantDiet) {
		this.plantDiet= plantDiet;
	}
	
	public void addPlantToDiet(Plant p) {
		this.plantDiet.add(p);
	}
	
	public void printDiet() {
		for(Plant p: plantDiet)
		System.out.println(p);
	}
	
	@Override
	public String toString() {
		return "Herbivore [plantDiet=" + plantDiet + "]";
	}
}
