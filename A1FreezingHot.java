class A1FreezingHot extends ConsoleProgram {

  /**
  * Description
  * @author: L. Chen
  */
  
  public void run() {
    int intTemp1;
    int intTemp2;

    boolean blnTemperature;

    intTemp1 = readInt("Enter temperature 1: ");
    intTemp2 = readInt("Enter temperature 2: ");

    if(blnTemperature = ((intTemp1 < 0 && intTemp2 > 100) || (intTemp1 > 100 && intTemp2 < 0))){
        System.out.println(blnTemperature);
    }

    else{
        System.out.println(blnTemperature);
    }
    
  }
}

