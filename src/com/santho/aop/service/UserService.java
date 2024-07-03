package com.santho.aop.service;

import com.santho.aop.model.Admin;
import com.santho.aop.model.General;

public class UserService {
    private Admin admin;
    private General general;

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public General getGeneral() {
        return general;
    }

    public void setGeneral(General general) {
        this.general = general;
    }
}
