package relojdespertador;

import java.sql.Time;

public class Display {

    public static boolean ledClock, ledAlarm, ledSet;

    /**
     * showLeds permite activar todos los botones y descargar las funciones
     *
     * @param showAlarm ON/OFF led from ledAlarm
     * @param showClock ON/OFF led from ledClock
     * @param showSet ON/OFF led from ledSet
     */

    /**
     * showLeds permite activar todos los botones y descargar las funciones
     */
    public static void showHrMin() {

    }

    static void showHr() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void showAlarm() {

    }

    public static void showLeds(boolean showClock, boolean showSet, boolean showAlarm) {
        ledClock = showClock;
        ledSet = showSet;
        ledAlarm = showAlarm;
    }

    /**
     * metodo para mostrar el tiempo real en el reloj
     *
     * @param tiempo
     */
    public void showClock(Time tiempo) {

    }

    /**
     * metodo para mostrar la horar a la que salta la alarma
     *
     * @param alarma
     */
    public void showAlarm(Time alarma) {
    }
}
