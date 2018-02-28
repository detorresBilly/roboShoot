import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShopButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShopButton extends Button
{   
    String itemName;
    public ShopButton(String s , int size, String toBuy){
        super(s,size);
        itemName = toBuy;
    }
    /**
     * Act - do whatever the ShopButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        if(isClicked()){
            makePurchase(itemName);
        }
    }
    
    public void makePurchase(String toPurch){
         Shop thisWorld = (Shop) getWorld();
         if(thisWorld.mainWorld.getObjects(Robo.class).size() != 0){
             switch(toPurch.toLowerCase()){
                case "splitbullet":
                    thisWorld.mainWorld.getObjects(Robo.class).get(0).addBullet("splitbullet", 5);
                    break;
                case "doublebullet":
                    thisWorld.mainWorld.getObjects(Robo.class).get(0).addBullet("doublebullet", 5);
                    break;
                default:
                    break;
             }
         }
    }
}
