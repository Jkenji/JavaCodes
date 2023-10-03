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
public class Escola {
    private String name;
    private ArrayList<Curso> cursos;
    private String director;
    
    public Escola(String name)
    {
        this.name = name;
        cursos = new ArrayList<>();
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        if(name.length() > 0)
        {
            this.name = name;
        }
    }
    
    public void addCurso(Curso curso) {
        this.cursos.add(curso);
    }
    
    public String getDirector(){
        return this.director;
    }
    
    public void setDirector(String director){
            this.director = director;
    }
    
    public int calculateStudents(){
        
        int students = 0;
        for(int curso = 0; curso < this.cursos.size(); curso++)
        {
            students += this.cursos.get(curso).getStudents();
        }
        return students;
    }
    
    public Curso maiorNumeroAlunos()
    {
        int maiorNumeroAlunos = 0;
        int indexCurso = 0;
        
        for(int curso = 0; curso < cursos.size(); curso++)
        {
            if(cursos.get(curso).getStudents() > maiorNumeroAlunos)
            {
                maiorNumeroAlunos = cursos.get(curso).getStudents();
                indexCurso = curso;
            }
        }
        return cursos.get(indexCurso);
    }
}
