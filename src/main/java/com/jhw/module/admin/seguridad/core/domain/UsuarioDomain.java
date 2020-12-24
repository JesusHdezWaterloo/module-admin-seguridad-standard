/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhw.module.admin.seguridad.core.domain;

import com.clean.core.utils.SortBy;
import com.jhw.module.admin.seguridad.service.ResourceKeys;
import com.jhw.utils.clean.EntityDomainObjectValidated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
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
