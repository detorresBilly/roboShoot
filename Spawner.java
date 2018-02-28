import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spawner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spawner extends Actor
{
    int yRand;
    public void EnemySpawn() {
        if(getWorld().getObjects(GreenDude.class).size() < 1){
            yRand = (Greenfoot.getRandomNumber(200) - 100);
            getWorld().addObject(new GreenDude(), getX(), getY()+ yRand);
        }
    }
    
    public int getYSpawn(){
        return getY() + yRand;
    }
    

    public void act() 
    {
       EnemySpawn();
       turn(1);
    }    
}

