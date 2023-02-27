package ie.tudublin;

import processing.core.PApplet;

public class BugZap2 extends PApplet 
{
    public void settings()
    {
        size(800, 640);
    }

    public void setup()
    {
            
    }
    
    float playerX, playerY;
    float playerWidth;
    float halfPlayerWidth = playerWidth / 2;
    
    public void draw()
    {
        background(0);
        drawPlayer(playerX, playerY, playerWidth);
    }

    void drawPlayer(float x, float y, float w)
    {
        // Draw player
        stroke(255);
        float playerHeight = w / 2;
        line(x - halfPlayerWidth , y + playerHeight, x + halfPlayerWidth, y + playerHeight);

    }

    
}
