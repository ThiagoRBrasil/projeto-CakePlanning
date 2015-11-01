package br.com.cakeplanning.componente.dao;

import br.com.cakeplanning.componente.Forma;
import br.com.cakeplanning.componente.Tamanho;
import br.com.cakeplanning.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 * 
 * @author Thiago Brasil
 */
public class TamanhoDAO {

    private Session sessao;
    private Transaction transacao;
    
    public void salvar(Tamanho tamanho){
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        transacao = sessao.beginTransaction();
        sessao.save(tamanho);
        transacao.commit();
        sessao.close();        
    }
    
    public void atualizar(Tamanho tamanho){
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        transacao = sessao.beginTransaction();
        sessao.update(tamanho);
        transacao.commit();
        sessao.close();        
    }
    
    public void excuir(Tamanho tamanho){
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(tamanho);
        transacao.commit();
        sessao.close();        
    }
    
    public List<Tamanho> listar(){
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        List<Tamanho> lista =
                sessao.createCriteria(Tamanho.class)
                .list();
        sessao.close();
        return lista;
    }
    
    public List<Tamanho> listar(String nome){
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        List<Tamanho> lista =
                sessao.createCriteria(Tamanho.class)
                .add(Restrictions.eq("nome", nome))
                .list();
        sessao.close();
        return lista;
    }
    
    public Tamanho listar(int id){
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        Tamanho t = (Tamanho)
                sessao.createCriteria(Tamanho.class)
                .add(Restrictions.eq("id", id))
                        .uniqueResult();
        sessao.close();
        return t;
    }

}
