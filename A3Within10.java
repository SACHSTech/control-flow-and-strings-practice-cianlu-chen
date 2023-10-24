class A3Within10 extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    int intNum1;
    int intNum2;

    int intNumDiff1;
    int intNumDiff2;

    intNum1 = readInt("Enter the first number: ");
    intNum2 = readInt("Enter the second number: ");

    intNumDiff1 = Math.abs(10 - intNum1);
    intNumDiff2 = Math.abs(10 - intNum2);

    if(intNumDiff1 < intNumDiff2){
      System.out.println(intNum1);
    }

    else if(intNumDiff2 < intNumDiff1){
      System.out.println(intNum2);
    }

    else{
      System.out.println("0");
    }
    
  }
}

