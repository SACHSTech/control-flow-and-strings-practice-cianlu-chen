class A1FreezingHot extends ConsoleProgram {

  /**
  * Description
  * @author: L. Chen
  */
  
  public void run() {
    int intTemp1;
    int intTemp2;

    intTemp1 = readInt("Enter temperature 1: ");
    intTemp2 = readInt("Enter temperature 2: ");

    if((intTemp1 <= 0 && intTemp2 >= 100) || (intTemp1 >= 0 && intTemp2 <= 100)){
        System.out.println("true");
    }

    else{
        System.out.println("false");
    }
    
  }
}

