import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    private int direction, speed;

    public int getSpeed(){
        return speed;
    }

    public int getDirection(){
        return direction;
    }

    public Bullet(int dir)
    {
        GreenfootImage image = getImage();
        image.scale(10, 10);
        direction = dir;
        speed = 15;

    } 
    public void act() 
    {
        setRotation(getDirection());
        move(getSpeed()); 
    }

    public boolean checkBounds(){
        if(getX() >= 799){
            return true;
        }
        if(getY() >= 599){
            return true;
        }
        if(getY() <= 1){
            return true;
        }
        if(getX() <= 1){
            return true;
        }    
        return false;
    }

    public void remove(){

        World myWorld = getWorld(); 
        getWorld().removeObject(this);  

    }
}
