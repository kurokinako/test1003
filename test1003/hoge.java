import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hoge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hoge extends Actor
{
    /**
     * Act - do whatever the hoge wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if( Greenfoot.isKeyDown( "up" ) )
        {
            setRotation(270);
            move(1);
        }
    }    
}
