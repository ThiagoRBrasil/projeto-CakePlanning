package br.com.cakeplanning.usuario.dao;

import br.com.cakeplanning.usuario.Usuario;
import br.com.cakeplanning.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 * 
 * @author Thiago Brasil
 */
public class UsuarioDAO {

    private Session sessao;
    private Transaction transacao;
    
    public void salvar(Usuario usuario){
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        transacao = sessao.beginTransaction();
        sessao.save(usuario);
        transacao.commit();
        sessao.close();        
    }
    
    public void atualizar(Usuario usuario){
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        transacao = sessao.beginTransaction();
        sessao.update(usuario);
        transacao.commit();
        sessao.close();        
    }
    
    public void excuir(Usuario usuario){
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(usuario);
        transacao.commit();
        sessao.close();        
    }
    
    public List<Usuario> listar(){
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        List<Usuario> lista =
                sessao.createCriteria(Usuario.class)
                .list();
        sessao.close();
        return lista;
    }
    
    public List<Usuario> listar(String nome){
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        List<Usuario> lista =
                sessao.createCriteria(Usuario.class)
                .add(Restrictions.eq("nome", nome))
                .list();
        sessao.close();
        return lista;
    }
    
    public Usuario listar(int id){
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        Usuario t = (Usuario)
                sessao.createCriteria(Usuario.class)
                .add(Restrictions.eq("id", id))
                        .uniqueResult();
        sessao.close();
        return t;
    }

}
