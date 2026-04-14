package io.petersonaraujo.projetoEstudoHexagonal.adapters.output.client;

import io.petersonaraujo.projetoEstudoHexagonal.adapters.output.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "findAddressByZipCodeClient",
        url = "${arantes.clients.address.url}"
)
public interface FindAddressByZipCodeClient {

    @GetMapping("/{zipCode}")
    AddressResponse find(@PathVariable("zipCode") String zipCode);

}
