package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

import processing.data.*;

public class StarMap extends PApplet {

    ArrayList<Star> stars = new ArrayList<Star>();
    
    public float border;

    void drawGrid()
    {
        stroke(0, 255, 255);
        textAlign(CENTER, CENTER);
        textSize(20);
        /*for(int i = -5; i <=5; i ++)
        {
            float x = map(i, -5, 5, border, width - border);
            line(x, border, x, height - border);
            line(border, x, width - border, x);
            fill(255);
            text(i, x, border * 0.5f);
            text(i, border * 0.5f, x);
        }*/
        int border = 50;
        int cellSize = 700 / 10;
        for(int i = 0, parsecs = -5; i <= 10; i++, parsecs++)
        {
            line(border + (cellSize * i), border, border + (cellSize * i), height - border);
            line(border, border + (cellSize * i), width - border, border + (cellSize * i));
            text(parsecs, border + (cellSize * i), border * 0.5f);
            text(parsecs, border * 0.5f, border + (cellSize * i));
        }

    }

    void printStars()
    {
        for(Star s:stars)
        {
            System.out.println(s);
        }
    }

    void loadStars()
    {
        Table table = loadTable("HabHYG15ly.csv", "header");
        for(TableRow r:table.rows())
        {
            Star s = new Star(r);
            stars.add(s);
        }
    }

    public void settings() {
        size(800, 800);
    }

    Star first = null;
    Star second = null;



    /*public void mouseClicked()
    {
        for(Star s:stars)
        {
            float x = map(s.getxG(), -5, 5, border, width - border);
            float y = map(s.getyG(), -5, 5, border, height - border);

            if (dist(mouseX, mouseY, x, y) < 20)
            {
                if (first == null)
                {
                    first = s;
                    break;
                }
                else if (second == null)
                {
                    second = s;
                    break;
                } 
                else
                {
                    first = s;
                    second = null;
                    break;
                }
            }
        }
    }*/

    public void setup() {
        colorMode(RGB);
        background(0);

        smooth();

        loadStars();
        printStars();

        /*border = width * 0.1f;*/
    }

    public void drawStars()
    {
        for(Star s:stars)
        {
            s.render(this);
        }
    }

    public void draw() 
    {
        strokeWeight(1);
        drawGrid();
        drawStars();

        /*if (first != null)
        {

            float x = map(first.getxG(), -5, 5, border, width - border);
            float y = map(first.getyG(), -5, 5, border, height - border);

            if (second != null)
            {
                float x2 = map(second.getxG(), -5, 5, border, width - border);
                float y2 = map(second.getyG(), -5, 5, border, height - border);

                stroke(255, 255, 0);
                line(x, y, x2, y2);

                float dist = dist(first.getxG(), first.getyG(), first.getzG(), second.getxG(), second.getyG(), second.getzG());

                fill(255);
                textAlign(CENTER, CENTER);
                text("Distance between: " + first.getDisplayName() + " and " + second.getDisplayName() + " is " + dist + " parsecs", width / 2, height - (border * 0.5f));
            }
            else
            {
                stroke(255, 255, 0);
                line(x, y, mouseX, mouseY);
            }
        }*/
    }
}