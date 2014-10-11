import java.util.List;

public class Problem1 {
  
  
  public static void main(String[] args) { 
    
    int sumMultiplesOfThree = addMultiples(3);
    
    int sumMultiplesOfFive = addMultiples(5);
    
    int sumMultiplesOfFifteen = addMultiples(15);
    
    System.out.println(sumMultiplesOfThree + sumMultiplesOfFive - sumMultiplesOfFifteen);
    
  }
  
  private static int addMultiples(int number) {
    int sumMultiples = 0;
    for (int a = 1; a <= (999/number); a ++) {
      sumMultiples = sumMultiples + (a * number);
    }
    return sumMultiples;
  }
}

  
