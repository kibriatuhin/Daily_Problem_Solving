package dataStructureAndAlgorithom.recursion;

public class Main {
    static void printNumber(int n){
        if (n==5)
            return;
        System.out.println(n);
        printNumber(n+1);
        System.out.println("after : " + n);
    }

    public static void main(String[] args) {
        printNumber(1);
    }
}
