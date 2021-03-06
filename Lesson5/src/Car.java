
/**
 * Created by Juliana on 27.06.2018
 */
public class Car {
    private int id;
    private String mark;
    private String model;
    private int year;
    private String color;
    private int price;
    private int number;

    public Car(int id, String mark, String model, int year, String color, int price, int number) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.number = number;
    }

    public Car() {
    }

    public int getId() {
        return id;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", number=" + number +
                '}';
    }
}



//class CarBuilder{
//    private static int id = 0;
//    private String mark = "Untitled";
//    private String model = "Untitled";
//    private int year = 0;
//    private String color = "Metallic";
//    private int price = 0;
//    private int number = 0;
//
//    CarBuilder buildMark(String mark){
//        this.mark = mark;
//        return this;
//    }
//    CarBuilder buildModel(String model){
//        this.model = model;
//        return this;
//    }
//    CarBuilder buildYear(int year){
//        this.year = year;
//        return this;
//    }
//    CarBuilder buildColor(String color){
//        this.color = color;
//        return this;
//    }
//    CarBuilder buildPrice(int price){
//        this.price = price;
//        return this;
//    }
//    CarBuilder buildNumber(int number){
//        this.number = number;
//        return this;
//    }
//
//    Car build(){
//        Car car = new Car();
//        car.setId(++id);
//        car.setMark(mark);
//        car.setModel(model);
//        car.setYear(year);
//        car.setColor(color);
//        car.setPrice(price);
//        car.setNumber(number);
//        return car;
//    }
//}