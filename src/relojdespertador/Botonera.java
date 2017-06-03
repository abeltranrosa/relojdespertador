package relojdespertador;

import java.time.LocalTime;

public class Botonera {

    /**
     * declaro atributos de tipo boolean con las funciones activar alarma,
     * configurar horars y minutos
     */
    static boolean alarmActive, setHr, setMin, ringON, setAlarm;

   

    /**
     * metodo encendido alarma
     */
    public boolean AlarmOn() {
        return alarmActive = true;
    }

    /**
     * metodo apagado alarma
     */
    public boolean AlarmOff() {
        return alarmActive = false;
    }

    /**
     * metodo configurar alarma en horas y minutos
     */
    public boolean configAlarm() {
        return setAlarm = true;
    }

    /**
     * metodo para configurar las horas del reloj
     */
    public boolean configHr() {
        return setHr = true;

    }

    /**
     * metodo para añadir 1 hora al reloj
     */
    public static void plusHr() {

    }

    /**
     * metodo para añadir 1 min al reloj
     */
    public void plusMin() {

    }

    /**
     * metodo para apagar el sonido de la alarma
     */
    public boolean stopAlarm() {
        return ringON = false;
    }

}
