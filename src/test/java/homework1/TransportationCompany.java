package homework1;

import org.junit.jupiter.api.Test;

public class TransportationCompany {
    public double calculateFuelConsumption (double a, double distance) {return a*distance/100;}
    int distance = 500;
    double price = 1.5;
    public double calculatePrice (double price, double x, double y) {return price*x/y;}



    @Test public void listOfVehicles() {
        Vehicle truck1 = new Vehicle();
        truck1.setTitle("Truck1");
        truck1.setCarryingCapacity(17);
        truck1.setFuelConsumption(23);

        Vehicle truck2 = new Vehicle();
        truck2.setTitle("Truck2");
        truck2.setCarryingCapacity(18);
        truck2.setFuelConsumption(25);

        Vehicle truck3 = new Vehicle();
        truck3.setTitle("Truck3");
        truck3.setCarryingCapacity(20);
        truck3.setFuelConsumption(30);

        Vehicle train1 = new Vehicle();
        train1.setTitle("Train1");
        train1.setCarryingCapacity(2000);
        train1.setFuelConsumption(700);

        Vehicle train2 = new Vehicle();
        train2.setTitle("Train2");
        train2.setCarryingCapacity(2500);
        train2.setFuelConsumption(800);


        double c = calculateFuelConsumption(truck1.getFuelConsumption(), distance);
        System.out.println(truck1.getTitle() + "  fuel consumption per " + distance + " km is " + c + " l ");

        double d = calculateFuelConsumption(truck2.getFuelConsumption(), distance);
        System.out.println(truck2.getTitle() + "  fuel consumption per " + distance + " km is " + d + " l ");

        double e = calculateFuelConsumption(truck3.getFuelConsumption(), distance);
        System.out.println(truck3.getTitle() + "  fuel consumption per " + distance + " km is " + e + " l ");

        double f = calculateFuelConsumption(train1.getFuelConsumption(), distance);
        System.out.println(train1.getTitle() + "  fuel consumption per " + distance + " km is " + f + " l ");

        double g = calculateFuelConsumption(train2.getFuelConsumption(), distance);
        System.out.println(train2.getTitle() + "  fuel consumption per " + distance +" km is " + g + " l ");



        double k = calculatePrice(price, c, truck1.getCarryingCapacity());
        System.out.println("The Transportation cost of 1 ton of cargo by " + truck1.getTitle() + " is " + k + " EUR ");

        double l = calculatePrice(price, d, truck2.getCarryingCapacity());
        System.out.println("The Transportation cost of 1 ton of cargo by " + truck2.getTitle() + " is " + l + " EUR ");

        double m = calculatePrice(price, e, truck3.getCarryingCapacity());
        System.out.println("The Transportation cost of 1 ton of cargo by " + truck3.getTitle() + " is " + m + " EUR ");

        double n = calculatePrice(price, f, train1.getCarryingCapacity());
        System.out.println("The Transportation cost of 1 ton of cargo by " + train1.getTitle() + " is " + n + " EUR ");

        double o = calculatePrice(price, g, train2.getCarryingCapacity());
        System.out.println("The Transportation cost of 1 ton of cargo by " + train2.getTitle() + " is " + o + " EUR ");







        double cheapest = k;
        if (l < cheapest) cheapest = l;
        if (m < cheapest) cheapest = m;
        if (n < cheapest) cheapest = n;
        if (o < cheapest) cheapest = o;
        System.out.println ("Cheapest transportation cost is: " + cheapest+ " EUR/per ton");




























    }

}
