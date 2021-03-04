package com.meihong.controller;

import com.meihong.entity.CommonResult;
import com.meihong.entity.GoodInfo;
import com.meihong.service.GoodCategoryService;
import com.meihong.service.GoodInfoService;
import com.meihong.util.PageRequest;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
/*@RequestMapping("goodinfo")*/
@Slf4j
@Api(tags = "商品数据接口")
public class GoodInfoCtroller {

    @Resource
    private GoodInfoService goodInfoService;
    @Resource
    private GoodCategoryService goodCategoryService;


    @GetMapping(value = "/mshop/findAll")
    public CommonResult<List<GoodInfo>> findAllGoodInfo() {
        List<GoodInfo> goodlist=goodInfoService.findAll();
        if(goodlist != null)
        {
            return new CommonResult(200,"查询成功,serverPort:  ", goodlist);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID: ",null);
        }
    }

    @GetMapping(value = "/mshop/findById/{goodId}")
    public CommonResult<GoodInfo> findGoodInfoById(@PathVariable("goodId") Long goodId) {
        GoodInfo goodInfo=goodInfoService.findGoodInfoById(goodId);

        if(goodInfo != null)
        {
            return new CommonResult(200,"查询成功,serverPort:  ", goodInfo);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID: ",null);
        }
    }

    @PostMapping(value="/mshop/findPage")
    public  Object findPage(@RequestBody PageRequest pageQuery) {
        return goodInfoService.findPage(pageQuery);
    }


    @GetMapping(value = "/mshop/findCgAll")
    public CommonResult<List<GoodInfo>> findCategoryAndGooInfoAll() {
        List<GoodInfo> goodlists=goodCategoryService.findCategoryAndGooInfoAll();
        if(goodlists != null)
        {
            return new CommonResult(200,"查询成功,serverPort:  ", goodlists);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID: ",null);
        }
    }

    @GetMapping(value = "/mshop/findGoodNum/{goodId}")
    public CommonResult<Integer> findGoodNumById(@PathVariable("goodId") Long goodId) {
        Integer goodNum = goodInfoService.findGoodNumById(goodId);
        if(goodNum != null)
        {
            return new CommonResult(200,"查询成功,serverPort:  ", goodNum);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID: ",null);
        }
    }
}