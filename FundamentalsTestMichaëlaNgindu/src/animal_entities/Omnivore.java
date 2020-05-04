package animal_entities;
import plant_entities.*;

import java.util.HashSet;
import java.util.Set;

public class Omnivore extends Animal{

		private Set<Plant> plantDiet = new HashSet<>();
		private double maxFoodSize;
		
		
		public Omnivore(String name) {
			super(name);
		}
		
		public Omnivore(String name, double weight, double height, double length) {
			super(name, weight, height, length);
		}
		
		public Set<Plant> getPlantDiet(){
			return plantDiet;
		}
		
		public void setPlantDiet(Set<Plant> plantDiet) {
			this.plantDiet= plantDiet;
		}
		
		public double getMaxFoodSize() {
			return maxFoodSize;
		}
		
		public void setMaxFoodSize(double maxFoodSize) {
			this.maxFoodSize = maxFoodSize;
		}
		
		 public void addPlantToDiet(Plant p) { 
			 this.plantDiet.add(p);
		 }
		 
		 

		@Override
		public String toString() {
			return "Omnivore [plantDiet=" + plantDiet + ", maxFoodSize=" + maxFoodSize + "]";
		}
}
