/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sp.senac.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Luiz Fernando
 */
@Entity
@Table(name = "VEICULO")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Veiculo.findAll", query = "SELECT v FROM Veiculo v"),
    @NamedQuery(name = "Veiculo.findById", query = "SELECT v FROM Veiculo v WHERE v.id = :id"),
    @NamedQuery(name = "Veiculo.findByCor", query = "SELECT v FROM Veiculo v WHERE v.cor = :cor"),
    @NamedQuery(name = "Veiculo.findByFabricante", query = "SELECT v FROM Veiculo v WHERE v.fabricante = :fabricante"),
    @NamedQuery(name = "Veiculo.findByMarca", query = "SELECT v FROM Veiculo v WHERE v.marca = :marca"),
    @NamedQuery(name = "Veiculo.findByModelo", query = "SELECT v FROM Veiculo v WHERE v.modelo = :modelo"),
    @NamedQuery(name = "Veiculo.findByPreco", query = "SELECT v FROM Veiculo v WHERE v.preco = :preco")
})
public class Veiculo implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Size(max = 255)
    @Column(name = "COR")
    private String cor;
    @Size(max = 255)
    @Column(name = "FABRICANTE")
    private String fabricante;
    @Size(max = 255)
    @Column(name = "MARCA")
    private String marca;
    @Size(max = 255)
    @Column(name = "MODELO")
    private String modelo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRECO")
    private Double preco;

    public Veiculo()
    {
    }

    public Veiculo(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getCor()
    {
        return cor;
    }

    public void setCor(String cor)
    {
        this.cor = cor;
    }

    public String getFabricante()
    {
        return fabricante;
    }

    public void setFabricante(String fabricante)
    {
        this.fabricante = fabricante;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public Double getPreco()
    {
        return preco;
    }

    public void setPreco(Double preco)
    {
        this.preco = preco;
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
        return "sp.senac.ejb.Veiculo[ id=" + id + " ]";
    }
    
}
