package io.petersonaraujo.projetoEstudoHexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProjetoEstudoHexagonalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoEstudoHexagonalApplication.class, args);
	}

}
