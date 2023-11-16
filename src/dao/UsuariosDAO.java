/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.MljfsUsuarios;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Melany
 */
public class UsuariosDAO extends DAO_Abstract {
 public MljfsUsuarios buscarUsuarioPorNomeESenha(String sobrenome, String senha) {

    session.beginTransaction();
    
    Query query = session.createQuery("FROM MljfsUsuarios WHERE mljfs_sobrenome = :mljfs_sobrenome AND mljfs_senha = :mljfs_senha");
    query.setParameter("mljfs_sobrenome", sobrenome);
    query.setParameter("mljfs_senha", senha);
    
    MljfsUsuarios usuario = (MljfsUsuarios) query.uniqueResult();
    
    session.getTransaction().commit();
    
    return usuario;
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
        criteria.add(Restrictions.eq("mljfsId", id));
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
    public List listNomeSetor(String nome, String setor){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MljfsUsuarios.class);
        if(nome.equals("") && !setor.equals(" ")){
            criteria.add(Restrictions.eq("mljfsSetor", setor));
        } else 
         if(setor.equals(" ") && !nome.equals("")){
             criteria.add(Restrictions.ilike("mljfsNome", "%" + nome + "%" ));
         } else{
        criteria.add(Restrictions.ilike("mljfsNome", "%" + nome + "%" ));
        criteria.add(Restrictions.eq("mljfsSetor", setor));}
        List results = criteria.list();
        session.getTransaction().commit();
        return results;
    }

}
