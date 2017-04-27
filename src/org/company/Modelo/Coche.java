package org.company.Modelo;

/**
 * Created by marco on 24/4/17.
 */
public class Coche extends Vehiculo implements Electrico{
    @Override
    public void recargarBateria() {
        System.out.println("Recargar coche");
    }
}
