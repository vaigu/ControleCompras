package ControleComprasGUI.Action;


import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import ControleComprasGUI.CadastrarSuperPanel;



public class CadastrarSuperCancelarAction extends AbstractAction {
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
	public CadastrarSuperCancelarAction(CadastrarSuperPanel panel) {
		super("Cancelar");
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		panel.clear();
	}

}