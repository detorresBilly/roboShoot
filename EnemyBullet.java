import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyBullet extends Bullet
{
    private boolean remove;
    public EnemyBullet(int dir) {
        super(dir);
    }   

    public void act() 
    {

        super.act();
        if(destroyPlayer() || checkBounds()){
        remove();
    }
}
    public boolean destroyPlayer()
    {
        Actor tar = getOneIntersectingObject(Robo.class);
        if(tar != null) 
        {
            getWorld().removeObject(tar); 
            return true;
        }
        return false;
    }
}
