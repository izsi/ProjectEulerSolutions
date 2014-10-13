public class Problem3 {
  
  public static void main (String[] args) {
        
    System.out.println(findBiggestPrimeFactor(600851475143l));
  }
    
  private static long findSmallestFactorUnlessPrime(long multiple) {
    for (long i = 2; i < multiple; i++) {
      if (multiple % i == 0) {
        return i;
      }        
    }
    return multiple;
  }
  private static long findBiggestPrimeFactor(long multiple) {
    long smallestFactor = findSmallestFactorUnlessPrime(multiple);
    if (multiple == smallestFactor) {
      return multiple;
    } else {
      return findBiggestPrimeFactor(multiple / smallestFactor);
    }
    
  }
    
}
