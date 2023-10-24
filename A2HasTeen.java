class A2HasTeens extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    int intAge1;
    int intAge2;
    int intAge3;

    boolean blnTeens;

    intAge1 = readInt("Enter the first age: ");
    intAge2 = readInt("Enter the second age: ");
    intAge3 = readInt("Enter the third age: ");

    if(blnTeens = ((intAge1 >= 13 && intAge1 <= 19) || (intAge2 >= 13 && intAge2 <= 19) || (intAge3 >= 13 && intAge3 <= 19))){
      System.out.println(blnTeens);
    }
    
    else{
      System.out.println(blnTeens);
    }
    
  }
}

