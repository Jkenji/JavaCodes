public class TesteQuestao1 {

    public static void main(String[] args) {
        Personagem kikas = new Personagem("Kikas", 50, 30, 10);
        Personagem rick = new Personagem("Rick", 50, 30, 10);

        kikas.atacar(rick);
        rick.atacar(kikas);

    }

}