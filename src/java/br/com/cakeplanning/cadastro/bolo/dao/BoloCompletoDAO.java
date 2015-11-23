package br.com.cakeplanning.cadastro.bolo.dao;

import br.com.cakeplanning.cadastro.bolo.BoloCompleto;
import br.com.cakeplanning.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Thiago Brasil
 */
public class BoloCompletoDAO {

    private Session sessao;
    private Transaction transacao;

    public void salvar(BoloCompleto boloCompleto) {
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        transacao = sessao.beginTransaction();
        sessao.save(boloCompleto);
        transacao.commit();
        sessao.close();
    }

    public void atualizar(BoloCompleto boloCompleto) {
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        transacao = sessao.beginTransaction();
        sessao.update(boloCompleto);
        transacao.commit();
        sessao.close();
    }

    public void excluir(BoloCompleto boloCompleto) {
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(boloCompleto);
        transacao.commit();
        sessao.close();
    }

    public List<BoloCompleto> listar() {
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        List<BoloCompleto> lista
                = sessao.createCriteria(BoloCompleto.class)
                .list();
        sessao.close();
        return lista;
    }

    public BoloCompleto listar(int id) {
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        BoloCompleto t = (BoloCompleto) sessao.createCriteria(BoloCompleto.class)
                .add(Restrictions.eq("id", id))
                .uniqueResult();
        sessao.close();
        return t;
    }

}
