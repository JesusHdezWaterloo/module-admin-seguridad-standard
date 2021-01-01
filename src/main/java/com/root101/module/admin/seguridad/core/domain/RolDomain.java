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
import com.root101.module.admin.seguridad.service.ResourceKeys;
import com.root101.utils.clean.EntityDomainObjectValidated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
@SortBy(priority = {"nivelAcceso"})
public class RolDomain extends EntityDomainObjectValidated {

    private Integer idRol;

    @NotEmpty(message = ResourceKeys.KEY_ROL_NOMBRE_VACIO)
    @Size(max = 95, message = ResourceKeys.KEY_ROL_NOMBRE_LARGO)
    private String nombreRol;

    private int nivelAcceso;

    @Size(max = 95, message = ResourceKeys.KEY_GENERAL_DESCRICION_LARGA)
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
