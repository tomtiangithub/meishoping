package com.meihong.service.impl;

import com.meihong.dao.AddressDao;
import com.meihong.entity.Address;
import com.meihong.service.AddressService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Resource
    private AddressDao addressDao;

    @Override
    public int saveAddress(Address address) {
        return addressDao.saveAddress(address);
    }

    @Override
    public int delAddressById(int addressId) {
        return addressDao.delAddressById(addressId);
    }

    @Override
    public int updateAddressById(Address address) {
        return addressDao.updateAddressById(address);
    }

    @Override
    public Address findAddressById(int addressId) {
        return addressDao.findAddressById(addressId);
    }

    @Override
    public List<Address> findAllAddress() {
        return addressDao.findAllAddress();
    }

    @Override
    public List<Address> findAddressByMid(int memberId) {
        return addressDao.findAddressByMid(memberId);
    }

    @Override
    public List<Address> findAddrDef(Address address) {
        return addressDao.findAddrDef(address);
    }

    @Override
    public int updateAddrByMid(int memberId) {
        return addressDao.updateAddrByMid(memberId);
    }

    @Override
    public int updateAddressByAddr(Address address) {
        return addressDao.updateAddressByAddr(address);
    }
}
