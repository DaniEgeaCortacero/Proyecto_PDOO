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

    //-------- name

    /**
     * Getter name
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Setter name
     * @param name String
     */
    public void setName(String name) {
        this.name = name;
    }

    //-------- description

    /**
     * Getter description
     * @return String
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter description
     * @param description String
     */
    public void setDescription(String description) {
        this.description = description;
    }

    //-------- pathImage

    /**
     * Getter pathImage
     * @return String
     */
    public String getPathImage() {
        return pathImage;
    }

    /**
     * Setter pathImage
     * @param pathImage String
     */
    public void setPathImage(String pathImage) {
        this.pathImage = pathImage;
    }

    //-------- prize

    /**
     * Getter prize
     * @return int
     */
    public int getPrize() {
        return prize;
    }

    /**
     * Setter prize
     * @param prize int
     */
    public void setPrize(int prize) {
        this.prize = prize;
    }
    
    //-------- ObjetoClicker

    /**
     * Getter obj
     * @return ObjetoClicker
     */
    public ObjetoClicker getObj() {
        return obj;
    }

    /**
     * Setter obj
     * @param obj ObjetoClicker 
     */
    public void setObj(ObjetoClicker obj) {
        this.obj = obj;
    }
    
    


    //----------------------------------- FUNCIONES ---------------------------------------------//

    //------ Añade experiencia al total.

    /**
     * Método addExp.
     * Suma la experiencia por clic actual con la del parámetro.
     */
    public void addExpPerClic(){
        this.getObj().getExp().addNExpClic(this.increaseExp);
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
