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

public class ActivityProblemeOsseuxList extends  Activity {
	ListView listViewProblemeOsseuxlist=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_probleme_osseux_list);



		
		
		
listViewProblemeOsseuxlist = (ListView) findViewById(R.id.ListViewProblemeOsseux);
		
		
		//Création de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemProblemeOsseuxList = new ArrayList<HashMap<String, String>>();
 
        //On déclare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapTestElementProblemeOsseux;
 
       
        //Création d'une HashMap pour insérer les informations du premier item de notre listView
        mapTestElementProblemeOsseux = new HashMap<String, String>();
        //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
        mapTestElementProblemeOsseux.put("titre", "Arnica");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        mapTestElementProblemeOsseux.put("description", "Arnica");
        //on insère la référence à l'image (convertit en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
      
        mapTestElementProblemeOsseux.put("img", String.valueOf(R.drawable.arnica));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemProblemeOsseuxList.add(mapTestElementProblemeOsseux); 
        
        

  
        mapTestElementProblemeOsseux = new HashMap<String, String>();
        mapTestElementProblemeOsseux.put("titre", "Consoude");
        mapTestElementProblemeOsseux.put("description", "Consoude");
        mapTestElementProblemeOsseux.put("img", String.valueOf(R.drawable.consoude));
        listItemProblemeOsseuxList.add(mapTestElementProblemeOsseux);	
		
		
        mapTestElementProblemeOsseux = new HashMap<String, String>();
        mapTestElementProblemeOsseux.put("titre", "Verveine");
        mapTestElementProblemeOsseux.put("description", "Verveine");
        mapTestElementProblemeOsseux.put("img", String.valueOf(R.drawable.verveine));
        listItemProblemeOsseuxList.add(mapTestElementProblemeOsseux);
        
        
        
        
       
       
        
        
        //Création d'un SimpleAdapter qui se chargera de mettre les items présent dans notre list (listItem) dans la vue affichageitem
          SimpleAdapter mScheduleTestSerie = new SimpleAdapter (this.getBaseContext(), listItemProblemeOsseuxList, R.layout.affichageitem,
                 new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
   
          //On attribut à notre listView l'adapter que l'on vient de créer
          listViewProblemeOsseuxlist.setAdapter(mScheduleTestSerie);
  		
  		
  		
          listViewProblemeOsseuxlist.setOnItemClickListener(new OnItemClickListener() {
  			@Override
          	@SuppressWarnings("unchecked")
           	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
  				//on récupère la HashMap contenant les infos de notre item (titre, description, img)
          		HashMap<String, String> map = (HashMap<String, String>) listViewProblemeOsseuxlist.getItemAtPosition(position);

          switch (position) {
          case 0:
          	 // Show Alert 
            // Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG).show();
              
             
      		        
      		   	Intent IntentActivityArnica = new Intent(ActivityProblemeOsseuxList.this,ActivityArnica.class);
      		  	startActivity(IntentActivityArnica);	
      		   	
      		   
          break;
          case 1:  
          	 // Show Alert 
              //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
               // .show();
             Intent IntentActivityConsoude= new Intent(ActivityProblemeOsseuxList.this,ActivityConsoude.class);
  		   	startActivity(IntentActivityConsoude);	
              
             
              
              
                   break;	
  	
          case 2:  
         	 // Show Alert 
             //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
              // .show();
            Intent IntentActivityVerveine= new Intent(ActivityProblemeOsseuxList.this,ActivityVerveine.class);
  		   	startActivity(IntentActivityVerveine);	
  		    break;  
         
  		
           
              
   		    
        }
            
       
    		
    	}

  		
  		
  		
  		
  		
  		
  	
   });










  }


  }
