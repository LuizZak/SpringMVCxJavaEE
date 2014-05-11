/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sp.senac.service;

import java.util.List;
import sp.senac.model.Veiculo;

/**
 *
 * @author Luiz Fernando
 */
public interface VeiculoService
{
    void adicionarVeiculo(Veiculo veiculo);
    void removerVeiculo(Veiculo veiculo);
    List<Veiculo> listarVeiculos();
}