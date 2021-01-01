/*
 * Copyright 2021 Root101 (jhernandezb96@gmail.com, +53-5-426-8660).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Or read it directly from LICENCE.txt file at the root of this project.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.root101.module.admin.seguridad.core.domain;

import com.root101.clean.core.utils.SortBy;
import com.root101.utils.clean.EntityDomainObjectValidated;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
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
