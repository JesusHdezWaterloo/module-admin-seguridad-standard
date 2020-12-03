/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhw.module.admin.seguridad.core.domain;

import com.clean.core.utils.SortBy;
import com.jhw.utils.clean.EntityDomainObjectValidated;

/**
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
@SortBy(priority = {"nivelAcceso"})
public class RolDomain extends EntityDomainObjectValidated {

    private Integer idRol;

    private String nombreRol;

    private int nivelAcceso;

    private String descripcion;

    public RolDomain() {
    }

    public RolDomain(String nombreRol, int nivelAcceso, String descripcion) {
        this.nombreRol = nombreRol;
        this.nivelAcceso = nivelAcceso;
        this.descripcion = descripcion;
        validate();
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public int getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(int nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRol != null ? idRol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolDomain)) {
            return false;
        }
        RolDomain other = (RolDomain) object;
        return !((this.idRol == null && other.idRol != null) || (this.idRol != null && !this.idRol.equals(other.idRol)));
    }

    @Override
    public String toString() {
        return nombreRol;
    }

}
