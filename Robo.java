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
<<<<<<< HEAD
    private double swapTime = 0;
    private double swapTime2 = 0;
    private int doubleShot = 2;
    private int splitShot = 2;
    private int money = 100;
    double rotateDecel = -0.2;
    double rotateAccel = 0.1;
=======
    private int bullets = 2;
    double rotateDecel = -0.7;
    double rotateAccel = 0.2;
>>>>>>> 0bbf5b966dbcced711a3a78d9e208110a0b668a8
    double rotateSpeed = 0;
    int rotateTopSpeed = 5;
    public Robo(){     
        GreenfootImage image = getImage();  
        image.scale(100, 100);
        setImage(image);
    }
<<<<<<< HEAD
    public void smoothRotate(){      
        if(Greenfoot.isKeyDown("a") && Greenfoot.isKeyDown("d"))
        {
        rotateSpeed = rotateSpeed;
        }
        else if(Greenfoot.isKeyDown("d") && rotateSpeed < 10)
=======

    public int roboGetX(){
        return this.getX();
    }

    public int roboGetY(){
        return this.getY();
    }

    public void smoothRotate(){

        if(Greenfoot.isKeyDown("a") && Greenfoot.isKeyDown("d"))
        {
            if (rotateSpeed < 0){
                rotateSpeed -= rotateDecel;
            }
            if (rotateSpeed >= 0){
                rotateSpeed += rotateDecel;
            }
        }
        else if(Greenfoot.isKeyDown("d"))
>>>>>>> 0bbf5b966dbcced711a3a78d9e208110a0b668a8
        {
            if (rotateSpeed < 0){
                rotateSpeed += 2*rotateAccel;
            }
            else if (rotateSpeed <rotateTopSpeed){
                rotateSpeed += rotateAccel;
            }
        }
<<<<<<< HEAD
        else if(Greenfoot.isKeyDown("a") && rotateSpeed > -10)
=======
        else if(Greenfoot.isKeyDown("a"))
>>>>>>> 0bbf5b966dbcced711a3a78d9e208110a0b668a8
        {
            if (rotateSpeed > 0){
                rotateSpeed -= 2*rotateAccel;
            }
            else if (rotateSpeed > -1*(rotateTopSpeed)){
                rotateSpeed -= rotateAccel;
            }
        }
        else if(rotateSpeed < 0){
<<<<<<< HEAD
        rotateSpeed -= rotateDecel;
        }
        else if(rotateSpeed > 0){
        rotateSpeed += rotateDecel;
        }
        turn((int)rotateSpeed);
    }
    
    public void addBullet(String toAdd, int numToAdd){
        switch(toAdd.toLowerCase()){
            case "splitbullet":
                splitShot += numToAdd;
                break;
            case "doublebullet":
                doubleShot += numToAdd;
                break;
            default:
                break;
        }
    }
    
=======
            rotateSpeed -= rotateDecel;
        }
        else if(rotateSpeed > 0){
            rotateSpeed += rotateDecel;
        }
        turn((int)rotateSpeed);
    }

>>>>>>> 0bbf5b966dbcced711a3a78d9e208110a0b668a8
    public void shoot() {
        double rotateRad = getRotation() * (3.14/180);
        double bulletX = getX() + (90 * Math.cos(rotateRad));
        double bulletY = getY() + (90* Math.sin(rotateRad));

        int X = (int)bulletX;
        int Y = (int)bulletY;
<<<<<<< HEAD
        if(splitShot >= 1 && (System.currentTimeMillis() - 100) > savedTime){
            getWorld().addObject(new SplitBullet(getRotation()), X, Y);
            splitShot--;
            savedTime = System.currentTimeMillis();
        }
        else if(doubleShot >= 1 && (System.currentTimeMillis() - 100) > savedTime){
            getWorld().addObject(new BasicBullet(getRotation() - 50), X, Y);
            getWorld().addObject(new BasicBullet(getRotation() + 50), X, Y);
            getWorld().addObject(new BasicBullet(getRotation()), X, Y);
            doubleShot--;
            savedTime = System.currentTimeMillis();
        }
        else if((System.currentTimeMillis() - 100) > savedTime){
            getWorld().addObject(new BasicBullet(getRotation()), X, Y); 
            savedTime = System.currentTimeMillis();
        }
    }
=======

        if((System.currentTimeMillis() - 100) > savedTime){
            for(int i = 0; i < bullets; i++){
                getWorld().addObject(new BasicBullet(getRotation() + ((-1)*(15*i))), X, Y);
                getWorld().addObject(new BasicBullet(getRotation() + (15*i)), X, Y);
                savedTime = System.currentTimeMillis();
            } 
        }
    }

>>>>>>> 0bbf5b966dbcced711a3a78d9e208110a0b668a8
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
        swapTime2 += 5;
        if (Greenfoot.isKeyDown("i") && swapTime2 - 500 > swapTime) { 
            swapTime = System.currentTimeMillis();
            swapTime2 = System.currentTimeMillis();
            World myWorld = this.getWorld();
            Greenfoot.setWorld(new Shop(myWorld));
        }
    }   
}
