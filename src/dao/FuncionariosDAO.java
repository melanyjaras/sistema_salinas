/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.MljfsFuncionarios;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Melany
 */
public class FuncionariosDAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        session.beginTransaction(); // É obrigatorio ter a transação com o hibernate e terminar com commit().
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
        session.delete(object);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MljfsFuncionarios.class);
        criteria.add(Restrictions.eq("mljfsId", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MljfsFuncionarios.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

     public List listNomeSalario(String nome, String cargo){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MljfsFuncionarios.class);
         if(nome.equals("") && !cargo.equals("")){
             criteria.add(Restrictions.ilike("mljfsCargo","%" +cargo + "%" ));
         }else if(!nome.equals("") && cargo.equals("")){
        criteria.add(Restrictions.ilike("mljfsNome", "%" + nome + "%" ));}
         else{
             criteria.add(Restrictions.ilike("mljfsNome", "%" + nome + "%" ));
         criteria.add(Restrictions.ilike("mljfsCargo","%" + cargo + "%" ));
         }
        List results = criteria.list();
        session.getTransaction().commit();
        return results;
    }
}
