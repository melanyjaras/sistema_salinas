/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import bean.MljfsVendasProdutos;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Melany
 */
public class VendasProdutosControle extends AbstractTableModel {
    private List lista;
    
    public void setList(List lista){
        this.lista = lista;
        this.fireTableDataChanged();
    }
    public MljfsVendasProdutos getBean (int row){
        return (MljfsVendasProdutos) lista.get(row);
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
        MljfsVendasProdutos vendas = (MljfsVendasProdutos) lista.get(rowIndex);
        if (columnIndex == 0){
            return vendas.getMljfsId();
        }
        if (columnIndex == 1){
            return vendas.getMljfsVendas();
        }
        if (columnIndex == 2){
            return vendas.getMljfsQuantidade();
        }
        if (columnIndex == 3){
            return vendas.getMljfsPrecoUnitario();
        }
        if (columnIndex == 4){
            return vendas.getMljfsPrecoTotal();
        }
        
        return "";
    }
    
    public String getColumnName(int column){
        if (column == 0){
            return "ID";
        }
        if (column == 1){
            return "ID VENDAS";
        }
        if (column == 2){
            return "QUANTIDADE";
        }
        if (column == 3){
            return "VALOR UNITARIO";
        }
        if (column == 4){
            return "VALOR TOTAL";
        }
        return "";  
    }

}
