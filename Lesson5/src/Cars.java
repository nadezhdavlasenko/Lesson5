import java.time.LocalDate;
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

    public ArrayList<Car> getCarsByMark(String mark) {
        ArrayList<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getMark().equals(mark)) {
                result.add(car);
            }
        }
        return result;
    }

    public ArrayList<Car> getCarsByModelAndYear(String model, int n) {
        int y = LocalDate.now().getYear();
        ArrayList<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getModel().equals(model) && LocalDate.now().getYear() - car.getYear() > n) {
                result.add(car);
            }
        }
        return result;
    }

    public ArrayList<Car> getCarsByYearAndPrice(int year, int price) {
        ArrayList<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() == year && car.getPrice() > price) {
                result.add(car);
            }
        }
        return result;
    }
}
