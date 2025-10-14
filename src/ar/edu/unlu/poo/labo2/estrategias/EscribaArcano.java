package ar.edu.unlu.poo.labo2.estrategias;

import ar.edu.unlu.poo.labo2.artefactos.Artefacto;

public class EscribaArcano implements EstrategiaDeMejora {
    public void mejorar(Artefacto artefacto) {
        if (artefacto.getTipo().equals("Pergamino" )){
            if((artefacto.getPoder()<30)){
                artefacto.setPoder(artefacto.getNivelDePoder()+25);
            } else {
                artefacto.setPoder(artefacto.getNivelDePoder()-10);
            }
        }
    }
}
