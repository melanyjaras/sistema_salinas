/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import bean.MljfsUsuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Melany
 */
public class UsuariosControle extends AbstractTableModel {
    private List lista;
    
    public void setList(List lista){
        this.lista = lista;
    }
    public MljfsUsuarios getBean (int row){
        return (MljfsUsuarios) lista.get(row);
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
        MljfsUsuarios usuarios = (MljfsUsuarios) lista.get(rowIndex);
        if (columnIndex == 0){
            return usuarios.getMljfsId();
        }
        if (columnIndex == 1){
            return usuarios.getMljfsNome();
        }
        if (columnIndex == 2){
            return usuarios.getMljfsSobrenome();
        }
        if (columnIndex == 3){
            return usuarios.getMljfsEmail();
        }
        if (columnIndex == 4){
            return usuarios.getMljfsCargo();
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
            return "SOBRENOME";
        }
        if (column == 3){
            return "EMAIL";
        }
        if (column == 4){
            return "CARGO";
        }
        return "";  
    }

}
