import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * @author R. Springer
 */
public class Level3 extends World {

    private CollisionEngine ce;

    /**
     * Constructor for objects of class MyWorld.
     *
     */
    public Level3() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1, false);
        this.setBackground("space2.png");
        
        int[][] map = {
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,35,58,58,58,37,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,27,27,27,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,38,-1,-1,38,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,27,27,27,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,182,-1,-1,-1,-1,-1,-1,-1,-1,-1,27,27,27,-1,-1,-1,-1,-1,-1,-1,-1,38,-1,-1,-1,-1,-1,-1,-1,-1,-1,12,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,38,-1,-1,-1,-1,-1,-1,-1,-1,38,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29,58,36,-1,-1,38,-1,-1,38,-1,-1,38,-1,-1,-1,-1,-1,-1,27,27,27,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,58,58,58,58,58},
{-1,68,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,27,27,27,-1,-1,-1,-1,-1,38,-1,-1,-1,-1,-1,-1,-1,-1,38,-1,-1,27,27,27,27,27},
{-1,67,-1,13,-1,-1,-1,38,-1,-1,38,-1,-1,38,-1,-1,-1,-1,-1,-1,181,-1,-1,-1,-1,-1,-1,38,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,38,-1,-1,-1,-1,-1,-1,-1,-1,-1,29,58,36,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,27,27,27,27,27},
{58,58,58,58,58,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,168,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,58,58,58,58,58,58,58,58,58,58,-1,-1,-1,-1,-1,-1,-1,-1,38,-1,-1,-1,-1,-1,27,27,27,27,27},
{27,27,27,27,27,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,58,58,58,-1,-1,-1,58,58,58,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,58,58,58,58,58,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,27,27,27,27,27,27,27,27,27,27,91,91,91,91,91,91,91,91,91,91,91,91,91,91,27,27,27,27,27},
{27,27,27,27,27,91,91,91,91,91,91,91,91,91,91,91,27,27,27,179,179,179,27,27,27,91,91,91,91,91,91,91,91,91,91,91,91,91,91,91,91,91,91,91,91,27,27,27,27,27,91,91,91,91,91,91,91,91,91,91,91,91,91,91,91,91,91,91,91,91,91,27,27,27,27,27,27,27,27,27,27,92,92,92,92,92,92,92,92,92,92,92,92,92,92,27,27,27,27,27},
{27,27,27,27,27,92,92,92,92,92,92,92,92,92,92,92,27,27,27,27,27,27,27,27,27,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,27,27,27,27,27,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,27,27,27,27,27,27,27,27,27,27,92,92,92,92,92,92,92,92,92,92,92,92,92,92,27,27,27,27,27},
{27,27,27,27,27,92,92,92,92,92,92,92,92,92,92,92,27,27,27,27,27,27,27,27,27,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,27,27,27,27,27,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,27,27,27,27,27,27,27,27,27,27,92,92,92,92,92,92,92,92,92,92,92,92,92,92,27,27,27,27,27},
{27,27,27,27,27,92,92,92,92,92,92,92,92,92,92,92,27,27,27,27,27,27,27,27,27,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,27,27,27,27,27,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,27,27,27,27,27,27,27,27,27,27,92,92,92,92,92,92,92,92,92,92,92,92,92,92,27,27,27,27,27},
{27,27,27,27,27,92,92,92,92,92,92,92,92,92,92,92,27,27,27,27,27,27,27,27,27,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,27,27,27,27,27,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,27,27,27,27,27,27,27,27,27,27,92,92,92,92,92,92,92,92,92,92,92,92,92,92,27,27,27,27,27},
{27,27,27,27,27,92,92,92,92,92,92,92,92,92,92,92,27,27,27,27,27,27,27,27,27,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,27,27,27,27,27,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,27,27,27,27,27,27,27,27,27,27,92,92,92,92,92,92,92,92,92,92,92,92,92,92,27,27,27,27,27},
{27,27,27,27,27,92,92,92,92,92,92,92,92,92,92,92,27,27,27,27,27,27,27,27,27,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,27,27,27,27,27,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,92,27,27,27,27,27,27,27,27,27,27,92,92,92,92,92,92,92,92,92,92,92,92,92,92,27,27,27,27,27},

                       };
        // Declareren en initialiseren van de TileEngine klasse om de map aan de world toe te voegen
        TileEngine te = new TileEngine(this, 60, 60, map);
        // Declarenre en initialiseren van de camera klasse met de TileEngine klasse 
        // zodat de camera weet welke tiles allemaal moeten meebewegen met de camera
        Camera camera = new Camera(te);
        // Declareren en initialiseren van een main karakter van het spel mijne heet Hero. Deze klasse 
        // moet de klasse Mover extenden voor de camera om te werken
        Hero hero = new Hero();

        // Laat de camera een object volgen. Die moet een Mover instatie zijn of een extentie hiervan.
        camera.follow(hero);

        // Alle objecten toevoegen aan de wereld: camera, main karakter en mogelijke enemies
        addObject(camera, 88, 612);
        addObject(hero, 88, 612);

        addObject(new Enemy(), 2492, 824); 
        addObject(new Door3(), 5908, 445);
        addObject(new DoorTop(), 5908, 390); 

        // Force act zodat de camera op de juist plek staat.
        camera.act();
        hero.act();

        // Initialiseren van de CollisionEngine zodat de speler niet door de tile heen kan lopen.
        // De collision engine kijkt alleen naar de tiles die de variabele solid op true hebben staan.
        ce = new CollisionEngine(te, camera);
        // Toevoegen van de mover instantie of een extentie hiervan
        ce.addCollidingMover(hero);
        
        prepare();
    }

    @Override
    public void act() {
        ce.update();
    }
    public void prepare()
    {
        PlayAgainTopLeft1 patl1 = new PlayAgainTopLeft1();
        addObject(patl1, 100, 40);
        HomeButton hb = new HomeButton();
        addObject(hb, 40, 40);
    }
}