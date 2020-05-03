package service;
import animal_entities.*;

import plant_entities.*;
import java.util.List;
import java.util.ListIterator.*;



public class ForestNoteBook {
	private List<Carnivore> carnivores;
	private List<Omnivore> omnivores;
	private List<Herbivore> herbivores;
	private int plantCount;
	private int animalCount;
	private List<Animal> animals;
	private List<Plant> plants;
	
	public ForestNoteBook() {
		
	}
	
	public List<Carnivore> getCarnivores() {
		return carnivores;
	}
	
	public void setCarnivores(List<Carnivore> carnivores) {
		this.carnivores = carnivores;
	}
	
	public List<Omnivore> getOmnivores() {
		return omnivores;
	}
	
	public void setOmnivores(List<Omnivore> omnivores) {
		this.omnivores = omnivores;
	}
	
	public List<Herbivore> getHerbivores() {
		return herbivores;
	}
	
	public int getPlantCount() {
		return plantCount;
	}
	
	public int getAnimalCount() {
		return animalCount;
	}
	
	public void addAnimal(Animal animal) {
		this.animals.add(animal);
	}
	
	public void addPlant(Plant plant){
			this.plants.add(plant);
	}
	
	public void printNotebook() {
		
		for(Animal a: this.animals) {
			System.out.println(a);
			}
		
		for(Plant p: this.plants) {
		System.out.println(p);
		}	
			
	}
	
	public void sortAnimalsByName() {//ordre naturel//
		
	}
	
	public void sortPlantsByName() {
		
	}

//ToString??
	
}
	 


