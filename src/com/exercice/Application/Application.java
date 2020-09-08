package com.exercice.Application;

import java.util.ArrayList;

import com.exercice.Entities.Categorie;
import com.exercice.Util.Function;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Categorie a=new Categorie((long) 1,"a",new ArrayList<Categorie>());
		Categorie b=new Categorie((long) 2,"b",new ArrayList<Categorie>());
		Categorie c=new Categorie((long) 3,"c",new ArrayList<Categorie>());
		Categorie d=new Categorie((long) 4,"d",new ArrayList<Categorie>());
		
		c.getCategories().add(d);
		b.getCategories().add(c);
		b.getCategories().add(d);
		a.getCategories().add(c);
		a.getCategories().add(b);
		
		System.out.println(Function.getListOfName(a));
	}

}
