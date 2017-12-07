package ru.samsung.itschool.spacearrays;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

public class Cloud {
    float x, y, vx, vy;
    static Bitmap pic;

    static{
        pic = ImageManager.getPic(R.drawable.cloud);
    }

    Cloud(){
        this.x = (float)(Math.random()*300);
        this.y = (float)(Math.random()*1000);
        this.vx = (float)(Math.random()*3);
        this.vy = 0;

    }
    void move(){
        this.x += this.vx;
        this.y += this.vy;
    }

    Paint paint = new Paint();
    Matrix matrix = new Matrix();
    void draw(Canvas canvas){
        matrix.setScale(0.30f, 0.30f);
        //Study mathematics, dear young programmer :)
        matrix.postTranslate(-pic.getWidth()/10,-pic.getHeight()/10);
        matrix.postRotate((float)Math.toDegrees(Math.atan2(vy, vx)));
        matrix.postTranslate(x, y);
        paint.setAlpha(255);
        canvas.drawBitmap(pic, matrix, paint);
    }
}