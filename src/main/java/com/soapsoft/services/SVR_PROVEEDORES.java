package com.soapsoft.services;

import com.soapsoft.Dao.TbProveedorDaoImpl;
import com.soapsoft.Model.TbProveedor;
import java.util.Date;
import java.util.List;
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
    @WebMethod(operationName = "fn_insertar_prove")
    public String fn_insertar_prove(@WebParam(name = "nit") String nit, @WebParam(name = "razon_social") String razon_social, @WebParam(name = "contacto") String contacto, @WebParam(name = "telefono") String telefono, @WebParam(name = "celular") String celular, @WebParam(name = "direccion") String direccion, @WebParam(name = "estado") boolean estado, @WebParam(name = "creadoPor") String creadoPor) {
        //TODO write your implementation code here:
        
        TbProveedor obj = new TbProveedor(nit, razon_social, contacto, telefono, celular, direccion, estado, creadoPor, new Date());
        
        try {
            TbProveedorDaoImpl dao = new TbProveedorDaoImpl();
            dao.create(obj);
            return "Se insertó el proveedor";
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "fn_borrar_prove")
    public String fn_borrar_prove(@WebParam(name = "ID") int ID) {
        //TODO write your implementation code here:
         try {
            TbProveedorDaoImpl dao = new TbProveedorDaoImpl();
            TbProveedor obj = dao.findById(ID);
            
            if(obj != null){
                dao.delete(obj);
                return "Se eliminó el proveedor";
            }else{
                return "El proveedor no existe";
            }
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    @WebMethod(operationName = "fn_modificar_prove")
    public String fn_modificar_prove( 
            @WebParam(name = "ID") int ID,
            @WebParam(name = "nit") String nit, 
            @WebParam(name = "razon_social") String razon_social, 
            @WebParam(name = "contacto") String contacto, 
            @WebParam(name = "telefono") String telefono, 
            @WebParam(name = "celular") String celular, 
            @WebParam(name = "direccion") String direccion, 
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
                obj_modificar.setModificadoPor(modificadoPor);
                obj_modificar.setModificadoEn(new Date());

                dao.update(obj_modificar);
                return "Se modificó el proveedor";
            }else{
                return "El proveedor no existe";
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "fn_buscar_all_prove")
    public List<TbProveedor> fn_buscar_all_prove() {
        //TODO write your implementation code here:
         TbProveedorDaoImpl dao = new TbProveedorDaoImpl();
         return dao.fn_consultar_todos_prove();
    }
    
}
