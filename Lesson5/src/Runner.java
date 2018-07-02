import java.util.ArrayList;

/**
 * Created by Juliana on 27.06.2018
 */
public class Runner {
    public static void main(String[] args) {

        Cars cars = getCars();

        System.out.println("Cписок автомобилей заданной марки");
        printResult(cars.getCarsByMark("Toyota"));
        System.out.println("Cписок автомобилей заданной модели, которые эксплуатируются больше n лет");
        printResult(cars.getCarsByModelAndYear("NX", 5));
        System.out.println("Cписок автомобилей заданного года выпуска, цена которых больше указанной");
        printResult(cars.getCarsByYearAndPrice(2001, 1500));

    }

    public static Cars getCars() {
        Director director = new Director();
        director.setCarBuilder(new CorollaBuilder());
        Car carB1 = director.buildCar();
        director.setCarBuilder(new CamryBuilder());
        Car carB2 = director.buildCar();
        director.setCarBuilder(new PassatBuilder());
        Car carB3 = director.buildCar();
        director.setCarBuilder(new NXBuilder());
        Car carB4 = director.buildCar();

        Cars cars = new Cars();
        cars.addCar(carB1);
        cars.addCar(carB2);
        cars.addCar(carB3);
        cars.addCar(carB4);

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
