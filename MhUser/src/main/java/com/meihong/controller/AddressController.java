package com.meihong.controller;

import com.meihong.entity.Address;
import com.meihong.entity.CommonResult;
import com.meihong.entity.Muser;
import com.meihong.service.AddressService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Api(tags = "地址数据接口")
@RestController
@RequestMapping("address")
public class AddressController {

    @Resource
    private AddressService addressService;

    @PostMapping(value="/saveAddress")
    public int saveAddress(@RequestBody Address address){
        return addressService.saveAddress(address);
    }
    @GetMapping(value="/delAddressById")
    public int delAddressById(@RequestParam int addressId){
        return addressService.delAddressById(addressId);
    }
    @PostMapping(value="/updateAddressById")
    public int updateAddressById(@RequestBody Address address){
        return addressService.updateAddressById(address);
    }

    @GetMapping(value="/findAddressById")
    public Address findAddressById(@RequestParam int addressId){
        return addressService.findAddressById(addressId);
    }

    @GetMapping(value="/findAllAddress")
    public List<Address> findAllAddress(){
        return addressService.findAllAddress();
    }

  /*  public CommonResult<Muser> getMuserById(@PathVariable("id") Long id) {*/
    @GetMapping(value="/findAddressByMid/{memberId}")
    public List<Address> findAddressByMid(@PathVariable("memberId") int memberId){
    /*public List<Address> findAddressByMid(@RequestParam int memberId){*/
        return addressService.findAddressByMid(memberId);
    }

    @PostMapping(value="/findAddrDef")
    public CommonResult<List<Address>> findAddrDef(@RequestBody Address address) {
        List<Address> addressList=addressService.findAddrDef(address);
        if(addressList != null)
        {
            return new CommonResult(200,"查询成功,serverPort:  ", addressList);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID: ",null);
        }
    }

    @GetMapping(value="/updateAddrByMid/{memberId}")
    public int updateAddrByMid(@PathVariable("memberId") int memberId) {
        return addressService.updateAddrByMid(memberId);
    }

    @PostMapping(value="/updateAddressByAddr")
    public int updateAddressByAddr(@RequestBody Address address) {
        return addressService.updateAddressByAddr(address);
    }




}
