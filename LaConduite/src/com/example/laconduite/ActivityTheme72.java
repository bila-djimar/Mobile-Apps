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

public class ActivityTheme72 extends  Activity {
	RadioGroup rGroupTheme72;
	RadioButton buttonTheme721,buttonTheme722;
	Chronometer Chronometer72;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme72);



		
		
		
rGroupTheme72 = (RadioGroup) findViewById(R.id.radioGroupTheme72);
		
        Chronometer72 = (Chronometer) findViewById(R.id.chronometer72);
		
		Chronometer72.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonTheme721 = new RadioButton(this);
		buttonTheme721.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme72.addView(buttonTheme721);
		 
		 buttonTheme722 = new RadioButton(this);
		buttonTheme722.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme72.addView(buttonTheme722);
		 
		
		 
		rGroupTheme72.check(buttonTheme721.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityTheme72.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderTheme72(View v) 
	
	{ buttonTheme721.setTextColor(Color.BLUE);
	
	 rGroupTheme72.check(buttonTheme721.getId()) ;
	 
	 Chronometer72.stop();
	}	
	
	
	
	
}
