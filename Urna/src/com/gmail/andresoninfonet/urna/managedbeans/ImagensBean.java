package com.gmail.andresoninfonet.urna.managedbeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SuppressWarnings("serial")
@ManagedBean
@SessionScoped
public class ImagensBean implements Serializable{
	
	private List<String> lista; 
	private List<String> lista2;
	private List<String> lista3;
	
	public ImagensBean(){
		lista = new ArrayList<String>();
		lista.add("/resources/slash1.jpg");
		lista.add("/resources/slash2.jpg");
		lista.add("/resources/slash3.jpg");
		lista.add("/resources/slash4.jpg");
		lista.add("/resources/slash5.jpg");
		
		lista2 = new ArrayList<String>();
		lista2.add("/resources/zakk1.jpg");
		lista2.add("/resources/zakk2.jpg");
		lista2.add("/resources/zakk3.jpg");
		lista2.add("/resources/zakk4.jpg");
		lista2.add("/resources/zakk5.jpg");
		
		lista3 = new ArrayList<String>();
		lista3.add("/resources/dime1.jpg");
		lista3.add("/resources/dime2.jpg");
		lista3.add("/resources/dime3.jpg");
		lista3.add("/resources/dime4.jpg");
		lista3.add("/resources/dime5.jpg");
		
	}


	public List<String> getLista3() {
		return lista3;
	}


	public List<String> getLista2() {
		return lista2;
	}

	public List<String> getLista() {
		return lista;
	}


	
	
}
