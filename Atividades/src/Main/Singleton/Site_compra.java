package Main.Singleton;

import java.util.List;

public class Site_compra {
    private Site_compra(){}
    private static Site_compra usuario = new Site_compra();
    public static Site_compra getUsuario() {
        return usuario;
    }

    private String token;
    private List<String> carrinho;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<String> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(List<String> carrinho) {
        this.carrinho = carrinho;
    }
}
