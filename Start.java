import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{

    /**
     * Constructor for objects of class Start.
     * 
     */
    public Start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        this.setBackground("space3.png");
        prepare();
    }
    private void prepare()
    {
        Play play = new Play();
        addObject(play, 500, 200);
        SelectButton sb = new SelectButton();
        addObject(sb, 500, 400);
        ConrtolsButton cb = new ConrtolsButton();
        addObject(cb, 500, 600);
    }
}
