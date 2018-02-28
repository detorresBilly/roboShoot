import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shop extends World
{
    public World mainWorld;
    /**
     * Constructor for objects of class Shop.
     * 
     */
    public Shop(World inWorld)
    {    
       super(1000, 600, 1); 
       mainWorld = inWorld;
       prepare();
    }
    
    public void prepare(){
        ButtonListener myListener = new ButtonListener();
        ShopButton splitBullet = new ShopButton("Split Bullet x5", 50, "splitbullet");
        addObject(splitBullet, 500, 300);
        addObject(myListener, 500, 300);
    }
    
    public void revertWorld(){
        Greenfoot.setWorld(mainWorld);
    }
}
