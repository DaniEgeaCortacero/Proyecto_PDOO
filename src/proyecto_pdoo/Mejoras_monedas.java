package proyecto_pdoo;

public class Mejoras_monedas extends Mejoras{

    private int increaseCoins;

    //----------------------------------- CONSTRUCTORES ---------------------------------------------//

    /**
     * Constructor por defecto
     */
    public Mejoras_monedas(){
        this("", "", "", 0, null, 0);
    }

    /**
     * Constructor por parámetros
     * @param name String
     * @param description String
     * @param pathImage String
     * @param prize int
     * @param obj ObjetoClicker
     * @param increaseCoins int
     */
    public Mejoras_monedas(String name, String description, String pathImage, int prize, ObjetoClicker obj, int increaseCoins) {
        super(name, description, pathImage, prize, TipoMejoras.MEJORAS_MONEDAS, obj);
        this.increaseCoins = increaseCoins;
    }

    /**
     * Constructor de copia
     * @param otro Mejoras_monedas
     */
    public Mejoras_monedas(Mejoras_experiencia otro){
        this(otro.getName(), otro.getDescription(), otro.getPathImage(), otro.getPrize(), otro.getObj(), otro.getIncreaseExp());
    }


    //----------------------------------- Getter y setters ---------------------------------------------//

    //-------- increaseCoins
    
    /**
     * Getter increaseCoins
     * @return int
     */
    public int getIncreaseCoins() {
        return increaseCoins;
    }

    /**
     * Setter increasecoins
     * @param increaseCoins int
     */
    public void setIncreaseCoins(int increaseCoins) {
        this.increaseCoins = increaseCoins;
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


    //------ Añadir o quitar monedas totales.

    /**
     * addCoins
     * Añade o quita monedas del total según el parámetro.
     */
    public void addCoins(){
        this.getObj().getMonedas().addCoins(this.increaseCoins);
        super.buyUpgrade();
    }


    //------ Añadir monedas por click

    /**
     * addCoinsClick
     * Suma las monedas por clic actuales con el parámetro.
     */
    public void addCoinsClick(){
        super.obj.getMonedas().addCoinsClick(this.increaseCoins);
        super.buyUpgrade();
    }


    //----------------------------------- OTROS ---------------------------------------------//


    @Override
    public String toString() {
        return  "Name=" + super.getName() +
                ", description= " + super.getDescription() +
                ", pathImage= " + super.getPathImage() +
                ", prize= " + super.getPrize() +
                ", increaseCoins= " + this.increaseCoins;
    }
}
