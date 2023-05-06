package com.example.laconduite;

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

public class ActivityQuestionOralesList extends  Activity {
	ListView listViewQuestionoralelist=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_question_orales_list);



		
		listViewQuestionoralelist = (ListView) findViewById(R.id.listViewQuestionoraleslist);

		//Création de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemQuestionoraleList = new ArrayList<HashMap<String, String>>();
 
        //On déclare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapQuestionoraleElement;
 
       
        //Création d'une HashMap pour insérer les informations du premier item de notre listView
        mapQuestionoraleElement = new HashMap<String, String>();
        //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
        mapQuestionoraleElement.put("titre", "Vérifications interieures");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        mapQuestionoraleElement.put("description", " Commencer l'ensemble de tests");
        //on insère la référence à l'image (convertit en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
      
        mapQuestionoraleElement.put("img", String.valueOf(R.drawable.interieures));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemQuestionoraleList.add(mapQuestionoraleElement); 
        
        
  
        mapQuestionoraleElement = new HashMap<String, String>();
        mapQuestionoraleElement.put("titre", "Vérifications  exterieures");
        mapQuestionoraleElement.put("description", " Commencer l'ensemble de tests");
        mapQuestionoraleElement.put("img", String.valueOf(R.drawable.exterieures));
        listItemQuestionoraleList.add(mapQuestionoraleElement);
        
        
        
        
      //Création d'un SimpleAdapter qui se chargera de mettre les items présent dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mScheduleTestSerie = new SimpleAdapter (this.getBaseContext(), listItemQuestionoraleList, R.layout.affichageitem,
               new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
 
        //On attribut à notre listView l'adapter que l'on vient de créer
        listViewQuestionoralelist.setAdapter(mScheduleTestSerie);
        
        listViewQuestionoralelist.setOnItemClickListener(new OnItemClickListener() {
			@Override
        	@SuppressWarnings("unchecked")
         	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				//on récupère la HashMap contenant les infos de notre item (titre, description, img)
        		HashMap<String, String> map = (HashMap<String, String>) listViewQuestionoralelist.getItemAtPosition(position);


        		switch (position) {
                case 0:
                	
                   
            		        
            		   	Intent IntentSerie1 = new Intent(ActivityQuestionOralesList.this,ActivityVerificationInterieurList.class);
            		  	startActivity(IntentSerie1);	
            		  	 break;
            		  	 
            		  	 
                case 1:
                	
                    
    		        
        		   	Intent IntentSerie2 = new Intent(ActivityQuestionOralesList.this,ActivityVerificationExterieurList.class);
        		  	startActivity(IntentSerie2);	
        		  	 break;   
                    
}
                
                
          		
          	}

        		
        		
        		
        		
        		
        		
        	
         });
		
	}

}
