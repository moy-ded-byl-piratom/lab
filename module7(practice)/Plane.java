public class Plane  implements ICostCalculationStrategy{
    @Override
    public double conculation(int countOfPassangers, int typeClass, int sale, int benefits) {
        double baseCost;

        if (typeClass == 1) {
            baseCost = countOfPassangers * 1000 + 50000;
        } else {
            baseCost = countOfPassangers * 500;
        }
        if (sale > 0) {
            baseCost -= baseCost * (sale / 100.0);
        }
        if (benefits > 0) {
            baseCost -= baseCost * (benefits / 100.0);
        }

        return baseCost;

    }
}
