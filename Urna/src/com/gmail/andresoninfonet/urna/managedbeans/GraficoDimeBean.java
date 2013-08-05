package com.gmail.andresoninfonet.urna.managedbeans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;

import com.gmail.andresoninfonet.urna.dao.CandidatoDAO;

@SuppressWarnings("serial")
@ManagedBean
@SessionScoped
public class GraficoDimeBean implements Serializable{

	private CartesianChartModel categoryModel;
	private CandidatoDAO dao = new CandidatoDAO();
	
	public GraficoDimeBean(){
		createCategoryModel();
	}
	
	public CartesianChartModel getCategoryModel() {  
        return categoryModel;  
    } 
	
	private void createCategoryModel(){
		categoryModel = new CartesianChartModel();
		
		ChartSeries candidato = new ChartSeries();
		candidato.setLabel("Dimebag Darrell");
		
		candidato.set("Votos", dao.getDime().getVoto());
		
		categoryModel.addSeries(candidato);
	}
}
