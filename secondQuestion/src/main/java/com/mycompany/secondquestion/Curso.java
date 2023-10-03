/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.secondquestion;

import java.util.ArrayList;

/**
 *
 * @author 01055016201
 */
public class Curso {
    private String name;
    private String professor;
    private ArrayList<Aluno> alunos;
    
    public Curso(String name, String professor)
    {
        this.name = name;
        this.professor = professor;
        alunos = new ArrayList<>();
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getProfessor(){
        return this.professor;
    }
    
    public void setProfessor(String professor){
        this.professor = professor;
    }
    
    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }
    
    public int getStudents(){
        return alunos.size();
    }
    
    public int calculateGrades(){
        
        int grade = 0;
        for(int aluno = 0; aluno < this.alunos.size(); aluno++)
        {
            grade += this.alunos.get(aluno).getGrade();
        }
        return grade/this.alunos.size();
}
}
