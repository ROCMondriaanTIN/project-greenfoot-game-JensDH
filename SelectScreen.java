import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Select here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectScreen extends World
{
    public SelectScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        this.setBackground("bg.png");
        prepare();
    }
    private void prepare()
    {
        SelectLevel sl = new SelectLevel();
        addObject (sl, 500, 100);
        Level1Button lb1 = new Level1Button();
        addObject(lb1, 200, 400);
        Level2Button lb2 = new Level2Button();
        addObject(lb2, 400, 400);
        Level3Button lb3 = new Level3Button();
        addObject (lb3, 600, 400);
        Level4Button lb4 = new Level4Button();
        addObject (lb4, 800, 400);
    }
}
