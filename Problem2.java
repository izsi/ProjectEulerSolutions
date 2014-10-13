public class Problem2 {

  public static void main(String[] args) {
    
    
    int[] allFibonaccis = new int[4000000];
    
    int a = 1;
    int b = 2;
    int c = a + b;
     
    allFibonaccis[0] = 1;
    allFibonaccis[1] = 2;
      
    int numberOfFibonaccis = 2;
    for (; c < 4000000; numberOfFibonaccis++) {
      allFibonaccis[numberOfFibonaccis] = c;
            
      a = b;
      b = c;
     
      c = a + b;
    }
    
    /*for (int i = 0; i < 20; i++) {
      System.out.println(allFibonaccis[i]);
    }
    */
    
    int sumEvenFibonaccis = 0;
    for (int i = 0; i < numberOfFibonaccis; i++) {      
      if (allFibonaccis[i] % 2 == 0) {
        sumEvenFibonaccis = sumEvenFibonaccis + allFibonaccis[i];
      }
    }
    
    System.out.println(sumEvenFibonaccis);
  }
}
    
        