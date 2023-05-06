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

public class ActivityTheme21 extends Activity {
	RadioGroup rGroupThem2;
	RadioButton buttonThem21,buttonThem22;
	Chronometer Chronometer21;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme21);

		rGroupThem2 = (RadioGroup) findViewById(R.id.radioGroupThem2);
        Chronometer21 = (Chronometer) findViewById(R.id.chronometer21);
		
		Chronometer21.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonThem21 = new RadioButton(this);
		buttonThem21.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupThem2.addView(buttonThem21);
		 
		 buttonThem22 = new RadioButton(this);
		buttonThem22.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupThem2.addView(buttonThem22);
		 
		
		 
		rGroupThem2.check(buttonThem21.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityTheme21.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderThem2(View v) 
	
	{ buttonThem22.setTextColor(Color.BLUE);
	
	 rGroupThem2.check(buttonThem22.getId()) ;
	 Chronometer21.stop();
	}	
	
	
	
	
}
