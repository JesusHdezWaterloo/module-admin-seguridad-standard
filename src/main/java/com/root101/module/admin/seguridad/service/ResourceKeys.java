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
package com.root101.module.admin.seguridad.service;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
public class ResourceKeys {

    //---------------------------- GENERAL ----------------------------\\
    public static final String KEY_GENERAL_DESCRICION_LARGA = "#msg.module.admin.seguridad.validation.descripcion_larga#";
    
    //---------------------------- GENERAL ----------------------------\\

    //---------------------------- ROL ----------------------------\\
    public static final String KEY_ROL_NOMBRE_VACIO = "#msg.module.admin.seguridad.validation.rol_nombre_vacio#";
    public static final String KEY_ROL_NOMBRE_LARGO = "#msg.module.admin.seguridad.validation.rol_nombre_largo#";
    //---------------------------- ROL ----------------------------\\

    //---------------------------- USUARIO ----------------------------\\
    public static final String KEY_USUARIO_NOMBRE_VACIO = "#msg.module.admin.seguridad.validation.usuario_nombre_vacio#";
    public static final String KEY_USUARIO_NOMBRE_LARGO = "#msg.module.admin.seguridad.validation.usuario_nombre_largo#";
    public static final String KEY_USUARIO_EMAIL_INVALID = "#msg.module.admin.seguridad.validation.usuario_email_invalid#";
    public static final String KEY_USUARIO_ROL_NULL = "#msg.module.admin.seguridad.validation.usuario_rol_null#";
    //---------------------------- USUARIO ----------------------------\\
}
