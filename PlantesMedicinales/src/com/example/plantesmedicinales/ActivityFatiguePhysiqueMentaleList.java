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

public class ActivityFatiguePhysiqueMentaleList extends  Activity {
	ListView listViewFatiguePhysiqueMentalelist=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fatigue_physique_mentale_list);



		
		
		
		
		
		
		
listViewFatiguePhysiqueMentalelist = (ListView) findViewById(R.id.listViewFatiguePhysiqueMentale);

		
		//Création de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemFatiguePhysiqueMentaleList = new ArrayList<HashMap<String, String>>();
 
        //On déclare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapTestElementFatiguePhysiqueMentale;
 
       
        //Création d'une HashMap pour insérer les informations du premier item de notre listView
        mapTestElementFatiguePhysiqueMentale = new HashMap<String, String>();
       
        mapTestElementFatiguePhysiqueMentale = new HashMap<String, String>();
        mapTestElementFatiguePhysiqueMentale.put("titre", "Gingembre");
        mapTestElementFatiguePhysiqueMentale.put("description", "Gingembre");
        mapTestElementFatiguePhysiqueMentale.put("img", String.valueOf(R.drawable.gingembre));
        listItemFatiguePhysiqueMentaleList.add(mapTestElementFatiguePhysiqueMentale);	
		
		
        mapTestElementFatiguePhysiqueMentale = new HashMap<String, String>();
        mapTestElementFatiguePhysiqueMentale.put("titre", "Ginseng");
        mapTestElementFatiguePhysiqueMentale.put("description", "Ginseng");
        mapTestElementFatiguePhysiqueMentale.put("img", String.valueOf(R.drawable.ginseng));
        listItemFatiguePhysiqueMentaleList.add(mapTestElementFatiguePhysiqueMentale);
        
        
        
        
        mapTestElementFatiguePhysiqueMentale = new HashMap<String, String>();
        mapTestElementFatiguePhysiqueMentale.put("titre", "Guarana");
        mapTestElementFatiguePhysiqueMentale.put("description", " Guarana");
        mapTestElementFatiguePhysiqueMentale.put("img", String.valueOf(R.drawable.guarana));
        listItemFatiguePhysiqueMentaleList.add(mapTestElementFatiguePhysiqueMentale);
        
        
        mapTestElementFatiguePhysiqueMentale = new HashMap<String, String>();
        mapTestElementFatiguePhysiqueMentale.put("titre", "Maca");
        mapTestElementFatiguePhysiqueMentale.put("description", " Maca");
        mapTestElementFatiguePhysiqueMentale.put("img", String.valueOf(R.drawable.maca));
        listItemFatiguePhysiqueMentaleList.add(mapTestElementFatiguePhysiqueMentale);
        
        
        
        
        mapTestElementFatiguePhysiqueMentale = new HashMap<String, String>();
        mapTestElementFatiguePhysiqueMentale.put("titre", "Origan");
        mapTestElementFatiguePhysiqueMentale.put("description", " Origan");
        mapTestElementFatiguePhysiqueMentale.put("img", String.valueOf(R.drawable.origan));
        listItemFatiguePhysiqueMentaleList.add(mapTestElementFatiguePhysiqueMentale);
        
        
        mapTestElementFatiguePhysiqueMentale = new HashMap<String, String>();
        mapTestElementFatiguePhysiqueMentale.put("titre", "Propolis");
        mapTestElementFatiguePhysiqueMentale.put("description", " Propolis");
        mapTestElementFatiguePhysiqueMentale.put("img", String.valueOf(R.drawable.propolis));
        listItemFatiguePhysiqueMentaleList.add(mapTestElementFatiguePhysiqueMentale);
        
        
        mapTestElementFatiguePhysiqueMentale = new HashMap<String, String>();
        mapTestElementFatiguePhysiqueMentale.put("titre", "Spiruline");
        mapTestElementFatiguePhysiqueMentale.put("description", " Spiruline");
        mapTestElementFatiguePhysiqueMentale.put("img", String.valueOf(R.drawable.spiruline));
        listItemFatiguePhysiqueMentaleList.add(mapTestElementFatiguePhysiqueMentale);
        
        
       
        
      //Création d'un SimpleAdapter qui se chargera de mettre les items présent dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mScheduleTestSerie = new SimpleAdapter (this.getBaseContext(), listItemFatiguePhysiqueMentaleList, R.layout.affichageitem,
               new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
 
        //On attribut à notre listView l'adapter que l'on vient de créer
        listViewFatiguePhysiqueMentalelist.setAdapter(mScheduleTestSerie);
		
		
		
		
        listViewFatiguePhysiqueMentalelist.setOnItemClickListener(new OnItemClickListener() {
			@Override
        	@SuppressWarnings("unchecked")
         	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				//on récupère la HashMap contenant les infos de notre item (titre, description, img)
        		HashMap<String, String> map = (HashMap<String, String>) listViewFatiguePhysiqueMentalelist.getItemAtPosition(position);

        switch (position) {
        case 0:
        	 // Show Alert 
          // Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG).show();
            
           
    		        
    		   	Intent IntentSignauxDanger = new Intent(ActivityFatiguePhysiqueMentaleList.this,ActivityZingiber.class);
    		  	startActivity(IntentSignauxDanger);	
    		   	
    		   
        break;
        case 1:  
        	 // Show Alert 
            //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
             // .show();
           Intent IntentPassageAniveau= new Intent(ActivityFatiguePhysiqueMentaleList.this,ActivityGinseng.class);
		   	startActivity(IntentPassageAniveau);	
            
           
            
            
                 break;	
	
        case 2:  
       	 // Show Alert 
           //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
            // .show();
          Intent IntentsignauxIntersectionPriorite= new Intent(ActivityFatiguePhysiqueMentaleList.this,ActivityGuarana.class);
		   	startActivity(IntentsignauxIntersectionPriorite);	
		    break;  
        case 3:  
          	 // Show Alert 
              //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
               // .show();
             Intent IntentSignalisationInterdiction= new Intent(ActivityFatiguePhysiqueMentaleList.this,ActivityMaca.class);
   		   	startActivity(IntentSignalisationInterdiction);	
           
           
                break;	
		
        case 4:  
        	 // Show Alert 
            //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
             // .show();
           Intent IntentArretStationnement= new Intent(ActivityFatiguePhysiqueMentaleList.this,ActivityOrigan.class);
 		   	startActivity(IntentArretStationnement);	
         
         
              break;
              
       case 5:  
       	 // Show Alert 
           //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
            // .show();
          Intent Intentobligation= new Intent(ActivityFatiguePhysiqueMentaleList.this,ActivityPropolis.class);
		   	startActivity(Intentobligation);	
        
        
             break;	 
               
       case 6:  
      	 // Show Alert 
          //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
           // .show();
         Intent IntentSignauxIndication= new Intent(ActivityFatiguePhysiqueMentaleList.this,ActivitySpiruline.class);
		   	startActivity(IntentSignauxIndication);	
		    break;	
		   	
		   	
      
  		   	
  		   	
      
      }
          
     
  		// TODO Auto-generated method stub
  		//super.onListItemClick(l, v, position, id);
  	}

		
		
		
		
		
		
	
 });










}


}
