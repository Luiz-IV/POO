package main;

import suporte.Suporte;
import suporte.SuporteBasico;
import suporte.SuporteTecnico;
import suporte.SuporteEspecializado;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Suporte suporteEspecializado = new SuporteEspecializado(null);
        Suporte suporteTecnico = new SuporteTecnico(suporteEspecializado);
        Suporte suporteBasico = new SuporteBasico(suporteTecnico);

        String[] problemas = {"problema básico", "problema técnico", "problema especializado", "problema desconhecido"};

        for (String problema : problemas) {
            System.out.println("Relatando: " + problema);
            suporteBasico.tratarProblema(problema);
            System.out.println();
        }
    }
}
