/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nathaly
 */
public class VendedorDAO {
    int idVendedor;
    String nomeVendedor;

    VendedorDAO() {
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }
        
        

    public VendedorDAO(int idVendedor, String nomeVendedor) {
        this.idVendedor = idVendedor;
        this.nomeVendedor = nomeVendedor;
    }
}
