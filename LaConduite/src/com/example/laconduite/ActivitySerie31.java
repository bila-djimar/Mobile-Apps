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

public class ActivitySerie31 extends  Activity {
	RadioGroup rGroupSerie31;
	RadioButton buttonSerie311,buttonSerie312,buttonSerie313,buttonSerie314;
	Chronometer ChronometerS31;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie31);

		rGroupSerie31 = (RadioGroup) findViewById(R.id.radioGroupSerie31);
		
		ChronometerS31 = (Chronometer) findViewById(R.id.chronometerS31);
		ChronometerS31.start();
		
		
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonSerie311 = new RadioButton(this);
		buttonSerie311.setText("Une route importante ......................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie31.addView(buttonSerie311);
		 
		 buttonSerie312 = new RadioButton(this);
		buttonSerie312.setText("Un itinéraire bis ...............................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie31.addView(buttonSerie312);
		 
		buttonSerie313 = new RadioButton(this);
		buttonSerie313.setText("Un itinéraire S ..................................(C)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupSerie31.addView(buttonSerie313);
		
		
		
		buttonSerie314 = new RadioButton(this);
		buttonSerie314.setText("Une autoroute ..................................(D)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupSerie31.addView(buttonSerie314);
		 
		rGroupSerie31.check(buttonSerie311.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie31.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderSerie31(View v) 
	
	{ buttonSerie311.setTextColor(Color.BLUE);
	
	 rGroupSerie31.check(buttonSerie311.getId()) ;
	 ChronometerS31.stop();
	 
	 
	 
	 
	 
	 
	}	
	
	
	
public void QuitterSerie31(View v) 

{ Intent IntentQuitterSerie31 = new Intent(ActivitySerie31.this,MainActivity.class);
	startActivity(IntentQuitterSerie31);
}	
	

public void SuivanteSerie31(View v) 

{Intent IntentSuivanteSerie31 = new Intent(ActivitySerie31.this,ActivitySerie32.class);
 startActivity(IntentSuivanteSerie31);}	

}
