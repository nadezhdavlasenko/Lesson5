import java.util.ArrayList;

/**
 * Created by Juliana on 27.06.2018
 */
public class Cars {
    private ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public ArrayList<Car> getCarByMark(String mark) {
        ArrayList<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getModel().equals(mark)) {
                result.add(car);
            }
        }
        return cars;
    }
}
