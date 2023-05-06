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

public class ActivityExterieur4 extends  Activity {
	RadioGroup rGroupExterieur4;
	RadioButton buttonExterieur41,buttonExterieur42,buttonExterieur43,buttonExterieur44;
	Chronometer ChronometerEx4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_exterieur4);



		rGroupExterieur4 = (RadioGroup) findViewById(R.id.radioGroupExterieur4);
        ChronometerEx4 = (Chronometer) findViewById(R.id.chronometerE4);
		
		ChronometerEx4.start();
		
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonExterieur41 = new RadioButton(this);
		buttonExterieur41.setText("Le risque de dérapage............................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupExterieur4.addView(buttonExterieur41);
		 
		 buttonExterieur42 = new RadioButton(this);
		buttonExterieur42.setText("La consommation de carburant.............(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupExterieur4.addView(buttonExterieur42);
		 
		 buttonExterieur43 = new RadioButton(this);
		 buttonExterieur43.setText("La distance de freinage..........................(C)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupExterieur4.addView(buttonExterieur43);
		 
		
		
		 buttonExterieur44 = new RadioButton(this);
		 buttonExterieur44.setText("Le risque d'aquaplaning.........................(D)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupExterieur4.addView(buttonExterieur44);
		
		
		
		rGroupExterieur4.check(buttonExterieur41.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityExterieur4.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderExterieur4(View v) 
	
	{ 
	
	
	 buttonExterieur41.setTextColor(Color.BLUE);
		
	 rGroupExterieur4.check(buttonExterieur41.getId()) ;
	 
	 
	 buttonExterieur43.setTextColor(Color.BLUE);
		
	 rGroupExterieur4.check(buttonExterieur43.getId()) ;
	 
	 
	
	 buttonExterieur44.setTextColor(Color.BLUE);
	
	 rGroupExterieur4.check(buttonExterieur44.getId()) ;
	 ChronometerEx4.stop();
	}	
	
	
	
	
}
