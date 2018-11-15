import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Enemy extends Mover {

    private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;
    
    private GreenfootImage run1 = new GreenfootImage ("flyFly1.png");
    private GreenfootImage run2 = new GreenfootImage ("flyFly2.png");
    private int frame = 1;
    
    public Enemy() {
        super();
        getImage().mirrorHorizontally();
        setImage("flyFly1.png");
        walkRange = 140;
        firstAct = true;
        speed = 1;
    }
    public void animate()
    {
        if (frame == 1)
        {
            setImage (run1);
        }
        else if (frame == 2)
        {
            setImage (run2);
            frame = 1;
            return;
        }
        frame ++;
    }
    
    @Override
    public void act() {
        int x = getX();
        int y = getY();
        animate();

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
