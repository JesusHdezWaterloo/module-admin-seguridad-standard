package com.jhw.module.admin.seguridad.core.usecase_def;

import com.root101.clean.core.app.usecase.CRUDUseCase;
import com.jhw.module.admin.seguridad.core.domain.*;

public interface ClienteUseCase extends CRUDUseCase<ClienteDomain> {

    public ClienteDomain loadClientByName(String client) throws Exception;

}
