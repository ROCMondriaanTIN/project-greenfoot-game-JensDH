import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Controls here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Controls extends World
{

    /**
     * Constructor for objects of class Controls.
     * 
     */
    public Controls()
    {    
        super(1000, 800, 1, false);
        this.setBackground("space3.png");
        prepare();
    }
    public void prepare()
    {
        ControlKeys ck = new ControlKeys();
        addObject(ck, 500, 400);
        HomeButton hb = new HomeButton();
        addObject(hb, 40, 40);
    }
}
