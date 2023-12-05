package application;

import entities.Funcionario;

public static void main (String[] args) {
    Funcionario funcionario1 = new Funcionario("Alice", 30, 4500.0);
    Funcionario funcionario2 = new Funcionario("Bob", 25, 3800.0);
    
    System.out.println("Informações do Funcioário 1:");
    System.out.println("Nome: " + funcionario1.getNome());
    System.out.println("Idade: " + funcionario1.getIdade());
    System.out.println("Salário: " + funcionario1.getSalario());
    
     
    System.out.println("\nInformações do Funcioário 2:");
    System.out.println("Nome: " + funcionario2.getNome());
    System.out.println("Idade: " + funcionario2.getIdade());
    System.out.println("Salário: " + funcionario2.getSalario());

}