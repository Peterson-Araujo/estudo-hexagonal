package io.petersonaraujo.projetoEstudoHexagonal.application.ports.output;

import io.petersonaraujo.projetoEstudoHexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
