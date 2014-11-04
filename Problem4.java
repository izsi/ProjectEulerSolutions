import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Problem4 {
  
  public static void main(String[] args) {
     int palindrome = findPalindromeFromProducts();
     if(palindrome == 0) {
       System.out.println("No palindromes found under these conditions.");
     }else{
       System.out.println("" + palindrome + " is the highest palindrome.");
     }
  }
  
  private static boolean isPalindrome(int number) {
    String stringNumber = Integer.toString(number);
    String reverseStringNumber = new StringBuilder(stringNumber).reverse().toString();
    return stringNumber.equals(reverseStringNumber);
  }
  
  private static int findPalindromeFromProducts() {
    List<Integer> palindromes = new ArrayList<Integer>(); 
    
    for(int x = 999; x >= 100; x--){
      for(int y = x; y >= 100; y--){
        int z = x * y;
        if (isPalindrome(z)) {
          palindromes.add(z);
        }
      }
    }
    Collections.sort(palindromes);
    Collections.reverse(palindromes);
    return palindromes.get(0);
  }  
}
