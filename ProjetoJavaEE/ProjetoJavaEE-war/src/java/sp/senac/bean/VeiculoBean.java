/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sp.senac.bean;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import sp.senac.ejb.VeiculoEJBLocal;
import sp.senac.entidades.Veiculo;

/**
 *
 * @author Luiz Fernando
 */
@ManagedBean
@SessionScoped
public class VeiculoBean implements Serializable
{
    private Veiculo veiculo;
    private List<Veiculo> listaVeiculo;
    
    @EJB
    private VeiculoEJBLocal veiculoEJB;
    
    public String telaCadastroVeiculo()    
    {
        setVeiculo(new Veiculo());
        
        return "telaCadastrarVeiculo";
    }
    
    public String telaListarVeiculos()
    {
        setListaVeiculo(veiculoEJB.listarVeiculos());
        
        return "./veiculo/listar.xhtml";
    }
    
    public String cadastrar()
    {
        veiculoEJB.cadastrarVeiculo(veiculo);
        
        return "telaVeiculoPrincipal";
    }
    
    /**
     * @return the veiculo
     */
    public Veiculo getVeiculo()
    {
        return veiculo;
    }

    /**
     * @param veiculo the veiculo to set
     */
    public void setVeiculo(Veiculo veiculo)
    {
        this.veiculo = veiculo;
    }

    /**
     * @return the listaVeiculo
     */
    public List<Veiculo> getListaVeiculo()
    {
        return listaVeiculo;
    }

    /**
     * @param listaVeiculo the listaVeiculo to set
     */
    public void setListaVeiculo(List<Veiculo> listaVeiculo)
    {
        this.listaVeiculo = listaVeiculo;
    }

    /**
     * @return the veiculoEJB
     */
    public VeiculoEJBLocal getVeiculoEJB()
    {
        return veiculoEJB;
    }

    /**
     * @param veiculoEJB the veiculoEJB to set
     */
    public void setVeiculoEJB(VeiculoEJBLocal veiculoEJB)
    {
        this.veiculoEJB = veiculoEJB;
    }
    
    
}
