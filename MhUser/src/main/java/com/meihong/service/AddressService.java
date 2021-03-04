package com.meihong.service;

import com.meihong.entity.Address;

import java.util.List;

public interface AddressService {

    public int saveAddress(Address address);
    public int delAddressById(int addressId);
    public int updateAddressById(Address address);
    public int updateAddrByMid(int memberId);
    public int updateAddressByAddr(Address address);
    public Address findAddressById(int addressId);
    public List<Address> findAllAddress();
    public List<Address> findAddressByMid(int memberId);
    public List<Address> findAddrDef(Address address);

}
