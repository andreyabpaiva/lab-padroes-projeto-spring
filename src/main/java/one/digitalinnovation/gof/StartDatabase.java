package one.digitalinnovation.gof;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.ClienteRepository;
import one.digitalinnovation.gof.model.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class StartDatabase {
    @Autowired
    private ClienteRepository clienteRepository;
    //private EnderecoRepository enderecoRepository;


    public void run(String... args) throws Exception {

        Cliente cliente = new Cliente();
        cliente.setNome("default");

        clienteRepository.save(cliente);

        clienteRepository.findAll().forEach(System.out::println);
    }
}
