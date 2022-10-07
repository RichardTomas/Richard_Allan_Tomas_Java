package com.company;

public class Constable extends Character {

    String jurisdiction = "Townsville";

    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, boolean attackAnotherCharacter())

    {
        this.name = name;
        this.strength = 60;
        this.health = 100;
        this.stamina = 60;
        this.speed = 20;
        this.attackPower = 5;
        this.running = false;
        this.arrested = false;
    }

    public void arrestAnotherCharacter(){
    //arrest character if within jurisdiction

        return true;
    }

    public void gotArrested() {
        //within jurisdiction

        arrested = true;
    }

}
