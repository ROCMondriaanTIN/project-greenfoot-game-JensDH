import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Slime extends Mover {

    private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;
    
  
    private int frame = 1;
    
    public Slime() {
        super();
        getImage().mirrorHorizontally();
        
        walkRange = 500;
        firstAct = true;
        speed = 5;
    }

    
    @Override
    public void act() {
        int x = getX();
        int y = getY();
       

        if (firstAct) {
            firstAct = false;
            xMin = x - walkRange / 2;
            xMax = x + walkRange / 2;
        }

        velocityX = speed;
        applyVelocity();
        if (getX() >= xMax) {
            speed *= -1;
            x = xMax;
            getImage().mirrorHorizontally();
        } else if (getX() <= xMin) {
            speed *= -1;
            x = xMin;
            getImage().mirrorHorizontally();
        }
    }
}