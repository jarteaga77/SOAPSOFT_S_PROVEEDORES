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
 * TbDetalleOrdenCompra generated by hbm2java
 */
@Entity
@Table(name="tb_detalle_orden_compra"
    ,catalog="soap_soft"
)
public class TbDetalleOrdenCompra  implements java.io.Serializable {


     private Integer id;
     private TbMateriaPrima tbMateriaPrima;
     private TbOrdenCompra tbOrdenCompra;
     private int cantidad;
     private int vlorIva;
     private String tipoIva;
     private int vlorUnitario;
     private int vlorTotal;
     private String creadoPor;
     private Date creadoEn;
     private String modificadoPor;
     private Date modificadoEn;

    public TbDetalleOrdenCompra() {
    }

	
    public TbDetalleOrdenCompra(TbMateriaPrima tbMateriaPrima, TbOrdenCompra tbOrdenCompra, int cantidad, int vlorIva, String tipoIva, int vlorUnitario, int vlorTotal, String creadoPor, Date creadoEn) {
        this.tbMateriaPrima = tbMateriaPrima;
        this.tbOrdenCompra = tbOrdenCompra;
        this.cantidad = cantidad;
        this.vlorIva = vlorIva;
        this.tipoIva = tipoIva;
        this.vlorUnitario = vlorUnitario;
        this.vlorTotal = vlorTotal;
        this.creadoPor = creadoPor;
        this.creadoEn = creadoEn;
    }
    public TbDetalleOrdenCompra(TbMateriaPrima tbMateriaPrima, TbOrdenCompra tbOrdenCompra, int cantidad, int vlorIva, String tipoIva, int vlorUnitario, int vlorTotal, String creadoPor, Date creadoEn, String modificadoPor, Date modificadoEn) {
       this.tbMateriaPrima = tbMateriaPrima;
       this.tbOrdenCompra = tbOrdenCompra;
       this.cantidad = cantidad;
       this.vlorIva = vlorIva;
       this.tipoIva = tipoIva;
       this.vlorUnitario = vlorUnitario;
       this.vlorTotal = vlorTotal;
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
    @JoinColumn(name="id_materia_prima", nullable=false)
    public TbMateriaPrima getTbMateriaPrima() {
        return this.tbMateriaPrima;
    }
    
    public void setTbMateriaPrima(TbMateriaPrima tbMateriaPrima) {
        this.tbMateriaPrima = tbMateriaPrima;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_orden_compra", nullable=false)
    public TbOrdenCompra getTbOrdenCompra() {
        return this.tbOrdenCompra;
    }
    
    public void setTbOrdenCompra(TbOrdenCompra tbOrdenCompra) {
        this.tbOrdenCompra = tbOrdenCompra;
    }

    
    @Column(name="cantidad", nullable=false)
    public int getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    @Column(name="vlor_iva", nullable=false)
    public int getVlorIva() {
        return this.vlorIva;
    }
    
    public void setVlorIva(int vlorIva) {
        this.vlorIva = vlorIva;
    }

    
    @Column(name="tipo_iva", nullable=false, length=10)
    public String getTipoIva() {
        return this.tipoIva;
    }
    
    public void setTipoIva(String tipoIva) {
        this.tipoIva = tipoIva;
    }

    
    @Column(name="vlor_unitario", nullable=false)
    public int getVlorUnitario() {
        return this.vlorUnitario;
    }
    
    public void setVlorUnitario(int vlorUnitario) {
        this.vlorUnitario = vlorUnitario;
    }

    
    @Column(name="vlor_total", nullable=false)
    public int getVlorTotal() {
        return this.vlorTotal;
    }
    
    public void setVlorTotal(int vlorTotal) {
        this.vlorTotal = vlorTotal;
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




}


