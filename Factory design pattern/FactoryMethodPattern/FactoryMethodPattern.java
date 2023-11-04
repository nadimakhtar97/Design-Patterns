
public class FactoryMethodPattern {

    // Product Interface
    public interface Coffee {
        public String brew();
    }

    // Concrete product
    public static class Latte implements Coffee {

        @Override
        public String brew() {
            return "Latte";
        }

    }

    // Concrete product
    public static class Americano implements Coffee {

        @Override
        public String brew() {
            return "Americano";
        }

    }

    // Concrete product
    public static class Espresso implements Coffee {

        @Override
        public String brew() {
            return "Espresso";
        }

    }

    // Concrete product
    public static class Cappuccino implements Coffee {

        @Override
        public String brew() {
            return "Cappuccino";
        }

    }

    // Factory Interface
    public interface CoffeeFactory {
        public Coffee createCoffee();
    }

    // Concrete Factory
    public static class LatteCoffeeFactory implements CoffeeFactory {
        @Override
        public FactoryMethodPattern.Coffee createCoffee() {
            return new Latte();
        }

    }
    // Concrete Factory
    public static class AmericanoCoffeeFactory implements CoffeeFactory {
        @Override
        public FactoryMethodPattern.Coffee createCoffee() {
            return new Americano();
        }

    }
    // Concrete Factory
    public static class EspressoCoffeeFactory implements CoffeeFactory {
        @Override
        public FactoryMethodPattern.Coffee createCoffee() {
            return new Espresso();
        }

    }
    // Concrete Factory
    public static class CappuccinoCoffeeFactory implements CoffeeFactory {
        @Override
        public FactoryMethodPattern.Coffee createCoffee() {
            return new Cappuccino();
        }

    }

    public static void main(String[] args) {
        CoffeeFactory latteCoffeeFactory = new LatteCoffeeFactory();
        Coffee latte = latteCoffeeFactory.createCoffee();
        System.out.println(latte.brew());
    }

}
