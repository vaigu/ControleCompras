package ControleCompras.DAO;


import java.util.List;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;

import ControleCompras.POJO.ListaProduto;
import ControleCompras.POJO.Produto;
import ControleCompras.POJO.Supermercado;


public class ControleDAO {


	public Produto MostrarProduto (String nome) {
		Produto produto = null;
		String cmd = "select * from produtos where nome= ?";

		Connection db = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			// abrir conexão
			Properties props = new Properties();
			props.load(new FileInputStream("controlecompras.properties"));
			String url = props.getProperty("url");

			db = DriverManager.getConnection(url, props);

			st = db.prepareStatement(cmd);
			st.setString(1,nome);
			rs = st.executeQuery();

			while (rs.next()) {
				
				int produtoID = rs.getInt(1);
				String nomeBD = rs.getString("nome");
				int preco = rs.getInt(3);
				int superID = rs.getInt(4);
				produto = new Produto(produtoID,nomeBD,preco, superID);
				
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (db != null) {
					db.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return produto; 
	}

	public void insertProduto(Produto produto) {
		String cmd = "insert into produtos(id_prod, nome, preco, id_super_fk) values (?, ?, ?, ?)";

		Connection db = null;
		PreparedStatement st = null;

		try {
			// abrir conexão
			Properties props = new Properties();
			props.load(new FileInputStream("controlecompras.properties"));
			String url = props.getProperty("url");

			db = DriverManager.getConnection(url, props);

			st = db.prepareStatement(cmd);
			st.setInt(1, produto.getProdutoID());
			st.setString(2, produto.getNome());
			st.setInt(3, produto.getPreco());
			st.setInt(4, produto.getSuperID());
			int r = st.executeUpdate();

			if (r != 1) {
				throw new RuntimeException("Erro ao inserir");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null) {
					st.close();
				}
				if (db != null) {
					db.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}




public void insertSupermercado(Supermercado supermercado) {
	String cmd = "insert into supermercado(id_, nome) values (?, ?)";

	Connection db = null;
	PreparedStatement st = null;

	try {
		// abrir conexão
		Properties props = new Properties();
		props.load(new FileInputStream("controlecompras.properties"));
		String url = props.getProperty("url");

		db = DriverManager.getConnection(url, props);

		st = db.prepareStatement(cmd);
		st.setInt(1, supermercado.getSuperID());
		st.setString(2, supermercado.getNome());
		int r = st.executeUpdate();

		if (r != 1) {
			throw new RuntimeException("Erro ao inserir");
		}

	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			if (st != null) {
				st.close();
			}
			if (db != null) {
				db.close();
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
}





public List <ListaProduto> findByNomeProduto(String produto){
	String cmd = "select * from produtos where nome= ?";
	List <ListaProduto> lp = new ArrayList <ListaProduto>();
	
	Connection db = null;
    PreparedStatement st = null;
    ResultSet rs = null;

    try {
		// abrir conexão
		Properties props = new Properties();
		props.load(new FileInputStream("controlecompras.properties"));
		String url = props.getProperty("url");

		db = DriverManager.getConnection(url, props);

		st = db.prepareStatement(cmd);
		st.setInt(1,1);
		
		int r = st.executeUpdate();
		
		while (rs.next()) {
            String nome  = rs.getString(2);
            double preço = rs.getInt(3);
            int supermercado = rs.getInt(4); 
            
            lp.add(new ListaProduto(nome,preço,supermercado));
		 } 
		
     }catch (Exception e) {
             e.printStackTrace();
     } finally {
             try {
                     if (rs != null) {
                             rs.close();
                     }
                     if (st != null) {
                             st.close();
                     }
                     if (db != null) {
                             db.close();
                     }
             } catch (Exception e2) {
                     e2.printStackTrace();
             }
     }
     return lp;
}


}












