/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhw.module.admin.seguridad.core;

import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class ModuleAdminSeguridadConstants {

    public static final String USERNAME = "username";
    public static final String SEGURIDAD_GENERAL_PATH = "/seguridad";

    //-----------------------ROL-----------------------\\
    public static final String ROL_GENERAL_PATH = SEGURIDAD_GENERAL_PATH + "/rol";

    //-----------------------USUARIO-----------------------\\
    public static final String USUARIO_GENERAL_PATH = SEGURIDAD_GENERAL_PATH + "/usuario";

    public static final String USUARIO_FIND_BY_USERNAME = "/find_by_username/{" + USERNAME + "}";
    public static final RequestMethod USUARIO_FIND_BY_METHOD = RequestMethod.GET;

}
