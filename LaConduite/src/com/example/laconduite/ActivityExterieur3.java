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

public class ActivityExterieur3 extends  Activity {
	RadioGroup rGroupExterieur3;
	RadioButton buttonExterieur31,buttonExterieur32;
	Chronometer ChronometerE3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_exterieur3);



		
		
		rGroupExterieur3 = (RadioGroup) findViewById(R.id.radioGroupExterieur3);
		
        ChronometerE3 = (Chronometer) findViewById(R.id.chronometerE3);
		
		ChronometerE3.start();
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonExterieur31 = new RadioButton(this);
		buttonExterieur31.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupExterieur3.addView(buttonExterieur31);
		 
		 buttonExterieur32 = new RadioButton(this);
		buttonExterieur32.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupExterieur3.addView(buttonExterieur32);
		 
		
		 
		rGroupExterieur3.check(buttonExterieur31.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityExterieur3.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderExterieur3(View v) 
	
	{ buttonExterieur31.setTextColor(Color.BLUE);
	
	 rGroupExterieur3.check(buttonExterieur31.getId()) ;
	 ChronometerE3.stop();
	}	
	
	
	
	
}
