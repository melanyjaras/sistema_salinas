/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.MljfsUsuarios;
import dao.UsuariosDAO;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import tools.Util;

/**
 *
 * @author melany
 */
public class JDlgMljfsUsuarios extends javax.swing.JDialog {

    private boolean incluindo;
    MaskFormatter mascaraCPF, mascaraDataNascimento;
    private boolean alterando;

    public void setAlterando(boolean alterando) {
        this.alterando = alterando;
    }

    /**
     * Creates new form Cliente
     */
    public JDlgMljfsUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Usuarios");

        Util.habilitar(false, jBtnAltera, jBtnCancelar, jBtnConfirmar, jBtnExcluir, jBtnIncluir, jBtnPesquisar, jTxtId, jTxtNome, jTxtSobrenome, jTxtEmail, jTxtCargo, jTxtSalario, jFmtdataNasc, jFmtTelefone, jCboSetor, jPwfSenha);
        jBtnIncluir.setEnabled(true);
        jBtnPesquisar.setEnabled(true);
        try {
            mascaraCPF = new MaskFormatter("###.###.###-##");
            mascaraDataNascimento = new MaskFormatter("##/##/####");
        } catch (ParseException ex) {
            Logger.getLogger(JDlgMljfsUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private MljfsUsuarios viewBean() {
        MljfsUsuarios usuarios = new MljfsUsuarios();

        int id = Util.strInt(jTxtId.getText());
        usuarios.setMljfsId(id);
        usuarios.setMljfsNome(jTxtNome.getText());
        usuarios.setMljfsSobrenome(jTxtSobrenome.getText());
        usuarios.setMljfsEmail(jTxtEmail.getText());
        usuarios.setMljfsCargo(jTxtCargo.getText());
        Double salario = Util.strDouble(jTxtSalario.getText());
        usuarios.setMljfsSalario(salario);
        Date dataNascimento = Util.StrDate(jFmtdataNasc.getText());
        usuarios.setMljfsDataNascimento(dataNascimento);
        usuarios.setMljfsTelefone(jFmtTelefone.getText());
        if ((jCboSetor.getSelectedIndex() == 1)) {
            usuarios.setMljfsSetor("administracao");
        } else if ((jCboSetor.getSelectedIndex() == 2)) {
            usuarios.setMljfsSetor("recursos humanos");
        } else if ((jCboSetor.getSelectedIndex() == 3)) {
            usuarios.setMljfsSetor("financeiro");
        } else if ((jCboSetor.getSelectedIndex() == 4)) {
            usuarios.setMljfsSetor("contabil");
        } else if ((jCboSetor.getSelectedIndex() == 5)) {
            usuarios.setMljfsSetor("marketing e vendas");
        } else if ((jCboSetor.getSelectedIndex() == 6)) {
            usuarios.setMljfsSetor("producao");
        } else if ((jCboSetor.getSelectedIndex() == 7)) {
            usuarios.setMljfsSetor("logistica");
        } else if ((jCboSetor.getSelectedIndex() == 8)) {
            usuarios.setMljfsSetor("tecnologia da informacao");
        } else if ((jCboSetor.getSelectedIndex() == 9)) {
            usuarios.setMljfsSetor("juridico");
        } else if ((jCboSetor.getSelectedIndex() == 10)) {
            usuarios.setMljfsSetor("pesquisa");
        } else if ((jCboSetor.getSelectedIndex() == 11)) {
            usuarios.setMljfsSetor("compras");
        } else if ((jCboSetor.getSelectedIndex() == 12)) {
            usuarios.setMljfsSetor("suprimentos");
        } else {
            usuarios.setMljfsSetor("atendimento ao cliente");
        }
        usuarios.setMljfsSenha(jPwfSenha.getText());

        return usuarios;

    }

    public void beanView(MljfsUsuarios usuarios) {
        jTxtId.setText(Util.intStr(usuarios.getMljfsId()));
        jTxtNome.setText(usuarios.getMljfsNome());
        jTxtSobrenome.setText(usuarios.getMljfsSobrenome());
        jTxtEmail.setText(usuarios.getMljfsEmail());
        jTxtCargo.setText(usuarios.getMljfsCargo());
        jTxtSalario.setText(Util.doubleStr(usuarios.getMljfsSalario()));
        jFmtdataNasc.setText(Util.dateStr(usuarios.getMljfsDataNascimento()));
        jFmtTelefone.setText(usuarios.getMljfsTelefone());
        String setor = usuarios.getMljfsSetor();
        if (setor.equals("administracao")) {
            jCboSetor.setSelectedIndex(1);
        } else if (setor.equals("recursos humanos")) {
            jCboSetor.setSelectedIndex(2);
        } else if (setor.equals("financeiro")) {
            jCboSetor.setSelectedIndex(3);
        } else if (setor.equals("contabil")) {
            jCboSetor.setSelectedIndex(4);
        } else if (setor.equals("marketing e vendas")) {
            jCboSetor.setSelectedIndex(5);
        } else if (setor.equals("producao")) {
            jCboSetor.setSelectedIndex(6);
        } else if (setor.equals("logistica")) {
            jCboSetor.setSelectedIndex(7);
        } else if (setor.equals("tecnologia da informacao")) {
            jCboSetor.setSelectedIndex(8);
        } else if (setor.equals("juridico")) {
            jCboSetor.setSelectedIndex(9);
        } else if (setor.equals("pesquisa")) {
            jCboSetor.setSelectedIndex(10);
        } else if (setor.equals("compras")) {
            jCboSetor.setSelectedIndex(11);
        } else if (setor.equals("suprimentos")) {
            jCboSetor.setSelectedIndex(12);
        } else {
            jCboSetor.setSelectedIndex(-1);
        }
        jPwfSenha.setText(usuarios.getMljfsSenha());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtSobrenome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBtnIncluir = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnAltera = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTxtId = new javax.swing.JTextField();
        jPwfSenha = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jFmtdataNasc = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jTxtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTxtCargo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTxtSalario = new javax.swing.JTextField();
        jFmtTelefone = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jCboSetor = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nome");

        jTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Sobrenome");

        jLabel3.setText("Salario");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel5.setText("Cadastro de Usuario");

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar3.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir2 (2).png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar2.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnAltera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        jBtnAltera.setText("Alterar");
        jBtnAltera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlteraActionPerformed(evt);
            }
        });

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/confirmacao2.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jLabel6.setText("Id");

        jTxtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtIdActionPerformed(evt);
            }
        });

        jPwfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPwfSenhaActionPerformed(evt);
            }
        });

        jLabel7.setText("Data de Nacimento");

        try {
            jFmtdataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFmtdataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtdataNascActionPerformed(evt);
            }
        });

        jLabel8.setText("Email");

        jTxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEmailActionPerformed(evt);
            }
        });

        jLabel9.setText("Cargo");

        jLabel10.setText("Senha");

        try {
            jFmtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel11.setText("Celular");

        jLabel12.setText("Setor");

        jCboSetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "administracao", "recursos humanos", "financeiro", "contabil", "marketing e vendas", "producao", "logística", "tecnologia da informacao", "juridico", "pesquisa", "compras", "suprimentos", "atendimento ao cliente" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFmtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCboSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jPwfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTxtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnAltera, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabel1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(121, 121, 121)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(103, 103, 103)
                                .addComponent(jLabel7)
                                .addGap(0, 21, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTxtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFmtdataNasc)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFmtdataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFmtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPwfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCboSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAltera))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnPesquisar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:    
        Util.habilitar(true, jBtnAltera, jBtnCancelar, jBtnConfirmar, jBtnExcluir, jBtnIncluir, jBtnPesquisar, jTxtId, jTxtNome, jTxtSobrenome, jTxtEmail, jTxtCargo, jTxtSalario, jFmtdataNasc, jFmtTelefone, jCboSetor, jPwfSenha);
        jBtnIncluir.setEnabled(false);
        jBtnExcluir.setEnabled(false);
        jBtnPesquisar.setEnabled(false);
        jBtnAltera.setEnabled(false);
        incluindo = true;
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null, "Deseja excluir o Usuario?",
                "Exclusão", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            MljfsUsuarios usuarios = viewBean();
            UsuariosDAO usuarios_DAO = new UsuariosDAO();
            usuarios_DAO.delete(usuarios);
            JOptionPane.showMessageDialog(null, "Exclusão realizada!.");

        } else {
            Util.mensagem("Exclusão cancelada.");
        }

        //limparDados();
        Util.habilitar(false, jBtnAltera, jBtnCancelar, jBtnConfirmar, jBtnExcluir, jBtnIncluir, jBtnPesquisar, jTxtId, jTxtNome, jTxtSobrenome, jTxtEmail, jTxtCargo, jTxtSalario, jFmtdataNasc, jFmtTelefone, jCboSetor, jPwfSenha);
        jBtnIncluir.setEnabled(true);
        jBtnPesquisar.setEnabled(true);
        Util.limparCampos(jTxtId, jTxtNome, jTxtSobrenome, jTxtEmail, jTxtCargo, jTxtSalario, jFmtdataNasc, jFmtTelefone, jCboSetor, jPwfSenha);
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        Util.habilitar(false, jBtnAltera, jBtnCancelar, jBtnConfirmar, jBtnExcluir, jBtnIncluir, jBtnPesquisar, jTxtId, jTxtNome, jTxtSobrenome, jTxtEmail, jTxtCargo, jTxtSalario, jFmtdataNasc, jFmtTelefone, jCboSetor, jPwfSenha);
        jBtnIncluir.setEnabled(true);
        jBtnPesquisar.setEnabled(true);

        Util.limparCampos(jTxtId, jTxtNome, jTxtSobrenome, jTxtEmail, jTxtCargo, jTxtSalario, jFmtdataNasc, jFmtTelefone, jCboSetor, jPwfSenha);
        // limparDados();
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnAlteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlteraActionPerformed
        incluindo = false;
        Util.habilitar(true, jBtnAltera, jBtnCancelar, jBtnConfirmar, jBtnExcluir, jBtnIncluir, jBtnPesquisar, jTxtId, jTxtNome, jTxtSobrenome, jTxtEmail, jTxtCargo, jTxtSalario, jFmtdataNasc, jFmtTelefone, jCboSetor, jPwfSenha);

        Util.habilitar(false, jBtnAltera, jBtnCancelar, jBtnConfirmar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
        jBtnCancelar.setEnabled(true);
        jBtnConfirmar.setEnabled(true);
    }//GEN-LAST:event_jBtnAlteraActionPerformed

    private void jTxtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtIdActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        // TODO add your handling code here:

        Util.habilitar(false, jBtnAltera, jBtnCancelar, jBtnConfirmar, jBtnExcluir, jBtnIncluir, jBtnPesquisar, jTxtId, jTxtNome, jTxtSobrenome, jTxtEmail, jTxtCargo, jTxtSalario, jFmtdataNasc, jFmtTelefone, jCboSetor, jPwfSenha);
        jBtnIncluir.setEnabled(true);
        jBtnPesquisar.setEnabled(true);
        jBtnCancelar.setEnabled(false);

        MljfsUsuarios usuarios = viewBean();//constroi o bean

        UsuariosDAO usuarios_DAO = new UsuariosDAO();//constroi o dao
        if (incluindo == true) {
            usuarios_DAO.insert(usuarios);
            Util.mensagem("Usuario adicionado com sucesso!");
        } else {
            usuarios_DAO.update(usuarios);
            Util.mensagem("Usuario alterado!");
        }

        Util.limparCampos(jTxtId, jTxtNome, jTxtSobrenome, jTxtEmail, jTxtCargo, jTxtSalario, jFmtdataNasc, jFmtTelefone, jCboSetor, jPwfSenha);
        //limparDados();

    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jPwfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPwfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPwfSenhaActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        // TODO add your handling code here:

        JDlgMljfsUsuariosPesquisa jDlgUsuariosPesquisa = new JDlgMljfsUsuariosPesquisa(null, true);
        jDlgUsuariosPesquisa.setTelaAnterior(this);
        jDlgUsuariosPesquisa.setVisible(true);
        if (alterando) {
            Util.habilitar(false, jBtnAltera, jBtnCancelar, jBtnConfirmar, jBtnExcluir, jBtnIncluir, jBtnPesquisar, jTxtId, jTxtNome, jTxtSobrenome, jTxtEmail, jTxtCargo, jTxtSalario, jFmtdataNasc, jFmtTelefone, jCboSetor, jPwfSenha);
            jBtnIncluir.setEnabled(true);
            jBtnPesquisar.setEnabled(true);
            jBtnAltera.setEnabled(true);
            jBtnExcluir.setEnabled(true);
            jBtnCancelar.setEnabled(true);
        } else {
            Util.habilitar(false, jBtnAltera, jBtnCancelar, jBtnConfirmar, jBtnExcluir, jBtnIncluir, jBtnPesquisar, jTxtId, jTxtNome, jTxtSobrenome, jTxtEmail, jTxtCargo, jTxtSalario, jFmtdataNasc, jFmtTelefone, jCboSetor, jPwfSenha);
            jBtnIncluir.setEnabled(true);
            jBtnPesquisar.setEnabled(true);
        }
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNomeActionPerformed

    private void jFmtdataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtdataNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtdataNascActionPerformed

    private void jTxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEmailActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgMljfsUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgMljfsUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgMljfsUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgMljfsUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgMljfsUsuarios dialog = new JDlgMljfsUsuarios(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnAltera;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JComboBox<String> jCboSetor;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JFormattedTextField jFmtTelefone;
    private javax.swing.JFormattedTextField jFmtdataNasc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPwfSenha;
    private javax.swing.JTextField jTxtCargo;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtId;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtSalario;
    private javax.swing.JTextField jTxtSobrenome;
    // End of variables declaration//GEN-END:variables
}
