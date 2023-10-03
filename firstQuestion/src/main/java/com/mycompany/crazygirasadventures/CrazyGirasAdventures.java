/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.crazygirasadventures;

/**
 *
 * @author 23300040
 */
public class CrazyGirasAdventures {

    public static void main(String[] args) {
        
      Character vardamir = new Character("Vardamir", 150, 30);
      Character goldriver = new Character("Goldriver", 30, 40);
      
      vardamir.setDamage(5);
      goldriver.setDamage(3);
      
      System.out.println(vardamir.toString());
      System.out.println();
      System.out.println(goldriver.toString());
      
      while (vardamir.isAlive() && goldriver.isAlive()) {
           while(vardamir.getEnergy() > 0){
               vardamir.attack(goldriver);
               System.out.printf("%s atacou %s e deu %d de dano\n",vardamir.getName(), goldriver.getName(), vardamir.getDamage());
           }
           while(goldriver.getEnergy() > 0){
               while(goldriver.getEnergy() > 0){
               goldriver.attack(vardamir);
               System.out.printf("%s atacou %s e deu %d de dano\n",goldriver.getName(), vardamir.getName(), goldriver.getDamage());
           } 
           }
           if(!vardamir.isAlive()){
               System.out.println("Vardamir is dead...");
           }
           else if(!goldriver.isAlive()){
               System.out.println("Goldriver is dead...");
           }
           else{
               System.out.println("Draw!");
           }
    }
}
}
