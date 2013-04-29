package com.example.travelguide;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.FloatMath;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.*;


public class AppScreen extends Activity  {
    String[] names = { "Ратуша", "Колодязь", "Стара фортеця", "Церква", "Греко-римська церква", "Споруда 1",
            "Споруда 2", "Споруда 3", "Споруда 5", "Споруда 6", "Споруда 7" };



	@Override
	public void onCreate(Bundle savedInstanceState) {
	   super.onCreate(savedInstanceState);
	   setContentView(R.layout.app_screen);
        TouchImageView img = (TouchImageView) findViewById(R.id.snoopy);
        img.setImageResource(R.drawable.mapsdf);
        img.setScaleType(ImageView.ScaleType.MATRIX);
        img.setMaxZoom(3f);

        ListView lvMain = (ListView) findViewById(R.id.lvMain1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, names);
        lvMain.setAdapter(adapter);

        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {


            }
        });
        lvMain.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

            }

            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
	}
}