import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    
    private GreenfootImage run1 = new GreenfootImage ("p1_walk01.png");
    private GreenfootImage run2 = new GreenfootImage ("p1_walk02.png");
    private GreenfootImage run3 = new GreenfootImage ("p1_walk03.png");
    private GreenfootImage run4 = new GreenfootImage ("p1_walk04.png");
    private GreenfootImage run5 = new GreenfootImage ("p1_walk05.png");
    private GreenfootImage run6 = new GreenfootImage ("p1_walk06.png");
    private GreenfootImage run7 = new GreenfootImage ("p1_walk07.png");
    private GreenfootImage run8 = new GreenfootImage ("p1_walk08.png");
    private GreenfootImage run9 = new GreenfootImage ("p1_walk09.png");
    private GreenfootImage run10 = new GreenfootImage ("p1_walk10.png");
    private GreenfootImage run11 = new GreenfootImage ("p1_walk11.png");
    
    private GreenfootImage run12 = new GreenfootImage ("p1_walk01_.png");
    private GreenfootImage run13 = new GreenfootImage ("p1_walk02_.png");
    private GreenfootImage run14 = new GreenfootImage ("p1_walk03_.png");
    private GreenfootImage run15 = new GreenfootImage ("p1_walk04_.png");
    private GreenfootImage run16 = new GreenfootImage ("p1_walk05_.png");
    private GreenfootImage run17 = new GreenfootImage ("p1_walk06_.png");
    private GreenfootImage run18 = new GreenfootImage ("p1_walk07_.png");
    private GreenfootImage run19 = new GreenfootImage ("p1_walk08_.png");
    private GreenfootImage run20 = new GreenfootImage ("p1_walk09_.png");
    private GreenfootImage run21 = new GreenfootImage ("p1_walk10_.png");
    private GreenfootImage run22 = new GreenfootImage ("p1_walk11_.png");
    
    private int frame = 1;
    private int frame2 = 1;

    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
    }
    
    @Override
    public void act() {
  
        getWorld().showText(getX() + "," + getY(),100,100);
        handleInput();
        removeKey();
    
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                Greenfoot.setWorld(new GameOver());
                break;
            }
        }
        for (Actor enemy : getIntersectingObjects(Death.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                Greenfoot.setWorld(new GameOver());
                break;
            }
        }
    }
    
    public void removeKey()
    {
    if (isTouching(BlueKey.class)) {
        removeTouching(BlueKey.class); 
    }
    
    if (isTouching(RedKey.class)) {
        removeTouching(RedKey.class); 
    }
    
    if (isTouching(Star.class)) {
        removeTouching(Star.class); 
    }
   }

    public void handleInput() {
        if (Greenfoot.isKeyDown("w")) {
            velocityY = -10;
        }

        if (Greenfoot.isKeyDown("a")) {
            velocityX = -2;
            animateLeft();
        } else if (Greenfoot.isKeyDown("d")) {
            velocityX = 2;
            animateRight();
        }
    }
    
      public void animateRight()
    {
        if (frame == 1)
        {
            setImage (run1);
        }
        else if (frame == 2)
        {
            setImage (run2);
        }
        else if (frame == 3)
        {
            setImage (run3);
        }
        else if (frame == 4)
        {
            setImage (run4);
        }
        else if (frame == 5)
        {
            setImage (run5);
        }
        else if (frame == 6)
        {
            setImage (run6);
        }
        else if (frame == 7)
        {
            setImage (run7);
        }
        else if (frame == 8)
        {
            setImage (run8);
        }
        else if (frame == 9)
        {
            setImage (run9);
        }
        else if (frame == 10)
        {
            setImage (run10);
        }
        else if (frame == 11)
        {
            setImage (run11);
            frame = 1;
            return;
        }
        frame ++;
    }
    
     public void animateLeft()
    {
        if (frame2 == 1)
        {
            setImage (run12);
        }
        else if (frame2 == 2)
        {
            setImage (run13);
        }
        else if (frame2 == 3)
        {
            setImage (run14);
        }
        else if (frame2 == 4)
        {
            setImage (run15);
        }
        else if (frame2 == 5)
        {
            setImage (run16);
        }
        else if (frame2 == 6)
        {
            setImage (run17);
        }
        else if (frame2 == 7)
        {
            setImage (run18);
        }
        else if (frame2 == 8)
        {
            setImage (run19);
        }
        else if (frame2 == 9)
        {
            setImage (run20);
        }
        else if (frame2 == 10)
        {
            setImage (run21);
        }
        else if (frame2 == 11)
        {
            setImage (run22);
            frame2 = 1;
            return;
        }
        frame2 ++;
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
}
