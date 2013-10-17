package ControleCompras.Test;

import ControleCompras.DAO.ControleDAO;
import ControleCompras.POJO.Produto;
import ControleCompras.POJO.Supermercado;

public class ControleDAOTest {
	
	
	

		public static void main(String[] args) {
			
			ControleDAO dao = new ControleDAO();
			System.out.println(dao.MostrarProduto("ceva"));

			Supermercado p = new Supermercado(1,"teste");
			dao.insertSupermercado(p);

			System.out.println(dao.MostrarProduto("teste"));

		}

	}
	
	
	
	
	
	
	


