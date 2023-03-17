package com.ntt.santiago.entity;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Rule;


import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ItemTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private Cliente cliente;

    @Before
    public void setUp() {
        List<Cliente> lista = new ArrayList<>();
        cliente = new Cliente(23445322, "C", "pepito", "alejandro", "perez", "torres", "3125252501", "Cll 71 # 04-24", "Bogota");
        lista.add(cliente);
    }

    @Test
    public void saveTypeIdInCliente() {
        Assertions.assertEquals(cliente.getTypeId(), "C");
    }

    @Test
    public void saveLastnameInClient() {
        Assertions.assertEquals(cliente.getFirstLastName(), "perez");
    }


}
