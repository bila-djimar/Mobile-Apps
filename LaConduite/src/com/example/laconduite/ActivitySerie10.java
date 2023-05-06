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

public class ActivitySerie10 extends  Activity {
RadioGroup rGroupSerie10;
	
	RadioButton buttonSerie101,buttonSerie102,buttonSerie103;
	Chronometer ChronometerS10;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie10);


		rGroupSerie10 = (RadioGroup) findViewById(R.id.radioGroupSerie10);
		//bt10 = (Button) findViewById(R.id.ValiderSerie10);
		ChronometerS10 = (Chronometer) findViewById(R.id.chronometerS10);
		ChronometerS10.start();
	
		
		
		
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		        
		          
		        
		        
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
			
				
				
				
				
			}
		};
		
		
		buttonSerie101 = new RadioButton(this);
		buttonSerie101.setText("Une route nationale..........................(A) ");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie10.addView(buttonSerie101);
		 
		 buttonSerie102 = new RadioButton(this);
		buttonSerie102.setText("Une section d'autoroute à péage......(B) ");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie10.addView(buttonSerie102);
		 
		 buttonSerie103 = new RadioButton(this);
		buttonSerie103.setText("Une section d'autoroute gratuite......(C) ");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupSerie10.addView(buttonSerie103);
		 
		rGroupSerie10.check(buttonSerie101.getId()) ;
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie10.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
	
	
	
public void ValiderSerie10(View v) 
	
	{ buttonSerie103.setTextColor(Color.BLUE);
	
	 rGroupSerie10.check(buttonSerie103.getId()) ;
	 
	 
	 ChronometerS10.stop();
	}	
	
	

	

public void QuitterSerie10(View v) 

{ Intent IntentQuitterSerie10 = new Intent(ActivitySerie10.this,MainActivity.class);
startActivity(IntentQuitterSerie10);
}	


public void SuivanteSerie10(View v) 

{ Intent IntentSuivanteSerie10 = new Intent(ActivitySerie10.this,ActivitySerie11.class);
startActivity(IntentSuivanteSerie10);
}	

}
