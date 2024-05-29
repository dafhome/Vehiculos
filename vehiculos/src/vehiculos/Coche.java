package vehiculos;

public class Coche extends Vehiculos{
    
    private int doors;
    private int cv;
    private static final double DTO = 10.00;
    public Coche(String brand, String model, int year, int wheels, int doors, int cv, double price) {
        super(brand, model, year, wheels, price);
        this.doors = doors;
        this.cv = cv;
    }
    public Coche() {

    }
    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public int getCv() {
        return cv;
    }
    public void setCv(int cv) {
        this.cv = cv;
    }
    @Override
    public String toString() {
        return "Coche [brand=" + brand + ", doors=" + doors + ", model=" + model + ", cv=" + cv + ", year=" + year
                + ", wheels=" + wheels + ", price=" + price + "]";
    }

    public String descuento(){
        double pvpDto =  price*(1-(DTO/100));
        return "Coche " + brand +" modelo "+model+" del año "+year+" tiene "+wheels+" ruedas, "+cv+" cv, "+doors+" puertas y cuesta "+price+"€. Ahora con descuento de "+DTO+"% te lo llevas por "+pvpDto;
    }


}
