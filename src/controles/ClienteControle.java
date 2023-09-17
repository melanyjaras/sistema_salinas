/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import bean.MljfsClientes;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Melany
 */
public class ClienteControle extends AbstractTableModel {
    private List lista;
    
    public void setList(List lista){
        this.lista = lista;
    }
    public MljfsClientes getBean(int row){
        return (MljfsClientes) lista.get(row);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
       return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MljfsClientes cliente = (MljfsClientes) lista.get(rowIndex);
        if (columnIndex == 0){
            return cliente.getMljfsId();
        }
        if (columnIndex == 1){
            return cliente.getMljfsNome();
        }
        if (columnIndex == 2){
            return cliente.getMljfsSobrenome();
        }
        if (columnIndex == 3){
            return cliente.getMljfsEmail();
        }
        if (columnIndex == 4){
            return cliente.getMljfsTelefone();
        }
        if (columnIndex == 5){
            return cliente.getMljfsEndereco();
        }
        if (columnIndex == 6){
            return cliente.getMljfsCidade();
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
            return "CPF";
        }
        if (column == 3){
            return "RG";
        }
        if (column == 4){
            return "CEP";
        }
        if (column == 5){
            return "CELULAR";
        }
        if (column == 6){
            return "SENHA";
        }
        return "";
    }
    
    
}
