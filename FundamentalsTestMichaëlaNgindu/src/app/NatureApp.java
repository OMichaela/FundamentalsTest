package app;

import java.util.List.*;
import java.util.Set.*;
import plant_entities.*;
import animal_entities.*;
import service.*;
import java.util.Scanner;
import java.util.Set;

public class NatureApp {
	 
	public static void main(String[] args) {
		 String elm, weed, beech, raspberryBush, wisteria;
		 String roeDeer,goat,wolf,squirrel,fox,hare,lynx, boar, hedgehog;
		
		ForestNoteBook natureDiary = new ForestNoteBook();
		
		
	Bush bush = new Bush(raspberryBush,200);
	bush.setFruit("raspberry");
	bush.setLeafType(LeafType.ROUND);
	natureDiary.addPlant(bush);
	
	Weed weed1 = new Weed(weed, 2);
	weed1.setArea(40);
	natureDiary.addPlant(weed1);
	
	Flower flower = new Flower(wisteria, 10);
	flower.setSmell(Scent.SWEET);
	natureDiary.addPlant(flower);
	
	Tree tree1 = new Tree(elm, 30);
	tree1.setLeafType(LeafType.ROUND);
	natureDiary.addPlant(tree1);
	
	Tree tree2 = new Tree(beech, 30);
	tree2.setLeafType(LeafType.ROUND);
	natureDiary.addPlant(tree2);
	
	Carnivore carnivore1 = new Carnivore(lynx, 2, 70, 130);
	carnivore1.setMaxFoodSize(2);
	natureDiary.addAnimal(carnivore1);
	
	Carnivore carnivore2 = new Carnivore(hedgehog, 1, 13, 25);
	carnivore2.setMaxFoodSize(0.15);
	natureDiary.addAnimal(carnivore2);
	
	Carnivore carnivore3 = new Carnivore(wolf, 80, 80, 180);
	carnivore3.setMaxFoodSize(4);
	natureDiary.addAnimal(carnivore3);
	
	Herbivore herbivore1 = new Herbivore(roeDeer, 22, 65, 110);
	herbivore1.setPlantDiet(weed1);
	natureDiary.addAnimal(herbivore1);
	
	Herbivore herbivore2 = new Herbivore(goat, 40, 54, 90);
	herbivore2.setPlantDiet(weed1);
	natureDiary.addAnimal(herbivore2);
	
	Herbivore herbivore3 = new Herbivore(hare, 5, 53, 53);
	herbivore3.setPlantDiet(plantDiet);
	natureDiary.addAnimal(herbivore3);
	
	Omnivore omnivore1 = new Omnivore(squirrel, 0.600, 21, 40);
	omnivore1.setPlantDiet(plantDiet);
	omnivore1.setMaxFoodSize(0.600);
	natureDiary.addAnimal(omnivore1);
	
	Omnivore omnivore2 = new Omnivore(fox, 7, 45, 90);
	omnivore2.setPlantDiet();
	omnivore2.setMaxFoodSize(0.500);
	natureDiary.addAnimal(omnivore2);
	
	Omnivore omnivore3 = new Omnivore(boar, 90, 110, 190);
	omnivore3.setPlantDiet(plantDiet);
	omnivore3.setMaxFoodSize(1.5);
	natureDiary.addAnimal(omnivore3);
	
	

	//1) Nombre de plantes et d'animaux rencontrés//
	natureDiary.getAnimalCount();
		System.out.println("Number of Animals is:"+'getAnimalCount');
	}
	
	natureDiary.getPlantCount();{
		System.out.println("Number of Plants is:"+'getPlantCount');
	}
	
	//2) Liste pas triée des animaux et plantes(Set), methode printNotebook van Notebook instantie
			
		natureDiary.printNotebook.size();	
			
	//3) Print lijsten séparées de Carnivores, omnivores et herbivores.//	
		
			natureDiary.List<carnivores>.getCarnivores();{
			
			System.out.println("Please find the Carnivores'List" +'Carnivores');
			}
			
			natureDiary.getOmnivores();{
			
			System.out.println("PLease find the Omnivores'List:"+);
			}
			
			natureDiary.getHerbivores();{
			System.out.println("Please find the Herbivores'List:"+);
			}
			
			//4)Trier les animaux et les plantes sortAnimalsByName et SortPlantsByName de l'instance Notebook//		
			
			natureDiary.getPlants.sortPlantsByName(){
				
			System.out.println("Sort Plants by name");
			}
			
			natureDiary.getAnimals.sortAnimalsByName(){
			
			System.out.println("Sort Animals by name");
			}
			
			//5) Liste triée des animaux et plantes (List)
					Sort Plants by name
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


























	private void forEach(Object object) {
		// TODO Auto-generated method stub
		
	}

}
}