package ControleComprasGUI;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


import ControleCompras.POJO.Produto;
import ControleComprasGUI.Action.CadastrarProdutoAction;
import ControleComprasGUI.Action.CadastrarProdutoCancelarAction;

/**
 * 
 *
 *
 */
public class CadastrarProdutoPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//private int a,b,c;
	public JFrame getFrame() {
		// TODO Auto-generated method stub
		return frame;
	}

	public CardLayout getCard() {
		// TODO Auto-generated method stub
		return card;
	}
	
	private JFrame frame;
	private CardLayout card;
	private JTextField id;
	private JTextField nome;
	private JTextField preco;
	private JTextField id_super;
	/**
	 * 
	 * @return
	 */
	public Produto getProduto() {
		return new Produto(Integer.parseInt(id.getText()), nome.getText(),Integer.parseInt(preco.getText()),Integer.parseInt(id_super.getText()));
	}

	public void clear() {
		id.setText("");
		nome.setText("");
		preco.setText("");
		id_super.setText("");
	}


	/**
	 * 
	 */
	public CadastrarProdutoPanel(JFrame frame,CardLayout card) {
		JLabel label;

		this.frame = frame;
		this.card = card;
		
	
		setLayout(new FlowLayout());

		label = new JLabel("ID");
		add(label);
		id = new JTextField(10);
		label.setLabelFor(id);
		add(id);

		label = new JLabel("Nome");
		add(label);
		nome = new JTextField(10);
		label.setLabelFor(nome);
		add(nome);

		label = new JLabel("Preco");
		add(label);
		preco = new JTextField(10);
		label.setLabelFor(preco);
		add(preco);
		
		label = new JLabel("id_super");
		add(label);
		id_super = new JTextField(10);
		label.setLabelFor(id_super);
		add(id_super);

		JButton button;

		button = new JButton(new CadastrarProdutoAction(this));
		button.setToolTipText("Cadastrar produto");
		button.setMnemonic(KeyEvent.VK_C);
		add(button);

		button = new JButton(new CadastrarProdutoCancelarAction(this));
		button.setToolTipText("Cancelar cadastro do produto");
		button.setMnemonic(KeyEvent.VK_N);
		add(button);		
	}

	
}