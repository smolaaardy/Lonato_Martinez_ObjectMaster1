package com.codingdojo.dnd;

public class Human {
	public int strength;
	public int stealth; 
	public int intelligence; 
	public int health; 
	public Human() {
		this.health = 100;
		this.stealth = 3;
		this.strength = 3;
		this.intelligence = 3;
	}
	
	public Human attack(Human h) {
		System.out.println("Attack!");
		h.health -= strength;
		System.out.println("The defender has " + h.health + " " + "health left!");
		return this;
	}

}
