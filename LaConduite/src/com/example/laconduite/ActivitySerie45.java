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

public class ActivitySerie45 extends  Activity {
	RadioGroup rGroupSerie451,rGroupSerie452;
	RadioButton buttonSerie451,buttonSerie452,buttonSerie453,buttonSerie454;
	Chronometer ChronometerS45;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie45);


		rGroupSerie451 = (RadioGroup) findViewById(R.id.radioGroupSerie451);
		rGroupSerie452 = (RadioGroup) findViewById(R.id.radioGroupSerie452);
		ChronometerS45 = (Chronometer) findViewById(R.id.chronometerS45);
		ChronometerS45.start();
		
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
		buttonSerie451 = new RadioButton(this);
		buttonSerie451.setText("Oui........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie451.addView(buttonSerie451);
		 
		 buttonSerie452 = new RadioButton(this);
		 buttonSerie452.setText("Non ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie451.addView(buttonSerie452);
		 
		
		 
		rGroupSerie451.check(buttonSerie451.getId()) ;
		
		
		buttonSerie453 = new RadioButton(this);
		buttonSerie453.setText("Oui........................(C)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie452.addView(buttonSerie453);
		 
		 buttonSerie454 = new RadioButton(this);
		 buttonSerie454.setText("Non ......................(D)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie452.addView(buttonSerie454);
		 
		
		 
		rGroupSerie452.check(buttonSerie453.getId()) ;
		
		
		
		
		
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivitySerie45.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderSerie45(View v) 
		
		{ buttonSerie451.setTextColor(Color.BLUE);
		
		 rGroupSerie451.check(buttonSerie451.getId()) ;
		 
		 
		 
		 buttonSerie453.setTextColor(Color.BLUE);
			
		 rGroupSerie452.check(buttonSerie453.getId()) ;
		 
		 ChronometerS45.stop();
		}	
		
		
		
	public void QuitterSerie45(View v) 

	{ Intent IntentQuitterSerie45 = new Intent(ActivitySerie45.this,MainActivity.class);
		startActivity(IntentQuitterSerie45);
	}	
		

}
