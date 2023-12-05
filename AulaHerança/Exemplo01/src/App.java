public class App {
	public static void main(String[] args) throws Exception {
		Aluno aluno1 = new Aluno();
		aluno1.matricula = 123321;
		aluno1.nome = "Bart";
		aluno1.cpf = "987.789.321-12"; // É ATRIBUTO PRIVADO DE PESSOA !!!

		Professor professor1 = new Professor();
		professor1.hasMestrado = true;
		professor1.nome = "Part";
		professor1.cpf = "321-321-321.32"; // É ATRIBUTO PRIVADO DE PESSOA !!!
		professor1.matricula = 987789; // FAZ PARTE DE ALUNO E NÃO DE PROFESSOR!!!

		Pessoa pessoa = new Pessoa(); // Não faz sentido a criação de pessoa para esse contexto !!!
		pessoa.nome = "Hart";
		pessoa.cpf = "765-567-765.21"; // Como é privado, só pode ser modificado com o método set!
	}
}
