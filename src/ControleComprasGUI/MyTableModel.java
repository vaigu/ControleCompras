package ControleComprasGUI;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import ControleCompras.DAO.ControleDAO;
import ControleCompras.POJO.ListaProduto;

public class MyTableModel extends AbstractTableModel {

    private String produto;
    private List<ListaProduto> lp;

    public MyTableModel(String produto) {
            this.produto = produto;
            ControleDAO dao = new ControleDAO();
            lp = dao.findByNomeProduto(produto);
    }

    @Override
    public int getColumnCount() {
            return 3;
    }

    @Override
    public int getRowCount() {
            return lp.size();
    }
    

    @Override
    public Object getValueAt(int lin, int col) {
            System.out.println(lin);
            ListaProduto l = lp.get(lin);
            switch (col) {
            case 0:
                    return l.getNome();
            case 1:
                    return l.getPreço();
            case 2:
                    return l.getSupermercado();
            default:
                    return "*ERRO*";
            }
    }

}