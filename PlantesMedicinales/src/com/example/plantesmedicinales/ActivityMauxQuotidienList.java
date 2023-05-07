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

public class ActivityMauxQuotidienList extends  Activity {
	ListView listViewMauxQuotidienlist=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_maux_quotidien_list);

		listViewMauxQuotidienlist = (ListView) findViewById(R.id.listViewMauxQuotidien);

		
		
		//Cr�ation de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemMauxQuotidiensList = new ArrayList<HashMap<String, String>>();
 
        //On d�clare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapTestElementMauxQuotidien;
 
       
        //Cr�ation d'une HashMap pour ins�rer les informations du premier item de notre listView
        mapTestElementMauxQuotidien = new HashMap<String, String>();
        //on ins�re un �l�ment titre que l'on r�cup�rera dans le textView titre cr�� dans le fichier affichageitem.xml
        mapTestElementMauxQuotidien.put("titre", "Ail des ours");
        //on ins�re un �l�ment description que l'on r�cup�rera dans le textView description cr�� dans le fichier affichageitem.xml
        mapTestElementMauxQuotidien.put("description", "Ail des ours");
        //on ins�re la r�f�rence � l'image (convertit en String car normalement c'est un int) que l'on r�cup�rera dans l'imageView cr�� dans le fichier affichageitem.xml
      
        mapTestElementMauxQuotidien.put("img", String.valueOf(R.drawable.aildesour));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemMauxQuotidiensList.add(mapTestElementMauxQuotidien); 
        
        
  
        mapTestElementMauxQuotidien = new HashMap<String, String>();
        mapTestElementMauxQuotidien.put("titre", "Chou");
        mapTestElementMauxQuotidien.put("description", "Chou");
        mapTestElementMauxQuotidien.put("img", String.valueOf(R.drawable.chou));
        listItemMauxQuotidiensList.add(mapTestElementMauxQuotidien);	
		
		
        mapTestElementMauxQuotidien = new HashMap<String, String>();
        mapTestElementMauxQuotidien.put("titre", "Citronnelle");
        mapTestElementMauxQuotidien.put("description", "Citronnelle");
        mapTestElementMauxQuotidien.put("img", String.valueOf(R.drawable.citronnelle));
        listItemMauxQuotidiensList.add(mapTestElementMauxQuotidien);
        
        
        
        
        mapTestElementMauxQuotidien = new HashMap<String, String>();
        mapTestElementMauxQuotidien.put("titre", "Gel�e royale");
        mapTestElementMauxQuotidien.put("description", " Gel�e royale");
        mapTestElementMauxQuotidien.put("img", String.valueOf(R.drawable.geleeroyale));
        listItemMauxQuotidiensList.add(mapTestElementMauxQuotidien);
        
        
        mapTestElementMauxQuotidien = new HashMap<String, String>();
        mapTestElementMauxQuotidien.put("titre", "Nigelle");
        mapTestElementMauxQuotidien.put("description", " Nigelle");
        mapTestElementMauxQuotidien.put("img", String.valueOf(R.drawable.nigelle));
        listItemMauxQuotidiensList.add(mapTestElementMauxQuotidien);
        
        
        
        
        mapTestElementMauxQuotidien = new HashMap<String, String>();
        mapTestElementMauxQuotidien.put("titre", "Raifort");
        mapTestElementMauxQuotidien.put("description", " Raifort");
        mapTestElementMauxQuotidien.put("img", String.valueOf(R.drawable.raifort));
        listItemMauxQuotidiensList.add(mapTestElementMauxQuotidien);
        
        
        mapTestElementMauxQuotidien = new HashMap<String, String>();
        mapTestElementMauxQuotidien.put("titre", "Thym");
        mapTestElementMauxQuotidien.put("description", " Thym");
        mapTestElementMauxQuotidien.put("img", String.valueOf(R.drawable.thym));
        listItemMauxQuotidiensList.add(mapTestElementMauxQuotidien);
        
        
        
        
      //Cr�ation d'un SimpleAdapter qui se chargera de mettre les items pr�sent dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mScheduleTestSerie = new SimpleAdapter (this.getBaseContext(), listItemMauxQuotidiensList, R.layout.affichageitem,
               new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
 
        //On attribut � notre listView l'adapter que l'on vient de cr�er
        listViewMauxQuotidienlist.setAdapter(mScheduleTestSerie);
		
		
		
        listViewMauxQuotidienlist.setOnItemClickListener(new OnItemClickListener() {
			@Override
        	@SuppressWarnings("unchecked")
         	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				//on r�cup�re la HashMap contenant les infos de notre item (titre, description, img)
        		HashMap<String, String> map = (HashMap<String, String>) listViewMauxQuotidienlist.getItemAtPosition(position);

        switch (position) {
        case 0:
        	 // Show Alert 
          // Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG).show();
            
           
    		        
    		   	Intent IntentSignauxDanger = new Intent(ActivityMauxQuotidienList.this,ActivityAildesOur.class);
    		  	startActivity(IntentSignauxDanger);	
    		   	
    		   
        break;
        case 1:  
        	 // Show Alert 
            //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
             // .show();
           Intent IntentPassageAniveau= new Intent(ActivityMauxQuotidienList.this,ActivityChou.class);
		   	startActivity(IntentPassageAniveau);	
            
           
            
            
                 break;	
	
        case 2:  
       	 // Show Alert 
           //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
            // .show();
          Intent IntentsignauxIntersectionPriorite= new Intent(ActivityMauxQuotidienList.this,ActivityCitronnelle.class);
		   	startActivity(IntentsignauxIntersectionPriorite);	
		    break;  
        case 3:  
          	 // Show Alert 
              //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
               // .show();
             Intent IntentSignalisationInterdiction= new Intent(ActivityMauxQuotidienList.this,ActivityGeleeroyale.class);
   		   	startActivity(IntentSignalisationInterdiction);	
           
           
                break;	
		
        case 4:  
        	 // Show Alert 
            //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
             // .show();
           Intent IntentArretStationnement= new Intent(ActivityMauxQuotidienList.this,ActivityNigelle.class);
 		   	startActivity(IntentArretStationnement);	
         
         
              break;
              
       case 5:  
       	 // Show Alert 
           //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
            // .show();
          Intent Intentobligation= new Intent(ActivityMauxQuotidienList.this,ActivityRaifort.class);
		   	startActivity(Intentobligation);	
        
        
             break;	 
               
       case 6:  
      	 // Show Alert 
          //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
           // .show();
         Intent IntentSignauxIndication= new Intent(ActivityMauxQuotidienList.this,ActivityThym.class);
		   	startActivity(IntentSignauxIndication);	
		    break;	
		   	
		   	
      
  		   	
  		   	
  		   	
      
      }
          
     
  		// TODO Auto-generated method stub
  		//super.onListItemClick(l, v, position, id);
  	}

		
		
		
		
		
		
	
 });










}


}
