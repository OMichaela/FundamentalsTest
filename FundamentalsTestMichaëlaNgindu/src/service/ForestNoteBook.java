package service;

import animal_entities.*;

import plant_entities.*;
import java.util.List;
import java.util.ListIterator.*;
import java.util.Comparator;

public class ForestNoteBook {
	private List<Carnivore> carnivores;
	private List<Omnivore> omnivores;
	private List<Herbivore> herbivores;
	private int plantCount;
	private int animalCount;
	private List<Animal> animals;
	private List<Plant> plants;
	public Object getAnimalCount;

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

	public void addPlant(Plant plant) {
		this.plants.add(plant);
	}

	public void printNotebook() {

		for (Animal a : this.animals) {
			System.out.println(a);
		}

		for (Plant p : this.plants) {
			System.out.println(p);
		}

	}

	public void sortAnimalsByName() {
		if (animal.this.name.equals(Animal.getname)) remove Animal.getname.remove();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + animalCount;
		result = prime * result + ((animals == null) ? 0 : animals.hashCode());
		result = prime * result + ((carnivores == null) ? 0 : carnivores.hashCode());
		result = prime * result + ((getAnimalCount == null) ? 0 : getAnimalCount.hashCode());
		result = prime * result + ((herbivores == null) ? 0 : herbivores.hashCode());
		result = prime * result + ((omnivores == null) ? 0 : omnivores.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ForestNoteBook other = (ForestNoteBook) obj;
		if (animalCount != other.animalCount)
			return false;
		if (animals == null) {
			if (other.animals != null)
				return false;
		} else if (!animals.equals(other.animals))
			return false;
		if (carnivores == null) {
			if (other.carnivores != null)
				return false;
		} else if (!carnivores.equals(other.carnivores))
			return false;
		if (getAnimalCount == null) {
			if (other.getAnimalCount != null)
				return false;
		} else if (!getAnimalCount.equals(other.getAnimalCount))
			return false;
		if (herbivores == null) {
			if (other.herbivores != null)
				return false;
		} else if (!herbivores.equals(other.herbivores))
			return false;
		if (omnivores == null) {
			if (other.omnivores != null)
				return false;
		} else if (!omnivores.equals(other.omnivores))
			return false;
		return true;
	}

	public void sortPlantsByName() {

	}

}
