package com.example.plantesmedicinales;

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

public class ActivityTroubleDigestionTransitList extends  Activity {
	ListView listViewTroubleDigestionTransitlist=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_trouble_digestion_transit_list);



		
listViewTroubleDigestionTransitlist = (ListView) findViewById(R.id.ListViewTroubleDigestionTransitList);
		
		
		//Création de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemTroubleDigestionTransitList = new ArrayList<HashMap<String, String>>();
 
        //On déclare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapTestElementTroubleDigestionTransit;
 
       
        //Création d'une HashMap pour insérer les informations du premier item de notre listView
        mapTestElementTroubleDigestionTransit = new HashMap<String, String>();
        //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
        mapTestElementTroubleDigestionTransit.put("titre", "Badiane");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        mapTestElementTroubleDigestionTransit.put("description", "Badiane");
        //on insère la référence à l'image (convertit en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
      
        mapTestElementTroubleDigestionTransit.put("img", String.valueOf(R.drawable.badianeanisetoile));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemTroubleDigestionTransitList.add(mapTestElementTroubleDigestionTransit); 
        
        

  
        mapTestElementTroubleDigestionTransit = new HashMap<String, String>();
        mapTestElementTroubleDigestionTransit.put("titre", "Cannelle");
        mapTestElementTroubleDigestionTransit.put("description", "Cannelle");
        mapTestElementTroubleDigestionTransit.put("img", String.valueOf(R.drawable.cannelle));
        listItemTroubleDigestionTransitList.add(mapTestElementTroubleDigestionTransit);	
		
		
        mapTestElementTroubleDigestionTransit = new HashMap<String, String>();
        mapTestElementTroubleDigestionTransit.put("titre", "Cardamome)");
        mapTestElementTroubleDigestionTransit.put("description", "Cardamome)");
        mapTestElementTroubleDigestionTransit.put("img", String.valueOf(R.drawable.cardamome));
        listItemTroubleDigestionTransitList.add(mapTestElementTroubleDigestionTransit);
        
        
        
        
       
        mapTestElementTroubleDigestionTransit = new HashMap<String, String>();
        mapTestElementTroubleDigestionTransit.put("titre", "Curcuma)");
        mapTestElementTroubleDigestionTransit.put("description", "Curcuma)");
        mapTestElementTroubleDigestionTransit.put("img", String.valueOf(R.drawable.curcuma));
        listItemTroubleDigestionTransitList.add(mapTestElementTroubleDigestionTransit);
        
        mapTestElementTroubleDigestionTransit = new HashMap<String, String>();
        mapTestElementTroubleDigestionTransit.put("titre", "Fenouil)");
        mapTestElementTroubleDigestionTransit.put("description", "Fenouil)");
        mapTestElementTroubleDigestionTransit.put("img", String.valueOf(R.drawable.fenouil));
        listItemTroubleDigestionTransitList.add(mapTestElementTroubleDigestionTransit);
        
        
		

        mapTestElementTroubleDigestionTransit = new HashMap<String, String>();
        mapTestElementTroubleDigestionTransit.put("titre", "Fenugrec)");
        mapTestElementTroubleDigestionTransit.put("description", "Fenugrec)");
        mapTestElementTroubleDigestionTransit.put("img", String.valueOf(R.drawable.fenugrec));
        listItemTroubleDigestionTransitList.add(mapTestElementTroubleDigestionTransit);
        
        
        mapTestElementTroubleDigestionTransit = new HashMap<String, String>();
        mapTestElementTroubleDigestionTransit.put("titre", "Psyllium");
        mapTestElementTroubleDigestionTransit.put("description", "Psyllium");
        mapTestElementTroubleDigestionTransit.put("img", String.valueOf(R.drawable.psyllium));
        listItemTroubleDigestionTransitList.add(mapTestElementTroubleDigestionTransit);
        
        
        mapTestElementTroubleDigestionTransit = new HashMap<String, String>();
        mapTestElementTroubleDigestionTransit.put("titre", "Radis noir");
        mapTestElementTroubleDigestionTransit.put("description", "Radis noir");
        mapTestElementTroubleDigestionTransit.put("img", String.valueOf(R.drawable.radisnoire));
        listItemTroubleDigestionTransitList.add(mapTestElementTroubleDigestionTransit);
        
        
        
        
        mapTestElementTroubleDigestionTransit = new HashMap<String, String>();
        mapTestElementTroubleDigestionTransit.put("titre", "Tamarin");
        mapTestElementTroubleDigestionTransit.put("description", "Tamarin");
        mapTestElementTroubleDigestionTransit.put("img", String.valueOf(R.drawable.tamarin));
        listItemTroubleDigestionTransitList.add(mapTestElementTroubleDigestionTransit);
        
        //Création d'un SimpleAdapter qui se chargera de mettre les items présent dans notre list (listItem) dans la vue affichageitem
          SimpleAdapter mScheduleTestSerie = new SimpleAdapter (this.getBaseContext(), listItemTroubleDigestionTransitList, R.layout.affichageitem,
                 new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
   
          //On attribut à notre listView l'adapter que l'on vient de créer
          listViewTroubleDigestionTransitlist.setAdapter(mScheduleTestSerie);
  		
  		
  		
          listViewTroubleDigestionTransitlist.setOnItemClickListener(new OnItemClickListener() {
  			@Override
          	@SuppressWarnings("unchecked")
           	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
  				//on récupère la HashMap contenant les infos de notre item (titre, description, img)
          		HashMap<String, String> map = (HashMap<String, String>) listViewTroubleDigestionTransitlist.getItemAtPosition(position);

          switch (position) {
          case 0:
          	 // Show Alert 
            // Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG).show();
              
             
      		        
      		   	Intent IntentActivityBadiane = new Intent(ActivityTroubleDigestionTransitList.this,ActivityBadiane.class);
      		  	startActivity(IntentActivityBadiane);	
      		   	
      		   
          break;
          case 1:  
          	 // Show Alert 
              //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
               // .show();
             Intent IntentCannelle= new Intent(ActivityTroubleDigestionTransitList.this,ActivityCannelle.class);
  		   	startActivity(IntentCannelle);	
              
             
              
              
                   break;	
  	
          case 2:  
         	 // Show Alert 
             //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
              // .show();
            Intent IntentCardamome= new Intent(ActivityTroubleDigestionTransitList.this,ActivityCardamome.class);
  		   	startActivity(IntentCardamome);	
  		    break;  
         
  		
          case 3:  
          	 // Show Alert 
              //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
               // .show();
             Intent IntentCurcuma= new Intent(ActivityTroubleDigestionTransitList.this,ActivityCurcuma.class);
   		   	startActivity(IntentCurcuma);	
   		    break;  
  		   	
  		   	
          case 4:  
           	 // Show Alert 
               //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                // .show();
              Intent IntentFenouil= new Intent(ActivityTroubleDigestionTransitList.this,ActivityFenouil.class);
    		   	startActivity(IntentFenouil);	
    		    break;  
    		   	
    		   	
          case 5:  
            	 // Show Alert 
                //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                 // .show();
               Intent IntentFenugrec= new Intent(ActivityTroubleDigestionTransitList.this,ActivityFenugrec.class);
     		   	startActivity(IntentFenugrec);	
     		    break; 
     		    
     		    
     		    
          case 6:  
         	 // Show Alert 
             //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
              // .show();
            Intent IntentPsyllium= new Intent(ActivityTroubleDigestionTransitList.this,ActivityPsyllium.class);
  		   	startActivity(IntentPsyllium);	
  		    break;    	    
     		    
        
  		    
          case 7:  
          	 // Show Alert 
              //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
               // .show();
             Intent IntentRadisNoire= new Intent(ActivityTroubleDigestionTransitList.this,ActivityRadisNoire.class);
   		   	startActivity(IntentRadisNoire);	
   		    break;   
  		    
  		 
   		    
          case 8:  
           	 // Show Alert 
               //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                // .show();
              Intent IntentTamarin= new Intent(ActivityTroubleDigestionTransitList.this,ActivityTamarin.class);
    		   	startActivity(IntentTamarin);	
    		    break;      
   		    
        }
            
       
    		// TODO Auto-generated method stub
    		//super.onListItemClick(l, v, position, id);
    	}

  		
  		
  		
  		
  		
  		
  	
   });










  }


  }
