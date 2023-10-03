package entities;

import java.util.Scanner;
import java.util.ArrayList;

public class TimeFutebol {

	private String nome;
	private String tecnico;
	public String jogadores;

	public TimeFutebol() {
	}

	public TimeFutebol(String nome, String tecnico) {
		this.nome = nome;
		this.tecnico = tecnico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTecnico() {
		return tecnico;
	}

	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}
	
	public static void addJogadores() {
		Scanner sc = new Scanner(System.in);
		
		Array<String> jogadores = new ArrayList<String>();
		
		
	}

}
