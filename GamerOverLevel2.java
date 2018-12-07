import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GamerOverLevel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GamerOverLevel2 extends GameOver
{

    /**
     * Constructor for objects of class GamerOverLevel2.
     * 
     */
    public GamerOverLevel2()
    {
    }
    private void prepare()
    {
        PlayAgainTopLeft1 playAgain = new PlayAgainTopLeft1();
        addObject (playAgain, 350, 500);
        GameOver1 gameOver1= new GameOver1();
        addObject (gameOver1, 500, 300);
        SelectButton sb = new SelectButton(); 
        addObject (sb, 650,500);
    }
}
