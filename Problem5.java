class Problem5 {
  
  public static void main(String[] args) {
    for(int number = 20; ; number++) {
      if (isDivisible(number)) {
        System.out.println("" + number + " is the answer.");
        break;
      } 
    }
  }
  
  private static boolean isDivisible(int number) {
    for (int factor = 20; factor > 1; factor--) {
      if (number % factor != 0) {
        return false;
      }      
    }
    return true;
  }
       
}
  
