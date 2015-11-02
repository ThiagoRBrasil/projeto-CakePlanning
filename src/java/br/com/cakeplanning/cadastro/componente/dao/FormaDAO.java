package br.com.cakeplanning.cadastro.componente.dao;

import br.com.cakeplanning.cadastro.componente.Forma;
import br.com.cakeplanning.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 * 
 * @author Thiago Brasil
 */
public class FormaDAO {

    private Session sessao;
    private Transaction transacao;
    
    public void salvar(Forma forma){
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        transacao = sessao.beginTransaction();
        sessao.save(forma);
        transacao.commit();
        sessao.close();        
    }
    
    public void atualizar(Forma forma){
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        transacao = sessao.beginTransaction();
        sessao.update(forma);
        transacao.commit();
        sessao.close();        
    }
    
    public void excuir(Forma forma){
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(forma);
        transacao.commit();
        sessao.close();        
    }
    
    public List<Forma> listar(){
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        List<Forma> lista =
                sessao.createCriteria(Forma.class)
                .list();
        sessao.close();
        return lista;
    }
    
    public List<Forma> listar(String nome){
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        List<Forma> lista =
                sessao.createCriteria(Forma.class)
                .add(Restrictions.eq("nome", nome))
                .list();
        sessao.close();
        return lista;
    }
    
    public Forma listar(int id){
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        Forma f = (Forma)
                sessao.createCriteria(Forma.class)
                .add(Restrictions.eq("id", id))
                        .uniqueResult();
        sessao.close();
        return f;
    }

}
