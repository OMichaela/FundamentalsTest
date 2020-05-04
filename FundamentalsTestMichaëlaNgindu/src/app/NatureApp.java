package app;

import plant_entities.*;
import animal_entities.*;
import service.*;


public class NatureApp {

	public static void main(String[] args) {
		 String elm = "Elm";
		 String weed ="Weed";
		 String beech = "Beech";
		 String raspberryBush="RaspberryBush";
		 String wisteria= "Wisteria";
		 String roeDeer= "RoeDeer";
		 String goat= "Goat";
		 String wolf= "Wolf";
		 String squirrel="Squirrel";
		 String fox="Fox";
		 String hare="Hare";
		 String lynx="Lynx";
		 String boar="Boar";
		 String hedgehog="Hedgehog";
		
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
	herbivore1.addPlantToDiet(weed1);
	herbivore1.addPlantToDiet(flower);
	natureDiary.addAnimal(herbivore1);
	
	Herbivore herbivore2 = new Herbivore(goat, 40, 54, 90);
	herbivore2.addPlantToDiet(weed1);
	herbivore2.addPlantToDiet(bush);
	natureDiary.addAnimal(herbivore2);
	
	Herbivore herbivore3 = new Herbivore(hare, 5, 53, 53);
	herbivore3.addPlantToDiet(bush);
	natureDiary.addAnimal(herbivore3);
	
	Omnivore omnivore1 = new Omnivore(squirrel, 0.600, 21, 40);
	omnivore1.addPlantToDiet(weed1);
	omnivore1.setMaxFoodSize(0.600);
	natureDiary.addAnimal(omnivore1);
	
	Omnivore omnivore2 = new Omnivore(fox, 7, 45, 90);
	omnivore2.addPlantToDiet(tree2);
	omnivore2.setMaxFoodSize(0.500);
	natureDiary.addAnimal(omnivore2);
	
	Omnivore omnivore3 = new Omnivore(boar, 90, 110, 190);
	omnivore3.addPlantToDiet(tree1);
	omnivore3.setMaxFoodSize(1.5);
	natureDiary.addAnimal(omnivore3);
	
	
	int AnimalCount = natureDiary.getAnimalCount();
	
		System.out.println("Number of Animals is:"+ AnimalCount);

	
	int PlantCount = natureDiary.getPlantCount();
		
		System.out.println("Number of Plants is:"+ PlantCount);
			
		natureDiary.printNotebook();	
		
			
			for(Carnivore c: natureDiary.getCarnivores())
				System.out.println(c);
			
			for(Omnivore o: natureDiary.getOmnivores())
				System.out.println(o);
			
			for(Herbivore h: natureDiary.getHerbivores())
				System.out.println(h);
			
		
				
			natureDiary.sortAnimalsByName();
				
			System.out.println("Sort Animals by name");
			
			
			natureDiary.sortPlantsByName();
			
			System.out.println("Sort Plants by name");
			

}}