import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spawner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spawner extends Actor
{
    public void EnemySpawn() {
        if(getWorld().getObjects(Enemy.class).size() < 3){
            getWorld().addObject(new Enemy(), getX(), 50);
        }
    }
    public void act() 
    {
       EnemySpawn();
       turn(1);
    }    
}

