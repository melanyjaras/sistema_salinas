/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import bean.MljfsFuncionarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Melany
 */
public class FuncionariosController extends AbstractTableModel{
     private List lista;
    
    public void setList(List lista){
        this.lista = lista;
        this.fireTableDataChanged();
    }
    public MljfsFuncionarios getBean(int row){
        return (MljfsFuncionarios) lista.get(row);
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
       
    MljfsFuncionarios funcionarios = (MljfsFuncionarios) lista.get(rowIndex);
        if (columnIndex == 0){
            return funcionarios.getMljfsId();
        }
        if (columnIndex == 1){
            return funcionarios.getMljfsNome();
        }
        if (columnIndex == 2){
            return funcionarios.getMljfsCargo();
        }
        if (columnIndex == 3){
            return funcionarios.getMljfsSalario();
        }
        if (columnIndex == 4){
            return funcionarios.getMljfsDataAdmissao();
        }
        if (columnIndex == 5){
            return funcionarios.getMljfsDataDemissao();
        }
        if (columnIndex == 6){
            return funcionarios.getMljfsTelefone();
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
            return "CARGO";
        }
        if (column == 3){
            return "SALARIO";
        }
        if (column == 4){
            return "DATA DE ADMISSAO";
        }
        if (column == 5){
            return "DATA DE DEMISSAO";
        }
        if (column == 6){
            return "TELEFONE";
        }
        return "";
    }
    
}
