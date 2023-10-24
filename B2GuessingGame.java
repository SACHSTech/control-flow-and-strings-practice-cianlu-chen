import java.util.Random;

class B2GuessingGame extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    int intUserGuess;

    Random randomNum = new Random();
    int intNum = randomNum.nextInt(101);

    System.out.println("Guess the number between 1 and 100");
    intUserGuess = readInt("Enter your guess: ");

    if(intUserGuess > intNum){
        System.out.println("Too high");
      }

    else if(intUserGuess < intNum){
      System.out.println("Too low");
    }

    while(intUserGuess != intNum){
      for(int intGuessCounter = 1; intGuessCounter <= 4; intGuessCounter ++){
        intUserGuess = readInt("Enter your guess: ");
      
        if(intUserGuess > intNum){
          System.out.println("Too high");
        }

        else if(intUserGuess < intNum){
          System.out.println("Too low");
        }
      }
      break;
      System.out.println("Nice try");
      break;
    }
  }
}

