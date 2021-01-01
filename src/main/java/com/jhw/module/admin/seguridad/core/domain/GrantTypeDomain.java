/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhw.module.admin.seguridad.core.domain;

import com.root101.clean.core.utils.SortBy;
import com.root101.utils.clean.EntityDomainObjectValidated;

/**
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
@SortBy(priority = {"nombreGrantTypes"})
public class GrantTypeDomain extends EntityDomainObjectValidated {

    private Integer idGrantType;

    private String nombreGrantTypes;

    private String descripcion;

    public GrantTypeDomain() {
    }

    public GrantTypeDomain(Integer idGrantType) {
        this.idGrantType = idGrantType;
    }

    public GrantTypeDomain(String nombreGrantTypes, String descripcion) {
        this.nombreGrantTypes = nombreGrantTypes;
        this.descripcion = descripcion;
    }

    public Integer getIdGrantType() {
        return idGrantType;
    }

    public void setIdGrantType(Integer idGrantType) {
        this.idGrantType = idGrantType;
    }

    public String getNombreGrantTypes() {
        return nombreGrantTypes;
    }

    public void setNombreGrantTypes(String nombreGrantTypes) {
        this.nombreGrantTypes = nombreGrantTypes;
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
        hash += (idGrantType != null ? idGrantType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GrantTypeDomain)) {
            return false;
        }
        GrantTypeDomain other = (GrantTypeDomain) object;
        return !((this.idGrantType == null && other.idGrantType != null) || (this.idGrantType != null && !this.idGrantType.equals(other.idGrantType)));
    }

    @Override
    public String toString() {
        return nombreGrantTypes;
    }

}
