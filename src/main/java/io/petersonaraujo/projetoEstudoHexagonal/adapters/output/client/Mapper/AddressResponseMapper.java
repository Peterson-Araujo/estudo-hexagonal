package io.petersonaraujo.projetoEstudoHexagonal.adapters.output.client.Mapper;

import io.petersonaraujo.projetoEstudoHexagonal.adapters.output.client.response.AddressResponse;
import io.petersonaraujo.projetoEstudoHexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
