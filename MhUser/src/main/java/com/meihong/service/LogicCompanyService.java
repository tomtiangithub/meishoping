package com.meihong.service;

import com.meihong.entity.LogicCompany;

import java.util.List;

public interface LogicCompanyService {

    public int saveLogicCompany(LogicCompany logicCompany);
    public int delLogicCompanyById(String deliveryCompanyCode);
    public int updateLogicCompanyById(LogicCompany logicCompany);
    public LogicCompany findLogicCompanyById(String deliveryCompanyCode);
    public List<LogicCompany> findAllLogicCompany();

}
