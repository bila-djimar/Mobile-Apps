package com.characteristicsamartphone;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.BatteryManager;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

@SuppressLint("NewApi")
public class ActivityBattery extends Activity {
	
	    float BackLightValue = 0.5f; //dummy default value
	    ///float BackLightValue2 = 0.9f;
	
		private TextView TextViewbatteryLevel;
		private TextView TextViewbatteryTemperature;
		private TextView TextViewbatteryHealt;
		private TextView TextViewbatteryVoltage;
		private TextView TextViewbatteryTechnologie;
		private TextView TextViewbatteryStatus;
		private TextView TextViewbatteryPresent;
		private TextView TextViewbatteryChargePLUGGED;
		private TextView TextViewModeEconomic ;
	
		
		
		
		
		  private BroadcastReceiver mBatInfoReceiver = new BroadcastReceiver(){
		    @Override
		    public void onReceive(Context ctxt, Intent intent) {
		      
		  
		  //--------------------------------- level of battery ---debut-----------------------------//	
		    int  level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0);
		    TextViewbatteryLevel.setText("          "+String.valueOf(level) + "%");
		    ProgressBar ProgressBarbattery = (ProgressBar) findViewById(R.id.progressbar);
		    ProgressBarbattery.getIndeterminateDrawable().setColorFilter(0xFFFFFFFF, android.graphics.PorterDuff.Mode.MULTIPLY);
		    
		    ProgressBarbattery.setProgress(level);
		    ProgressBarbattery.setScaleY(ProgressBarbattery.getHeight());
		  

		    
		    
		    
		    
		    
		    
		    
		    if(level<=15)
		    {
		       
		    	
		    	
		    	
		    	
		    	//-------------------------un message d'alerte----debut instruction---------------------------// 
		    	    /* Context context = getApplicationContext();
		             CharSequence text = "Battery is low!";
		             int duration = Toast.LENGTH_LONG;
                     Toast toast = Toast.makeText(context, text, duration);
		             toast.show();*/ 
		        //-------------------------un message d'alerte----fin  instruction---------------------------//
		             
		            
		       //-------------------------Tester le bluetooth----debut instruction---------------------------//          
		          /*   BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();    
			         if (mBluetoothAdapter.isEnabled()) { mBluetoothAdapter.disable();}*/
			  //-------------------------Tester le bluetooth----fin instruction---------------------------//                     
		    
		    
			 //-------------------------Tester le wifi----debut instruction---------------------------//       
			        /* WifiManager wifiManager = (WifiManager)getSystemService(Context.WIFI_SERVICE); 
		             if (wifiManager.setWifiEnabled(true)) {wifiManager.setWifiEnabled(false);}*/
		    //-------------------------Tester le wifi----fin instruction---------------------------// 
		             
		            
		             
		             
		            
		            

		            
		   //-------------------------Tester le mode silencieux----debut instruction---------------------------//           
				      
				    /*  AudioManager amanager=(AudioManager)getSystemService(Context.AUDIO_SERVICE); 
				      amanager.setRingerMode(AudioManager.RINGER_MODE_SILENT);   */ 
				    
		  //-------------------------Tester le mode silencieux----fin instruction---------------------------//           
		
	    
       
		      
//-------------------------diminuer la luminosité vers la coleur noir----debut instruction---------------------------// 
		      
		      android.provider.Settings.System.putInt(getContentResolver(),
				      android.provider.Settings.System.SCREEN_OFF_TIMEOUT,
				      60000);
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      /*  Intent brightnessIntent = new Intent();
				float  brightness = brightnessIntent.getFloatExtra("brightness value",0.1f);
		        WindowManager.LayoutParams lp = getWindow().getAttributes();
		        lp.screenBrightness = brightness;
		        getWindow().setAttributes(lp);*/


		      
		        
		        
		        
		      
		        
		        
		        
		        
		        
		        
		          
		      
		      
//-------------------------diminuer la luminosité vers la coleur noir----FIN instruction---------------------------// 	      
		      
		      
		      
   //-------------------------Tester la visibility----debut instruction---------------------------// 
		      
		      
		      
		      
		      
		       
		      
		      TextViewModeEconomic.setVisibility(View.INVISIBLE);
		     
		      
		      
		      SeekBar SeekBarLuminosity = (SeekBar)findViewById(R.id.SeekBarLuminosity);

              final TextView TextViewPorcentageLuminusite = (TextView)findViewById(R.id.PorcentageLuminusite);
		      TextViewPorcentageLuminusite.setGravity(Gravity.CENTER);
		      
		      SeekBarLuminosity.setVisibility(View.INVISIBLE);
		      TextViewPorcentageLuminusite.setVisibility(View.INVISIBLE);
//-------------------------Tester la visibility----fin instruction---------------------------//		      
		      
		      
		      
		    
		      
		      
		      
		      
		      
		



		    }
		    
		    
		    
	else
		    	
		    {
		    	
		  

 //-------------------------diminuer la luminosité vers la coleur ----debut instruction---------------------------// 
	      android.provider.Settings.System.putInt(getContentResolver(),
			      android.provider.Settings.System.SCREEN_OFF_TIMEOUT,
			      60000);
	      
	      
	    
	        
	             
	      
	      
//-------------------------diminuer la luminosité vers la coleur ----FIN instruction---------------------------// 	      
		
		    	  
		
	            TextViewModeEconomic.setVisibility(View.INVISIBLE);
		     
		      
		      
		      SeekBar SeekBarLuminosity = (SeekBar)findViewById(R.id.SeekBarLuminosity);
		      SeekBarLuminosity.setVisibility(View.INVISIBLE);

              final TextView TextViewPorcentageLuminusite = (TextView)findViewById(R.id.PorcentageLuminusite);
		      TextViewPorcentageLuminusite.setGravity(Gravity.CENTER);
		      TextViewPorcentageLuminusite.setVisibility(View.INVISIBLE);
		      
		     
		      
		      
		      
		      
		      
		    }
		     //-----------------------------------------LEVEL------------------------	 
		    
		     
		     
		     
		     
		     
		     
		   //-----------------------------------------TEMPERATURE------------------------	
		     int temp = intent.getIntExtra(BatteryManager.EXTRA_TEMPERATURE, 0);
		     double temperature=temp/10.0;
		     TextViewbatteryTemperature.setText("          "+String.valueOf(temperature) + " °C");
		     
		     
		     
		     
		   //-----------------------------------------TEMPERATURE------------------------	   
		     
		     
		     //----------------------------------------FAILURE-------------------------	
		     int healttext = intent.getIntExtra(BatteryManager.EXTRA_HEALTH, 0);
		     
		     
		     if(healttext==BatteryManager.BATTERY_HEALTH_COLD)
			    {
		    	 
		    	 
		    	 TextViewbatteryHealt.setText("          ");
		    	/* TextViewbatteryHealt.setText("          Cold");
			     Context contextCold= getApplicationContext();
			     CharSequence textCold = "Battery is Cold!";
			     int durationCold = Toast.LENGTH_LONG;
	      
			     Toast toastCold = Toast.makeText(contextCold, textCold, durationCold);
			     toastCold.show();  */  
			    
			    
			    
			    }
		     
		     
		     
		     if(healttext==BatteryManager.BATTERY_HEALTH_DEAD)
			    { 
		    	 TextViewbatteryHealt.setText("          ");
		    	 
		    	/* TextViewbatteryHealt.setText("          Dead");
			     Context contextDead= getApplicationContext();
			     CharSequence textDead = "Battery is Dead!";
			     int durationDead = Toast.LENGTH_LONG;
	      
			     Toast toastDead = Toast.makeText(contextDead, textDead, durationDead);
			     toastDead.show(); */
			    }
		     
		     
		     
		     
		     if(healttext==BatteryManager.BATTERY_HEALTH_GOOD)
			    { TextViewbatteryHealt.setText("          Good");
			    
			    
			  
			    }
		     
		     
		     
		     
		     
		     
		     if(healttext==BatteryManager.BATTERY_HEALTH_OVER_VOLTAGE)
			    { 
		    	 
		    	 TextViewbatteryHealt.setText("          ");
		    	/* TextViewbatteryHealt.setText("          Over voltage");
		    	 Context contextvoltage= getApplicationContext();
			     CharSequence textvoltage = "Battery is Over voltage!";
			     int durationvoltage = Toast.LENGTH_LONG;
	      
			     Toast toastvoltage = Toast.makeText(contextvoltage, textvoltage, durationvoltage);
			     toastvoltage.show(); */
		    	 
			    }	
		     
		     if(healttext==BatteryManager.BATTERY_HEALTH_OVERHEAT)
		    	 
			    {
		    	 
		    	 
		    	 TextViewbatteryHealt.setText("          ");
		    	/* TextViewbatteryHealt.setText("          Overheat");
			     Context contextOverheat= getApplicationContext();
			     CharSequence textOverheat = "Battery is Overheat!";
			     int durationOverheat = Toast.LENGTH_LONG;
	      
			     Toast toastOverheat = Toast.makeText(contextOverheat, textOverheat, durationOverheat);
			     toastOverheat.show(); */
			    }	
		     
		     if(healttext==BatteryManager.BATTERY_HEALTH_UNKNOWN)/*=2*/
			    { 
		    	 
		    	 TextViewbatteryHealt.setText("          ");
		    	 
		    	 /*TextViewbatteryHealt.setText("          Unknown");
		    	 
		    	 Context contextUNKNOWN= getApplicationContext();
			     CharSequence textUNKNOWN = "Unknown problem of Battery !";
			     int durationUNKNOWN = Toast.LENGTH_LONG;
	      
			     Toast toastUNKNOWN = Toast.makeText(contextUNKNOWN, textUNKNOWN, durationUNKNOWN);
			     toastUNKNOWN.show();*/
			    
			   }	
		     
		     if(healttext==BatteryManager.BATTERY_HEALTH_UNSPECIFIED_FAILURE)/*=2*/
			    { 
		    	 
		    	 TextViewbatteryHealt.setText("          ");
		    	/* TextViewbatteryHealt.setText("          Unspecified failure");
		    	 Context contextUnspecified= getApplicationContext();
			     CharSequence textUnspecified = "Unspecified failure of Battery !";
			     int durationUnspecified = Toast.LENGTH_LONG;
	      
			     Toast toastUnspecified = Toast.makeText(contextUnspecified, textUnspecified, durationUnspecified);
			     toastUnspecified.show();*/
			    
			    }	
		     //------------------------------------------FAILURE-----------------------	 
		     
		    
		     
		    //-------------------------------------------VOLTAGE----------------------	
		     int voltagetext = intent.getIntExtra(BatteryManager.EXTRA_VOLTAGE, 0);
		     TextViewbatteryVoltage.setText("          "+String.valueOf(voltagetext+" mV"));
		     
		     //------------------------------------------VOLTAGE-----------------------	  
		     
		     
		     
		     //---------------------------------------TECHNOLOGY--------------------------	
		     String  technologietext= intent.getExtras().getString(BatteryManager.EXTRA_TECHNOLOGY);
		     TextViewbatteryTechnologie.setText("          "+technologietext);
		    
		     //------------------------------------TECHNOLOGY-----------------------------	   
		    
		     
		     
		    //-------------------------------------STATUS----------------------------	
		     int statust = intent.getIntExtra(BatteryManager.EXTRA_STATUS, -1);
		    
		   
		     
		     if(statust==BatteryManager.BATTERY_STATUS_CHARGING)/*=2*/
			   { TextViewbatteryStatus.setText("          Charging");
			   
			   
			   }	
		     
		     if(statust==BatteryManager.BATTERY_STATUS_DISCHARGING)/*=3*/
		       { TextViewbatteryStatus.setText("          Discharging");
		       
		       }	
		     
		    if(statust==  BatteryManager.BATTERY_STATUS_FULL)/*=3*/
		       { TextViewbatteryStatus.setText("          Full");
		       
		       }
		    
		    if(statust==BatteryManager.BATTERY_STATUS_NOT_CHARGING)/*=3*/
		      { TextViewbatteryStatus.setText("          Not charging");
		     
		      }
		     
		     
		    if(statust==BatteryManager.BATTERY_STATUS_UNKNOWN)/*=3*/
		      { TextViewbatteryStatus.setText("          Unknown");
		      
		      }
		    //---------------------------------STATUS--------------------------------	
		    
		    
		    
		    //----------------------------------PLUGGED-------------------------------	
		    
		     int chargePlug = intent.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1);
		     
