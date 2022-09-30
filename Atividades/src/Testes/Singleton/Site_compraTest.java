package Testes.Singleton;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.fail;

class Site_compraTest {
    @Test
    public void deveVerificarDispositivoInvalido(){
        try {
            Site_compra.getUsuario().setToken("chave_primaria");
            fail();
        }catch (NullPointerException e){
            assertEquals("Erro parametro null", e.getMessage());
        }
    }
}