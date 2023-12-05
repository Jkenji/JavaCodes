public class App {
    public static void main(String[] args) throws Exception {
        Animal animais[] = new Animal[6];
        animais[0] = new Cachorro();
        animais[1] = new Gato();
        animais[2] = new Vaca();
        animais[3] = new Cachorro();
        animais[4] = new Gato();
        animais[5] = new Vaca();
        
        for(int i = 0; i < 6; i++)
        {
            animais[i].emitirSom();
        }
    }
}
