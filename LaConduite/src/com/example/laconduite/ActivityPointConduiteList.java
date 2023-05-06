package com.example.laconduite;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class ActivityPointConduiteList extends Activity {

	
	ListView listViewPoint=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_point_conduite_list);

		listViewPoint = (ListView) findViewById(R.id.listViewPointConduit);


		
		//Création de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemPoint = new ArrayList<HashMap<String, String>>();
 
        
        HashMap<String, String> mapPanneaux;
 
       
        
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Homicide ou blesseur involontaire");
        mapPanneaux.put("description", " 6 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a1));
        listItemPoint.add(mapPanneaux);
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Conduite en état d'alcoolémie");
        mapPanneaux.put("description", " 6 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a2));
        listItemPoint.add(mapPanneaux);
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Consommation de stupéfiants");
        mapPanneaux.put("description", " 6 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a3));
        listItemPoint.add(mapPanneaux);
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Excès de vitesse de-de 20 km/h");
        mapPanneaux.put("description", " 1 point");
        mapPanneaux.put("img", String.valueOf(R.drawable.a4));
        listItemPoint.add(mapPanneaux);
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Excès de vitesse de 20  à -de 30 km/h");
        mapPanneaux.put("description", " 2 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a5));
        listItemPoint.add(mapPanneaux);
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Excès de vitesse de 30  à -de 40 km/h");
        mapPanneaux.put("description", " 3 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a6));
        listItemPoint.add(mapPanneaux);
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Excès de vitesse de 40  à -de 50 km/h");
        mapPanneaux.put("description", " 3 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a7));
        listItemPoint.add(mapPanneaux);
        
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Excès de vitesse de 50 km/h ou plus");
        mapPanneaux.put("description", " 6 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a8));
        listItemPoint.add(mapPanneaux);
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Distance de sécurité");
        mapPanneaux.put("description", " 3 points ");
        mapPanneaux.put("img", String.valueOf(R.drawable.a9));
        listItemPoint.add(mapPanneaux);
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Distance de csécurité (tunnels)");
        mapPanneaux.put("description", " 6 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a10));
        listItemPoint.add(mapPanneaux);
        
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Délit de fuite");
        mapPanneaux.put("description", " 6 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a11));
        listItemPoint.add(mapPanneaux);
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Refuts d'obtempèrer");
        mapPanneaux.put("description", " 6 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a12));
        listItemPoint.add(mapPanneaux);
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Conduite et suspension du permis");
        mapPanneaux.put("description", " 6 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a13));
        listItemPoint.add(mapPanneaux);
        
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Fausse plaque d'immatriculation");
        mapPanneaux.put("description", " 6 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a14));
        listItemPoint.add(mapPanneaux);
		
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Non port de la ceinture de sécurité");
        mapPanneaux.put("description", " 3 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a15));
        listItemPoint.add(mapPanneaux);
        
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "  Non port de casque");
        mapPanneaux.put("description", "    3 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a16));
        listItemPoint.add(mapPanneaux);
        
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "   Usage du téléphone portable");
        mapPanneaux.put("description", "    2 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a17));
        listItemPoint.add(mapPanneaux);
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Circulation à gauche");
        mapPanneaux.put("description", " 3 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a18));
        listItemPoint.add(mapPanneaux);
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Changement de direction");
        mapPanneaux.put("description", " 3 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a19));
        listItemPoint.add(mapPanneaux);
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Chevauchement ligne continue");
        mapPanneaux.put("description", " 1 point");
        mapPanneaux.put("img", String.valueOf(R.drawable.a20));
        listItemPoint.add(mapPanneaux);
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Franchissement ligne continue");
        mapPanneaux.put("description", " 3 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a21));
        listItemPoint.add(mapPanneaux);
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Circulation en sens interdit");
        mapPanneaux.put("description", " 4 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a22));
        listItemPoint.add(mapPanneaux);
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Non respect de l'arrêt au feu rouge");
        mapPanneaux.put("description", " 4 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a23));
        listItemPoint.add(mapPanneaux);
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Non respect de l'arrêt au stop");
        mapPanneaux.put("description", " 4 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a24));
        listItemPoint.add(mapPanneaux);
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Refus de priorité");
        mapPanneaux.put("description", " 4 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a25));
        listItemPoint.add(mapPanneaux);
        
        
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Refus de priorité  a un piéton");
        mapPanneaux.put("description", " 4 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a26));
        listItemPoint.add(mapPanneaux);
        
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Utilisation d'un détecteur de radar");
        mapPanneaux.put("description", " 2 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a27));
        listItemPoint.add(mapPanneaux);
        
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Dépassement dangereux");
        mapPanneaux.put("description", " 3 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a28));
        listItemPoint.add(mapPanneaux);
        
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Accélération");
        mapPanneaux.put("description", " 2 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a29));
        listItemPoint.add(mapPanneaux);
        
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Circulation sans éclairage");
        mapPanneaux.put("description", " 4 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a30));
        listItemPoint.add(mapPanneaux);
        
        
       
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Stationnement sans éclairage");
        mapPanneaux.put("description", " 3 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a31));
        listItemPoint.add(mapPanneaux); 
        
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Stationnement ou arrêt dangereux");
        mapPanneaux.put("description", " 3 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a32));
        listItemPoint.add(mapPanneaux);
        
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Pénétration sur le terre-plein central");
        mapPanneaux.put("description", " 2 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a33));
        listItemPoint.add(mapPanneaux);
        
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Bande d'arrêt d'urgence");
        mapPanneaux.put("description", " 3 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a34));
        listItemPoint.add(mapPanneaux);
        
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Marche arrière sur autoroute");
        mapPanneaux.put("description", " 4 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a35));
        listItemPoint.add(mapPanneaux);
        
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Cumul de 2 infractions");
        mapPanneaux.put("description", " 8 points");
        mapPanneaux.put("img", String.valueOf(R.drawable.a36));
        listItemPoint.add(mapPanneaux);
        
      //Création d'un SimpleAdapter qui se chargera de mettre les items présent dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mSchedulepoint = new SimpleAdapter (this.getBaseContext(), listItemPoint, R.layout.affichageitem,
               new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
 
        //On attribut à notre listView l'adapter que l'on vient de créer
        listViewPoint.setAdapter(mSchedulepoint);
        
      
        listViewPoint.setOnItemClickListener(new OnItemClickListener() {
			@Override
        	@SuppressWarnings("unchecked")
         	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				//on récupère la HashMap contenant les infos de notre item (titre, description, img)
        		HashMap<String, String> map = (HashMap<String, String>) listViewPoint.getItemAtPosition(position);


        		switch (position) {
                case 0:  
                	// Show Alert 
                    // Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG).show();
                      
                     
              		        
                  		Intent IntentPoint0 = new Intent(ActivityPointConduiteList.this,ActivityPoint1.class);
                  	 	startActivity(IntentPoint0);	
              		   	
              		   
                  break;
                  case 1:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                  	Intent IntentPoint1 = new Intent(ActivityPointConduiteList.this,ActivityPoint2.class);
              	 	startActivity(IntentPoint1);	
                      
                     
                      
                      
                           break;	
          	
                  case 2:  
                 	 // Show Alert 
                     //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                      // .show();
                  	 Intent IntentPoint2= new Intent(ActivityPointConduiteList.this,ActivityPoint3.class);
                  	   	startActivity(IntentPoint2);	
          		    break;  
                  case 3:  
                    	 // Show Alert 
                        //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                         // .show();
                  	  Intent IntentPoint3= new Intent(ActivityPointConduiteList.this,ActivityPoint4.class);
                  		startActivity(IntentPoint3);	
                     
                     
                          break;	
                         
                          
                  case 4:  
                   	 // Show Alert 
                       //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                        // .show();
                  	   Intent IntentPoint4= new Intent(ActivityPointConduiteList.this,ActivityPoint5.class);
                  	  	startActivity(IntentPoint4);	
                    
                    
                         break;
                         
                  case 5:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                  	  Intent IntentPoint5= new Intent(ActivityPointConduiteList.this,ActivityPoint6.class);
                  		startActivity(IntentPoint5);	
                   
                   
                        break;	 
                          
                  case 6:  
                 	 // Show Alert 
                     //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                      // .show();
                  	  Intent IntentPoint6= new Intent(ActivityPointConduiteList.this,ActivityPoint7.class);
                  	   	startActivity(IntentPoint6);	
          		    break;	
          		   	
          		   	
                  case 7:  
                    	 // Show Alert 
                        //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                         // .show();
                  	   Intent IntentPoint8= new Intent(ActivityPointConduiteList.this,ActivityPoint8.class);
                  	startActivity(IntentPoint8);	
                  
             		 break;		
             		   	
             		   	
             		   	
                  case 8:  
                   	 // Show Alert 
                       //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                        // .show();
                  	    Intent IntentPoint9= new Intent(ActivityPointConduiteList.this,ActivityPoint9.class);
                  	  	startActivity(IntentPoint9);	
            		   	
            		   	
            		   	
            		   	
            		   	
            		   	
                       break;	
                       
                       
                  case 9:  
                   	 // Show Alert 
                       //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                        // .show();
                  	Intent IntentPoint10= new Intent(ActivityPointConduiteList.this,ActivityPoint10.class);
              	  	startActivity(IntentPoint10);	
                 
            		 break;	
                       
                       
                  case 10:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                  	Intent IntentPoint11= new Intent(ActivityPointConduiteList.this,ActivityPoint11.class);
              	  	startActivity(IntentPoint11);	
                
           		 break;	   
                  case 11:  
                 	 // Show Alert 
                     //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                      // .show();
                  	Intent IntentPoint12= new Intent(ActivityPointConduiteList.this,ActivityPoint12.class);
              	  	startActivity(IntentPoint12);
               
          		 break;	   
            		 
          		 
          		 
                  case 12:  
                    	 // Show Alert 
                        //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                         // .show();
                  	Intent IntentPoint13= new Intent(ActivityPointConduiteList.this,ActivityPoint13.class);
              	  	startActivity(IntentPoint13);	
                  
             		 break;	   
               		  
          		 
                  case 13:  
                   	 // Show Alert 
                       //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                        // .show();
                  	Intent IntentPoint14= new Intent(ActivityPointConduiteList.this,ActivityPoint14.class);
              	  	startActivity(IntentPoint14);	
                 
            		 break;	   
          		 
                  case 14:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                  	Intent IntentPoint15= new Intent(ActivityPointConduiteList.this,ActivityPoint15.class);
              	  	startActivity(IntentPoint15);	
                
           		 break;	   
          		 
                  case 15:  
                 	 // Show Alert 
                     //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                      // .show();
                 	Intent IntentPoint16= new Intent(ActivityPointConduiteList.this,ActivityPoint16.class);
             	  	startActivity(IntentPoint16);	
               
          		 break;	   
          		 
                  case 16:  
                 	 // Show Alert 
                     //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                      // .show();
                 	Intent IntentPoint17= new Intent(ActivityPointConduiteList.this,ActivityPoint17.class);
             	  	startActivity(IntentPoint17);	
               
          		 break;	   
          		 
                  case 17:  
                 	 // Show Alert 
                     //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                      // .show();
                 	Intent IntentPoint18= new Intent(ActivityPointConduiteList.this,ActivityPoint18.class);
             	  	startActivity(IntentPoint18);	
               
          		 break;	   
          		 
                  case 18:  
                 	 // Show Alert 
                     //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                      // .show();
                 	Intent IntentPoint19= new Intent(ActivityPointConduiteList.this,ActivityPoint19.class);
             	  	startActivity(IntentPoint19);	
               
          		 break;	   
           		 
                  case 19:  
                    	 // Show Alert 
                        //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                         // .show();
                  	Intent IntentPoint20= new Intent(ActivityPointConduiteList.this,ActivityPoint20.class);
                	  	startActivity(IntentPoint20);
                  
             		 break;	  
             		 
                  case 20:  
                    	 // Show Alert 
                        //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                         // .show();
                    	Intent IntentPoint21= new Intent(ActivityPointConduiteList.this,ActivityPoint21.class);
                	  	startActivity(IntentPoint21);	
                  
             		 break;	  
             		 
                  case 21:  
                    	 // Show Alert 
                        //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                         // .show();
                    	Intent IntentPoint22= new Intent(ActivityPointConduiteList.this,ActivityPoint22.class);
                	  	startActivity(IntentPoint22);	
                  
             		 break;	  
             		 
                  case 22:  
                    	 // Show Alert 
                        //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                         // .show();
                    	Intent IntentPoint23= new Intent(ActivityPointConduiteList.this,ActivityPoint23.class);
                	  	startActivity(IntentPoint23);	
                  
             		 break;	  
             		 
                  case 23:  
                    	 // Show Alert 
                        //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                         // .show();
                    	Intent IntentPoint24= new Intent(ActivityPointConduiteList.this,ActivityPoint24.class);
                	  	startActivity(IntentPoint24);	
                  
             		 break;	  
             		 
                  case 24:  
                    	 // Show Alert 
                        //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                         // .show();
                    	Intent IntentPoint25= new Intent(ActivityPointConduiteList.this,ActivityPoint25.class);
                	  	startActivity(IntentPoint25);	
                  
             		 break;	  
             		 
                  case 25:  
                    	 // Show Alert 
                        //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                         // .show();
                    	Intent IntentPoint26= new Intent(ActivityPointConduiteList.this,ActivityPoint26.class);
                	  	startActivity(IntentPoint26);	
                  
             		 break;	  
             		 
                  case 26:  
                    	 // Show Alert 
                        //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                         // .show();
                    	Intent IntentPoint27= new Intent(ActivityPointConduiteList.this,ActivityPoint27.class);
                	  	startActivity(IntentPoint27);	
                  
             		 break;	  
             		 
                  case 27:  
                    	 // Show Alert 
                        //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                         // .show();
                    	Intent IntentPoint28= new Intent(ActivityPointConduiteList.this,ActivityPoint28.class);
                	  	startActivity(IntentPoint28);	
                  
             		 break;	  
             		 
                  case 28:  
                    	 // Show Alert 
                        //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                         // .show();
                    	Intent IntentPoint29= new Intent(ActivityPointConduiteList.this,ActivityPoint29.class);
                	  	startActivity(IntentPoint29);	
                  
             		 break;	  
             		 
                  case 29:  
                    	 // Show Alert 
                        //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                         // .show();
                    	Intent IntentPoint30= new Intent(ActivityPointConduiteList.this,ActivityPoint30.class);
                	  	startActivity(IntentPoint30);	
                  
             		 break;	  
             		 
                  case 30:  
                    	 // Show Alert 
                        //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                         // .show();
                    	Intent IntentPoint31= new Intent(ActivityPointConduiteList.this,ActivityPoint31.class);
                	  	startActivity(IntentPoint31);	
                  
             		 break;	  
             		 
                  case 31:  
                    	 // Show Alert 
                        //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                         // .show();
                    	Intent IntentPoint32= new Intent(ActivityPointConduiteList.this,ActivityPoint32.class);
                	  	startActivity(IntentPoint32);	
                  
             		 break;	  
             		 
                  case 32:  
                    	 // Show Alert 
                        //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                         // .show();
                    	Intent IntentPoint33= new Intent(ActivityPointConduiteList.this,ActivityPoint33.class);
                	  	startActivity(IntentPoint33);	
                  
             		 break;	  
             		 
                  case 33:  
                    	 // Show Alert 
                        //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                         // .show();
                    	Intent IntentPoint34= new Intent(ActivityPointConduiteList.this,ActivityPoint34.class);
                	  	startActivity(IntentPoint34);	
                  
             		 break;	  
             		 
                  case 34:  
                    	 // Show Alert 
                        //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                         // .show();
                    	Intent IntentPoint35= new Intent(ActivityPointConduiteList.this,ActivityPoint35.class);
                	  	startActivity(IntentPoint35);	
                  
             		 break;	  
             		 
                  case 35:  
                    	 // Show Alert 
                        //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                         // .show();
                    	Intent IntentPoint36= new Intent(ActivityPointConduiteList.this,ActivityPoint36.class);
                	  	startActivity(IntentPoint36);	
                  
             		 break;	  
             		 
                  
                 }}});
        
	
	}}
