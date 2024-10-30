package proyecto_pdoo;

public class Mejoras_experiencia extends Mejoras{

    private int increaseExp;

    //----------------------------------- CONSTRUCTORES ---------------------------------------------//

    /**
     * Constructor por defecto
     */
    public Mejoras_experiencia(){
        this("", "", "", 0, null, 0);
    }

    /**
     * Constructor por parámetros
     * @param name String
     * @param description String
     * @param pathImage String
     * @param prize int
     * @param obj ObjetoClicker
     * @param increaseExp int
     */
    public Mejoras_experiencia(String name, String description, String pathImage, int prize, ObjetoClicker obj, int increaseExp) {
        super(name, description, pathImage, prize, obj);
        this.increaseExp = increaseExp;
    }

    /**
     * Constructor de copia
     * @param otro Mejoras_monedas
     */
    public Mejoras_experiencia(Mejoras_experiencia otro){
        this(otro.getName(), otro.getDescription(), otro.getPathImage(), otro.getPrize(), otro.getObj(), otro.increaseExp);
    }


    //----------------------------------- Getter y setters ---------------------------------------------//

    /**
     * Getter increaseCoins
     * @return int
     */
    public int getIncreaseExp() {
        return increaseExp;
    }

    /**
     * Setter increasecoins
     * @param increaseExp int
     */
    public void setIncreaseExp(int increaseExp) {
        this.increaseExp = increaseExp;
    }


    //----------------------------------- FUNCIONES ---------------------------------------------//

    //------ Añade experiencia al total.

    /**
     * Método addExp.
     * Suma la experiencia actual con la del parámetro.
     */
    public void addExp(){
        super.getObj().getExp().addExp(this.increaseExp);
        super.buyUpgrade(this.prize);
    }


    //----------------------------------- OTROS ---------------------------------------------//


    @Override
    public String toString() {
        return  "Name=" + super.getName() +
                ", description= " + super.getDescription() +
                ", pathImage= " + super.getPathImage() +
                ", prize= " + super.getPrize() +
                ", increaseExp= " + this.increaseExp;
    }
}
