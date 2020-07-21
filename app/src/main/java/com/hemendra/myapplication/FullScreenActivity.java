package com.hemendra.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

public class FullScreenActivity extends AppCompatActivity {
    int[] img ={R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,R.drawable.img6,R.drawable.img7,R.drawable.img8,R.drawable.img9,R.drawable.img10};
    ImageView iv_full ;
    Button setwallpaper;
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);
        position= getIntent().getIntExtra("position",0);
        iv_full = findViewById(R.id.full_iv);
        setwallpaper = findViewById(R.id.btn_set_wallpaper);
        iv_full.setImageResource(img[position]);
        setwallpaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setWallpaper();
            }
        });


    }
    private void setWallpaper() {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), img[position]);
        WallpaperManager manager = WallpaperManager.getInstance(getApplicationContext());
        try{
            manager.setBitmap(bitmap);
            Toast.makeText(this, "Wallpaper set!", Toast.LENGTH_SHORT).show();
        } catch(IOException e) {
            Toast.makeText(this, "Error!", Toast.LENGTH_SHORT).show();
        }
    }

}