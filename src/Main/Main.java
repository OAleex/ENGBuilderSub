package Main;

import Model.Sanduiche;
import Model.SanduicheBuilder;

public class Main {
    public static void main(String[] args) {

        Sanduiche sanduiche = new SanduicheBuilder()
                .setTipoDePao("Italiano")
                .setRecheio("Frango")
                .addMolho("Maionese")
                .addMolho("Mostarda")
                .setExtra("Bacon")
                .build();

        System.out.println(sanduiche);

        }
    }