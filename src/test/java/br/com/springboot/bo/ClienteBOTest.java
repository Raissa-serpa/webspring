package br.com.springboot.bo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;

import br.com.springboot.model.Cliente;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@TestMethodOrder(OrderAnnotation.class)
public class ClienteBOTest {

    @Autowired
    private ClienteBO bo;

    @Test
    @Order(1)
    public void insere() {
        Cliente cliente = new Cliente();
        cliente.setNome("Raissa Garcia Serpa");
        cliente.setCpf("04608684035");
        cliente.setDataDeNascimento(LocalDate.of(2002, 7, 1));
        cliente.setSexo("Feminino");
        cliente.setTelefone("519982470444");
        cliente.setCelular("51998503257");
        cliente.setAtivo(true);
        cliente.setEmail("raissa.serpa2015@gmail.com");
        bo.insere(cliente);
    }

    @Test
    @Order(2)
    public void pesquisaPeloId() {
        Cliente cliente = bo.pesquisaPeloId(1L);
        System.out.print(cliente);
    }

    @Test
    @Order(3)
    public void atualiza() {
        Cliente cliente = bo.pesquisaPeloId(1L);
        cliente.setCpf("06709809364");
        bo.atualiza(cliente);
    }
}
