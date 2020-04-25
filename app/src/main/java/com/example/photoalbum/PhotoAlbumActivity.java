package com.example.photoalbum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PhotoAlbumActivity extends AppCompatActivity {
    private Button forwardButton;
    private Button backButton;
    private TextView imageView;
    private int numberImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_album);
        randomUrlImage();
        forwardAction();
        backAction();
    }

    public void forwardAction() {
        forwardButton = findViewById(R.id.forwardButton);
        forwardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentForward = new Intent(PhotoAlbumActivity.this,
                        PhotoAlbumActivity.class);
                startActivity(intentForward);
            }
        });
    }

    public void backAction() {
        backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });

    }

    public void randomUrlImage() {
        numberImage = (int) (Math.random() * 100);
        imageView = findViewById(R.id.urlView);
        imageView.setText(String.format(getString(R.string.urlText), numberImage));
    }
}
