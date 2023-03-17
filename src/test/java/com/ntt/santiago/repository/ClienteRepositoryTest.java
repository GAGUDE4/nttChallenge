package com.ntt.santiago.repository;

import com.ntt.santiago.entity.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.transaction.Transactional;

import java.util.Optional;

@DataJpaTest
@ExtendWith(SpringExtension.class)
@Transactional
public class ClienteRepositoryTest {

    @Autowired
    private ClienteRepository clienteRepository;

    @Test
    public void testFindById() {
        Cliente item = new Cliente();
        clienteRepository.save(item);
        Optional<Cliente> result = clienteRepository.findById(item.getId());
        Assertions.assertEquals(item.getId(), result.get().getId());
    }

}
