package com.example.travelguide;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button startButton = (Button)findViewById(R.id.StartButton);
        startButton.setOnClickListener(this);

        Button exitButton = (Button)findViewById(R.id.ExitButton);
        exitButton.setOnClickListener(this);
        
        Button aboutButton = (Button)findViewById(R.id.AboutButton);
        aboutButton.setOnClickListener(this);
    }
    
    public void onConfigurationChanged(Configuration newConfig) {  
    	 super.onConfigurationChanged(newConfig);
    	 setContentView(R.layout.about);
    	}

    public void onClick(View v)
	{
		switch (v.getId())
		{
			case R.id.StartButton:
			{
				Intent intent = new Intent(MainActivity.this, AppScreen.class);
		        startActivity(intent);
		        break;

			}
				
            case R.id.AboutButton:
            {
            	Intent intent = new Intent(this, AboutScreen.class);
    	        startActivity(intent);
    	        break;

            }

            case R.id.ExitButton:
			    finish();
			    break;
			    
			default:
				break;
		}
	}
    
}