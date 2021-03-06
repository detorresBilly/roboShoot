import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private static int WORLD_HEIGHT = 720;
    private static int WORLD_WIDTH = 1280;
    private static int CELL_SIZE = 1;

    public MyWorld(){
        super(WORLD_WIDTH, WORLD_HEIGHT, CELL_SIZE);
        addObject(new Robo(), WORLD_WIDTH/2, WORLD_HEIGHT);
        addObject(new Spawner(), WORLD_WIDTH - 50, 100);
    }

    public static int getWorldHeight(){
        return WORLD_HEIGHT;
    }

    public static int getWorldWidth(){
        return WORLD_WIDTH;
    }
}

