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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
@SortBy(priority = {"username"})
public class UsuarioDomain extends EntityDomainObjectValidated {

    private Integer idUser;

    @NotEmpty(message = ResourceKeys.KEY_USUARIO_NOMBRE_VACIO)
    @Size(max = 95, message = ResourceKeys.KEY_USUARIO_NOMBRE_LARGO)
    private String username;

    @Pattern(regexp = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message = ResourceKeys.KEY_USUARIO_EMAIL_INVALID)
    private String email;

    private String password;

    @Size(max = 95, message = ResourceKeys.KEY_GENERAL_DESCRICION_LARGA)
    private String descripcion;

    @NotNull(message = ResourceKeys.KEY_USUARIO_ROL_NULL)
    private RolDomain rolFk;

    public UsuarioDomain() {
    }

    public UsuarioDomain(String username, String email, String password, String descripcion, RolDomain rolFk) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.descripcion = descripcion;
        this.rolFk = rolFk;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public RolDomain getRolFk() {
        return rolFk;
    }

    public void setRolFk(RolDomain rolFk) {
        this.rolFk = rolFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUser != null ? idUser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioDomain)) {
            return false;
        }
        UsuarioDomain other = (UsuarioDomain) object;
        return !((this.idUser == null && other.idUser != null) || (this.idUser != null && !this.idUser.equals(other.idUser)));
    }

    @Override
    public String toString() {
        return username;
    }

}
