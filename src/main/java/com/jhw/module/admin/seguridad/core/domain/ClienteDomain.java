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
@SortBy(priority = {"nombreCliente"})
public class ClienteDomain extends EntityDomainObjectValidated {

    private Integer idCliente;

    private String nombreCliente;

    private String secret;

    private String redirectURI;

    private int tokenValidationSeconds;

    private int refreshTokenValidationSeconds;

    private String descripcion;

    private GrantTypeDomain grantTypesFk;

    public ClienteDomain() {
    }

    public ClienteDomain(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public ClienteDomain(String nombreCliente, String secret, String redirectURI, int tokenValidationSeconds, int refreshTokenValidationSeconds, String descripcion, GrantTypeDomain grantTypesFk) {
        this.nombreCliente = nombreCliente;
        this.secret = secret;
        this.redirectURI = redirectURI;
        this.tokenValidationSeconds = tokenValidationSeconds;
        this.refreshTokenValidationSeconds = refreshTokenValidationSeconds;
        this.descripcion = descripcion;
        this.grantTypesFk = grantTypesFk;
        validate();
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getRedirectURI() {
        return redirectURI;
    }

    public void setRedirectURI(String redirectURI) {
        this.redirectURI = redirectURI;
    }

    public int getTokenValidationSeconds() {
        return tokenValidationSeconds;
    }

    public void setTokenValidationSeconds(int tokenValidationSeconds) {
        this.tokenValidationSeconds = tokenValidationSeconds;
    }

    public int getRefreshTokenValidationSeconds() {
        return refreshTokenValidationSeconds;
    }

    public void setRefreshTokenValidationSeconds(int refreshTokenValidationSeconds) {
        this.refreshTokenValidationSeconds = refreshTokenValidationSeconds;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public GrantTypeDomain getGrantTypesFk() {
        return grantTypesFk;
    }

    public void setGrantTypesFk(GrantTypeDomain grantTypesFk) {
        this.grantTypesFk = grantTypesFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClienteDomain)) {
            return false;
        }
        ClienteDomain other = (ClienteDomain) object;
        return !((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente)));
    }

    @Override
    public String toString() {
        return nombreCliente;
    }

}
