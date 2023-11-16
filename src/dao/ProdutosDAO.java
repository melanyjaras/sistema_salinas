/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.MljfsProdutos;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Melany
 */
public class ProdutosDAO extends DAO_Abstract{
    
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
        Criteria criteria = session.createCriteria(MljfsProdutos.class);
        criteria.add(Restrictions.eq("mlfjsId", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MljfsProdutos.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public List listNomeQuantidade(String nome, int quantidade){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MljfsProdutos.class);
        if(nome.equals("") && quantidade != 0){
            criteria.add(Restrictions.le("mljfsQuantidadeEmEstoque", quantidade));
        } else 
         if(quantidade == 0 && !nome.equals("")){
             criteria.add(Restrictions.ilike("mljfsNome", "%" + nome + "%" ));
         } else{
        criteria.add(Restrictions.ilike("mljfsNome", "%" + nome + "%" ));
        criteria.add(Restrictions.le("mljfsQuantidadeEmEstoque", quantidade));}
        List results = criteria.list();
        session.getTransaction().commit();
        return results;
    }
}
