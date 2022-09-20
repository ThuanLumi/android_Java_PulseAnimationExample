package com.example.pulseanimationexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.skyfishjy.library.RippleBackground;

public class MainActivity extends AppCompatActivity {
   private Boolean btnState = false;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      final RippleBackground rippleBackground = (RippleBackground) findViewById(R.id.content);
      ImageView imageView = (ImageView) findViewById(R.id.centerImage);
      imageView.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            if (!btnState) {
               rippleBackground.startRippleAnimation();
               Toast.makeText(MainActivity.this, "Start", Toast.LENGTH_SHORT).show();
            } else {
               rippleBackground.stopRippleAnimation();
               Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_SHORT).show();
            }
            btnState = !btnState;
         }
      });
   }
}