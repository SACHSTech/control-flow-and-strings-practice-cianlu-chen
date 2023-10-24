import java.util.Random;

class B1DiceGame extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    Random randomDice1 = new Random();
    Random randomDice2 = new Random();

    for(int i = 0; i <= 100; i++){
      int intDice1 = randomDice1.nextInt(7);
      int intDice2 = randomDice2.nextInt(7);

      if(intDice1 + intDice2 == 2){
        System.out.println("Snake eyes!");
      }

      else if(intDice1 + intDice2 == 7){
        System.out.println("Lucky seven");
      }
    }
  }
}

