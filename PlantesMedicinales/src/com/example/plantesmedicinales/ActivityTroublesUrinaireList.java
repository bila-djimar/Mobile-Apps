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

public class ActivityTroublesUrinaireList extends  Activity {
	ListView listViewtroublesUrinaireslist=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_troubles_urinaire_list);



		
		
listViewtroublesUrinaireslist = (ListView) findViewById(R.id.ListViewTroubleUrinaires);
		
		
		//Création de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemtroublesUrinairesList = new ArrayList<HashMap<String, String>>();
 
        //On déclare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapTestElementtroublesUrinaires;
 
       
        //Création d'une HashMap pour insérer les informations du premier item de notre listView
        mapTestElementtroublesUrinaires = new HashMap<String, String>();
        //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
        mapTestElementtroublesUrinaires.put("titre", "Busserole");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        mapTestElementtroublesUrinaires.put("description", "Busserole");
        //on insère la référence à l'image (convertit en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
      
        mapTestElementtroublesUrinaires.put("img", String.valueOf(R.drawable.busserole));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemtroublesUrinairesList.add(mapTestElementtroublesUrinaires); 
        
        

  
        mapTestElementtroublesUrinaires = new HashMap<String, String>();
        mapTestElementtroublesUrinaires.put("titre", "Canneberge");
        mapTestElementtroublesUrinaires.put("description", "Canneberge");
        mapTestElementtroublesUrinaires.put("img", String.valueOf(R.drawable.canneberge));
        listItemtroublesUrinairesList.add(mapTestElementtroublesUrinaires);	
		
		
        mapTestElementtroublesUrinaires = new HashMap<String, String>();
        mapTestElementtroublesUrinaires.put("titre", "Orthosiphon)");
        mapTestElementtroublesUrinaires.put("description", "Orthosiphon)");
        mapTestElementtroublesUrinaires.put("img", String.valueOf(R.drawable.orthosiphon));
        listItemtroublesUrinairesList.add(mapTestElementtroublesUrinaires);
        
        
        
        
       
        mapTestElementtroublesUrinaires = new HashMap<String, String>();
        mapTestElementtroublesUrinaires.put("titre", "Piloselle)");
        mapTestElementtroublesUrinaires.put("description", "Piloselle)");
        mapTestElementtroublesUrinaires.put("img", String.valueOf(R.drawable.piloselle));
        listItemtroublesUrinairesList.add(mapTestElementtroublesUrinaires);
        
        mapTestElementtroublesUrinaires = new HashMap<String, String>();
        mapTestElementtroublesUrinaires.put("titre", "Pissenlit)");
        mapTestElementtroublesUrinaires.put("description", "Pissenlit)");
        mapTestElementtroublesUrinaires.put("img", String.valueOf(R.drawable.pissenlit));
        listItemtroublesUrinairesList.add(mapTestElementtroublesUrinaires);
        
        
		

        mapTestElementtroublesUrinaires = new HashMap<String, String>();
        mapTestElementtroublesUrinaires.put("titre", "Prêle)");
        mapTestElementtroublesUrinaires.put("description", "Prêle)");
        mapTestElementtroublesUrinaires.put("img", String.valueOf(R.drawable.perle));
        listItemtroublesUrinairesList.add(mapTestElementtroublesUrinaires);
        
        
        mapTestElementtroublesUrinaires = new HashMap<String, String>();
        mapTestElementtroublesUrinaires.put("titre", "Sureau");
        mapTestElementtroublesUrinaires.put("description", "Sureau");
        mapTestElementtroublesUrinaires.put("img", String.valueOf(R.drawable.sureau));
        listItemtroublesUrinairesList.add(mapTestElementtroublesUrinaires);
        
        
        mapTestElementtroublesUrinaires = new HashMap<String, String>();
        mapTestElementtroublesUrinaires.put("titre", "Verge d'or");
        mapTestElementtroublesUrinaires.put("description", "Verge d'or");
        mapTestElementtroublesUrinaires.put("img", String.valueOf(R.drawable.verge));
        listItemtroublesUrinairesList.add(mapTestElementtroublesUrinaires);
        
        
        
        
        //Création d'un SimpleAdapter qui se chargera de mettre les items présent dans notre list (listItem) dans la vue affichageitem
          SimpleAdapter mScheduleTestSerie = new SimpleAdapter (this.getBaseContext(), listItemtroublesUrinairesList, R.layout.affichageitem,
                 new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
   
          //On attribut à notre listView l'adapter que l'on vient de créer
          listViewtroublesUrinaireslist.setAdapter(mScheduleTestSerie);
  		
  		
  		
          listViewtroublesUrinaireslist.setOnItemClickListener(new OnItemClickListener() {
  			@Override
          	@SuppressWarnings("unchecked")
           	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
  				//on récupère la HashMap contenant les infos de notre item (titre, description, img)
          		HashMap<String, String> map = (HashMap<String, String>) listViewtroublesUrinaireslist.getItemAtPosition(position);

          switch (position) {
          case 0:
          	 // Show Alert 
            // Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG).show();
              
             
      		        
      		   	Intent IntentSignauxDanger = new Intent(ActivityTroublesUrinaireList.this,ActivityBusserole.class);
      		  	startActivity(IntentSignauxDanger);	
      		   	
      		   
          break;
          case 1:  
          	 // Show Alert 
              //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
               // .show();
             Intent IntentPassageAniveau= new Intent(ActivityTroublesUrinaireList.this,ActivityCanneberge.class);
  		   	startActivity(IntentPassageAniveau);	
              
             
              
              
                   break;	
  	
          case 2:  
         	 // Show Alert 
             //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
              // .show();
            Intent IntentsignauxIntersectionPriorite= new Intent(ActivityTroublesUrinaireList.this,ActivityOrthosiphon.class);
  		   	startActivity(IntentsignauxIntersectionPriorite);	
  		    break;  
         
  		
          case 3:  
          	 // Show Alert 
              //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
               // .show();
             Intent IntentsignauxActivityPiloselle= new Intent(ActivityTroublesUrinaireList.this,ActivityPiloselle.class);
   		   	startActivity(IntentsignauxActivityPiloselle);	
   		    break;  
  		   	
  		   	
          case 4:  
           	 // Show Alert 
               //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                // .show();
              Intent IntentsignauxActivityPissenlit= new Intent(ActivityTroublesUrinaireList.this,ActivityPissenlit.class);
    		   	startActivity(IntentsignauxActivityPissenlit);	
    		    break;  
    		   	
    		   	
          case 5:  
            	 // Show Alert 
                //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                 // .show();
               Intent IntentsignauxActivityActivityPrele= new Intent(ActivityTroublesUrinaireList.this,ActivityPrele.class);
     		   	startActivity(IntentsignauxActivityActivityPrele);	
     		    break; 
     		    
     		    
     		    
          case 6:  
         	 // Show Alert 
             //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
              // .show();
            Intent IntentsignauxActivityActivitySureau= new Intent(ActivityTroublesUrinaireList.this,ActivitySureau.class);
  		   	startActivity(IntentsignauxActivityActivitySureau);	
  		    break;    	    
     		    
        
  		    
          case 7:  
          	 // Show Alert 
              //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
               // .show();
             Intent IntentsignauxActivityActivityverge= new Intent(ActivityTroublesUrinaireList.this,ActivityVergeOr.class);
   		   	startActivity(IntentsignauxActivityActivityverge);	
   		    break;   
  		    
  		    
        }
            
       
    		// TODO Auto-generated method stub
    		//super.onListItemClick(l, v, position, id);
    	}

  		
  		
  		
  		
  		
  		
  	
   });










  }


  }
