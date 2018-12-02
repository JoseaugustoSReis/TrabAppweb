/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nathaly
 */
public class ProdutoDAO {

    int idProduto;
    String nomeProduto;
    Double valorProduto;
    String descricao;
    //Data imagem;
    int vendido; //incremento ranking mais vendido
    //list busca

    public int getIdProduto() {
        return idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public Double getValorProduto() {
        return valorProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getVendido() {
        return vendido;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    
    

    public ProdutoDAO() {
    }
    
    public ProdutoDAO(int idProduto, String nomeProduto, Double valorProduto, String descricao, int vendido) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.descricao = descricao;
        this.vendido = vendido;
    }
}
