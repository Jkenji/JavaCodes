import java.util.Random;

class Dice {

  public static int rollD4(){
    Random random = new Random();
    
    return random.nextInt(4) + 1;
  }

  public static int rollD6(){
    Random random = new Random();
    
    return random.nextInt(6) + 1;
  }

  public static int rollD12(){
    Random random = new Random();
    
    return random.nextInt(12) + 1;
  }
}