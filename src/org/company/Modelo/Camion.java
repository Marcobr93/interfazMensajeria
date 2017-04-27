package org.company.Modelo;

/**
 * Created by marco on 24/4/17.
 */
public class Camion extends Vehiculo implements CombustibleFosil {
    @Override
    public void repostar() {
        System.out.println("Repostar camión");
    }
}
