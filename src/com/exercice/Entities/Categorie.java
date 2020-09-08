package com.exercice.Entities;

import java.util.ArrayList;

public class Categorie {
	private Long id;
	private String name;
	private ArrayList<Categorie> categories;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Categorie> getCategories() {
		return categories;
	}
	public void setCategories(ArrayList<Categorie> categories) {
		this.categories = categories;
	}
	public Categorie(Long id, String name, ArrayList<Categorie> categories) {
		super();
		this.id = id;
		this.name = name;
		this.categories = categories;
	}
	@Override
	public String toString() {
		return "Categorie [id=" + id + ", name=" + name + ", categories=" + categories + "]";
	}
	

}
