import java.util.*;
import greenfoot.*;

/**
 * Robo
 */
public class Robo extends Actor
{
    private int speedLeft = -5;
    private int speedRight = 5;
    private int speedForward = 5;
    private int speedReverse = -5;
    private double savedTime = 0;
    private int bullets = 2;
    double rotateDecel = -0.2;
    double rotateAccel = 0.1;
    double rotateSpeed = 0;
    public Robo(){     
        GreenfootImage image = getImage();  
        image.scale(150, 150);
        setImage(image);
    }
    public void smoothRotate(){
      
        if(Greenfoot.isKeyDown("a") && Greenfoot.isKeyDown("d"))
        {
        rotateSpeed = rotateSpeed;
    }
    else if(Greenfoot.isKeyDown("d") && rotateSpeed < 10)
        {
            rotateSpeed += rotateAccel;
        }
    else if(Greenfoot.isKeyDown("a") && rotateSpeed > -10)
        {
            rotateSpeed -= rotateAccel;
        }
    else if(rotateSpeed < 0){
        rotateSpeed -= rotateDecel;
    }
    else if(rotateSpeed > 0){
        rotateSpeed += rotateDecel;
    }
    turn((int)rotateSpeed);
}
    public void shoot() {
        double rotateRad = getRotation() * (3.14/180);
        double bulletX = getX() + (90 * Math.cos(rotateRad));
        double bulletY = getY() + (90* Math.sin(rotateRad));
        
        int X = (int)bulletX;
        int Y = (int)bulletY;
        
        if((System.currentTimeMillis() - 100) > savedTime){
            for(int i = 0; i < bullets; i++){
        getWorld().addObject(new BasicBullet(getRotation() + ((-1)*(15*i))), X, Y);
        getWorld().addObject(new BasicBullet(getRotation() + (15*i)), X, Y);
        savedTime = System.currentTimeMillis();
    } 
}
}

    public void act(){
        if(Greenfoot.isKeyDown("e"))
        {
            shoot();
        }
        smoothRotate();
        if (Greenfoot.isKeyDown("s")) {
            move(speedReverse);
        }
        if (Greenfoot.isKeyDown("w")) {
            move(speedForward);
        }
    }   
}
