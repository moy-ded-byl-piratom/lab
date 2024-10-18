public class HotChocolate extends Beverage {

        @Override
        protected void brew() {
            System.out.println(" HotChocolate brew");
        }

        @Override
        protected void addCondiments() {
            System.out.println("addCondiments");
        }
}

