package relojdespertador;

public class Altavoz {

    /**
     * declaro 2 atributos de tipo String melodia y boolean ringON
     */
    private static String melodia;
    static boolean ringON;

    static void playSound() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * creo el metodo que genere una melodia cuando suene el altavoz
     */
    public boolean playSound(boolean active) {
        if (active == false) {
            return ringON = true;
        } else {
            return ringON = false;
        }
    }
}
