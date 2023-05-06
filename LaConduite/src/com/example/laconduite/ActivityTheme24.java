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

public class ActivityTheme24 extends  Activity {
	RadioGroup rGroupTheme24;
	RadioButton buttonTheme241,buttonTheme242;
	Chronometer Chronometer24;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme24);



		
		

		rGroupTheme24 = (RadioGroup) findViewById(R.id.radioGroupTheme24);
		
        Chronometer24 = (Chronometer) findViewById(R.id.chronometer24);
		
		Chronometer24.start();
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonTheme241 = new RadioButton(this);
		buttonTheme241.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme24.addView(buttonTheme241);
		 
		 buttonTheme242 = new RadioButton(this);
		buttonTheme242.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme24.addView(buttonTheme242);
		 
		
		 
		rGroupTheme24.check(buttonTheme241.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityTheme24.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderTheme24(View v) 
	
	{ buttonTheme242.setTextColor(Color.BLUE);
	
	 rGroupTheme24.check(buttonTheme242.getId()) ;
	 Chronometer24.stop();
	}	
	
	
	
	
}
