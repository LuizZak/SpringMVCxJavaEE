/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sp.senac.service.jpa;

import java.util.List;
import sp.senac.model.Veiculo;
import sp.senac.service.VeiculoService;

import javax.persistence.*;

/**
 *
 * @author Luiz Fernando
 */
public class VeiculoServiceJPA implements VeiculoService
{
    @PersistenceContext
    EntityManager em;
    
    @Override
    public void adicionarVeiculo(Veiculo veiculo)
    {
        em.persist(veiculo);
    }

    @Override
    public void removerVeiculo(Veiculo veiculo)
    {
        em.remove(veiculo);
    }

    @Override
    public List<Veiculo> listarVeiculos()
    {
        Query query = em.createNamedQuery("Veiculo.findAll");
        
        return query.getResultList();
    }
}