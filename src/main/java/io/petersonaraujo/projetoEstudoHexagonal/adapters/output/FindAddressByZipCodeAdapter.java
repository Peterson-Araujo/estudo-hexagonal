package io.petersonaraujo.projetoEstudoHexagonal.adapters.output;

import io.petersonaraujo.projetoEstudoHexagonal.adapters.output.client.FindAddressByZipCodeClient;
import io.petersonaraujo.projetoEstudoHexagonal.adapters.output.client.Mapper.AddressResponseMapper;
import io.petersonaraujo.projetoEstudoHexagonal.application.core.domain.Address;
import io.petersonaraujo.projetoEstudoHexagonal.application.ports.output.FindAddressByZipCodeOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    private FindAddressByZipCodeClient findAddressByZipCodeClient;
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
