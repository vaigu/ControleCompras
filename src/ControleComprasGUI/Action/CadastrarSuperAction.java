package ControleComprasGUI.Action;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
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
	}

}
