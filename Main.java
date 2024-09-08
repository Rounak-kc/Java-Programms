//Error:-
//  Main.java:25: error: cannot find symbol
//             car.stop();
//                ^
//      symbol:   method stop()
//      location: variable car of type Car
//     1 error
 
//Error Explanation:- stop Method missing error from the class Car


class Car {
    private String make;
    private String model;

    public Car(String make, String model){
        this.make=make;
        this.model=model;
    }

    public void start(){
        System.out.println("Starting the car.");
    }

    public void stop(){
        System.out.println("Stop the car.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car=new Car("Toyota","Camry");
        car.start();
        car.stop();
    }
}
