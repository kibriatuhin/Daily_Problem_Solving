package effectiveJava.builderDesignPattern;
//concrete class Builder Design Pattern
class NutritionFacts{
    private final  int servingSize;
    private final int servings;
    private final int calories;
    private final int carbohydrate;
    private final int fat;
    private final int sodium;

    public static class Builder{
        //required parameters
        private int servingSize;
        private int servings;
        //optional parameters
        private int calories= 0;
        private int fat=0;
        private int sodium=0;
        private int carbohydrate=0;

        public Builder(int servingSize , int servings){
            this.servingSize = servingSize;
            this.servings = servings;
        }
        public Builder calories(int calories){
            this.calories = calories;
            return this;
        }
        public Builder fat(int val){
            fat = val;
            return this;
        }
        public Builder sodium(int val){
            sodium = val;
            return this;
        }
        public Builder carbohydrate(int val){
            carbohydrate = val;
            return this;
        }

        public NutritionFacts build(){
            return new NutritionFacts(this);
        }

    }

    private NutritionFacts(Builder builder){
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", carbohydrate=" + carbohydrate +
                ", fat=" + fat +
                ", sodium=" + sodium +
                '}';
    }
}
//Abstract Class Builder Design Pattern


public class Main {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(280,10).calories(100).fat(200).build();
        System.out.println(nutritionFacts);
    }
}
