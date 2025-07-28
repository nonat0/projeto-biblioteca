package com.mycompany.app;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PessoaTest {
    @Test
    public void testGetNome() {
        Pessoa pessoa = new Pessoa ();

        pessoa.setNome("Rafael");

        assertEquals ("Rafael", pessoa.getNome());
    }
     
}