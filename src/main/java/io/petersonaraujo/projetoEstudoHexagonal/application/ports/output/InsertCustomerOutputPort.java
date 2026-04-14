package io.petersonaraujo.projetoEstudoHexagonal.application.ports.output;

import io.petersonaraujo.projetoEstudoHexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);

}
