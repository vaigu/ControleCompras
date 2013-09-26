package ControleCompras.Test;

import ControleCompras.DAO.ControleDAO;
import ControleCompras.POJO.Produto;

public class ControleDAOTest {
	
	
	

		public static void main(String[] args) {
			
			ControleDAO dao = new ControleDAO();
			System.out.println(dao.MostrarProduto("ceva"));

			Produto p = new Produto(1,"teste",10,1);
			dao.insertProduto(p);

			System.out.println(dao.MostrarProduto("teste"));

		}

	}
	
	
	
	
	
	
	


