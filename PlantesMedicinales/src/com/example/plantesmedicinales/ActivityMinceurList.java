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

public class ActivityMinceurList extends  Activity {
	ListView listViewminceurlist=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_minceur_list);


		listViewminceurlist = (ListView) findViewById(R.id.listViewminceur);
		
		
		//Création de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemminceurList = new ArrayList<HashMap<String, String>>();
 
        //On déclare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapTestElementminceur;
 
       
        //Création d'une HashMap pour insérer les informations du premier item de notre listView
        mapTestElementminceur = new HashMap<String, String>();
        //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
        mapTestElementminceur.put("titre", "Konjac");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        mapTestElementminceur.put("description", "Konjac");
        //on insère la référence à l'image (convertit en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
      
        mapTestElementminceur.put("img", String.valueOf(R.drawable.konjac));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemminceurList.add(mapTestElementminceur); 
        
        
  
        mapTestElementminceur = new HashMap<String, String>();
        mapTestElementminceur.put("titre", "Noisetier");
        mapTestElementminceur.put("description", "Noisetier");
        mapTestElementminceur.put("img", String.valueOf(R.drawable.noisetier));
        listItemminceurList.add(mapTestElementminceur);	
		
		
        mapTestElementminceur = new HashMap<String, String>();
        mapTestElementminceur.put("titre", "Nopal(Figue de barbarie)");
        mapTestElementminceur.put("description", "Nopal(Figue de barbarie)");
        mapTestElementminceur.put("img", String.valueOf(R.drawable.nopalfiguedebarbarie));
        listItemminceurList.add(mapTestElementminceur);
        
        
        
        
        mapTestElementminceur = new HashMap<String, String>();
        mapTestElementminceur.put("titre", "Thé vert");
        mapTestElementminceur.put("description", " Thé vert");
        mapTestElementminceur.put("img", String.valueOf(R.drawable.thevert));
        listItemminceurList.add(mapTestElementminceur);
        
        
        
        
        
		


        
        
        
        
        
        
        
        
        
        //Création d'un SimpleAdapter qui se chargera de mettre les items présent dans notre list (listItem) dans la vue affichageitem
          SimpleAdapter mScheduleTestSerie = new SimpleAdapter (this.getBaseContext(), listItemminceurList, R.layout.affichageitem,
                 new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
   
          //On attribut à notre listView l'adapter que l'on vient de créer
          listViewminceurlist.setAdapter(mScheduleTestSerie);
  		
  		
  		
          listViewminceurlist.setOnItemClickListener(new OnItemClickListener() {
  			@Override
          	@SuppressWarnings("unchecked")
           	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
  				//on récupère la HashMap contenant les infos de notre item (titre, description, img)
          		HashMap<String, String> map = (HashMap<String, String>) listViewminceurlist.getItemAtPosition(position);

          switch (position) {
          case 0:
          	 // Show Alert 
            // Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG).show();
              
             
      		        
      		   	Intent IntentSignauxDanger = new Intent(ActivityMinceurList.this,ActivityKonjac.class);
      		  	startActivity(IntentSignauxDanger);	
      		   	
      		   
          break;
          case 1:  
          	 // Show Alert 
              //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
               // .show();
             Intent IntentPassageAniveau= new Intent(ActivityMinceurList.this,ActivityNoisetier.class);
  		   	startActivity(IntentPassageAniveau);	
              
             
              
              
                   break;	
  	
          case 2:  
         	 // Show Alert 
             //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
              // .show();
            Intent IntentsignauxIntersectionPriorite= new Intent(ActivityMinceurList.this,ActivityNopalFiguedeBarbarie.class);
  		   	startActivity(IntentsignauxIntersectionPriorite);	
  		    break;  
          case 3:  
            	 // Show Alert 
                //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                 // .show();
               Intent IntentSignalisationInterdiction= new Intent(ActivityMinceurList.this,ActivityTheVert.class);
     		   	startActivity(IntentSignalisationInterdiction);	
             
             
                  break;	
  		
         
  		   	
  		   	
        
    		   	
    		   	
    		   	
        
        }
            
       
    		// TODO Auto-generated method stub
    		//super.onListItemClick(l, v, position, id);
    	}

  		
  		
  		
  		
  		
  		
  	
   });










  }


  }
