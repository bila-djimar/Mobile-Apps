package com.example.laconduite;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ActivitySerie1 extends  Activity {
	RadioGroup rGroupSerie1;
	RadioButton buttonSerie11,buttonSerie12,buttonSerie13;
	Chronometer ChronometerS1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie1);
		
		rGroupSerie1 = (RadioGroup) findViewById(R.id.radioGroupSerie1);
		ChronometerS1 = (Chronometer) findViewById(R.id.chronometerS1);
		ChronometerS1.start();
		
		
		
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonSerie11 = new RadioButton(this);
		buttonSerie11.setText("80 km/h ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie1.addView(buttonSerie11);
		 
		 buttonSerie12 = new RadioButton(this);
		buttonSerie12.setText("100 km/h ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie1.addView(buttonSerie12);
		 
		 buttonSerie13 = new RadioButton(this);
		 buttonSerie13.setText("110 km/H ......................(C)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupSerie1.addView(buttonSerie13);
		 
		rGroupSerie1.check(buttonSerie11.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie1.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderSerie1(View v) 
	
	{ buttonSerie13.setTextColor(Color.BLUE);
	
	 rGroupSerie1.check(buttonSerie13.getId()) ;
	 
	 
	 ChronometerS1.stop();
	}	
	
	
public void QuitterSerie1(View v) 

{ Intent IntentQuitterSerie1 = new Intent(ActivitySerie1.this,MainActivity.class);
	startActivity(IntentQuitterSerie1);
}	
	

public void SuivanteSerie1(View v) 

{ Intent IntentSuivanteSerie1 = new Intent(ActivitySerie1.this,ActivitySerie2.class);
  startActivity(IntentSuivanteSerie1);
}	

}
