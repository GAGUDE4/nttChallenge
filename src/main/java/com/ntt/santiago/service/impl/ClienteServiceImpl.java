package com.ntt.santiago.service.impl;

import com.ntt.santiago.entity.Cliente;
import com.ntt.santiago.repository.ClienteRepository;
import com.ntt.santiago.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public boolean existId(int id) {
        return clienteRepository.existsById(id);
    }

    @Override
    public Optional<Cliente> getClient(int id, String typeId) {
        return clienteRepository.findById(id);
    }

}
