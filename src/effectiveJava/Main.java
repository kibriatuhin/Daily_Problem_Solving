package effectiveJava;

public class Main {
    enum Bear{
        KF,KO,CO,RO;
    }
    public static void main(String[] args) {
        Bear[] bear = Bear.values();
        for (Bear bear1 : bear){
            System.out.println(bear1);
        }
    }
}
