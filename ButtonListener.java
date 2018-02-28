import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class buttonListener here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonListener extends Actor
{
    double saveTime = System.currentTimeMillis();
    /**
     * Act - do whatever the buttonListener wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Shop thisShop = (Shop)getWorld();
        if(Greenfoot.isKeyDown("i") && System.currentTimeMillis() - 500 > saveTime){
            thisShop.revertWorld();
        }
    }    
}
