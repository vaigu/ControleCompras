package ControleComprasGUI.Action;

import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
//acao do menu 

public class ProdutoAction extends AbstractAction {

	
	private CardLayout card;
	private JFrame frame;
	
	
	private static final long serialVersionUID = 1L;

	
	
	public ProdutoAction(CardLayout card, JFrame frame) {
		super("Produto");
		this.card = card;
		this.frame = frame;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		//System.out.println("Sair");
		// TODO: verificar dados antes de sair da aplicação 
		card.show(frame.getContentPane(), "Produto");
	}

}