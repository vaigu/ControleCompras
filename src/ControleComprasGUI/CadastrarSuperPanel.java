package ControleComprasGUI;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


import ControleCompras.POJO.Produto;
import ControleCompras.POJO.Supermercado;
import ControleComprasGUI.Action.CadastrarProdutoAction;
import ControleComprasGUI.Action.CadastrarProdutoCancelarAction;
import ControleComprasGUI.Action.CadastrarSuperAction;
import ControleComprasGUI.Action.CadastrarSuperCancelarAction;

/**
 * 
 *
 *
 */
public class CadastrarSuperPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private JTextField id;
	private JTextField nome;
	
	/**
	 * 
	 * @return
	 */
	public Supermercado getSuper() {
		return new Supermercado(Integer.parseInt(id.getText()), nome.getText());
	}

	public void clear() {
		id.setText("");
		nome.setText("");
		
	}


	/**
	 * 
	 */
	public CadastrarSuperPanel() {
		JLabel label;

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


		JButton button;

		button = new JButton(new CadastrarSuperAction(this));
		button.setToolTipText("Cadastrar supermercado");
		button.setMnemonic(KeyEvent.VK_C);
		add(button);

		button = new JButton(new CadastrarSuperCancelarAction(this));
		button.setToolTipText("Cancelar cadastro do supermercado");
		button.setMnemonic(KeyEvent.VK_N);
		add(button);		
	}
}