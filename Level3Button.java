import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3Button extends Mover
{
    /**
     * Act - do whatever the Level3Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        Greenfoot.setWorld(new Level3());
    }    
}
