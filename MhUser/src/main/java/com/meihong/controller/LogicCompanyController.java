package com.meihong.controller;

import com.meihong.entity.LogicCompany;
import com.meihong.service.LogicCompanyService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Api(tags = "送货公司数据接口")
@RestController
@RequestMapping("logicCompany")
public class LogicCompanyController {

    @Resource
    private LogicCompanyService logicCompanyService;

    @PostMapping(value="/saveLogicCompany")
    public int saveLogicCompany(@RequestBody LogicCompany logicCompany){
        return logicCompanyService.saveLogicCompany(logicCompany);
    }
    @GetMapping(value="/delLogicCompanyById")
    public int delLogicCompanyById(String deliveryCompanyCode){
        return logicCompanyService.delLogicCompanyById(deliveryCompanyCode);
    }
    @PostMapping(value="/updateAreaById")
    public int updateLogicCompanyById(LogicCompany logicCompany) {
        return logicCompanyService.updateLogicCompanyById(logicCompany);
    }
    @GetMapping(value="/findLogicCompanyById")
    public LogicCompany findLogicCompanyById(String deliveryCompanyCode) {
        return  logicCompanyService.findLogicCompanyById(deliveryCompanyCode);
    }
    @GetMapping(value="/findAllLogicCompany")
    public List<LogicCompany> findAllLogicCompany() {
        return logicCompanyService.findAllLogicCompany();
    }

}
