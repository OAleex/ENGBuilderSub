package Model;

import java.util.ArrayList;
import java.util.List;

public class Sanduiche {

    private String tipoDePao;
    private String recheio;
    private List<String> molhos;
    private String extra;

    public Sanduiche() {
        molhos = new ArrayList<>();
    }

    public void setTipoDePao(String tipoDePao) {
        this.tipoDePao = tipoDePao;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public void addMolho(String molho) {
        molhos.add(molho);
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "Sanduíche: " + tipoDePao + ", Recheio: " + recheio + ", Molhos: " + molhos + ", Extra: " + extra;
    }
}

