package proyecto_pdoo;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author forza
 */
public class Mejoras_tiempo extends Mejoras{
    private int n_clicks;
    private Timer timer;
    private TimerTask task;
    private boolean isPaused;
    
    //----------------------------------- CONSTRUCTORES ---------------------------------------------//

    /**
     * Constructor por defecto.
     */
    public Mejoras_tiempo(){
        this(1, "", "", "", 0, null);
    }
    
    /**
     * Constructor por parámetros.
     * @param n_clicks int
     * @param name String
     * @param description String
     * @param pathImage String
     * @param prize int
     * @param obj ObjetoClicker
     */
    public Mejoras_tiempo(int n_clicks, String name, String description, String pathImage, int prize, ObjetoClicker obj) {
        super(name, description, pathImage, prize, obj);
        this.n_clicks = n_clicks;
        this.isPaused = false;
        timer = new Timer();
    }
    
    /**
     * Constructor de copia.
     * @param otro Mejoras_temporales
     */
    public Mejoras_tiempo(Mejoras_tiempo otro){
        this(otro.n_clicks, otro.name, otro.description, otro.pathImage, otro.prize, otro.obj);
    }
    
    
    //----------------------------------- GETTER Y SETTERS ---------------------------------------------//
    
    //-------- n_clicks
    
    public int getN_clicks() {
        return n_clicks;
    }

    public void setN_clicks(int n_clicks) {
        this.n_clicks = n_clicks;
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
    
    public void autoClicks(){
        
        task = new TimerTask(){
            public void run(){
                if(Mejoras_tiempo.this.obj != null){
                    Mejoras_tiempo.this.obj.doClick();
                    System.out.println(Mejoras_tiempo.this.obj);
                } else {
                    System.err.println("El objeto está vacío.");
                    timer.cancel();
                }
            }
        };
        
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
    
    public void runStop() {
        isPaused = true;
        System.out.println("Ejecución de "+this.name+" pausada.");
    }
    
    public void runStart() {
        isPaused = false;
        System.out.println("Ejecución de "+this.name+" reanudada.");
    }
    
    
    //----------------------------------- OTROS ---------------------------------------------//

    @Override
    public String toString() {
        return super.toString()+
            ", n_clicks= " + this.n_clicks +
            ", isPaused= " + this.isPaused;
    }

    
}
