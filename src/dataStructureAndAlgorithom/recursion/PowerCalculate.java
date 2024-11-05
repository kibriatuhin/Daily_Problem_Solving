package dataStructureAndAlgorithom.recursion;

public class PowerCalculate {
    static int calcPower(int x , int n){
        if (x==0){
            return 0;
        }
        if (n==0){
            return 1;
        }
        int calcP = calcPower(x, n-1);
        int power = x*calcP;
        return power;
    }
    public static void main(String[] args) {
        System.out.println(calcPower(0,3));
    }
}
