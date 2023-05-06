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

public class ActivitySerie43 extends  Activity {
	RadioGroup rGroupSerie43;
	RadioButton buttonSerie431,buttonSerie432,buttonSerie433;
	Chronometer ChronometerS43;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie43);


		rGroupSerie43 = (RadioGroup) findViewById(R.id.radioGroupSerie43);
		ChronometerS43 = (Chronometer) findViewById(R.id.chronometerS43);
		ChronometerS43.start();
		
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonSerie431 = new RadioButton(this);
		buttonSerie431.setText("Equipé en GPL ...................................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie43.addView(buttonSerie431);
		 
		 buttonSerie432 = new RadioButton(this);
		buttonSerie432.setText("Ouvert en permanence.......................(B)");
		//button2.setTextColor(Color.GREEN); 
		//button2.setOnClickListener(radio_listener);
		rGroupSerie43.addView(buttonSerie432);
		 
		 buttonSerie433 = new RadioButton(this);
		buttonSerie433.setText("A 40 km en direction de DIJON ..........(C)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupSerie43.addView(buttonSerie433);
		 
		rGroupSerie43.check(buttonSerie431.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie43.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderSerie43(View v) 
	
	{ buttonSerie432.setTextColor(Color.BLUE);
	
	 rGroupSerie43.check(buttonSerie432.getId()) ;
	 
	 buttonSerie433.setTextColor(Color.BLUE);
		
	 rGroupSerie43.check(buttonSerie433.getId()) ;
	 
	 ChronometerS43.stop();
	 
	 
	}	
	

public void QuitterSerie43(View v) 

{ Intent IntentQuitterSerie43 = new Intent(ActivitySerie43.this,MainActivity.class);
	startActivity(IntentQuitterSerie43);
}	
	

public void SuivanteSerie43(View v) 

{Intent IntentSuivanteSerie43 = new Intent(ActivitySerie43.this,ActivitySerie44.class);
 startActivity(IntentSuivanteSerie43);}	

}
