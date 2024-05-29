package vehiculos;

public class Moto extends Vehiculos {
    
    private int cc;
    private static final double DTO = 5.00;

    public Moto(String brand, String model, int year, int wheels, int cc, double price) {
        super(brand, model, year, wheels, price);
        this.cc = cc;
    }

    public Moto() {
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
    

    @Override
    public String toString() {
        return "Moto [brand=" + brand + ", cc=" + cc + ", model=" + model + ", year=" + year + ", wheels=" + wheels
                + ", price=" + price + "]";
    }


    @Override
    public String descuento(){
        final double pvpDto =  price*(1.00-(DTO/100));
        return "Moto " + brand +" modelo "+model+" del año "+year+" tiene "+wheels+" ruedas, tiene "+cc+"cc y cuesta "+price+"€. Ahora con descuento de "+DTO+"% te lo llevas por "+pvpDto;
    }

   
    

}
