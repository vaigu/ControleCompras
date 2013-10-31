package ControleComprasGUI.Action;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;

import ControleComprasGUI.JListaProdutoPanel;

public class ListaProdutoFecharAction extends AbstractAction{

	private static final long serialVersionUID = 1L;
    
    /**
     * 
     */
    private JListaProdutoPanel panel;

    /**
     * 
     * @param jExtratoPanel
     */
    public ListaProdutoFecharAction(JListaProdutoPanel listaproduto) {
            super("Fechar");
            this.panel = listaproduto;
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
            //panel.clear();
            CardLayout card = panel.getCard();
            JFrame frame = panel.getFrame();
            card.show(frame.getContentPane(), "Branco");                
    }
	
	
	
}
