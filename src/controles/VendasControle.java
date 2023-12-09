/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import bean.MljfsVendas;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Melany
 */
public class VendasControle extends AbstractTableModel {
    private List lista;
    
    public void setList(List lista){
        this.lista = lista;
        this.fireTableDataChanged();
    }
    public MljfsVendas getBean (int row){
        return (MljfsVendas) lista.get(row);
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
        MljfsVendas vendas = (MljfsVendas) lista.get(rowIndex);
        if (columnIndex == 0){
            return vendas.getMljfsId();
        }
        if (columnIndex == 1){
            return vendas.getMljfsData();
        }
        if (columnIndex == 2){
            return vendas.getMljfsValorTotal();
        }
        if (columnIndex == 3){
            return vendas.getMljfsMetodoPagamento();
        }
        if (columnIndex == 4){
            return vendas.getMljfsClienteId();
        }
        if (columnIndex == 5){
            return vendas.getMljfsFkFuncionarios();
        }
        
        return "";
    }
    
    public String getColumnName(int column){
        if (column == 0){
            return "ID";
        }
        if (column == 1){
            return "DATA";
        }
        if (column == 2){
            return "VALOR TOTAL";
        }
        if (column == 3){
            return "METODO PAGAMENTO";
        }
        if (column == 4){
            return "ID CLIENTE";
        }
        if (column == 5){
            return "ID VENDEDOR";
        }
        return "";  
    }

}
