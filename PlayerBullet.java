import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerBullet extends Bullet
{
    public PlayerBullet(int dir) {
        super(dir);
    }   

    public void act(){
 super.act();
        if(destroyEnemies() || checkBounds()){
        remove();
    }
}

    public boolean destroyEnemies()
    {

        Actor tar = getOneIntersectingObject(Enemy.class);
        if(tar != null) 
        {
            getWorld().removeObject(tar);  
            return true;                
        }
        return false;
    }
}
