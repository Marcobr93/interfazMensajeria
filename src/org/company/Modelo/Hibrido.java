package org.company.Modelo;

/**
 * Created by marco on 24/4/17.
 */
/*
Interfaces anidadas: esto resuelve el problema de la herencia sobre la herencia múltiple, la interfaz permite heredar
de dos clases a la vez y resolver el problema.
Una clase no puede implementar dos interfaces que tenga métodos con el mismo nombre.
Para implementar dos contantes con el mismo nombre pero de dos interfaces distintas, usamos la anotación
punto: constante.nombreInterfaz
*/
public interface Hibrido extends CombustibleFosil, Electrico {
}
