package ControleComprasGUI.Action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class SobreAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;

	public SobreAction(JFrame frame) {
		super("Sobre");
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Sobre");
		JOptionPane.showMessageDialog(frame, "v. 0.1 Controle Compras.",
				"Sobre o Controle de Compras - Gustavo Santos", JOptionPane.INFORMATION_MESSAGE);
	}

}