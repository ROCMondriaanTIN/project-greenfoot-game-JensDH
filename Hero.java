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
    
    int HeroCoin1 = 0;
    int HeroCoin2 = 0;
    int waardeCoin = 1;

    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
    }
    
    @Override
    public void act() {
        getWorld().showText(getX() + "," + getY(),100,100);
        handleInput();
        removeItems();
    
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                getWorld().removeObject(enemy);
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
    
    
    public void removeItems()
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
        if (isTouching(HeroCoin1.class)) {
        waardeCoin = 2;
        removeTouching(HeroCoin1.class); 
    }
}

    public void handleInput() {
        if (Greenfoot.isKeyDown("w")) {
            velocityY = -20;
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
        if(frame == 1)
        {
        setImage("p"+waardeCoin+"_walk01.png");
        }
        else if(frame == 2)
        {
        setImage("p"+waardeCoin+"_walk02.png");
        }
       else if(frame == 3)
        {
        setImage("p"+waardeCoin+"_walk03.png");
        }
        else if(frame == 4)
        {
        setImage("p"+waardeCoin+"_walk04.png");
        }
        else if(frame == 5)
        {
        setImage("p"+waardeCoin+"_walk05.png");
        }
        else if(frame == 6)
        {
        setImage("p"+waardeCoin+"_walk06.png");
        }
       else if(frame == 7)
        {
        setImage("p"+waardeCoin+"_walk07.png");
        }
        else if(frame == 8)
        {
        setImage("p"+waardeCoin+"_walk08.png");
        }
        else if(frame == 9)
        {
        setImage("p"+waardeCoin+"_walk09.png");
    {
       
        frame = 1;
        return;
        }

      
        }
        frame ++;
    }
    
    public void animateLeft()
    {
            if(frame == 1)
        {
        setImage("p"+waardeCoin+"_walk01mirrored.png");
        }
        else if(frame == 2)
        {
        setImage("p"+waardeCoin+"_walk02mirrored.png");
        }
       else if(frame == 3)
        {
        setImage("p"+waardeCoin+"_walk03mirrored.png");
        }
        else if(frame == 4)
        {
        setImage("p"+waardeCoin+"_walk04mirrored.png");
        }
        else if(frame == 5)
        {
        setImage("p"+waardeCoin+"_walk05mirrored.png");
        }
        else if(frame == 6)
        {
        setImage("p"+waardeCoin+"_walk06mirrored.png");
        }
       else if(frame == 7)
        {
        setImage("p"+waardeCoin+"_walk07mirrored.png");
        }
        else if(frame == 8)
        {
        setImage("p"+waardeCoin+"_walk08mirrored.png");
        }
        else if(frame == 9)
        {
        setImage("p"+waardeCoin+"_walk09mirrored.png");
        }
        setImage("p"+waardeCoin+"_walk10mirrored.png");
        { 
        setImage("p"+waardeCoin+"_walk11mirrored.png" );
        {
        
     
        frame = 1;
        return;
        }
        frame ++;
        }
    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
}
