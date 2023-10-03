/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.secondquestion;

/**
 *
 * @author 01055016201
 */
public class SecondQuestion {

    public static void main(String[] args) {
      
      Escola cesupa = new Escola("Cesupa");
      
      Curso computacao = new Curso("Computacao", "Girotto");
      Curso medicina = new Curso("Medicina", "Bia");
      
      Aluno joao  = new Aluno("Joao", 10);
      Aluno mario = new Aluno("Mario", 9);
      Aluno leandro = new Aluno("Leandro", 8);
      
      Aluno leonardo = new Aluno("Leonardo", 7);
      Aluno ana = new Aluno("Ana", 10);
      
      cesupa.addCurso(computacao);
      cesupa.addCurso(medicina);
      
      computacao.addAluno(joao);
      computacao.addAluno(mario);
      computacao.addAluno(leandro);
      medicina.addAluno(leonardo);
      medicina.addAluno(ana);
      
      System.out.println("Total de alunos no cesupa: " + cesupa.calculateStudents());
      
      cesupa.setDirector(computacao.getProfessor());
      System.out.println("Diretor do Cesupa:" + cesupa.getDirector());
      
      System.out.println("Media de computacao: " + computacao.calculateGrades());
      System.out.println("Media de medicina: " + medicina.calculateGrades());
      
      System.out.println("Curso com maior numero de alunos: " + cesupa.maiorNumeroAlunos().getName());
    }
}
