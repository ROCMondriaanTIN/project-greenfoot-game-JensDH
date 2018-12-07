import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScorenBord here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScorenBord extends Mover
{
    public boolean RedKey = false;

    /**
     * Act - do whatever the ScorenBord wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
   
    public void act() {
        
    }
    
        public void RedKeyHud() {
         RedKey = true;
         getWorld().addObject(new RedKeyHud(), 150, 750);
    }
}