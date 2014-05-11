/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sp.senac.ejb;

import java.util.List;
import javax.ejb.Local;
import sp.senac.entidades.Veiculo;

/**
 *
 * @author Luiz Fernando
 */
@Local
public interface VeiculoEJBLocal
{
    void cadastrarVeiculo(Veiculo veiculo);
    List<Veiculo> listarVeiculos();
}