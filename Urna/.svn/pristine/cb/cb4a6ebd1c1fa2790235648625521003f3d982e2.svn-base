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
public class GraficoFiscalBean implements Serializable{

	private CartesianChartModel categoryModel;
	private CandidatoDAO dao = new CandidatoDAO();
	
	
	public GraficoFiscalBean(){
		createCategoryModel();
	}
	
	public CartesianChartModel getCategoryModel() {  
        return categoryModel;  
    }  
	
	
	private void createCategoryModel(){
		categoryModel = new CartesianChartModel();
		
		ChartSeries zakk = new ChartSeries();
		zakk.setLabel("Zakk Wylde");
		
		zakk.set("22/05", 15);
		zakk.set("27/05", 28);
		zakk.set("01/06", 36);
		zakk.set("Hoje", dao.getZakk().getVoto());
		
		ChartSeries dime = new ChartSeries();
		dime.setLabel("Dimebag Darrell");
		
		dime.set("22/05", 7);
		dime.set("27/05", 23);
		dime.set("01/06", 30);
		dime.set("Hoje", dao.getDime().getVoto());
		
		ChartSeries slash = new ChartSeries();
		slash.setLabel("Slash");
		
		slash.set("22/05", 11);
		slash.set("27/05", 34);
		slash.set("01/06", 40);
		slash.set("Hoje", dao.getSlash().getVoto());
		
		categoryModel.addSeries(dime);
		categoryModel.addSeries(zakk);
		categoryModel.addSeries(slash);
	}
}
