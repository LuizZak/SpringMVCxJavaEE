/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sp.senac.service.fakeimpl;

import java.util.ArrayList;
import java.util.List;
import sp.senac.model.Veiculo;
import sp.senac.service.VeiculoService;

/**
 *
 * @author Luiz Fernando
 */
public class VeiculoServiceFakeImpl implements VeiculoService
{
    List<Veiculo> listaInterna;

    public VeiculoServiceFakeImpl()
    {
        listaInterna = new ArrayList<>();
    }

    @Override
    public void adicionarVeiculo(Veiculo veiculo)
    {
        listaInterna.add(veiculo);
    }

    @Override
    public void removerVeiculo(Veiculo veiculo)
    {
        listaInterna.remove(veiculo);
    }

    @Override
    public List<Veiculo> listarVeiculos()
    {
        List<Veiculo> listaRetorno = new ArrayList<Veiculo>();
        
        listaRetorno.addAll(listaInterna);
        
        return listaRetorno;
    }
}