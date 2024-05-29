package vehiculos;

public class Camion extends Vehiculos{

    private int kgMax;
    private static final double DTO = 3.00;

    public Camion(String brand, String model, int year, int wheels, int kgMax, double price) {
        super(brand, model, year, wheels, price);
        this.kgMax = kgMax;
    }

    public Camion() {
    }

    public int getKgMax() {
        return kgMax;
    }

    public void setKgMax(int kgMax) {
        this.kgMax = kgMax;
    }

    @Override
    public String toString() {
        return "Camion [brand=" + brand + ", kgMax=" + kgMax + ", model=" + model + ", year=" + year + ", wheels="
                + wheels + ", price=" + price + "]";
    }

    public String descuento(){
        double pvpDto =  price*(1-(DTO/100));
        return "Camion " + brand +" modelo "+model+" del año "+year+" tiene "+wheels+" ruedas y cuesta "+price+"€. Ahora con descuento de "+DTO+"% te lo llevas por "+pvpDto;
    }

    

    
}
