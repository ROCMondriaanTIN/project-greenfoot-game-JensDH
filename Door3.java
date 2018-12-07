import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door3 extends Mover
{
    /**
     * Act - do whatever the Door1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    if(getOneIntersectingObject(Hero.class)!= null && getWorld().getObjects(RedKey.class).isEmpty())
    {
     Greenfoot.setWorld(new Level2());
    }
     applyVelocity();
    }       
}
