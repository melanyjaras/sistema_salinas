package bean;
// Generated 20/09/2023 18:06:06 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MljfsProdutos generated by hbm2java
 */
@Entity
@Table(name="mljfs_produtos"
    ,catalog="db_melany_salinas"
)
public class MljfsProdutos  implements java.io.Serializable {


     private int mljfsId;
     private String mljfsNome;
     private Double mljfsPreco;
     private int mljfsQuantidadeEmEstoque;
     private String mljfsDescricaoDoProduto;

    public MljfsProdutos() {
    }

	
    public MljfsProdutos(int mljfsId, String mljfsNome, Double mljfsPreco) {
        this.mljfsId = mljfsId;
        this.mljfsNome = mljfsNome;
        this.mljfsPreco = mljfsPreco;
    }
    public MljfsProdutos(int mljfsId, String mljfsNome, Double mljfsPreco, int mljfsQuantidadeEmEstoque, String mljfsDescricaoDoProduto) {
       this.mljfsId = mljfsId;
       this.mljfsNome = mljfsNome;
       this.mljfsPreco = mljfsPreco;
       this.mljfsQuantidadeEmEstoque = mljfsQuantidadeEmEstoque;
       this.mljfsDescricaoDoProduto = mljfsDescricaoDoProduto;
    }
   
     @Id 

    
    @Column(name="mljfs_id", unique=true, nullable=false)
    public int getMljfsId() {
        return this.mljfsId;
    }
    
    public void setMljfsId(int mljfsId) {
        this.mljfsId = mljfsId;
    }

    
    @Column(name="mljfs_nome", nullable=false)
    public String getMljfsNome() {
        return this.mljfsNome;
    }
    
    public void setMljfsNome(String mljfsNome) {
        this.mljfsNome = mljfsNome;
    }

    
    @Column(name="mljfs_preco", nullable=false, precision=10)
    public Double getMljfsPreco() {
        return this.mljfsPreco;
    }
    
    public void setMljfsPreco(Double mljfsPreco) {
        this.mljfsPreco = mljfsPreco;
    }

    
    @Column(name="mljfs_quantidade_em_estoque")
    public int getMljfsQuantidadeEmEstoque() {
        return this.mljfsQuantidadeEmEstoque;
    }
    
    public void setMljfsQuantidadeEmEstoque(int mljfsQuantidadeEmEstoque) {
        this.mljfsQuantidadeEmEstoque = mljfsQuantidadeEmEstoque;
    }

    
    @Column(name="mljfs_descricao_do_produto", length=55)
    public String getMljfsDescricaoDoProduto() {
        return this.mljfsDescricaoDoProduto;
    }
    
    public void setMljfsDescricaoDoProduto(String mljfsDescricaoDoProduto) {
        this.mljfsDescricaoDoProduto = mljfsDescricaoDoProduto;
    }




}


