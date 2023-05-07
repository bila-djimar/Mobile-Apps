package com.characteristicsamartphone;

import java.util.List;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class ActivityRapportOfSensor extends Activity {
	private SensorManager sMgr;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_raport_of_sensor);

		
		
		
		
		
		
		
		  TextView sensorsData = (TextView)findViewById(R.id.textViewListCapteur);

	      sMgr = (SensorManager)this.getSystemService(SENSOR_SERVICE);
	      List <Sensor> list = sMgr.getSensorList(Sensor.TYPE_ALL);
	     
	      StringBuilder data = new StringBuilder();
	     // StringBuilder data1 = new StringBuilder();
	     // sensorsData.setTextColor(Color.RED);
	      //data.append("The sensors on this device are:\n");
	     
	      
	      
	      for(Sensor sensor: list){
	    	  
	    	// sensorsData.setTextColor(Color.BLUE);
	    	 data.append("                                     "+ "\n");
	    	 

	    	 data.append("---------------------------------------\n");
	    	 
	         data.append("   Name:   "+sensor.getName() + "\n");
	         data.append("                                     "+ "\n");
	         
	         
	         data.append("   Type:     "+sensor.getType()+ "\n");
		     data.append("                                     "+ "\n");
		     
	         
	         data.append("   Vendor:     "+sensor.getVendor() + "\n");
	         data.append("                                     "+ "\n");
	         
	         
	         
	         data.append("   Version:     "+sensor.getVersion() + "\n");
	         data.append("                                     "+ "\n");
	         
	         
	         data.append("   Resolution:     "+sensor.getResolution() + "\n");
	         data.append("                                     "+ "\n");
	         
	         
	         
	         //data.append("   Max Range:     "+sensor.getMaximumRange()+ "\n");
	         //data.append("                                     "+ "\n");
	         
	        
	         data.append("   Power:     "+sensor.getPower()+ "  mA \n");
	         
	         
	        
	        
	   }
	   sensorsData.setText(data);
	   
	   
	}

	   @Override
	   public boolean onCreateOptionsMenu(Menu menu) {
	      // Inflate the menu; this adds items to the action bar if it is present.
	      getMenuInflater().inflate(R.menu.main, menu);
	      return true;
	   }

	}
