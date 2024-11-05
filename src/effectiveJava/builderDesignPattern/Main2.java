package effectiveJava.builderDesignPattern;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

abstract class Pizza{
    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone(); // See Item 50
    }

    public enum Topping{ HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>>{
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopping(Topping topping) {
              toppings.add(Objects.requireNonNull(topping));
            return self();
        }
        // Subclasses must implement this method to return 'self' correctly
        protected abstract T self();
        abstract Pizza build();

    }
}

public class Main2 {
    public static void main(String[] args) {
        
    }
}
