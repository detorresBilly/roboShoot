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
    int xAccel = Greenfoot.getRandomNumber(5) + 1;
    double yAccel = 1;
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
                getWorld().addObject(new BallBullet((Greenfoot.getRandomNumber(270))), getX(), getY());
            }
            savedTime = System.currentTimeMillis();
        }
    } 

    public void act() {
        turnTowards(400, 600);
        movement();
        if (Greenfoot.getRandomNumber(100) == 1){
        shoot();
    }
}
    public void movement() {
        if(getX() >= MyWorld.getWorldWidth() -1){
            xAccel = -5 + Greenfoot.getRandomNumber(3);
        }
        if(getX() <=0){
            xAccel = 5 - Greenfoot.getRandomNumber(3);
        } 
    if (ySpeed < -12 || ySpeed > 12){
        yAccel = yAccel * -1;
    }
    ySpeed += yAccel;
    setLocation(getX()+xAccel, getY()+(int)ySpeed);
}
}
