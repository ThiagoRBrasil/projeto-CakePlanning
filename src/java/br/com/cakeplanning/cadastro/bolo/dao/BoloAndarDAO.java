package br.com.cakeplanning.cadastro.bolo.dao;

import br.com.cakeplanning.cadastro.bolo.BoloAndar;
import br.com.cakeplanning.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Thiago Brasil
 */
public class BoloAndarDAO {

    private Session sessao;
    private Transaction transacao;

    public void salvar(BoloAndar boloAndar) {
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        transacao = sessao.beginTransaction();
        sessao.save(boloAndar);
        transacao.commit();
        sessao.close();
    }

    public void atualizar(BoloAndar boloAndar) {
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        transacao = sessao.beginTransaction();
        sessao.update(boloAndar);
        transacao.commit();
        sessao.close();
    }

    public void excuir(BoloAndar boloAndar) {
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(boloAndar);
        transacao.commit();
        sessao.close();
    }

    public List<BoloAndar> listar() {
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        List<BoloAndar> lista
                = sessao.createCriteria(BoloAndar.class)
                .list();
        sessao.close();
        return lista;
    }

    public BoloAndar listar(int id) {
        sessao = HibernateUtil.getSessionFactory().
                openSession();
        BoloAndar t = (BoloAndar) sessao.createCriteria(BoloAndar.class)
                .add(Restrictions.eq("id", id))
                .uniqueResult();
        sessao.close();
        return t;
    }

}
