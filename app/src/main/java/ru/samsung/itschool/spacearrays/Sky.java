package ru.samsung.itschool.spacearrays;


import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Sky implements Drawable {
    int numStars = 500;
    int xStar[] = new int[numStars];
    int yStar[] = new int[numStars];
    int alphaStar[] = new int[numStars];


    Paint  p =new Paint();


    int maxX = 2000;
    int maxY = 2000;



    public void draw(Canvas canvas)
    {
        for (int i = 0; i < numStars; i++)
        {
            xStar[i] = (int)(Math.random() * maxX);
            yStar[i] = (int)(Math.random() * maxY);
            alphaStar[i] = (int)(Math.random() * 256);
        }

        canvas.drawColor(Color.BLACK);
        p.setColor(Color.YELLOW);
        p.setStrokeWidth(2);
        for (int i = 0; i < numStars; i++)
        {
            p.setAlpha(alphaStar[i]);
            alphaStar[i] += (int)(Math.random() * 11) - 5;
            if (alphaStar[i] > 255) alphaStar[i] = 255;
            if (alphaStar[i] < 0) alphaStar[i] = 0;
            canvas.drawCircle(xStar[i], yStar[i], 3, p);
        }
    }
}

