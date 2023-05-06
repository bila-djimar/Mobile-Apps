package com.example.laconduite;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ActivitySerie37 extends  Activity {
	RadioGroup rGroupSerie37;
	RadioButton buttonSerie371,buttonSerie372;
	Chronometer ChronometerS37;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie37);



		rGroupSerie37 = (RadioGroup) findViewById(R.id.radioGroupSerie37);
		ChronometerS37 = (Chronometer) findViewById(R.id.chronometerS37);
		ChronometerS37.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonSerie371 = new RadioButton(this);
		buttonSerie371.setText("Oui........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie37.addView(buttonSerie371);
		 
		 buttonSerie372 = new RadioButton(this);
		buttonSerie372.setText("Non ......................(B)");
		//button2.setTextColor(Color.GREENon);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie37.addView(buttonSerie372);
		 
		
		 
		rGroupSerie37.check(buttonSerie371.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie37.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderSerie37(View v) 
	
	{ buttonSerie371.setTextColor(Color.BLUE);
	
	 rGroupSerie37.check(buttonSerie371.getId()) ;
	 ChronometerS37.stop();
	}	
	
	
	
public void QuitterSerie37(View v) 

{ Intent IntentQuitterSerie37 = new Intent(ActivitySerie37.this,MainActivity.class);
	startActivity(IntentQuitterSerie37);
}	
	

public void SuivanteSerie37(View v) 

{Intent IntentSuivanteSerie37 = new Intent(ActivitySerie37.this,ActivitySerie38.class);
 startActivity(IntentSuivanteSerie37);}	

}
