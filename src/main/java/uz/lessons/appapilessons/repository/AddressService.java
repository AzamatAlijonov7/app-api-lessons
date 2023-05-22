package uz.lessons.appapilessons.repository;

import uz.lessons.appapilessons.entity.Address;

import java.util.List;

public interface AddressService {
    List<Address> getAllAddresses();

    Address getAddressById(Long id);
}
