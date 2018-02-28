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
<<<<<<< HEAD
        if(getWorld().getObjects(GreenDude.class).size() < 1){
            yRand = (Greenfoot.getRandomNumber(200) - 100);
            getWorld().addObject(new GreenDude(), getX(), getY()+ yRand);
=======
        if(getWorld().getObjects(Enemy.class).size() < 5){
            getWorld().addObject(new Enemy(), getX(), 50);
>>>>>>> 0bbf5b966dbcced711a3a78d9e208110a0b668a8
        }
    }
    public void act() 
    {
       EnemySpawn();
       turn(1);
    }    
}

