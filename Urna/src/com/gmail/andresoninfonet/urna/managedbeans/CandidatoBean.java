package com.gmail.andresoninfonet.urna.managedbeans;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import com.gmail.andresoninfonet.urna.dao.CandidatoDAO;
import com.gmail.andresoninfonet.urna.modelo.Candidato;


@ManagedBean
@SessionScoped
public class CandidatoBean implements Serializable{

	private static final long serialVersionUID = -7833642076160065807L;
	
	private Candidato candidatoSelecionado;
	private int idCandidatoSelecionado;
	private CandidatoDAO dao = new CandidatoDAO();
	private List<Candidato> lista = new ArrayList<Candidato>();
	
	
	public CandidatoBean(){
		lista.add(new Candidato(dao.getZakk().getC_id(), dao.getZakk().getNome(), dao.getZakk().getPartido(), dao.getZakk().getCampanha(), 
								dao.getZakk().getImagem()));
		lista.add(new Candidato(dao.getDime().getC_id(), dao.getDime().getNome(), dao.getDime().getPartido(), dao.getDime().getCampanha(),
								dao.getDime().getImagem()));
		lista.add(new Candidato(dao.getSlash().getC_id(), dao.getSlash().getNome(), dao.getSlash().getPartido(), dao.getSlash().getCampanha(),
								dao.getSlash().getImagem()));
		candidatoSelecionado = lista.get(0);
	}
	
	public void carregaCandidato(){
		for(Candidato candidato : lista){
			if(idCandidatoSelecionado == candidato.getC_id()){
				candidatoSelecionado = candidato;
				break;
			}
		}
	}
	
	public void atualiza(ActionEvent evt){
		System.out.println(idCandidatoSelecionado);
		dao.atualizaVoto(idCandidatoSelecionado);
		System.out.println("votado...");
	}
	
	public Candidato getCandidatoSelecionado() {
		return candidatoSelecionado;
	}
	public void setCandidatoSelecionado(Candidato candidato) {
		this.candidatoSelecionado = candidato;
	}
	public CandidatoDAO getDao() {
		return dao;
	}
	public void setDao(CandidatoDAO dao) {
		this.dao = dao;
	}
	public int getIdCandidatoSelecionado() {
		return idCandidatoSelecionado;
	}

	public void setIdCandidatoSelecionado(int idCandidatoSelecionado) {
		this.idCandidatoSelecionado = idCandidatoSelecionado;
	}

	public List<Candidato> getLista() {
		return lista;
	}

	public void setLista(List<Candidato> lista) {
		this.lista = lista;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
