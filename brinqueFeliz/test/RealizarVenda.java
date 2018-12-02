
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static javax.accessibility.AccessibleRole.LIST;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nathaly
 */
public class RealizarVenda {

    ProdutoDAO produto = new ProdutoDAO();
    VendedorDAO vendedor = new VendedorDAO();
    VendaDAO venda = new VendaDAO();
    ClienteDAO cliente = new ClienteDAO();

    public void NovaVenda(ProdutoDAO produto, int quantidadeDeCada, ClienteDAO cliente, VendedorDAO vendedor) {
        Date dataVenda = new Date();
        int qtd = quantidadeDeCada;
        produto.vendido++;

        //SQL com dados da venda
        //this.repositorio.CadastrarNovaVenda(produto, dataVenda, quantidade, cliente, vendedor);
    }

    public List<ProdutoDAO> PesquisarProdutos(ProdutoDAO p) throws Exception {
        /* Define a SQL */
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT nome ");
        sql.append("FROM produto ");
        sql.append("WHERE nome LIKE ? ");
        sql.append("ORDER BY nome ");

//        Connection conn = Conexao.abrir();

        /* Executa a SQL e captura o resultado da consulta */
        //ResultSet resultado = Comando.executeQuery();

        /* Cria uma lista para armazenar o resultado da consulta */
        List<ProdutoDAO> lista = new ArrayList<ProdutoDAO>();

        /* Percorre o resultado armazenando os valores em uma lista */
//        while (resultado.next()) {
//            /* Cria um objeto para armazenar uma linha da consulta */
//            ProdutoDAO linha = new ProdutoDAO();
//            linha.setIdProduto(resultado.getInt("idProduto"));
//            linha.setNomeProduto(resultado.getString("nome"));
//
//
//            /* Armazena a linha lida em uma lista */
//            lista.add(linha);
//        }

        /* Fecha a conexão */
//        resultado.close();
//        Comando.close();
//        conn.close();

        /* Retorna a lista contendo o resultado da consulta */
        return lista;

        //http://respostas.guj.com.br/36971-como-retornar-uma-pesquisa-no-banco-de-dados-em-um-textfield
    }
}


