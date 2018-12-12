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
        this.setBackground("space3.png");
        prepare();
    }
    private void prepare()
    {
        PlayAgain1 playAgain1 = new PlayAgain1();
        addObject(playAgain1, 350, 500);
        GameOver1 gameOver1= new GameOver1();
        addObject(gameOver1, 500, 300);
        SelectButton sb = new SelectButton(); 
        addObject(sb, 650,500);
        HomeButton hb = new HomeButton();
        addObject(hb, 40, 40);
    }
}
