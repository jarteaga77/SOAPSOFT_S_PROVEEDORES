package com.soapsoft.Model;
// Generated 27/11/2017 08:22:07 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TbUsuario generated by hbm2java
 */
@Entity
@Table(name="tb_usuario"
    ,catalog="soap_soft"
)
public class TbUsuario  implements java.io.Serializable {


     private Integer id;
     private TbRolUsuario tbRolUsuario;
     private String nombreUsuario;
     private int cedula;
     private String usuario;
     private String contrasena;
     private boolean estadoUsuario;
     private String creadoPor;
     private Date creadoEn;
     private String modificadoPor;
     private Date modificadoEn;

    public TbUsuario() {
    }

	
    public TbUsuario(TbRolUsuario tbRolUsuario, String nombreUsuario, int cedula, String usuario, String contrasena, boolean estadoUsuario, String creadoPor, Date creadoEn, String modificadoPor) {
        this.tbRolUsuario = tbRolUsuario;
        this.nombreUsuario = nombreUsuario;
        this.cedula = cedula;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.estadoUsuario = estadoUsuario;
        this.creadoPor = creadoPor;
        this.creadoEn = creadoEn;
        this.modificadoPor = modificadoPor;
    }
    public TbUsuario(TbRolUsuario tbRolUsuario, String nombreUsuario, int cedula, String usuario, String contrasena, boolean estadoUsuario, String creadoPor, Date creadoEn, String modificadoPor, Date modificadoEn) {
       this.tbRolUsuario = tbRolUsuario;
       this.nombreUsuario = nombreUsuario;
       this.cedula = cedula;
       this.usuario = usuario;
       this.contrasena = contrasena;
       this.estadoUsuario = estadoUsuario;
       this.creadoPor = creadoPor;
       this.creadoEn = creadoEn;
       this.modificadoPor = modificadoPor;
       this.modificadoEn = modificadoEn;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="ID", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_rol", nullable=false)
    public TbRolUsuario getTbRolUsuario() {
        return this.tbRolUsuario;
    }
    
    public void setTbRolUsuario(TbRolUsuario tbRolUsuario) {
        this.tbRolUsuario = tbRolUsuario;
    }

    
    @Column(name="nombre_usuario", nullable=false, length=100)
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    
    @Column(name="cedula", nullable=false)
    public int getCedula() {
        return this.cedula;
    }
    
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    
    @Column(name="usuario", nullable=false, length=50)
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
    @Column(name="contrasena", nullable=false, length=50)
    public String getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    
    @Column(name="estado_usuario", nullable=false)
    public boolean isEstadoUsuario() {
        return this.estadoUsuario;
    }
    
    public void setEstadoUsuario(boolean estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
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

    
    @Column(name="modificadoPor", nullable=false, length=50)
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




}

