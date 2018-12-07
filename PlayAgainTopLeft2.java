import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayAgainTopLeft2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayAgainTopLeft2 extends Mover
{
    /**
     * Act - do whatever the PlayAgainTopLeft2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)){ 
        Greenfoot.setWorld (new Level2());
    } 
    }    
}
