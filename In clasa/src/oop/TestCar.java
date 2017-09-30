/*
 *Testing the Car implementation
 */
package oop;

/**
 *
 * @author Bogdan
 */
public class TestCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create three car instances using all three constvstrctors
        Car car1 = new Car();
        short speed2 = 230;
        Car car2 = new Car ("Mercedes", speed2, Car.Color.YELLOW);
        Car car3 = new Car();
        // set color of first class to yellot
        car1.setColor (Car.Color.YELLOW);
        // set speed of sencond car
                car2.setSpeed(speed2);
         // set name of third car
                car3.setName("mercedes");
        // derease the speed of second car
        car2.decreaseSpeed(speed2);
       System.out.print("+++++++++++++++++++++++++++++++");
       System.out.println("Car1:");
       System.out.println("Car1.Name:"+ car1.getName());
       System.out.println("Car1.Color:"+ car1.getColor());
       System.out.println("Car1.Speed:"+ car1.getSpeed());
       System.out.println("Car1.DailyRentPrice:"+ car1.getDailyRentPrice());
       System.out.println("Car1.GetSalePrice:"+ car1.getSalePrice());
       System.out.print("+++++++++++++++++++++++++++++++");
       System.out.println("Car2:");
       System.out.println("Car2.Name:"+ car2.getName());
       System.out.println("Car2.Color:"+ car2.getColor());
       System.out.println("Car2.Speed:"+ car2.getSpeed());
       System.out.println("Car2.DailyRentPrice:"+ car2.getDailyRentPrice());
       System.out.println("Car2.GetSalePrice:"+ car2.getSalePrice());
       System.out.print("+++++++++++++++++++++++++++++++");
       System.out.println("Car3:");
       System.out.println("Car3.Name:"+ car3.getName());
       System.out.println("Car3.Color:"+ car3.getColor());
       System.out.println("Car3.Speed:"+ car3.getSpeed());
       System.out.println("Car3.DailyRentPrice:"+ car3.getDailyRentPrice());
       System.out.println("Car3.GetSalePrice:"+ car3.getSalePrice());
       System.out.print("+++++++++++++++++++++++++++++++");
    }

 
    
}
