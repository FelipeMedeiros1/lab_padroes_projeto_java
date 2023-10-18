package com.medeiros.facade;

import subsystem_cep.ApiCep;
import subsystem_crm.CRMService;

public class Facade {
    public void migrateClient(String name, String cep){

        String city = ApiCep.getInstance().getCity(cep);
        String state= ApiCep.getInstance().getState(cep);
        CRMService.saveClient(name,cep,city,state);

    }
}
