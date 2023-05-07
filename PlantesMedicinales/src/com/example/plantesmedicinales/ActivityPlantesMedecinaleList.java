package com.example.plantesmedicinales;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.AdapterView.OnItemClickListener;

public class ActivityPlantesMedecinaleList extends  Activity {
	ListView listViewplantesmedicinalesList=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_plantes_medecinale_list);



		
		
listViewplantesmedicinalesList = (ListView) findViewById(R.id.webViewplantesmedicinales);

		
		
		//Création de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemBeautePeauListList = new ArrayList<HashMap<String, String>>();
 
        //On déclare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapTestElementMauxQuotidien;
 
       
        //Création d'une HashMap pour insérer les informations du premier item de notre listView
        mapTestElementMauxQuotidien = new HashMap<String, String>();
        //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
        mapTestElementMauxQuotidien.put("titre", "Aloe vera (Aloès)");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        mapTestElementMauxQuotidien.put("description", "Aloe vera (Aloès)");
        //on insère la référence à l'image (convertit en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
      
        mapTestElementMauxQuotidien.put("img", String.valueOf(R.drawable.aloevera));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemBeautePeauListList.add(mapTestElementMauxQuotidien); 
        
        
  
        mapTestElementMauxQuotidien = new HashMap<String, String>();
        mapTestElementMauxQuotidien.put("titre", "Avoine");
        mapTestElementMauxQuotidien.put("description", "Avoine");
        mapTestElementMauxQuotidien.put("img", String.valueOf(R.drawable.avoine));
        listItemBeautePeauListList.add(mapTestElementMauxQuotidien);	
		
		
        mapTestElementMauxQuotidien = new HashMap<String, String>();
        mapTestElementMauxQuotidien.put("titre", "Bardane");
        mapTestElementMauxQuotidien.put("description", "Bardane");
        mapTestElementMauxQuotidien.put("img", String.valueOf(R.drawable.bardane));
        listItemBeautePeauListList.add(mapTestElementMauxQuotidien);
        
        
        
        
        mapTestElementMauxQuotidien = new HashMap<String, String>();
        mapTestElementMauxQuotidien.put("titre", "Bourrache");
        mapTestElementMauxQuotidien.put("description", " Bourrache");
        mapTestElementMauxQuotidien.put("img", String.valueOf(R.drawable.bourrache));
        listItemBeautePeauListList.add(mapTestElementMauxQuotidien);
        
        
        mapTestElementMauxQuotidien = new HashMap<String, String>();
        mapTestElementMauxQuotidien.put("titre", "Noyer");
        mapTestElementMauxQuotidien.put("description", " Noyer");
        mapTestElementMauxQuotidien.put("img", String.valueOf(R.drawable.noyer));
        listItemBeautePeauListList.add(mapTestElementMauxQuotidien);
        
        
        
        
       
        
        
        
      //Création d'un SimpleAdapter qui se chargera de mettre les items présent dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mScheduleTestSerie = new SimpleAdapter (this.getBaseContext(), listItemBeautePeauListList, R.layout.affichageitem,
               new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
 
        //On attribut à notre listView l'adapter que l'on vient de créer
        listViewplantesmedicinalesList.setAdapter(mScheduleTestSerie);
		
		
		
        listViewplantesmedicinalesList.setOnItemClickListener(new OnItemClickListener() {
			@Override
        	@SuppressWarnings("unchecked")
         	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				//on récupère la HashMap contenant les infos de notre item (titre, description, img)
        		HashMap<String, String> map = (HashMap<String, String>) listViewplantesmedicinalesList.getItemAtPosition(position);

        switch (position) {
        case 0:
        	 // Show Alert 
          // Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG).show();
            
           
    		        
    		   	Intent IntentActivityAloaloeveraera = new Intent(ActivityPlantesMedecinaleList.this,ActivityAloaloeveraera.class);
    		  	startActivity(IntentActivityAloaloeveraera);	
    		   	
    		   
        break;
        case 1:  
        	 // Show Alert 
            //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
             // .show();
           Intent IntentActivityAvoine= new Intent(ActivityPlantesMedecinaleList.this,ActivityAvoine.class);
		   	startActivity(IntentActivityAvoine);	
            
           
            
            
                 break;	
	
        case 2:  
       	 // Show Alert 
           //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
            // .show();
          Intent IntentActivityBardane= new Intent(ActivityPlantesMedecinaleList.this,ActivityBardane.class);
		   	startActivity(IntentActivityBardane);	
		    break;  
        case 3:  
          	 // Show Alert 
              //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
               // .show();
             Intent IntentActivityBourrache= new Intent(ActivityPlantesMedecinaleList.this,ActivityBourrache.class);
   		   	startActivity(IntentActivityBourrache);	
           
           
                break;	
		
        case 4:  
        	 // Show Alert 
            //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
             // .show();
           Intent IntentArretStationnement= new Intent(ActivityPlantesMedecinaleList.this,ActivityNoyer.class);
 		   	startActivity(IntentArretStationnement);	
         
         
              break;
              
     
		   	
      
  		   	
  		   	
  		   	
      
      }
          
     
  		// TODO Auto-generated method stub
  		//super.onListItemClick(l, v, position, id);
  	}

		
		
		
		
		
		
	
 });










}


}
