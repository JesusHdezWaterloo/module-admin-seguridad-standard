package com.jhw.module.admin.seguridad.core.usecase_def;

import com.clean.core.app.usecase.CRUDUseCase;
import com.jhw.module.admin.seguridad.core.domain.*;

public interface UsuarioUseCase extends CRUDUseCase<UsuarioDomain> {

    public UsuarioDomain loadUserByUsername(String username) throws Exception;
}
