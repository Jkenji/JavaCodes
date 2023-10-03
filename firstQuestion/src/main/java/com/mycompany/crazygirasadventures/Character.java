/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crazygirasadventures;

/**
 *
 * @author 23300040
 */

/*Um construtor que aceita apenas o nome do personagem e inicializa a vida e
energia com valores nulos e um construtor que aceita o nome, a vida e a energia
do personagem como parâmetros.*/
public class Character {

    private String name;
    private int hp;
    private int damage;
    private int energy;

    public Character(String name) {
        this.name = name;
        this.hp = 0;
        this.energy = 0;
    }

    public Character(String name, int hp, int energy) {
        this.name = name;
        this.hp = hp;
        this.energy = energy;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getEnergy() {
        return this.energy;
    }

    public void setName(int energy) {
        this.energy = energy;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isAlive() {
        return hp > 0;
    }
    
    public void attack(Character character){
        character.receiveDamage(this.damage);
        this.energy--;
    }

    public void receiveDamage(int damage) {
        this.hp -= damage;
        if (this.hp < 0) {
            this.hp = 0;
        }
    }
    
    @Override
    public String toString() {
        return name + "\nHP: " + hp + "\nEnergy: " + energy + "\nAttack: " + damage;
    }
}
