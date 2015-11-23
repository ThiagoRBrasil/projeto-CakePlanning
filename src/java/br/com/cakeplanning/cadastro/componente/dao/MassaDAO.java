package br.com.cakeplanning.cadastro.componente.dao;

import br.com.cakeplanning.cadastro.componente.Massa;
import br.com.cakeplanning.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 * 
 * @author Thiago Brasil
 */
public class MassaDAO {

    private Session sessao;
    private Transaction transacao;
    
    public void salvar(Massa massa){
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        transacao = sessao.beginTransaction();
        sessao.save(massa);
        transacao.commit();
        sessao.close();        
    }
    
    public void atualizar(Massa massa){
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        transacao = sessao.beginTransaction();
        sessao.update(massa);
        transacao.commit();
        sessao.close();        
    }
    
    public void excluir(Massa massa){
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(massa);
        transacao.commit();
        sessao.close();        
    }
    
    public List<Massa> listar(){
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        List<Massa> lista =
                sessao.createCriteria(Massa.class)
                .list();
        sessao.close();
        return lista;
    }
    
    public List<Massa> listar(String nome){
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        List<Massa> lista =
                sessao.createCriteria(Massa.class)
                .add(Restrictions.eq("nome", nome))
                .list();
        sessao.close();
        return lista;
    }
    
    public Massa listar(int id){
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        Massa m = (Massa)
                sessao.createCriteria(Massa.class)
                .add(Restrictions.eq("id", id))
                        .uniqueResult();
        sessao.close();
        return m;
    }

}
