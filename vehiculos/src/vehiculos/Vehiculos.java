package vehiculos;

public class Vehiculos implements Interface {
    
    protected String brand;
    protected String model;
    protected int year;
    protected int wheels;
    protected double price;
    public Vehiculos(String brand, String model, int year, int wheels, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.wheels = wheels;
        this.price = price;

    }
    public Vehiculos() {
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Vehiculos [brand=" + brand + ", model=" + model + ", year=" + year + ", wheels=" + wheels + ", price="
                + price + "]";
    }

    public String descuento(){
        return "Vehiculo";
    }


}
