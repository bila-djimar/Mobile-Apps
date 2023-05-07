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

public class ActivityPhytotherapieList extends  Activity {
	ListView listViewPlantelist=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_phytotherapie_list);


		listViewPlantelist = (ListView) findViewById(R.id.listViewPlante);

		
		//Cr�ation de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemPlanteList = new ArrayList<HashMap<String, String>>();
 
        //On d�clare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapTestElementPlante;
 
       
        //Cr�ation d'une HashMap pour ins�rer les informations du premier item de notre listView
        mapTestElementPlante = new HashMap<String, String>();
        //on ins�re un �l�ment titre que l'on r�cup�rera dans le textView titre cr�� dans le fichier affichageitem.xml
        mapTestElementPlante.put("titre", "Maux quotidiens");
        //on ins�re un �l�ment description que l'on r�cup�rera dans le textView description cr�� dans le fichier affichageitem.xml
        mapTestElementPlante.put("description", "Maux quotidiens");
        //on ins�re la r�f�rence � l'image (convertit en String car normalement c'est un int) que l'on r�cup�rera dans l'imageView cr�� dans le fichier affichageitem.xml
      
        mapTestElementPlante.put("img", String.valueOf(R.drawable.mauxquotidiens));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemPlanteList.add(mapTestElementPlante); 
        
        
  
        mapTestElementPlante = new HashMap<String, String>();
        mapTestElementPlante.put("titre", "Fatigue physique et mentale");
        mapTestElementPlante.put("description", "Fatigue physique et mentale");
        mapTestElementPlante.put("img", String.valueOf(R.drawable.fatigue_mentale));
        listItemPlanteList.add(mapTestElementPlante);	
		
		
        mapTestElementPlante = new HashMap<String, String>();
        mapTestElementPlante.put("titre", "Minceur");
        mapTestElementPlante.put("description", "Minceur");
        mapTestElementPlante.put("img", String.valueOf(R.drawable.minceur));
        listItemPlanteList.add(mapTestElementPlante);
        
        
        
        
        mapTestElementPlante = new HashMap<String, String>();
        mapTestElementPlante.put("titre", "Troubles f�minins");
        mapTestElementPlante.put("description", " Troubles f�minins");
        mapTestElementPlante.put("img", String.valueOf(R.drawable.trouble_feminin));
        listItemPlanteList.add(mapTestElementPlante);
        
        
        mapTestElementPlante = new HashMap<String, String>();
        mapTestElementPlante.put("titre", "Troubles urinaires");
        mapTestElementPlante.put("description", " Troubles urinaires");
        mapTestElementPlante.put("img", String.valueOf(R.drawable.troubleurainares));
        listItemPlanteList.add(mapTestElementPlante);
        
        
        
        
        mapTestElementPlante = new HashMap<String, String>();
        mapTestElementPlante.put("titre", "Troubles de la digestion et du transit");
        mapTestElementPlante.put("description", " Troubles de la digestion et du transit");
        mapTestElementPlante.put("img", String.valueOf(R.drawable.troubledigstion));
        listItemPlanteList.add(mapTestElementPlante);
        
        
        mapTestElementPlante = new HashMap<String, String>();
        mapTestElementPlante.put("titre", "Maux de l'esprit");
        mapTestElementPlante.put("description", " Maux de l'esprit");
        mapTestElementPlante.put("img", String.valueOf(R.drawable.mauxdelesprit));
        listItemPlanteList.add(mapTestElementPlante);
        
        
        mapTestElementPlante = new HashMap<String, String>();
        mapTestElementPlante.put("titre", "Phytoth�rapie, rhumatismes et probl�mes osseux");
        mapTestElementPlante.put("description", " Phytoth�rapie, rhumatismes et probl�mes osseux");
        mapTestElementPlante.put("img", String.valueOf(R.drawable.choix_8));
        listItemPlanteList.add(mapTestElementPlante);
        
        
        
        
      //Cr�ation d'un SimpleAdapter qui se chargera de mettre les items pr�sent dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mScheduleTestSerie = new SimpleAdapter (this.getBaseContext(), listItemPlanteList, R.layout.affichageitem,
               new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
 
        //On attribut � notre listView l'adapter que l'on vient de cr�er
        listViewPlantelist.setAdapter(mScheduleTestSerie);
		
		
		
        listViewPlantelist.setOnItemClickListener(new OnItemClickListener() {
			@Override
        	@SuppressWarnings("unchecked")
         	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				//on r�cup�re la HashMap contenant les infos de notre item (titre, description, img)
        		HashMap<String, String> map = (HashMap<String, String>) listViewPlantelist.getItemAtPosition(position);

        switch (position) {
        case 0:
        	 // Show Alert 
          // Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG).show();
            
           
    		        
    		   	Intent IntentSignauxDanger = new Intent(ActivityPhytotherapieList.this,ActivityMauxQuotidienList.class);
    		  	startActivity(IntentSignauxDanger);	
    		   	
    		   
        break;
        case 1:  
        	 // Show Alert 
            //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
             // .show();
           Intent IntentPassageAniveau= new Intent(ActivityPhytotherapieList.this,ActivityFatiguePhysiqueMentaleList.class);
		   	startActivity(IntentPassageAniveau);	
            
           
            
            
                 break;	
	
        case 2:  
       	 // Show Alert 
           //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
            // .show();
          Intent IntentsignauxIntersectionPriorite= new Intent(ActivityPhytotherapieList.this,ActivityMinceurList.class);
		   	startActivity(IntentsignauxIntersectionPriorite);	
		    break;  
        case 3:  
          	 // Show Alert 
              //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
               // .show();
             Intent IntentSignalisationInterdiction= new Intent(ActivityPhytotherapieList.this,ActivityTroublesFemininsList.class);
   		   	startActivity(IntentSignalisationInterdiction);	
           
           
                break;	
		
        case 4:  
        	 // Show Alert 
            //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
             // .show();
           Intent IntentArretStationnement= new Intent(ActivityPhytotherapieList.this,ActivityTroublesUrinaireList.class);
 		   	startActivity(IntentArretStationnement);	
         
         
              break;
              
       case 5:  
       	 // Show Alert 
           //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
            // .show();
          Intent Intentobligation= new Intent(ActivityPhytotherapieList.this,ActivityTroubleDigestionTransitList.class);
		   	startActivity(Intentobligation);	
        
        
             break;	 
               
       case 6:  
      	 // Show Alert 
          //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
           // .show();
         Intent IntentSignauxIndication= new Intent(ActivityPhytotherapieList.this,ActivityMauxEspritList.class);
		   	startActivity(IntentSignauxIndication);	
		    break;	
		   	
		   	
       case 7:  
         	 // Show Alert 
             //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
              // .show();
            Intent Intentsignauxdirection= new Intent(ActivityPhytotherapieList.this,ActivityProblemeOsseuxList.class);
  		   	startActivity(Intentsignauxdirection);	
       
  		 break;		
  		   	
  		   	
  		   	
      
      }
          
     
  		// TODO Auto-generated method stub
  		//super.onListItemClick(l, v, position, id);
  	}

		
		
		
		
		
		
	
 });










}


}
