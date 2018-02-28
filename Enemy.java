import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    private double savedTime = 0;
    int xAccel = 5;
    double yAccel = 5;
    double ySpeed = 1;
    public void destroyRobo()
    {

        Actor Robo = getOneIntersectingObject(Robo.class);
        if(Robo != null) 
        {
            World myWorld = getWorld();
            getWorld().removeObject(Robo);  
            getWorld().removeObject(this);                   
        }
    }

    
    public void act() 
    {
        destroyRobo();
    }
}
