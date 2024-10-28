package proyecto_pdoo;

/**
 *
 * @author Dani
 */
public class Proyecto_PDOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ObjetoClicker objeto = new ObjetoClicker();
        System.out.println(objeto.toString());

        objeto.getExp().addExp(100);
        objeto.getExp().addExp(100);
        objeto.getExp().addExp(10000);
        System.out.println(objeto.toString());
    }
    
}
