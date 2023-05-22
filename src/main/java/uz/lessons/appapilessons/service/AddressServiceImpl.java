package uz.lessons.appapilessons.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.lessons.appapilessons.entity.Address;
import uz.lessons.appapilessons.repository.AddressRepository;
import uz.lessons.appapilessons.repository.AddressService;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    @Override
    public Address getAddressById(Long id) {
        return addressRepository.findById(id).orElseThrow();
    }
}
