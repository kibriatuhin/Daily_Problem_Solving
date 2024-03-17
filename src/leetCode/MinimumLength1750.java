package leetCode;

public class MinimumLength1750 {
    public static int minimumLength(String s) {

        int low=0 ,high = s.length()-1 , result=0;
        while (low<high && s.charAt(low)== s.charAt(high)){
            char ch = s.charAt(low);
            while (low<=high && s.charAt(low)== ch) low++;
            while (low<=high && s.charAt(high)== ch) high--;
        }
        return high-low+1;
    }

    public static void main(String[] args) {
        System.out.println(minimumLength("cabaabac"));
        String date = "date";
        System.out.println();
    }

}
