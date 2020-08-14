/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "alumno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alumno.findAll", query = "SELECT a FROM Alumno a")
    , @NamedQuery(name = "Alumno.findByC\u00e9dula", query = "SELECT a FROM Alumno a WHERE a.c\u00e9dula = :c\u00e9dula")
    , @NamedQuery(name = "Alumno.findByNombres", query = "SELECT a FROM Alumno a WHERE a.nombres = :nombres")
    , @NamedQuery(name = "Alumno.findByApellidos", query = "SELECT a FROM Alumno a WHERE a.apellidos = :apellidos")
    , @NamedQuery(name = "Alumno.findByDirecci\u00f3n", query = "SELECT a FROM Alumno a WHERE a.direcci\u00f3n = :direcci\u00f3n")
    , @NamedQuery(name = "Alumno.findByTel\u00e9fono", query = "SELECT a FROM Alumno a WHERE a.tel\u00e9fono = :tel\u00e9fono")
    , @NamedQuery(name = "Alumno.findByCarrera", query = "SELECT a FROM Alumno a WHERE a.carrera = :carrera")
    , @NamedQuery(name = "Alumno.findByModulo", query = "SELECT a FROM Alumno a WHERE a.modulo = :modulo")
    , @NamedQuery(name = "Alumno.findByCorreo", query = "SELECT a FROM Alumno a WHERE a.correo = :correo")})
public class Alumno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "C\u00e9dula")
    private String cédula;
    @Size(max = 45)
    @Column(name = "Nombres")
    private String nombres;
    @Size(max = 45)
    @Column(name = "Apellidos")
    private String apellidos;
    @Size(max = 45)
    @Column(name = "Direcci\u00f3n")
    private String dirección;
    @Size(max = 45)
    @Column(name = "Tel\u00e9fono")
    private String teléfono;
    @Size(max = 45)
    @Column(name = "Carrera")
    private String carrera;
    @Size(max = 45)
    @Column(name = "Modulo")
    private String modulo;
    @Size(max = 100)
    @Column(name = "correo")
    private String correo;

    public Alumno() {
    }

    public Alumno(String cédula) {
        this.cédula = cédula;
    }

    public String getCédula() {
        return cédula;
    }

    public void setCédula(String cédula) {
        this.cédula = cédula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cédula != null ? cédula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumno)) {
            return false;
        }
        Alumno other = (Alumno) object;
        if ((this.cédula == null && other.cédula != null) || (this.cédula != null && !this.cédula.equals(other.cédula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Alumno[ c\u00e9dula=" + cédula + " ]";
    }
    
}
