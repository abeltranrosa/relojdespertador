package relojdespertador;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class RelojDespertador {

    public static LocalTime hora;
    public static LocalTime alarma;
    private static Object timer;

    /**
     *
     * menu options
     */
    public static void main() {
        hora = LocalTime.of(0, 0);
        alarma = LocalTime.of(13, 04);
        Boolean quedarse = true;
       
        TimerTask task;
        task = new TimerTask() {
            @Override
            public void run() {
                if (alarma.getHour() == (LocalTime.now().getHour() + hora.getHour())
                        && alarma.getMinute() == (LocalTime.now().getMinute() + hora.getMinute())
                        && Botonera.alarmActive == true
                        && Altavoz.ringON == true) {
                    Altavoz.playSound();
                } else {
                    Display.showHr();
                }
            }
        };

        do {//configure hour , configure alarm ,alarm on, off and stop alarm

            int option = Integer.parseInt(JOptionPane.showInputDialog("\n 1: Configurar Hr \n 2: Configurar alarma \n 3 : Alarma on \n 4: Alarma off\n 5: Stop Alarma"));
            switch (option) {
                case 1:
                    Botonera.setHr();

                    break;
                case 2:
                    Botonera.alarmActive();

                    break;
                case 3:
                    Botonera.ringON();

                    break;
                case 4:
                    Botonera.alarmOFF();

                    break;
                case 5:
                    Botonera.alarmOFF();
                    quedarse = false;
                    break;

            }
        } while (quedarse);

       System.exit(0);
    }
}
