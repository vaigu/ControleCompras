package ControleComprasGUI.Action;


import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import ControleComprasGUI.CadastrarProdutoPanel;



public class CadastrarProdutoCancelarAction extends AbstractAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private CadastrarProdutoPanel panel;

	/**
	 * 
	 * @param panel
	 */
	public CadastrarProdutoCancelarAction(CadastrarProdutoPanel panel) {
		super("Cancelar");
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		panel.clear();
	}

}