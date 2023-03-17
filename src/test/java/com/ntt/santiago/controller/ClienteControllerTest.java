package com.ntt.santiago.controller;

import com.ntt.santiago.entity.Cliente;
import com.ntt.santiago.repository.ClienteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class ClienteControllerTest {

    @Autowired
    ClienteRepository clienteRepository;

    @Test
    public void clienteTest(){
        Cliente cliente = mock();
        clienteRepository.save(cliente);
    }

    public Cliente mock() {
        Cliente item = new Cliente(23445322, "C", "pepito", "alejandro", "perez", "torres", "3125252501", "Cll 71 # 04-24", "Bogota");
        return item;
    }
}
