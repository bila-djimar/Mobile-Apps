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

public class ActivityAssr14 extends  Activity {
	RadioGroup rGroupAssr14;
	RadioButton buttonAssr141,buttonAssr142,buttonAssr143,buttonAssr144;
	Chronometer ChronometerASSR14;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_assr14);



		
		
		rGroupAssr14 = (RadioGroup) findViewById(R.id.radioGroupAssr14);
		ChronometerASSR14 = (Chronometer) findViewById(R.id.chronometerASR14);
		ChronometerASSR14.start();
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonAssr141 = new RadioButton(this);
		buttonAssr141.setText("Je ralentis et je passe............................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupAssr14.addView(buttonAssr141);
		 
		 buttonAssr142 = new RadioButton(this);
		buttonAssr142.setText("Je passe sans ralentir............................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupAssr14.addView(buttonAssr142);
		 
		 buttonAssr143 = new RadioButton(this);
		 buttonAssr143.setText("Je m'arrête avant le passage piétons.....(C)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupAssr14.addView(buttonAssr143);
		 
		
		
		 buttonAssr144 = new RadioButton(this);
		 buttonAssr144.setText("Je m'arrête au niveau de la ligne discontinue.............................................(D)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupAssr14.addView(buttonAssr144);
		
		
		
		rGroupAssr14.check(buttonAssr141.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityAssr14.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderAssr14(View v) 
	
	{ 
	
	
	 
	
	 buttonAssr143.setTextColor(Color.BLUE);
	
	 rGroupAssr14.check(buttonAssr143.getId()) ;
	 
	 ChronometerASSR14.stop();
	}	
	
	
	
	
}
