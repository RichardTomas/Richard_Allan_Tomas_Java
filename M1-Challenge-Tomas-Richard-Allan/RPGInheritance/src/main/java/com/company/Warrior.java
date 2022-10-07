package com.company;

public class Warrior extends Character{
    int shieldStrength = 100;

    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, boolean attackAnotherCharacter())

    {
        this.name = name;
        this.strength = 75;
        this.health = 100;
        this.stamina = 100;
        this.speed = 50;
        this.attackPower = 5;
        this.running = false;
        this.arrested = false;
    }

    public void gotArrested() {
        //within jurisdiction

        arrested = true;
    }

}
