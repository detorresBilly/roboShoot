import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenDude extends Enemy
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

    public void shoot() {

        if((System.currentTimeMillis() - 200) > savedTime){
            for(int i = 0; i < 3; i++){
                getWorld().addObject(new BallBullet((Greenfoot.getRandomNumber(270) + 90)), getX(), getY());
            }
            savedTime = System.currentTimeMillis();
        }
    } 

    public void act() 
    {
       destroyRobo();
       movement();
    }
    public void movement() {
        if(getWorld() != null){
        if(getX() >= 799){
            xAccel = -5;
        }
        if(getX() <= 1){
            xAccel = 5;
        } 
        if (ySpeed < -50 || ySpeed > 50){
        yAccel = yAccel * -1;
        }
        ySpeed += yAccel;
        setLocation(getX()+xAccel, getY()+(int)ySpeed);
}
}
}
