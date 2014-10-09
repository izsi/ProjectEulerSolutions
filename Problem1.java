import java.util.List;

public class Problem1 {
  
  
  public static void main(String[] args) { 
    
    int sumMultiplesOfThree = 0;
    for (int a = 1; a <= 333; a++) {
      sumMultiplesOfThree = sumMultiplesOfThree + (a * 3);
    }
    
    int totalSum = sumMultiplesOfThree;
    for (int b = 1; b <= 199; b ++) { 
      totalSum = totalSum + (b * 5);
    }
     
    int sumMultiplesOfFifteen = 0;
    for (int c = 1; c <= 66; c ++) {
      sumMultiplesOfFifteen = sumMultiplesOfFifteen + (c * 15);
    }
    
    System.out.println(totalSum - sumMultiplesOfFifteen);
    
  }
  
}

  
