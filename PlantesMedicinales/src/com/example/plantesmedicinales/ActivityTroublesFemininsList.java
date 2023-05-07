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

public class ActivityTroublesFemininsList extends  Activity {
	ListView listViewtroublesfemininslist=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_troubles_feminins_list);



		
		
		
listViewtroublesfemininslist = (ListView) findViewById(R.id.listViewtroublesfeminins);
		
		
		//Cr�ation de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemtroublesfemininsList = new ArrayList<HashMap<String, String>>();
 
        //On d�clare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapTestElementtroublesfeminins;
 
       
        //Cr�ation d'une HashMap pour ins�rer les informations du premier item de notre listView
        mapTestElementtroublesfeminins = new HashMap<String, String>();
        //on ins�re un �l�ment titre que l'on r�cup�rera dans le textView titre cr�� dans le fichier affichageitem.xml
        mapTestElementtroublesfeminins.put("titre", "Myrtille");
        //on ins�re un �l�ment description que l'on r�cup�rera dans le textView description cr�� dans le fichier affichageitem.xml
        mapTestElementtroublesfeminins.put("description", "Myrtille");
        //on ins�re la r�f�rence � l'image (convertit en String car normalement c'est un int) que l'on r�cup�rera dans l'imageView cr�� dans le fichier affichageitem.xml
      
        mapTestElementtroublesfeminins.put("img", String.valueOf(R.drawable.myrtille));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemtroublesfemininsList.add(mapTestElementtroublesfeminins); 
        
        
  
        mapTestElementtroublesfeminins = new HashMap<String, String>();
        mapTestElementtroublesfeminins.put("titre", "Persil");
        mapTestElementtroublesfeminins.put("description", "Persil");
        mapTestElementtroublesfeminins.put("img", String.valueOf(R.drawable.persil));
        listItemtroublesfemininsList.add(mapTestElementtroublesfeminins);	
		
		
        mapTestElementtroublesfeminins = new HashMap<String, String>();
        mapTestElementtroublesfeminins.put("titre", "Sauge)");
        mapTestElementtroublesfeminins.put("description", "Sauge)");
        mapTestElementtroublesfeminins.put("img", String.valueOf(R.drawable.sauge));
        listItemtroublesfemininsList.add(mapTestElementtroublesfeminins);
        
        
        
        
       
        
        
        
        
        
		


        
        
        
        
        
        
        
        
        
        //Cr�ation d'un SimpleAdapter qui se chargera de mettre les items pr�sent dans notre list (listItem) dans la vue affichageitem
          SimpleAdapter mScheduleTestSerie = new SimpleAdapter (this.getBaseContext(), listItemtroublesfemininsList, R.layout.affichageitem,
                 new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
   
          //On attribut � notre listView l'adapter que l'on vient de cr�er
          listViewtroublesfemininslist.setAdapter(mScheduleTestSerie);
  		
  		
  		
          listViewtroublesfemininslist.setOnItemClickListener(new OnItemClickListener() {
  			@Override
          	@SuppressWarnings("unchecked")
           	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
  				//on r�cup�re la HashMap contenant les infos de notre item (titre, description, img)
          		HashMap<String, String> map = (HashMap<String, String>) listViewtroublesfemininslist.getItemAtPosition(position);

          switch (position) {
          case 0:
          	 // Show Alert 
            // Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG).show();
              
             
      		        
      		   	Intent IntentSignauxDanger = new Intent(ActivityTroublesFemininsList.this,ActivityMyrtille.class);
      		  	startActivity(IntentSignauxDanger);	
      		   	
      		   
          break;
          case 1:  
          	 // Show Alert 
              //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
               // .show();
             Intent IntentPassageAniveau= new Intent(ActivityTroublesFemininsList.this,ActivityPersil.class);
  		   	startActivity(IntentPassageAniveau);	
              
             
              
              
                   break;	
  	
          case 2:  
         	 // Show Alert 
             //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
              // .show();
            Intent IntentsignauxIntersectionPriorite= new Intent(ActivityTroublesFemininsList.this,ActivitySauge.class);
  		   	startActivity(IntentsignauxIntersectionPriorite);	
  		    break;  
         
  		
         
  		   	
  		   	
        
    		   	
    		   	
    		   	
        
        }
            
       
    		// TODO Auto-generated method stub
    		//super.onListItemClick(l, v, position, id);
    	}

  		
  		
  		
  		
  		
  		
  	
   });










  }


  }
