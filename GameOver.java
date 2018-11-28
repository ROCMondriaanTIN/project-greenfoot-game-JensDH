import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        super(1000, 800, 1, false);
        this.setBackground("bg.png");
        
        prepare();
    }
    private void prepare()
    {
        PlayAgain playAgain = new PlayAgain();
        addObject (playAgain, 500, 500);
        GameOver1 gameOver1= new GameOver1();
        addObject (gameOver1, 500, 300);
    }
}
