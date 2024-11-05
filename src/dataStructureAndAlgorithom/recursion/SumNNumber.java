package dataStructureAndAlgorithom.recursion;

public class SumNNumber {
    static  void sumNumbers(int i , int n , int sum){
        if (i== n ){
            sum +=n ;
            System.out.println(sum);
            return;
        }
        sum += i;
        sumNumbers(i+1 , n , sum);
    }
    public static void main(String[] args) {
        sumNumbers(1,5,0);
    }
}