		     if(chargePlug==0)/*BatteryManager.BATTERY_PLUGGED_AC*/
			    {TextViewbatteryChargePLUGGED.setText("          Battery");
			    
			    }	
		     
		    if(chargePlug==BatteryManager.BATTERY_PLUGGED_USB)/*2*/
		    { TextViewbatteryChargePLUGGED.setText("          USB port");
		    
		    }	
		     
		    if(chargePlug==  BatteryManager.BATTERY_PLUGGED_WIRELESS)/*4*/
		    { TextViewbatteryChargePLUGGED.setText("          wireless");
		    
		    
		    }	
		    //--------------------------------PLUGGED---------------------------------	   
		    
		    Boolean Present1= intent.getBooleanExtra(BatteryManager.EXTRA_PRESENT, false);

		    //int pressent = intent.getIntExtra(BatteryManager.EXTRA_PRESENT, -1);
		     
		    TextViewbatteryPresent.setText(String.valueOf("          "+Present1));
		     
		    }
		  };
		  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_battery);
		
		
		
			
		
		
		TextViewModeEconomic = (TextView)findViewById(R.id.TextViewModeEconomic);
		TextViewModeEconomic.setGravity(Gravity.CENTER);
		TextViewModeEconomic.setTextColor(Color.parseColor("#E71B14"));
		TextViewModeEconomic.setVisibility(View.INVISIBLE);
		
		
		
		
		
		
		
		
		
		        
		
		        
		         TextViewbatteryLevel = (TextView) this.findViewById(R.id.textViewLevel111);
		         TextViewbatteryLevel.setTextColor(Color.parseColor("#0000FF"));
		         
		         
				 TextViewbatteryTemperature = (TextView) this.findViewById(R.id.textViewTemperature);
				 TextViewbatteryTemperature.setTextColor(Color.parseColor("#0000FF"));
				 
				 TextViewbatteryHealt = (TextView) this.findViewById(R.id.textViewHealth);
				 TextViewbatteryHealt.setTextColor(Color.parseColor("#0000FF"));
				 
				 TextViewbatteryVoltage = (TextView) this.findViewById(R.id.textViewVoltage);
				TextViewbatteryVoltage.setTextColor(Color.parseColor("#0000FF"));
				 
				 
				 TextViewbatteryTechnologie = (TextView) this.findViewById(R.id.textViewTechnology);
				 TextViewbatteryTechnologie.setTextColor(Color.parseColor("#0000FF"));
				 
				 TextViewbatteryStatus= (TextView) this.findViewById(R.id.textViewStatus);
				 TextViewbatteryStatus.setTextColor(Color.parseColor("#0000FF"));
				 
				 TextViewbatteryChargePLUGGED=(TextView) this.findViewById(R.id.textViewPower);
				 TextViewbatteryChargePLUGGED.setTextColor(Color.parseColor("#0000FF"));
				  
				 TextViewbatteryPresent=(TextView) this.findViewById(R.id.textViewPresent);
				 TextViewbatteryPresent.setTextColor(Color.parseColor("#0000FF"));
				 
				
				this.registerReceiver(this.mBatInfoReceiver, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
		
		
		
		
		
		
		
		
		
		
		
	}


	
}
