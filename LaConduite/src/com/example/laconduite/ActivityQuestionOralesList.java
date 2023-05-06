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

		//Cr�ation de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemQuestionoraleList = new ArrayList<HashMap<String, String>>();
 
        //On d�clare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapQuestionoraleElement;
 
       
        //Cr�ation d'une HashMap pour ins�rer les informations du premier item de notre listView
        mapQuestionoraleElement = new HashMap<String, String>();
        //on ins�re un �l�ment titre que l'on r�cup�rera dans le textView titre cr�� dans le fichier affichageitem.xml
        mapQuestionoraleElement.put("titre", "V�rifications interieures");
        //on ins�re un �l�ment description que l'on r�cup�rera dans le textView description cr�� dans le fichier affichageitem.xml
        mapQuestionoraleElement.put("description", " Commencer l'ensemble de tests");
        //on ins�re la r�f�rence � l'image (convertit en String car normalement c'est un int) que l'on r�cup�rera dans l'imageView cr�� dans le fichier affichageitem.xml
      
        mapQuestionoraleElement.put("img", String.valueOf(R.drawable.interieures));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemQuestionoraleList.add(mapQuestionoraleElement); 
        
        
  
        mapQuestionoraleElement = new HashMap<String, String>();
        mapQuestionoraleElement.put("titre", "V�rifications  exterieures");
        mapQuestionoraleElement.put("description", " Commencer l'ensemble de tests");
        mapQuestionoraleElement.put("img", String.valueOf(R.drawable.exterieures));
        listItemQuestionoraleList.add(mapQuestionoraleElement);
        
        
        
        
      //Cr�ation d'un SimpleAdapter qui se chargera de mettre les items pr�sent dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mScheduleTestSerie = new SimpleAdapter (this.getBaseContext(), listItemQuestionoraleList, R.layout.affichageitem,
               new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
 
        //On attribut � notre listView l'adapter que l'on vient de cr�er
        listViewQuestionoralelist.setAdapter(mScheduleTestSerie);
        
        listViewQuestionoralelist.setOnItemClickListener(new OnItemClickListener() {
			@Override
        	@SuppressWarnings("unchecked")
         	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				//on r�cup�re la HashMap contenant les infos de notre item (titre, description, img)
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
