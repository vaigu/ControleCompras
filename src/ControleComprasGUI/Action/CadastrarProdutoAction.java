package ControleComprasGUI.Action;



import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;

import ControleCompras.DAO.ControleDAO;
import ControleCompras.POJO.Produto;
import ControleComprasGUI.CadastrarProdutoPanel;


public class CadastrarProdutoAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private CadastrarProdutoPanel panel;
	
	
	
	public CadastrarProdutoAction(CadastrarProdutoPanel panel) {
		super("Cadastrar");
		this.panel = panel;
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Produto c = panel.getProduto();
		//System.out.println(c);
		ControleDAO dao = new ControleDAO();
		dao.insertProduto(c);
		panel.clear();
		CardLayout card = panel.getCard();
		JFrame frame = panel.getFrame();
	    card.show(frame.getContentPane(),"Branco");
	}
}