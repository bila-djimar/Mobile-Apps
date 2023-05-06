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

public class ActivityTheme91 extends  Activity {
	RadioGroup rGroupThem9;
	RadioButton buttonThem91,buttonThem92;
	Chronometer Chronometer9;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme91);

		rGroupThem9 = (RadioGroup) findViewById(R.id.radioGroupThem9);
        Chronometer9 = (Chronometer) findViewById(R.id.chronometer9);
		Chronometer9.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonThem91 = new RadioButton(this);
		buttonThem91.setText("Un seul constat amiable..............(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupThem9.addView(buttonThem91);
		 
		 buttonThem92 = new RadioButton(this);
		buttonThem92.setText("Deux constats amiables..............(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupThem9.addView(buttonThem92);
		 
		
		 
		rGroupThem9.check(buttonThem91.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityTheme91.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderThem9(View v) 
	
	{ buttonThem92.setTextColor(Color.BLUE);
	
	 rGroupThem9.check(buttonThem92.getId()) ;
	 Chronometer9.stop();
	}	
	
	
	
	
}
