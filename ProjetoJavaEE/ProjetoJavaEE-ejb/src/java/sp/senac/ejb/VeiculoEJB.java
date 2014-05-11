/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sp.senac.ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import sp.senac.entidades.Veiculo;

/**
 *
 * @author Luiz Fernando
 */
@Stateless
public class VeiculoEJB implements VeiculoEJBLocal
{
    @PersistenceContext
    private EntityManager em;
    
    @Override
    public void cadastrarVeiculo(Veiculo veiculo)
    {
        getEm().persist(veiculo);
    }

    @Override
    public List<Veiculo> listarVeiculos()
    {
        Query query = getEm().createNamedQuery("Veiculo.findAll");
        
        return query.getResultList();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    /**
     * @return the em
     */
    public EntityManager getEm()
    {
        return em;
    }

    /**
     * @param em the em to set
     */
    public void setEm(EntityManager em)
    {
        this.em = em;
    }
}
