package vehiculos;

public class Vehiculos implements Interface {

    /**
     * Instanciamos en esta clase el tipo vehiculo extendida por las clases Camión,
     * Coche y
     * Moto.
     * Se implementa también un interface con el descuento
     * 
     * @params = brand{String} -Marca-, model{String} modelo, year{int} año,
     *         wheels{int} numero de ruedas, price{double} precio en euros
     */

    protected String brand;
    protected String model;
    protected int year;
    protected int wheels;
    protected double price;


    /**
     * función constructora del objeto
     * @param brand {String} marca
     * @param model {String} modelo
     * @param year {int} año
     * @param wheels {int} numero de ruedas
     * @param price {int} precio en euros
     * @return una instancia del objeto {Vehiculos}
     */
    public Vehiculos(String brand, String model, int year, int wheels, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.wheels = wheels;
        this.price = price;

    }

    /**
     * función constructor vacio
     */
    public Vehiculos() {
    }

    /**
     * Función get de la marca
     * @return marca vehiculos
     */
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

    /**
     * toString personalizado
     * @return marca, modelo, año, nº de ruedas y precio como un {String}
     */
    @Override
    public String toString() {
        return "Vehiculos [brand=" + brand + ", model=" + model + ", year=" + year + ", wheels=" + wheels + ", price="
                + price + "]";
    }


    /**
     * toString personalizado descuento
     * @return descuento {String}
     */
    public String descuento() {
        return "Vehiculo";
    }

}
