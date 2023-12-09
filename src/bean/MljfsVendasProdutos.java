package bean;
// Generated 05/12/2023 08:44:27 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * MljfsVendasProdutos generated by hbm2java
 */
@Entity
@Table(name="mljfs_vendas_produtos"
    ,catalog="db_melany_salinas"
)
public class MljfsVendasProdutos  implements java.io.Serializable {


     private int mljfsId;
     private MljfsProdutos mljfsProdutos;
     private MljfsVendas mljfsVendas;
     private int mljfsQuantidade;
     private Double mljfsPrecoUnitario;

    public MljfsVendasProdutos() {
    }

	
    public MljfsVendasProdutos(int mljfsId) {
        this.mljfsId = mljfsId;
    }
    public MljfsVendasProdutos(int mljfsId, MljfsProdutos mljfsProdutos, MljfsVendas mljfsVendas, int mljfsQuantidade, Double mljfsPrecoUnitario) {
       this.mljfsId = mljfsId;
       this.mljfsProdutos = mljfsProdutos;
       this.mljfsVendas = mljfsVendas;
       this.mljfsQuantidade = mljfsQuantidade;
       this.mljfsPrecoUnitario = mljfsPrecoUnitario;
    }
   
     @Id 

    
    @Column(name="mljfs_id", unique=true, nullable=false)
    public int getMljfsId() {
        return this.mljfsId;
    }
    
    public void setMljfsId(int mljfsId) {
        this.mljfsId = mljfsId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_mljfs_produto")
    public MljfsProdutos getMljfsProdutos() {
        return this.mljfsProdutos;
    }
    
    public void setMljfsProdutos(MljfsProdutos mljfsProdutos) {
        this.mljfsProdutos = mljfsProdutos;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_mljfs_vendas")
    public MljfsVendas getMljfsVendas() {
        return this.mljfsVendas;
    }
    
    public void setMljfsVendas(MljfsVendas mljfsVendas) {
        this.mljfsVendas = mljfsVendas;
    }

    
    @Column(name="mljfs_quantidade")
    public int getMljfsQuantidade() {
        return this.mljfsQuantidade;
    }
    
    public void setMljfsQuantidade(int mljfsQuantidade) {
        this.mljfsQuantidade = mljfsQuantidade;
    }

    
    @Column(name="mljfs_preco_unitario", precision=10)
    public Double getMljfsPrecoUnitario() {
        return this.mljfsPrecoUnitario;
    }
    
    public void setMljfsPrecoUnitario(Double mljfsPrecoUnitario) {
        this.mljfsPrecoUnitario = mljfsPrecoUnitario;
    }




}


