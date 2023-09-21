/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.MljfsFuncionarios;
import controles.FuncionariosController;
import dao.FuncionariosDAO;
import java.util.Date;
import java.util.List;
import tools.Util;

/**
 *
 * @author Melany
 */
public class JDlgFuncionariosNovoIA extends javax.swing.JDialog {
public FuncionariosController funcionariosController = new FuncionariosController();
       
    public JDlgFuncionariosNovoIA(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
       Util.limparCampos(jTxtId, jTxtNome, jTxtCargo, jTxtSetor, jFmtCelular, jFmtDataAdmicao, jFmtdataDem);
    }
    private boolean incluindo;

     public void setIncluindo(boolean incluindo) {
        this.incluindo = incluindo;

     }
    private MljfsFuncionarios viewBean(){
        MljfsFuncionarios funcionarios = new MljfsFuncionarios();
        
        int id = Util.strInt(jTxtId.getText());
        funcionarios.setMljfsId(id);
        funcionarios.setMljfsNome(jTxtNome.getText());
        funcionarios.setMljfsCargo(jTxtCargo.getText());
        
        Date dataAdmicao = Util.StrDate(jFmtDataAdmicao.getText());
        funcionarios.setMljfsDataAdmissao(dataAdmicao);
        
        Date dataDemissao = Util.StrDate(jFmtdataDem.getText());
        funcionarios.setMljfsDataDemissao(dataDemissao);
        
        funcionarios.setMljfsTelefone(jFmtCelular.getText());
        funcionarios.setMljfsSetor(jTxtSetor.getText());
        return funcionarios;
    }
    public void beanView(MljfsFuncionarios funcionarios){
        jTxtId.setText(Util.intStr(funcionarios.getMljfsId()));
        jTxtNome.setText(funcionarios.getMljfsNome());
        jTxtCargo.setText(funcionarios.getMljfsCargo());
        jFmtDataAdmicao.setText(Util.dateStr(funcionarios.getMljfsDataAdmissao()));
        jFmtdataDem.setText(Util.dateStr(funcionarios.getMljfsDataDemissao()));
        jFmtCelular.setText(funcionarios.getMljfsTelefone());
        jTxtSetor.setText(funcionarios.getMljfsSetor());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTxtId = new javax.swing.JTextField();
        jTxtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jFmtCelular = new javax.swing.JFormattedTextField();
        jTxtSetor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jFmtdataDem = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtCargo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jFmtDataAdmicao = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Id");

        jLabel3.setText("Nome");

        jLabel6.setText("Setor");

        jLabel7.setText("Telefone");

        try {
            jFmtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFmtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtCelularActionPerformed(evt);
            }
        });

        jLabel9.setText("Data de Demissao");

        try {
            jFmtdataDem.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setText("Cargo");

        jLabel5.setText("Data de admição");

        try {
            jFmtDataAdmicao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/confirmacao2.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnConfirmar);

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar2.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jBtnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnCancelar);

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel8.setText("Funcionarios Novo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel3)
                                .addGap(396, 396, 396))
                            .addComponent(jTxtNome, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTxtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jFmtDataAdmicao)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jFmtdataDem, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFmtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTxtSetor))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(275, 275, 275)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel7)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtDataAdmicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFmtdataDem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFmtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtCelularActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        // TODO add your handling code here:
          
       if (incluindo) {
                   setTitle("Inclusao");
             System.out.println("A variável booleana é verdadeira. Você está incluindo um novo funcionário.");
         MljfsFuncionarios funcionarios = viewBean();
         FuncionariosDAO funcionariosDAO = new FuncionariosDAO();
        funcionariosDAO.insert(funcionarios);
        setVisible(false);
       
        
        } else {
                   setTitle("Alteracao");
            System.out.println("A variável booleana é falsa. Você está alterando um funcionário existente.");
            MljfsFuncionarios funcionarios = viewBean();
            FuncionariosDAO funcionariosDAO = new FuncionariosDAO();
            funcionariosDAO.update(funcionarios);
            setVisible(false);
        }

        Util.limparCampos(jTxtId, jTxtNome, jTxtCargo, jFmtDataAdmicao, jFmtdataDem, jFmtCelular, jTxtSetor);
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        /*desabilitar();
        jBtnIncluir.setEnabled(true);
        jBtnPesquisar.setEnabled(true);

        limpardados();*/
        // Util.limparCampos(jTxtId, jTxtNome, jTxtCargo, jFmtDataAdmicao, jFmtdataDem, jFmtCelular, jTxtSetor);
        this.dispose();
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDlgFuncionariosNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgFuncionariosNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgFuncionariosNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgFuncionariosNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgFuncionariosNovoIA dialog = new JDlgFuncionariosNovoIA(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JFormattedTextField jFmtCelular;
    private javax.swing.JFormattedTextField jFmtDataAdmicao;
    private javax.swing.JFormattedTextField jFmtdataDem;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtCargo;
    private javax.swing.JTextField jTxtId;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtSetor;
    // End of variables declaration//GEN-END:variables
}
