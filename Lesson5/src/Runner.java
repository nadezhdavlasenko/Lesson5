/**
 * Created by Juliana on 27.06.2018
 */
public class Runner {
    public static void main(String[] args) {
        Car car = new Car(1, "mark1", "model1", 2000, "color1", 1111, 1234);
        Car car1 = new Car(2, "mark1", "model2", 3000, "color2", 2222, 1235);
        Car car2 = new Car(2, "mark1", "model2", 3000, "color2", 2222, 1236);

        Cars cars = new Cars();
        cars.addCar(car);
        cars.addCar(car1);

        for (Car tempCar : cars.getCarByMark("mark1")) {
            System.out.println(tempCar);
        }

    }
}
