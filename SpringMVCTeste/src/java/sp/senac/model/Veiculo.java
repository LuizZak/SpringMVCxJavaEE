/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sp.senac.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Luiz Fernando
 */
@Entity
@NamedQuery(name = "Veiculo.findAll", query = "SELECT v FROM Veiculo v")
public class Veiculo implements Serializable
{
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Size(max = 255)
    @Column(name = "MODELO")
    private String modelo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRECO")
    private Double preco;
    @Size(max = 255)
    @Column(name = "COR")
    private String cor;
    @Size(max = 255)
    @Column(name = "MARCA")
    private String marca;
    @Size(max = 255)
    @Column(name = "FABRICANTE")
    private String fabricante;
    
    /**
     * @return the id
     */
    public Long getId()
    {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id)
    {
        this.id = id;
    }
    
    /**
     * @return the modelo
     */
    public String getModelo()
    {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    /**
     * @return the preco
     */
    public Double getPreco()
    {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(Double preco)
    {
        this.preco = preco;
    }

    /**
     * @return the cor
     */
    public String getCor()
    {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor)
    {
        this.cor = cor;
    }

    /**
     * @return the marca
     */
    public String getMarca()
    {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    /**
     * @return the fabricante
     */
    public String getFabricante()
    {
        return fabricante;
    }

    /**
     * @param fabricante the fabricante to set
     */
    public void setFabricante(String fabricante)
    {
        this.fabricante = fabricante;
    }

    public Veiculo()
    {
    }

    public Veiculo(Long id)
    {
        this.id = id;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Veiculo))
        {
            return false;
        }
        Veiculo other = (Veiculo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "sp.senac.model.Veiculo[ id=" + id + " ]";
    }
}