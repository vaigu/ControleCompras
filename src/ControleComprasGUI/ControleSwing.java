package ControleComprasGUI;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import ControleComprasGUI.Action.ListaProdutoAction;
import ControleComprasGUI.Action.ProdutoAction;
import ControleComprasGUI.Action.SairAction;
import ControleComprasGUI.Action.SobreAction;
import ControleComprasGUI.Action.SuperAction;

public class ControleSwing {
	/**
	 * Create the GUI and show it. For thread safety, this method should be
	 * invoked from the event-dispatching thread.
	 */
	private static void createAndShowGUI() {
		// Create and set up the window.
		
		CardLayout card = new CardLayout(0,0);
		
		
		
		JFrame frame = new JFrame("Controle de Rancho");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(
        ControleSwing.class.getResource("/ControleComprasGUI/Cart-icon.png")));

		JMenuBar mb = new JMenuBar();
		frame.setJMenuBar(mb);

		JMenu arquivo = new JMenu("Arquivo");
		arquivo.setMnemonic(KeyEvent.VK_A);
		mb.add(arquivo);

		JMenu cadastrar = new JMenu("Cadastrar");
		cadastrar.setMnemonic(KeyEvent.VK_C);
		mb.add(cadastrar);
		
		JMenu listar = new JMenu("Listar");
		cadastrar.setMnemonic(KeyEvent.VK_L);
		mb.add(listar);
		
		JMenuItem listaproduto = new JMenuItem(new ListaProdutoAction(frame, card));
		listar.add(listaproduto);
	
		JMenuItem produto = new JMenuItem(new ProdutoAction(card, frame));
		cadastrar.add(produto);
		JMenuItem supermercado = new JMenuItem(new SuperAction(card, frame));
		cadastrar.add(supermercado);
		
		JMenu ajuda = new JMenu("Ajuda");
		ajuda.setMnemonic(KeyEvent.VK_U);
		mb.add(ajuda);

		JMenuItem sair = new JMenuItem(new SairAction());
		arquivo.add(sair);
		sair.setMnemonic(KeyEvent.VK_S);
		sair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,ActionEvent.CTRL_MASK));

		JMenuItem sobre = new JMenuItem(new SobreAction(frame));
		ajuda.add(sobre);
		sobre.setMnemonic(KeyEvent.VK_S);
		
		
		frame.setLayout(card);
		
		frame.getContentPane().add(new Panel(), "Branco");
		
		JPanel panelCadProd = new CadastrarProdutoPanel(frame,card);
		frame.getContentPane().add(panelCadProd, "Produto");

		JPanel panelCadSuper = new CadastrarSuperPanel(frame,card);
		frame.getContentPane().add(panelCadSuper, "Supermercado");
		
		JPanel JListaProdutoPanel = new JListaProdutoPanel(frame, card);
		frame.getContentPane().add(JListaProdutoPanel, "ListaProduto");
		
		frame.setPreferredSize(new Dimension(800, 200));
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
