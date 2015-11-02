package br.com.cakeplanning.cadastro.componente.dao;

import br.com.cakeplanning.cadastro.componente.Recheio;
import br.com.cakeplanning.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 * 
 * @author Thiago Brasil
 */
public class RecheioDAO {

    private Session sessao;
    private Transaction transacao;
    
    public void salvar(Recheio recheio){
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        transacao = sessao.beginTransaction();
        sessao.save(recheio);
        transacao.commit();
        sessao.close();        
    }
    
    public void atualizar(Recheio recheio){
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        transacao = sessao.beginTransaction();
        sessao.update(recheio);
        transacao.commit();
        sessao.close();        
    }
    
    public void excuir(Recheio recheio){
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(recheio);
        transacao.commit();
        sessao.close();        
    }
    
    public List<Recheio> listar(){
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        List<Recheio> lista =
                sessao.createCriteria(Recheio.class)
                .list();
        sessao.close();
        return lista;
    }
    
    public List<Recheio> listar(String nome){
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        List<Recheio> lista =
                sessao.createCriteria(Recheio.class)
                .add(Restrictions.eq("nome", nome))
                .list();
        sessao.close();
        return lista;
    }
    
    public Recheio listar(int id){
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        Recheio r = (Recheio)
                sessao.createCriteria(Recheio.class)
                .add(Restrictions.eq("id", id))
                        .uniqueResult();
        sessao.close();
        return r;
    }

}
