/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soapsoft.Dao;
import com.soapsoft.Model.TbProveedor;
import com.soapsoft.Util.LlaveValor;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author PC
 */
public class TbProveedorDaoImpl extends GenericDaoImpl<TbProveedor, Integer> implements TbProveedorDao{
    
       public List<TbProveedor>  fn_consultar_todos_prove(){
          
            List<TbProveedor> resultado = null;

            try{ 

                String query = "SELECT Id, nit as Nit, razon_social as RazonSocial,telefono as Telefono, celular as Celular,direccion as Direccion, contacto as Contacto  FROM  tb_proveedor ORDER BY RazonSocial asc";

                ArrayList<LlaveValor> parametros = new ArrayList<>();

                resultado = this.Query(query, parametros,TbProveedor.class);

                } catch (Exception e) {
                    throw e;
                }

            return resultado;
          
       }
    
    
    
}
