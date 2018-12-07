import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverLevel3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverLevel3 extends GameOver
{

    /**
     * Constructor for objects of class GameOverLevel3.
     * 
     */
    public GameOverLevel3()
    {
    }
    private void prepare()
    {
        PlayAgain1 playAgain1 = new PlayAgain1();
        addObject (playAgain1, 350, 500);
        GameOver1 gameOver1= new GameOver1();
        addObject (gameOver1, 500, 300);
        SelectButton sb = new SelectButton(); 
        addObject (sb, 650,500);
    }
}
