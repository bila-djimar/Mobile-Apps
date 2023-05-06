package com.example.laconduite;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ActivityTheme85 extends  Activity {
	RadioGroup rGroupTheme85;
	RadioButton buttonTheme851,buttonTheme852,buttonTheme853,buttonTheme854;
	Chronometer Chronometer85;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme85);



		
		
		
		rGroupTheme85 = (RadioGroup) findViewById(R.id.radioGroupTheme85);
		
        Chronometer85 = (Chronometer) findViewById(R.id.chronometer85);
		
		Chronometer85.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonTheme851 = new RadioButton(this);
		buttonTheme851.setText("J'actionne le clignotant droit .....(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme85.addView(buttonTheme851);
		 
		 buttonTheme852 = new RadioButton(this);
		buttonTheme852.setText("J'actionne les feux de détresse........(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme85.addView(buttonTheme852);
		 
		
		 
		
		
		 buttonTheme853 = new RadioButton(this);
			buttonTheme853.setText("Je serre au maximum à droite........(B)");
			//button2.setTextColor(Color.GREEN);
			//button2.setOnClickListener(radio_listener);
			rGroupTheme85.addView(buttonTheme853);
		
		
			 buttonTheme854 = new RadioButton(this);
				buttonTheme854.setText("Je me réfugie dans la niche de sécurité........(B)");
				//button2.setTextColor(Color.GREEN);
				//button2.setOnClickListener(radio_listener);
				rGroupTheme85.addView(buttonTheme854);
			
		rGroupTheme85.check(buttonTheme851.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityTheme85.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderTheme85(View v) 
	
	{ buttonTheme852.setTextColor(Color.BLUE);
	
	 rGroupTheme85.check(buttonTheme852.getId()) ;
	 
	 buttonTheme853.setTextColor(Color.BLUE);
		
	 rGroupTheme85.check(buttonTheme853.getId()) ;
	 
	 buttonTheme854.setTextColor(Color.BLUE);
		
	 rGroupTheme85.check(buttonTheme854.getId()) ;
	 
	 Chronometer85.stop();
	}	
	
	
	
	
}
