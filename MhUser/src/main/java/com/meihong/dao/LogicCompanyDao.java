package com.meihong.dao;

import com.meihong.entity.LogicCompany;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface LogicCompanyDao {

    public int saveLogicCompany(LogicCompany logicCompany);
    public int delLogicCompanyById(String deliveryCompanyCode);
    public int updateLogicCompanyById(LogicCompany logicCompany);
    public LogicCompany findLogicCompanyById(String deliveryCompanyCode);
    public List<LogicCompany> findAllLogicCompany();

}
