/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soapsoft.services;

import com.soapsoft.Dao.TbProveedorDaoImpl;
import com.soapsoft.Model.TbProveedor;
import java.util.Date;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author PC
 */
@WebService(serviceName = "SVR_PROVEEDORES")
public class SVR_PROVEEDORES {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "fn_insertar")
    public String fn_insertar(@WebParam(name = "nit") String nit, @WebParam(name = "razon_social") String razon_social, @WebParam(name = "contacto") String contacto, @WebParam(name = "telefono") String telefono, @WebParam(name = "celular") String celular, @WebParam(name = "direccion") String direccion, @WebParam(name = "estado") boolean estado, @WebParam(name = "creadoPor") String creadoPor) {
        //TODO write your implementation code here:
        
        TbProveedor obj = new TbProveedor(nit, razon_social, contacto, telefono, celular, direccion, estado, creadoPor, new Date());
        
        try {
            TbProveedorDaoImpl dao = new TbProveedorDaoImpl();
            dao.create(obj);
            return "Se insertó el cliente";
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "fn_borrar")
    public String fn_borrar(@WebParam(name = "ID") int ID) {
        //TODO write your implementation code here:
         try {
            TbProveedorDaoImpl dao = new TbProveedorDaoImpl();
            TbProveedor obj = dao.findById(ID);
            
            if(obj != null){
                dao.delete(obj);
                return "Se eliminó el cliente";
            }else{
                return "El cliente no existe";
            }
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    @WebMethod(operationName = "fn_modificar")
    public String fn_modificar( 
            @WebParam(name = "ID") int ID,
            @WebParam(name = "nit") String nit, 
            @WebParam(name = "razon_social") String razon_social, 
            @WebParam(name = "contacto") String contacto, 
            @WebParam(name = "telefono") String telefono, 
            @WebParam(name = "celular") String celular, 
            @WebParam(name = "direccion") String direccion, 
            @WebParam(name = "estado") boolean estado, 
            @WebParam(name = "creadoPor") String creadoPor, 
            @WebParam(name = "modificadoPor") String modificadoPor
    ) {
        //TODO write your implementation code here:
       
        try {
            TbProveedorDaoImpl dao = new TbProveedorDaoImpl();
            TbProveedor obj_modificar = dao.findById(ID);
            
            if(obj_modificar != null){
                
                obj_modificar.setNit(nit);
                obj_modificar.setRazonSocial(razon_social);
                obj_modificar.setContacto(contacto);
                obj_modificar.setCelular(celular);
                obj_modificar.setDireccion(direccion);
                obj_modificar.setEstado(estado);
                obj_modificar.setCreadoPor(creadoPor);
                obj_modificar.setModificadoPor(modificadoPor);
                obj_modificar.setModificadoEn(new Date());

                dao.update(obj_modificar);
                return "Se modificó el cliente";
            }else{
                return "El cliente no existe";
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
}
