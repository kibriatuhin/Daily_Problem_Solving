package dataStructureAndAlgorithom.recursion;

public class FactorialNumber {
    static int factorial(int n) {
        if (n==1 || n==0){
            return 1;
        }
        int fact_nm1 = factorial(n-1);
        int fact_nm2 = n * fact_nm1;
        return fact_nm2;
    }
    static void factorialNumber(int n , int fact){
        if (n==1){
            System.out.println(fact);
            return;
        }
        if (n==0){
            System.out.println(fact);
            return;
        }
        fact *= n;
        factorialNumber(n-1, fact);
    }
    public static void main(String[] args) {
       // factorialNumber(3,1);
        System.out.println(factorial(5));
    }
}
