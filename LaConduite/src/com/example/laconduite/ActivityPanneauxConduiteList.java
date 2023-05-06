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

public class ActivityPanneauxConduiteList extends Activity {
	ListView listViewPanneaux=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_panneaux_conduite_list);

		
		listViewPanneaux = (ListView) findViewById(R.id.listViewPanneauxConduite);


		//Création de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemPanneaux = new ArrayList<HashMap<String, String>>();
 
        //On déclare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapPanneaux;
 
        //Création d'une HashMap pour insérer les informations du premier item de notre listView
        mapPanneaux = new HashMap<String, String>();
        //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
        mapPanneaux.put("titre", "Signaux de Danger");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        mapPanneaux.put("description", " Panneaux des signaux de danger");
        //on insère la référence à l'image (convertit en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
        mapPanneaux.put("img", String.valueOf(R.drawable.signaux_danger));
        //enfin on ajoute cette hashMap dans la arrayList
        listItemPanneaux.add(mapPanneaux);
 
        //On refait la manip plusieurs fois avec des données différentes pour former les items de notre ListView
 
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Passage à niveau");
        mapPanneaux.put("description", " Panneaux de passage à niveau");
        mapPanneaux.put("img", String.valueOf(R.drawable.passage_niveau));
        listItemPanneaux.add(mapPanneaux);
 
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Signaux d'intersection et de priorité");
        mapPanneaux.put("description", "Panneaux des Signaux d'intersection et de priorité");
        mapPanneaux.put("img", String.valueOf(R.drawable.signaux_intersection_priorite));
        listItemPanneaux.add(mapPanneaux);
 
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Signalisation d'interdiction, de fin d'interdiction, et de zone");
        mapPanneaux.put("description", "Panneaux de signalisation d'interdiction, de fin d'interdiction, et de zone");
        mapPanneaux.put("img", String.valueOf(R.drawable.signalisation_interdiction));
        listItemPanneaux.add(mapPanneaux);
 
 
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Arrêt stationnement");
        mapPanneaux.put("description", "Panneaux des arrêts stationnement");
        mapPanneaux.put("img", String.valueOf(R.drawable.arret_stationnement));
        listItemPanneaux.add(mapPanneaux);
		
		
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Signaux d'obligation et de fin d'obligation");
        mapPanneaux.put("description", "Panneaux des signaux d'obligation et de fin d'obligation");
        mapPanneaux.put("img", String.valueOf(R.drawable.obligation));
        listItemPanneaux.add(mapPanneaux);
		
        
        
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Signaux d'indication");
        mapPanneaux.put("description", "Panneaux des signaux d'indication");
        mapPanneaux.put("img", String.valueOf(R.drawable.signaux_indication));
        listItemPanneaux.add(mapPanneaux);
        
        
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Signaux de direction");
        mapPanneaux.put("description", "Panneaux des signaux de direction");
        mapPanneaux.put("img", String.valueOf(R.drawable.signaux_direction));
        listItemPanneaux.add(mapPanneaux);
        
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Bifurcations autorotières");
        mapPanneaux.put("description", "Panneaux des bifurcations autorotières");
        mapPanneaux.put("img", String.valueOf(R.drawable.bifurcation));
        listItemPanneaux.add(mapPanneaux);
        
        
        
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Panneaux de localisation et d'information, bornes et plaquettes de repérage");
        mapPanneaux.put("description", "Panneaux de localisation et d'information, bornes et plaquettes de repérage");
        mapPanneaux.put("img", String.valueOf(R.drawable.localisation));
        listItemPanneaux.add(mapPanneaux);
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Idéogrammes et symboles");
        mapPanneaux.put("description", "Panneaux des idéogrammes et symboles");
        mapPanneaux.put("img", String.valueOf(R.drawable.ideogrammes));
        listItemPanneaux.add(mapPanneaux);
        
        
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Balises");
        mapPanneaux.put("description", "Panneaux des balises");
        mapPanneaux.put("img", String.valueOf(R.drawable.balise));
        listItemPanneaux.add(mapPanneaux);
          
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Panonceaux");
        mapPanneaux.put("description", "Panneaux des panonceaux");
        mapPanneaux.put("img", String.valueOf(R.drawable.panonceau));
        listItemPanneaux.add(mapPanneaux);
        
        
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Signaux lumineaux");
        mapPanneaux.put("description", "Panneaux des signaux lumineaux");
        mapPanneaux.put("img", String.valueOf(R.drawable.signaux_lumineux));
        listItemPanneaux.add(mapPanneaux);
           
        
        mapPanneaux = new HashMap<String, String>();
        mapPanneaux.put("titre", "Signalisation temporaire");
        mapPanneaux.put("description", "Panneaux des signalisation temporaire");
        mapPanneaux.put("img", String.valueOf(R.drawable.signalisation_temporaire));
        listItemPanneaux.add(mapPanneaux);
        
      //Création d'un SimpleAdapter qui se chargera de mettre les items présent dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mSchedule = new SimpleAdapter (this.getBaseContext(), listItemPanneaux, R.layout.affichageitem,
               new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
 
        //On attribut à notre listView l'adapter que l'on vient de créer
        listViewPanneaux.setAdapter(mSchedule);
		
		
		
		
        listViewPanneaux.setOnItemClickListener(new OnItemClickListener() {
			@Override
        	@SuppressWarnings("unchecked")
         	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				//on récupère la HashMap contenant les infos de notre item (titre, description, img)
        		HashMap<String, String> map = (HashMap<String, String>) listViewPanneaux.getItemAtPosition(position);


        		switch (position) {
                case 0:
                	 
            		        
            		   	Intent IntentSignauxDanger = new Intent(ActivityPanneauxConduiteList.this,ActivitySignauxDanger.class);
            		  	startActivity(IntentSignauxDanger);	
            		   	
            		   
                break;
                case 1:  
                	 
                   Intent IntentPassageAniveau= new Intent(ActivityPanneauxConduiteList.this,ActivityPassageNiveau.class);
        		   	startActivity(IntentPassageAniveau);	
                    
                   
                    
                    
                         break;	
        	
                case 2:  
               	 
                  Intent IntentsignauxIntersectionPriorite= new Intent(ActivityPanneauxConduiteList.this,ActivitySignauxIntersectionPriority.class);
        		   	startActivity(IntentsignauxIntersectionPriorite);	
        		    break;  
                case 3:  
                  	
                     Intent IntentSignalisationInterdiction= new Intent(ActivityPanneauxConduiteList.this,ActivitySignalisationInterdictionZone.class);
           		   	startActivity(IntentSignalisationInterdiction);	
                   
                   
                        break;	
        		
                case 4:  
                	
                   Intent IntentArretStationnement= new Intent(ActivityPanneauxConduiteList.this,ActivityArretStationnement.class);
         		   	startActivity(IntentArretStationnement);	
                 
                 
                      break;
                      
               case 5:  
               	 
                  Intent Intentobligation= new Intent(ActivityPanneauxConduiteList.this,ActivitySignauxObligation.class);
        		   	startActivity(Intentobligation);	
                
                
                     break;	 
                       
               case 6:  
              	
                 Intent IntentSignauxIndication= new Intent(ActivityPanneauxConduiteList.this,ActivitySignauxIndication.class);
       		   	startActivity(IntentSignauxIndication);	
       		    break;	
       		   	
       		   	
               case 7:  
                 	 
                    Intent Intentsignauxdirection= new Intent(ActivityPanneauxConduiteList.this,ActivitySignauxDirection.class);
          		   	startActivity(Intentsignauxdirection);	
               
          		 break;		
          		   	
          		   	
          		   	
               case 8:  
                	 
                   Intent IntentBifurcation= new Intent(ActivityPanneauxConduiteList.this,ActivityBifurcationAutorotier.class);
         		   	startActivity(IntentBifurcation);	
         		   	
         		   	
         		   	
         		   	
         		   	
         		   	
                    break;	
                    
                    
               case 9:  
                	
                   Intent IntentLoacalisation= new Intent(ActivityPanneauxConduiteList.this,ActivityPanneauLocalisation.class);
         		   	startActivity(IntentLoacalisation);	
              
         		 break;	
                    
                    
               case 10:  
               	
                  Intent IntentIdeogramme= new Intent(ActivityPanneauxConduiteList.this,ActivityIdeogramme.class);
        		   	startActivity(IntentIdeogramme);	
             
        		 break;	   
               case 11:  
              	
                 Intent IntentBalises= new Intent(ActivityPanneauxConduiteList.this,ActivityBalises.class);
       		   	startActivity(IntentBalises);	
            
       		 break;	   
         		 
       		 
       		 
               case 12:  
                 	
                    Intent IntentPanonceaux= new Intent(ActivityPanneauxConduiteList.this,ActivityPannonceaux.class);
          		   	startActivity(IntentPanonceaux);	
               
          		 break;	   
            		  
       		 
               case 13:  
                	
                   Intent IntentSignauxLumineux= new Intent(ActivityPanneauxConduiteList.this,ActivitySignauxLumineux.class);
         		   	startActivity(IntentSignauxLumineux);	
              
         		 break;	   
       		 
               case 14:  
               	 
                  Intent IntentSignalisationTemporaire= new Intent(ActivityPanneauxConduiteList.this,ActivitySignalisationTemporaire.class);
        		   	startActivity(IntentSignalisationTemporaire);	
             
        		 break;	   
                
              }
                  
             
          		
          	}

        		
        		
        		
        		
        		
        		
        	
         });
	
	
	
	
       
	

	
	
	
}
	

}
