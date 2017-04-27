package org.company.Modelo;

/**
 * Created by marco on 24/4/17.
 */
public class Furgoneta extends Vehiculo implements Hibrido{
    @Override
    public void recargarBateria() {
        System.out.println("Recargar furgoneta");
    }

    @Override
    public void repostar() {
        System.out.println("Repostar furgoneta");
    }
}
