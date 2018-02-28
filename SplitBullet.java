import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SplitBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SplitBullet extends PlayerBullet
{
    public SplitBullet(int dir) {
    super(dir);
}   
    public void act() 
    {
        super.act();
        if(this == null){
            
        }
    }
    public void remove(){
        World myWorld = getWorld();
        myWorld.addObject(new BasicBullet(getRotation()), getX(), getY());
        myWorld.addObject(new BasicBullet(getRotation() + 50), getX(), getY());
        myWorld.addObject(new BasicBullet(getRotation() + 100), getX(), getY());
        myWorld.addObject(new BasicBullet(getRotation() + 150), getX(), getY());
        myWorld.addObject(new BasicBullet(getRotation() + 200), getX(), getY());
        myWorld.addObject(new BasicBullet(getRotation() + 250), getX(), getY());
        myWorld.addObject(new BasicBullet(getRotation() + 300), getX(), getY());
        myWorld.removeObject(this);  

    }
}
