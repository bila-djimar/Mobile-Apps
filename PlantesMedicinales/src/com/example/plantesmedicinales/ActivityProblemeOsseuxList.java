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
		
		
		//Cr�ation de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemProblemeOsseuxList = new ArrayList<HashMap<String, String>>();
 
        //On d�clare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapTestElementProblemeOsseux;
 
       
        //Cr�ation d'une HashMap pour ins�rer les informations du premier item de notre listView
        mapTestElementProblemeOsseux = new HashMap<String, String>();
        //on ins�re un �l�ment titre que l'on r�cup�rera dans le textView titre cr�� dans le fichier affichageitem.xml
        mapTestElementProblemeOsseux.put("titre", "Arnica");
        //on ins�re un �l�ment description que l'on r�cup�rera dans le textView description cr�� dans le fichier affichageitem.xml
        mapTestElementProblemeOsseux.put("description", "Arnica");
        //on ins�re la r�f�rence � l'image (convertit en String car normalement c'est un int) que l'on r�cup�rera dans l'imageView cr�� dans le fichier affichageitem.xml
      
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
        
        
        
        
       
       
        
        
        //Cr�ation d'un SimpleAdapter qui se chargera de mettre les items pr�sent dans notre list (listItem) dans la vue affichageitem
          SimpleAdapter mScheduleTestSerie = new SimpleAdapter (this.getBaseContext(), listItemProblemeOsseuxList, R.layout.affichageitem,
                 new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
   
          //On attribut � notre listView l'adapter que l'on vient de cr�er
          listViewProblemeOsseuxlist.setAdapter(mScheduleTestSerie);
  		
  		
  		
          listViewProblemeOsseuxlist.setOnItemClickListener(new OnItemClickListener() {
  			@Override
          	@SuppressWarnings("unchecked")
           	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
  				//on r�cup�re la HashMap contenant les infos de notre item (titre, description, img)
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
