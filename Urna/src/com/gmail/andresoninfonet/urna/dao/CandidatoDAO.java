package com.gmail.andresoninfonet.urna.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.NamingException;

import com.gmail.andresoninfonet.urna.conexao.ConnectionFactory;
import com.gmail.andresoninfonet.urna.modelo.Candidato;

public class CandidatoDAO {

	private Connection con;
	private Statement stm;

	
	public void conectar(){
		try {
			con = new ConnectionFactory().getConnection();
			stm = con.createStatement();
			System.out.println("conectado");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (NamingException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void fechar(){
		try {
			stm.close();
			con.close();
			System.out.println("desconectado");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	public Candidato getZakk(){
		conectar();
		try{
			ResultSet result = stm.executeQuery("select c_id, nome, partido, campanha, imagem, voto from candidato where c_id='1'");
			Candidato cand = new Candidato();
			while(result.next()){
			
				cand.setC_id(result.getInt("c_id"));
				cand.setNome(result.getString("nome"));
				cand.setPartido(result.getString("partido"));
				cand.setCampanha(result.getString("campanha"));
				cand.setImagem(result.getString("imagem"));
				cand.setVoto(result.getInt("voto"));
			}
			
			return cand;
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}finally{
			fechar();
		}
	}
	
	public Candidato getDime(){
		conectar();
		try{
			ResultSet result = stm.executeQuery("select c_id, nome, partido, campanha, imagem, voto from candidato where c_id='2'");
			Candidato cand = new Candidato();
			while(result.next()){
			
				cand.setC_id(result.getInt("c_id"));
				cand.setNome(result.getString("nome"));
				cand.setPartido(result.getString("partido"));
				cand.setCampanha(result.getString("campanha"));
				cand.setImagem(result.getString("imagem"));
				cand.setVoto(result.getInt("voto"));
			}
			
			return cand;
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}finally{
			fechar();
		}
	}
	
	public Candidato getSlash(){
		conectar();
		try{
			ResultSet result = stm.executeQuery("select c_id, nome, partido, campanha, imagem, voto from candidato where c_id='3'");
			Candidato cand = new Candidato();
			while(result.next()){
			
				cand.setC_id(result.getInt("c_id"));
				cand.setNome(result.getString("nome"));
				cand.setPartido(result.getString("partido"));
				cand.setCampanha(result.getString("campanha"));
				cand.setImagem(result.getString("imagem"));
				cand.setVoto(result.getInt("voto"));
			}
			
			return cand;
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}finally{
			fechar();
		}
	}
	
	public void atualizaVoto(int id){
		conectar();
		try{
			stm.executeUpdate("update candidato set voto = voto + 1 where c_id=" + id);
		}catch(SQLException e){
			throw new RuntimeException(e);
		}finally{
			fechar();
		}
	}
}
