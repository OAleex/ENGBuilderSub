package Model;

public class SanduicheBuilder {

    private Sanduiche sanduiche;

    public SanduicheBuilder() {
        sanduiche = new Sanduiche();
    }

    public SanduicheBuilder setTipoDePao(String tipoDePao) {
        sanduiche.setTipoDePao(tipoDePao);
        return this;
    }

    public SanduicheBuilder setRecheio(String recheio) {
        sanduiche.setRecheio(recheio);
        return this;
    }

    public SanduicheBuilder addMolho(String molho) {
        sanduiche.addMolho(molho);
        return this;
    }

    public SanduicheBuilder setExtra(String extra) {
        sanduiche.setExtra(extra);
        return this;
    }

    public Sanduiche build() {
        return sanduiche;
    }
}