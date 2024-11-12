package day_10real;

public class Array6_6 {

    public static void main(String[] args) {
        int[] evens = {2, 4, 6, 8, 10};  
        int primes[] = {2, 3, 5, 7, 9, 11, 13};  

     
        int evenSum = sum(evens);  
        int primeSum = sum(primes);  

    
        System.out.println("짝수 배열의 합: " + evenSum);
        System.out.println("소수 배열의 합: " + primeSum);
    }

    
    public static int sum(int[] arr) {
        int sum = 0;
  
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;  
    }
}
