package com.ntt.santiago;

import com.ntt.santiago.controller.ClienteController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
class SantiagoApplicationTests {

    @Autowired
    private ClienteController clienteController;

    @Test
    void contextLoads() { //Verifica la creacion del controller
        assertThat(clienteController).isNotNull();
    }

}
