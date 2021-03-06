package com.soapsoft.Model;
// Generated 27/11/2017 08:22:07 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TbEntradaProdTerminado generated by hbm2java
 */
@Entity
@Table(name="tb_entrada_prod_terminado"
    ,catalog="soap_soft"
)
public class TbEntradaProdTerminado  implements java.io.Serializable {


     private Integer id;
     private String creadorPor;
     private Date creadoEn;
     private String modificadoPor;
     private Date modificadoEn;
     private Set tbDetalleEntradaProdTerms = new HashSet(0);

    public TbEntradaProdTerminado() {
    }

	
    public TbEntradaProdTerminado(String creadorPor, Date creadoEn) {
        this.creadorPor = creadorPor;
        this.creadoEn = creadoEn;
    }
    public TbEntradaProdTerminado(String creadorPor, Date creadoEn, String modificadoPor, Date modificadoEn, Set tbDetalleEntradaProdTerms) {
       this.creadorPor = creadorPor;
       this.creadoEn = creadoEn;
       this.modificadoPor = modificadoPor;
       this.modificadoEn = modificadoEn;
       this.tbDetalleEntradaProdTerms = tbDetalleEntradaProdTerms;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="ID", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="creadorPor", nullable=false, length=50)
    public String getCreadorPor() {
        return this.creadorPor;
    }
    
    public void setCreadorPor(String creadorPor) {
        this.creadorPor = creadorPor;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbEntradaProdTerminado")
    public Set getTbDetalleEntradaProdTerms() {
        return this.tbDetalleEntradaProdTerms;
    }
    
    public void setTbDetalleEntradaProdTerms(Set tbDetalleEntradaProdTerms) {
        this.tbDetalleEntradaProdTerms = tbDetalleEntradaProdTerms;
    }




}


