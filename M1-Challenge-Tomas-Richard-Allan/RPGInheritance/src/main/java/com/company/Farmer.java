package com.company;

public class Farmer extends Character {

    boolean plowing = false;
    boolean harvesting = false;

    public Farmer(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, boolean attackAnotherCharacter())

    {
        this.name = name;
        this.strength = 75;
        this.health = 100;
        this.stamina = 75;
        this.speed = 10;
        this.attackPower = 1;
        this.running = false;
        this.arrested = false;
    }

    public void plowingTheField() {
        //if farmer is plowing, do something
        plowing = true;
    }

    public void harvestingTheCrops() {
        //if farmer is harvesting, do something
        harvesting = true;
    }

    public void gotArrested() {
        //within jurisdiction

        arrested = true;
    }

    
}
