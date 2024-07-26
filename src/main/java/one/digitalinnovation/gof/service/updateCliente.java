package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;

public class updateCliente {


    @Autowired
    ClienteService queryupdate;

    public void updateClientName(Cliente clienteupdate, Long id){
        queryupdate.atualizar(id,clienteupdate);
    }

}
