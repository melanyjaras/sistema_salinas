/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.MljfsUsuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Melany
 */
public class UsuariosDAO extends DAO_Abstract {
 public MljfsUsuarios buscarUsuarioPorNomeESenha(String nome, String senha) {

        MljfsUsuarios usuarios = null;

        //url = "jdbc:mysql://10.7.0.51:33062/db_melany_salinas";
        //user = "melany_salinas";
        //password = "melany_salinas";

        String url = "jdbc:mysql://10.7.0.51:33062/db_eduardo_aguero";
        String user = "eduardo_aguero";
        String password = "eduardo_aguero";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt = DriverManager.getConnection(url, user, password);

            String sql = "SELECT * FROM usuarios WHERE apelido = ? AND senha = ?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setString(1, nome);
            pstm.setString(2, senha);

            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                usuarios = new MljfsUsuarios();
                usuarios.setMljfsSobrenome(rs.getString("sobrenome"));
                //usuarios.setSenha(rs.getString("senha"));
            }

            rs.close();
            pstm.close();
            cnt.close();

        } catch (SQLException ex) {
         Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
     }

        return usuarios;
    }

    @Override
    public void insert(Object object) {
        //para ter uma transacao com o hibernate e finalizar com commit
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();//grava tudo precisa pq ele quer dar erro ao pegar as informacoes do bd
        session.clear();//limpa
        session.delete(object);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MljfsUsuarios.class);
        criteria.add(Restrictions.eq("idusuarios", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MljfsUsuarios.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

}
