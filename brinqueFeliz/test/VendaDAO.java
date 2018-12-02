
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nathaly
 */
public class VendaDAO {
    	String idVenda;
	int idCliente;
	int idProduto;
	int idVendedor;	
	Date dataVenda;

    public String getIdVenda() {
        return idVenda;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public VendaDAO(String idVenda, int idCliente, int idProduto, int idVendedor, Date dataVenda) {
        this.idVenda = idVenda;
        this.idCliente = idCliente;
        this.idProduto = idProduto;
        this.idVendedor = idVendedor;
        this.dataVenda = dataVenda;
    }

    public VendaDAO() {
    }
        
        
    
}
