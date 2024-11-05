package dataStructureAndAlgorithom.recursion;

public class FibonacciSeries {
    static void fibonacciSeries(int a , int b , int n) {
        if (n==0){
            return;
        }
        int c = a+b ;
        System.out.println(c);
        fibonacciSeries(b,c,n-1);
    }
    public static void main(String[] args) {

    }
}
