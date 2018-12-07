
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    
    private int frame = 1;
    private int frame2 = 1;
    
    int waardeCoin = 1;
    
    private boolean RedKey = false;
    ScorenBord sb;

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
        RedKey();
    
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
    if (isTouching(HeroCoin1.class)) {
        waardeCoin = 2;
        removeTouching(HeroCoin1.class); 
    }
    if (isTouching(HeroCoin2.class)) {
        waardeCoin = 3;
        removeTouching(HeroCoin2.class); 
    }
}

    public void RedKey()
    {
        if(isTouching(RedKey.class))
        {
            RedKey = true;
            removeTouching(RedKey.class);
            sb.RedKeyHud();
        }
    }

    public void handleInput() {
        if (Greenfoot.isKeyDown("w"))
        {
            velocityY = -15;
        }
        if (Greenfoot.isKeyDown("a")|| Greenfoot.isKeyDown("left"))
        {
            velocityX = -10;
            animateLeft();
        }
        if (Greenfoot.isKeyDown("d")|| Greenfoot.isKeyDown("right"))
        {
            velocityX = 10;
            animateRight();
        }
        if(Greenfoot.isKeyDown("shift") && Greenfoot.isKeyDown("a")
        || Greenfoot.isKeyDown("shift") && Greenfoot.isKeyDown("left"))
        {
            velocityX -= 3;
        }
        if(Greenfoot.isKeyDown("shift") && Greenfoot.isKeyDown("d")
        || Greenfoot.isKeyDown("shift") && Greenfoot.isKeyDown("right"))
        {
            velocityX += 3;
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
        }
        else if(frame == 10)
        {
         setImage("p"+waardeCoin+"_walk10.png");
        }
        if(frame == 11)
        {
         setImage("p"+waardeCoin+"_walk11.png");
        
        frame = 1;
        return;
        }
        frame ++;
    }

    
    public void animateLeft()
    {
        if(frame == 1)
        {
        setImage("p"+waardeCoin+"_walk01_.png");
        }
        else if(frame == 2)
        {
        setImage("p"+waardeCoin+"_walk02_.png");
        }
        else if(frame == 3)
        {
        setImage("p"+waardeCoin+"_walk03_.png");
        }
        else if(frame == 4)
        {
        setImage("p"+waardeCoin+"_walk04_.png");
        }
        else if(frame == 5)
        {
        setImage("p"+waardeCoin+"_walk05_.png");
        }
        else if(frame == 6)
        {
        setImage("p"+waardeCoin+"_walk06_.png");
        }
        else if(frame == 7)
        {
        setImage("p"+waardeCoin+"_walk07_.png");
        }
        else if(frame == 8)
        {
        setImage("p"+waardeCoin+"_walk08_.png");
        }
        else if(frame == 9)
        {
        setImage("p"+waardeCoin+"_walk09_.png");
        }
        else if (frame == 10)
        {
        setImage("p"+waardeCoin+"_walk10_.png");
        }
        else if (frame == 11)
        {
        setImage("p"+waardeCoin+"_walk11_.png" );
        
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
