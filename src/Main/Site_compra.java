package Main;

import java.util.ArrayList;
import java.util.List;

public class Site_compra {
    private Site_compra(){}
    private static Site_compra usuario = new Site_compra();
    public static Site_compra getUsuario() {
        return usuario;
    }

    private ArrayList<String> carrinho = new ArrayList<String>();
    private String usuario_token;
    public ArrayList<String> getCarrinho() {
        return carrinho;
    }

    public void addCarrinho(String item){
        this.carrinho.add(item);
    }

    public void removeCarrinho(String item){
        this.carrinho.remove(item);
    }

    public String getUsuario_token() {
        return usuario_token;
    }

    public void setUsuario_token(String usuario_token) {
        this.usuario_token = usuario_token;
    }
}
