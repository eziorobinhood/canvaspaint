package com.rrkrish.paint.canvaspaint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgview;
    Bitmap bmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgview = findViewById(R.id.imgview);
        bmp = Bitmap.createBitmap(100,100,Bitmap.Config.RGB_565);
        imgview.setImageBitmap(bmp);

        Canvas canvas = new Canvas(bmp);
        Paint paint = new Paint();
        paint.setColor(Color.WHITE);

        Paint red = new Paint();
        red.setColor(Color.YELLOW);

        Paint black = new Paint();
        black.setColor(Color.BLACK);


/*
        canvas.drawLine(10,10,50,10,paint);
        canvas.drawLine(10,10,10,50,paint);
        canvas.drawLine(10,50,50,50,paint);
        canvas.drawLine(50,50,50,10,paint);

        canvas.drawRect(50,50,90,90,red);
*/
        canvas.drawArc(20,20,60,60,0,360,true,red);
        canvas.drawArc(30,30,33,35,0,360,true,black);
        canvas.drawArc(48,30,45,35,0,360,true,black);
        canvas.drawArc(34,35,45,50,0,180,true,black);

    }
}
