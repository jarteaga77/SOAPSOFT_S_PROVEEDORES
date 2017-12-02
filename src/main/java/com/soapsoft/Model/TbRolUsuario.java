package com.soapsoft.Model;
// Generated 27/11/2017 08:22:07 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TbRolUsuario generated by hbm2java
 */
@Entity
@Table(name="tb_rol_usuario"
    ,catalog="soap_soft"
)
public class TbRolUsuario  implements java.io.Serializable {


     private int id;
     private String descripcion;
     private boolean estadoRol;
     private String creadoPor;
     private Date creadoEn;
     private String modificadoPor;
     private Date modificadoEn;
     private Set tbUsuarios = new HashSet(0);

    public TbRolUsuario() {
    }

	
    public TbRolUsuario(int id, String descripcion, boolean estadoRol, String creadoPor, Date creadoEn) {
        this.id = id;
        this.descripcion = descripcion;
        this.estadoRol = estadoRol;
        this.creadoPor = creadoPor;
        this.creadoEn = creadoEn;
    }
    public TbRolUsuario(int id, String descripcion, boolean estadoRol, String creadoPor, Date creadoEn, String modificadoPor, Date modificadoEn, Set tbUsuarios) {
       this.id = id;
       this.descripcion = descripcion;
       this.estadoRol = estadoRol;
       this.creadoPor = creadoPor;
       this.creadoEn = creadoEn;
       this.modificadoPor = modificadoPor;
       this.modificadoEn = modificadoEn;
       this.tbUsuarios = tbUsuarios;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="descripcion", nullable=false, length=11)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    @Column(name="estado_rol", nullable=false)
    public boolean isEstadoRol() {
        return this.estadoRol;
    }
    
    public void setEstadoRol(boolean estadoRol) {
        this.estadoRol = estadoRol;
    }

    
    @Column(name="creadoPor", nullable=false, length=50)
    public String getCreadoPor() {
        return this.creadoPor;
    }
    
    public void setCreadoPor(String creadoPor) {
        this.creadoPor = creadoPor;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="creadoEn", nullable=false, length=19)
    public Date getCreadoEn() {
        return this.creadoEn;
    }
    
    public void setCreadoEn(Date creadoEn) {
        this.creadoEn = creadoEn;
    }

    
    @Column(name="modificadoPor", length=50)
    public String getModificadoPor() {
        return this.modificadoPor;
    }
    
    public void setModificadoPor(String modificadoPor) {
        this.modificadoPor = modificadoPor;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="modificadoEn", length=19)
    public Date getModificadoEn() {
        return this.modificadoEn;
    }
    
    public void setModificadoEn(Date modificadoEn) {
        this.modificadoEn = modificadoEn;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbRolUsuario")
    public Set getTbUsuarios() {
        return this.tbUsuarios;
    }
    
    public void setTbUsuarios(Set tbUsuarios) {
        this.tbUsuarios = tbUsuarios;
    }




}


