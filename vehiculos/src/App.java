import java.util.ArrayList;

import vehiculos.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        ArrayList<Coche> coches = new ArrayList<>();
        coches.add(new Coche("Volvo","XC90", 2024, 4, 5, 250,54350));
        coches.add(new Coche("BMW","M2",2023, 4, 4, 450, 89000));

        ArrayList<Moto> motos = new ArrayList<>();
        motos.add(new Moto("Yamaha", "TMAX", 2024, 2, 560, 16700));
        motos.add(new Moto("Honda", "X-ADV", 2023, 2, 350, 12500));

        ArrayList<Camion> camiones = new ArrayList<>();
        camiones.add(new Camion("MAN", "TGS",2020,8,1500, 46500));
        camiones.add(new Camion("MercedesBenz", "2643",2022,6,1500, 70000));

        // - ¿Cómo harías un arraylist mixto con coches, motos y camiones?

        ArrayList<Vehiculos> vehiculos = new ArrayList<>();
        
        vehiculos.add(new Coche("Volvo","XC90", 2024, 4, 5, 250, 54350));
        vehiculos.add(new Coche("BMW","M2",2023, 4, 4, 450, 89000));
        vehiculos.add(new Moto("Yamaha", "TMAX", 2024, 2, 560, 16700));
        vehiculos.add(new Moto("Honda", "X-ADV", 2023, 2, 350, 12500));
        vehiculos.add(new Camion("MAN", "TGS",2020,8,1500, 46500));
        vehiculos.add(new Camion("MercedesBenz", "2643",2022,6,1500, 70000));


        for (Vehiculos v : vehiculos) {
            System.out.println(v);
        }

        // - Prueba a recorrer cada array por características, del tipo: todos los nombres, marcas precios, etc
        System.out.println();
        System.out.println("Recorrer ArrayList y mostrar una característica concreta:");
        for (Coche c : coches) {
            System.out.println(c.getBrand());
        }

        // - ¿Cómo encontrarías un modelo en específico en cada arraylist?
        System.out.println();
        System.out.println("Buscar un modelo especifico en arraylist");
        for (int i = 0; i<motos.size();i++){
            if (motos.get(i).getModel().equalsIgnoreCase("tmax")) {
                System.out.println("La he encontrado, está en la posición "+(i+1));
            }
        }
        // - ¿Cómo guardarías todas las marcas aparte?
        System.out.println();
        System.out.println("Guardar marcas en un Array: ");
        ArrayList<String> marcas = new ArrayList<>();

        for (Vehiculos v : vehiculos) {
            marcas.add(v.getBrand());
        }
        System.out.println(marcas);

        // +EXTRA: Puedes añadir un descuento global por fin de temporada, que afecte a todas las clases. ¿Cómo lo harías?
        System.out.println();
        System.out.println("Descuento global diferente por tipo:");
        for (Vehiculos v : vehiculos) {
            System.out.println(v.descuento());
        }
    } 
}


