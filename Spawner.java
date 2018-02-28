import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spawner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spawner extends Actor
{
    int yRand = 0;
    public void EnemySpawn() {

        if(getWorld().getObjects(GreenDude.class).size() < 10){
            yRand = (Greenfoot.getRandomNumber(200) - 100);
            getWorld().addObject(new GreenDude(), getX(), getY()+ yRand);
        }
    }
    public void act() {
       EnemySpawn();
       turn(1);
    }    
}

