import java.util.ArrayList;

/**
 * Created by Juliana on 27.06.2018
 */
public class Runner {
    public static void main(String[] args) {

        Cars cars = getCars();

        System.out.println("Cписок автомобилей заданной марки");
        printResult(cars.getCarsByMark("mark1"));
        System.out.println("Cписок автомобилей заданной модели, которые эксплуатируются больше n лет");
        printResult(cars.getCarsByModelAndYear("model2", 10));
        System.out.println("Cписок автомобилей заданного года выпуска, цена которых больше указанной");
        printResult(cars.getCarsByYearAndPrice(2016, 1500));

    }

    public static Cars getCars() {
        Car carB1 = new CarBuilder().buildMark("Toyota").buildModel("Corolla").buildYear(2016).buildColor("Gray").buildPrice(21000).buildNumber(1111).build();
        Car carB2 = new CarBuilder().buildMark("Toyota").buildModel("Camry").buildYear(2016).buildColor("Black").buildPrice(44000).buildNumber(2222).build();

        Car car = new Car(1, "mark1", "model1", 2000, "color1", 1111, 1234);
        Car car1 = new Car(2, "mark1", "model2", 2000, "color2", 2222, 1235);
        Car car2 = new Car(3, "mark2", "model2", 2012, "color3", 2222, 1236);
        Car car3 = new Car(4, "mark2", "model2", 2004, "color4", 3000, 1237);

        Cars cars = new Cars();
        cars.addCar(carB1);
        cars.addCar(carB2);
        cars.addCar(car);
        cars.addCar(car1);
        cars.addCar(car2);
        cars.addCar(car3);
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
