package com.example.plantesmedicinales;

import java.util.ArrayList;
import java.util.HashMap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class ActivityMauxEspritList extends ActionBarActivity {
	ListView listViewMauxEspritlist=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_maux_esprit_list);



		
		
		
		
		
		
listViewMauxEspritlist = (ListView) findViewById(R.id.ListViewMauxEsprit);
		
		
		//Création de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemMauxEspritList = new ArrayList<HashMap<String, String>>();
 
        //On déclare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapTestElementMauxEsprit;
 
       
        //Création d'une HashMap pour insérer les informations du premier item de notre listView
        mapTestElementMauxEsprit = new HashMap<String, String>();
        //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
        mapTestElementMauxEsprit.put("titre", "Aubépine");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        mapTestElementMauxEsprit.put("description", "Aubépine");
        //on insère la référence à l'image (convertit en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
      
        mapTestElementMauxEsprit.put("img", String.valueOf(R.drawable.aubepine));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemMauxEspritList.add(mapTestElementMauxEsprit); 
        
        

  
        mapTestElementMauxEsprit = new HashMap<String, String>();
        mapTestElementMauxEsprit.put("titre", "Ginkgo biloba");
        mapTestElementMauxEsprit.put("description", "Ginkgo biloba");
        mapTestElementMauxEsprit.put("img", String.valueOf(R.drawable.ginkgobiloba));
        listItemMauxEspritList.add(mapTestElementMauxEsprit);	
		
		
        mapTestElementMauxEsprit = new HashMap<String, String>();
        mapTestElementMauxEsprit.put("titre", "Houblon");
        mapTestElementMauxEsprit.put("description", "Houblon");
        mapTestElementMauxEsprit.put("img", String.valueOf(R.drawable.houblon));
        listItemMauxEspritList.add(mapTestElementMauxEsprit);
        
        
        
        
       
        mapTestElementMauxEsprit = new HashMap<String, String>();
        mapTestElementMauxEsprit.put("titre", "Lavande)");
        mapTestElementMauxEsprit.put("description", "Lavande)");
        mapTestElementMauxEsprit.put("img", String.valueOf(R.drawable.lavande));
        listItemMauxEspritList.add(mapTestElementMauxEsprit);
        
        mapTestElementMauxEsprit = new HashMap<String, String>();
        mapTestElementMauxEsprit.put("titre", "Millepertuis)");
        mapTestElementMauxEsprit.put("description", "Millepertuis)");
        mapTestElementMauxEsprit.put("img", String.valueOf(R.drawable.millepertuis));
        listItemMauxEspritList.add(mapTestElementMauxEsprit);
        
        
		

        mapTestElementMauxEsprit = new HashMap<String, String>();
        mapTestElementMauxEsprit.put("titre", "Passiflore)");
        mapTestElementMauxEsprit.put("description", "Passiflore)");
        mapTestElementMauxEsprit.put("img", String.valueOf(R.drawable.passiflore));
        listItemMauxEspritList.add(mapTestElementMauxEsprit);
        
        
        mapTestElementMauxEsprit = new HashMap<String, String>();
        mapTestElementMauxEsprit.put("titre", "Romarin");
        mapTestElementMauxEsprit.put("description", "Romarin");
        mapTestElementMauxEsprit.put("img", String.valueOf(R.drawable.romarin));
        listItemMauxEspritList.add(mapTestElementMauxEsprit);
        
        
        mapTestElementMauxEsprit = new HashMap<String, String>();
        mapTestElementMauxEsprit.put("titre", "Rooibos");
        mapTestElementMauxEsprit.put("description", "Rooibos");
        mapTestElementMauxEsprit.put("img", String.valueOf(R.drawable.rooibos));
        listItemMauxEspritList.add(mapTestElementMauxEsprit);
        
        
        
        mapTestElementMauxEsprit = new HashMap<String, String>();
        mapTestElementMauxEsprit.put("titre", "Tilleul");
        mapTestElementMauxEsprit.put("description", "Tilleul");
        mapTestElementMauxEsprit.put("img", String.valueOf(R.drawable.tilleul));
        listItemMauxEspritList.add(mapTestElementMauxEsprit);
        
        
        //Création d'un SimpleAdapter qui se chargera de mettre les items présent dans notre list (listItem) dans la vue affichageitem
          SimpleAdapter mScheduleTestSerie = new SimpleAdapter (this.getBaseContext(), listItemMauxEspritList, R.layout.affichageitem,
                 new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
   
          //On attribut à notre listView l'adapter que l'on vient de créer
          listViewMauxEspritlist.setAdapter(mScheduleTestSerie);
  		
  		
  		
          listViewMauxEspritlist.setOnItemClickListener(new OnItemClickListener() {
  			@Override
          	@SuppressWarnings("unchecked")
           	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
  				//on récupère la HashMap contenant les infos de notre item (titre, description, img)
          		HashMap<String, String> map = (HashMap<String, String>) listViewMauxEspritlist.getItemAtPosition(position);

          switch (position) {
          case 0:
          	 // Show Alert 
            // Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG).show();
              
             
      		        
      		   	Intent IntentActivityAubepine = new Intent(ActivityMauxEspritList.this,ActivityAubepine.class);
      		  	startActivity(IntentActivityAubepine);	
      		   	
      		   
          break;
          case 1:  
          	 // Show Alert 
              //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
               // .show();
             Intent IntentActivityGinkgoBiloba= new Intent(ActivityMauxEspritList.this,ActivityGinkgoBiloba.class);
  		   	startActivity(IntentActivityGinkgoBiloba);	
              
             
              
              
                   break;	
  	
          case 2:  
         	 // Show Alert 
             //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
              // .show();
            Intent IntentHoublon= new Intent(ActivityMauxEspritList.this,ActivityHoublon.class);
  		   	startActivity(IntentHoublon);	
  		    break;  
         
  		
          case 3:  
          	 // Show Alert 
              //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
               // .show();
             Intent IntentLavande= new Intent(ActivityMauxEspritList.this,ActivityLavande.class);
   		   	startActivity(IntentLavande);	
   		    break;  
  		   	
  		   	
          case 4:  
           	 // Show Alert 
               //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                // .show();
              Intent IntentMillepertuis= new Intent(ActivityMauxEspritList.this,ActivityMillepertuis.class);
    		   	startActivity(IntentMillepertuis);	
    		    break;  
    		   	
    		   	
          case 5:  
            	 // Show Alert 
                //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                 // .show();
               Intent IntentPassiflore= new Intent(ActivityMauxEspritList.this,ActivityPassiflore.class);
     		   	startActivity(IntentPassiflore);	
     		    break; 
     		    
     		    
     		    
          case 6:  
         	 // Show Alert 
             //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
              // .show();
            Intent IntentActivityRomarin= new Intent(ActivityMauxEspritList.this,ActivityRomarin.class);
  		   	startActivity(IntentActivityRomarin);	
  		    break;    	    
     		    
        
  		    
          case 7:  
          	 // Show Alert 
              //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
               // .show();
             Intent IntentActivityRooibos= new Intent(ActivityMauxEspritList.this,ActivityRooibos.class);
   		   	startActivity(IntentActivityRooibos);	
   		    break;   
  		    
  		 
          case 8:  
           	 // Show Alert 
               //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                // .show();
              Intent IntentActivityTilleul= new Intent(ActivityMauxEspritList.this,ActivityTilleul.class);
    		   	startActivity(IntentActivityTilleul);	
    		    break;    
              
   		    
        }
            
       
    		
    	}

  		
  		
  		
  		
  		
  		
  	
   });










  }


  }
