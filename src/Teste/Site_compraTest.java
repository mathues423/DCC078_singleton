package Teste;

import Main.Site_compra;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Array;
import static org.junit.jupiter.api.Assertions.*;
class Site_compraTest {

    @Test
    public void deveRetornarItem(){
        Site_compra.getUsuario().addCarrinho("S");
        assertEquals("S", Site_compra.getUsuario().getCarrinho().get(0));

    }

    @Test
    public void deveRetornarTokemUsuarioLogado() {
        Site_compra.getUsuario().setUsuario_token("Usuario 1");
        assertEquals("Usuario 1", Site_compra.getUsuario().getUsuario_token());
    }

    @Test
    public void deveRemoverItem(){
        Site_compra.getUsuario().addCarrinho("S");
        Site_compra.getUsuario().removeCarrinho("S");
    }
}