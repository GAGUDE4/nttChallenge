package com.ntt.santiago.service;


import com.ntt.santiago.entity.Cliente;

import java.util.Optional;

public interface ClienteService {

    boolean existId(int id);

    Optional<Cliente> getClient(int id, String typeId);

}
