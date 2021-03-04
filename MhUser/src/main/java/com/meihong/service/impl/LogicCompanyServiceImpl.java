package com.meihong.service.impl;

import com.meihong.dao.LogicCompanyDao;
import com.meihong.entity.LogicCompany;
import com.meihong.service.LogicCompanyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LogicCompanyServiceImpl implements LogicCompanyService {

    @Resource
    private LogicCompanyDao logicCompanyDao;
    @Override
    public int saveLogicCompany(LogicCompany logicCompany) {
        return logicCompanyDao.saveLogicCompany(logicCompany);
    }

    @Override
    public int delLogicCompanyById(String deliveryCompanyCode) {
        return logicCompanyDao.delLogicCompanyById(deliveryCompanyCode);
    }

    @Override
    public int updateLogicCompanyById(LogicCompany logicCompany) {
        return logicCompanyDao.updateLogicCompanyById(logicCompany);
    }

    @Override
    public LogicCompany findLogicCompanyById(String deliveryCompanyCode) {
        return logicCompanyDao.findLogicCompanyById(deliveryCompanyCode);
    }

    @Override
    public List<LogicCompany> findAllLogicCompany() {
        return logicCompanyDao.findAllLogicCompany();
    }
}
