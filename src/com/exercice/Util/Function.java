package com.exercice.Util;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import com.exercice.Entities.Categorie;
public class Function {
	static ArrayList<String> names=new ArrayList<String>();
	public static ArrayList<String> getListOfName(Categorie a){
		ArrayList<Categorie> listofCategories=new ArrayList<Categorie>();
		listofCategories=a.getCategories();
		getCategories(listofCategories);
		Set<String> set = new HashSet<>(names);
		names.clear();
		names.addAll(set);
		return names;
	}

	public static void getCategories(ArrayList<Categorie> exemple) {
		ArrayList<Categorie> categories=new ArrayList<Categorie>();
		categories=exemple;
		while(categories.size()>0) {
			getNames(categories);
			ArrayList<Categorie> treatmentList=new ArrayList<Categorie>();
			for(int j=0;j<categories.size();j++) {
				treatmentList.addAll(categories.get(j).getCategories());
			}
			categories=treatmentList;
		}
	}
	
	public static void getNames(ArrayList<Categorie> ListOfCategorie) {
		for(int i=0;i<ListOfCategorie.size();i++) {
			names.add(ListOfCategorie.get(i).getName());
		}
	}

}
