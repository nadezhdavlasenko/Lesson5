abstract class CarBuilder{
    Car car;
    private static int id = 0;
    void createCar(){car = new Car();}
    void builId(){car.setId(++id);}
    abstract void buildMark();
    abstract void buildModel();
    abstract void buildYear();
    abstract void buildColor();
    abstract void buildPrice();
    abstract void buildNumber();
    Car getCar(){return car;}
}
class Director{
    CarBuilder carBuilder;
    private static int id = 0;
    void setCarBuilder(CarBuilder carBuilder){this.carBuilder = carBuilder;}
    Car buildCar(){
        carBuilder.createCar();
        carBuilder.builId();
        carBuilder.buildMark();
        carBuilder.buildModel();
        carBuilder.buildYear();
        carBuilder.buildColor();
        carBuilder.buildPrice();
        carBuilder.buildNumber();
        return carBuilder.getCar();
    }
}
class PassatBuilder extends CarBuilder{

    @Override
    void buildMark() {car.setMark("Volkswagen");}

    @Override
    void buildModel() {car.setModel("Passat");}

    @Override
    void buildYear() {car.setYear(2001);}

    @Override
    void buildColor() {car.setColor("Black");}

    @Override
    void buildPrice() {car.setPrice(30000);}

    @Override
    void buildNumber() {car.setNumber(3333);}
}

class CorollaBuilder extends CarBuilder{

    @Override
    void buildMark() {car.setMark("Toyota");}

    @Override
    void buildModel() {car.setModel("Corolla");}

    @Override
    void buildYear() {car.setYear(2016);}

    @Override
    void buildColor() {car.setColor("Gray");}

    @Override
    void buildPrice() {car.setPrice(21000);}

    @Override
    void buildNumber() {car.setNumber(1111);}
}

class CamryBuilder extends CarBuilder{

    @Override
    void buildMark() {car.setMark("Toyota");}

    @Override
    void buildModel() {car.setModel("Camry");}

    @Override
    void buildYear() {car.setYear(2004);}

    @Override
    void buildColor() {car.setColor("Red");}

    @Override
    void buildPrice() {car.setPrice(41000);}

    @Override
    void buildNumber() {car.setNumber(2222);}
}

class NXBuilder extends CarBuilder{

    @Override
    void buildMark() {car.setMark("Lexus");}

    @Override
    void buildModel() {car.setModel("NX");}

    @Override
    void buildYear() {car.setYear(2008);}

    @Override
    void buildColor() {car.setColor("White");}

    @Override
    void buildPrice() {car.setPrice(55000);}

    @Override
    void buildNumber() {car.setNumber(4444);}
}

