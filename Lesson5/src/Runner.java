import java.util.ArrayList;

/**
 * Created by Juliana on 27.06.2018
 */
public class Runner {
    public static void main(String[] args) {

        Cars cars = getCars();

        printResult(cars.getCarsByMark("mark1"));
        printResult(cars.getCarsByModelAndYear("model2", 10));
        printResult(cars.getCarsByYearAndPrice(2000, 1500));

    }

    public static Cars getCars() {
        Car car = new Car(1, "mark1", "model1", 2000, "color1", 1111, 1234);
        Car car1 = new Car(2, "mark1", "model2", 2000, "color2", 2222, 1235);
        Car car2 = new Car(3, "mark2", "model2", 2012, "color3", 2222, 1236);

        Cars cars = new Cars();
        cars.addCar(car);
        cars.addCar(car1);
        cars.addCar(car2);
        return cars;
    }

    public static void printResult(ArrayList<Car> cars) {
        if (cars != null) {
            for (Car car : cars) {
                System.out.println(car);
            }
        }
        System.out.println();
    }
}
