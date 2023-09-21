/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import bean.MljfsProdutos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Melany
 */
public class ProdutosController extends AbstractTableModel {
    private List lista;
    
    public void setList(List lista){
        this.lista = lista;
        this.fireTableDataChanged();
    }
    public MljfsProdutos getBean(int row){
        return (MljfsProdutos) lista.get(row);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
       return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MljfsProdutos cliente = (MljfsProdutos) lista.get(rowIndex);
        if (columnIndex == 0){
            return cliente.getMljfsId();
        }
        if (columnIndex == 1){
            return cliente.getMljfsNome();
        }
        if (columnIndex == 2){
            return cliente.getMljfsPreco();
        }
        if (columnIndex == 3){
            return cliente.getMljfsDescricaoDoProduto();
        }
        if (columnIndex == 4){
            return cliente.getMljfsQuantidadeEmEstoque();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int column){
        if (column == 0){
            return "ID";
        }
        if (column == 1){
            return "NOME";
        }
        if (column == 2){
            return "PRECO";
        }
        if (column == 3){
            return "DESCRICAO";
        }
        if (column == 4){
            return "QUANTIDADE";
        }
        return "";
    }
    
    
}
