/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.secondquestion;

/**
 *
 * @author 01055016201
 */
public class Aluno {
    private String name;
    private int grade;
    
    public Aluno(String name, int grade)
    {
        this.name = name;
        this.grade = grade;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getGrade(){
        return this.grade;
    }
    
    public void setGrade(int grade){
        this.grade = grade;
    }
}
