package io.petersonaraujo.projetoEstudoHexagonal.application.core.usecase;

import io.petersonaraujo.projetoEstudoHexagonal.application.core.domain.Customer;
import io.petersonaraujo.projetoEstudoHexagonal.application.ports.output.FindAddressByZipCodeOutputPort;
import io.petersonaraujo.projetoEstudoHexagonal.application.ports.output.InsertCustomerOutputPort;

public class InsertCustomerUseCase {


    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUseCase(
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            InsertCustomerOutputPort insertCustomerOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    public void insert(Customer customer, String zipCode) {

        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
    }

}
