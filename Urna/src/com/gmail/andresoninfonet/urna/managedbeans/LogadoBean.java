package com.gmail.andresoninfonet.urna.managedbeans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.security.Authentication;
import org.springframework.security.context.SecurityContext;
import org.springframework.security.context.SecurityContextHolder;
import org.springframework.security.userdetails.User;

@SuppressWarnings("serial")
@ManagedBean
@SessionScoped
public class LogadoBean implements Serializable{
	
	User usuario;

	public LogadoBean(){
		SecurityContext context=SecurityContextHolder.getContext();
		Authentication auth=context.getAuthentication();
		System.out.println(auth.getPrincipal());
	}
	
	public String logado(){
		
		System.out.println(SecurityContextHolder.getContext().getAuthentication().getName());
		String usuario = SecurityContextHolder.getContext().getAuthentication().getName();
		return usuario;
	}
	
	
	public String logoutEleitor(){
		String log = "/Urna/eleitor/j_spring_security_logout";
		return log;
	}
	
	public User getUsuario() {
		return usuario;
	}

	public void setUsuario(User usuario) {
		this.usuario = usuario;
	}
}
