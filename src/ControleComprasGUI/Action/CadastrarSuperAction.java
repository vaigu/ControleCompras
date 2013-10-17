package ControleComprasGUI.Action;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;

import ControleCompras.DAO.ControleDAO;
import ControleCompras.POJO.Supermercado;
import ControleComprasGUI.CadastrarSuperPanel;

public class CadastrarSuperAction extends AbstractAction {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	/**
		 * 
		 */
	private CadastrarSuperPanel panel;
	private CardLayout card;
	private JFrame frame;
	/**
	 * 
	 * @param panel
	 */
	public CadastrarSuperAction(CadastrarSuperPanel panel) {
		super("Cadastrar");
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Supermercado s = panel.getSuper();
		// System.out.println(c);
		ControleDAO dao = new ControleDAO();
		dao.insertSupermercado(s);
		panel.clear();
		CardLayout card = panel.getCard();
		JFrame frame = panel.getFrame();
		card.show(frame.getContentPane(), "Branco");
		
	}

}
