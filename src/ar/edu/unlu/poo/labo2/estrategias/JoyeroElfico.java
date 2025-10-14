package ar.edu.unlu.poo.labo2.estrategias;

import ar.edu.unlu.poo.labo2.artefactos.Artefacto;

public class JoyeroElfico implements EstrategiaDeMejora {

    @Override
    public void mejorar(Artefacto artefacto) {
        if (artefacto.getTipo().equals("Amuleto" )){
            if((artefacto.getPoder()<50)){
                artefacto.setPoder(artefacto.getNivelDePoder()*2);
            } else {
                int poderActual = artefacto.getNivelDePoder();
                int poderNuevo = (int) (poderActual * 1.25);
                artefacto.setPoder(poderNuevo);
            }
        }
    }
}
