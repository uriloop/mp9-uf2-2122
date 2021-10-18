package a1;

/**
 * Created by jordi on 06/12/16.
 * Procés monitorCargola: Monitoritza el punts acumulats d'un Cargol
 * Mòdul M9. Activitat 2. Exercici 1
 * Necessita de Cargol.java i CursaCargols.java
 */

public class monitorCargols implements Runnable {
    private Cargol cargol;

    public monitorCargols(Cargol c) {
        cargol = c;
    }

    @Override
    public void run() {
        System.out.println(cargol.getNom()  + " acumula " + cargol.getMetres() + " metres");
    }
}
