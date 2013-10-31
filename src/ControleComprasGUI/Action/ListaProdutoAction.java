package ControleComprasGUI.Action;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import ControleCompras.DAO.ControleDAO;

public class ListaProdutoAction extends AbstractAction{

	   private static final long serialVersionUID = 1L;
       
       private JFrame frame;
       private CardLayout card;

       public ListaProdutoAction(JFrame frame, CardLayout card) {
               super("Consultar produto");
               this.frame = frame;
               this.card = card;
       }

       @Override
       public void actionPerformed(ActionEvent arg0) {        
               //TODO: criar tela extrato cliente
    	   
    	   
    	   //ControleDAO dao = new ControleDAO();
   		   //dao.findByNomeProduto(produto);
    	   card.show(frame.getContentPane(), "ListaProduto" );
       
       
       }
	
	
	
	
}
