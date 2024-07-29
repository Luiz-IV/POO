package suporte;

public class SuporteBasico extends Suporte {
    public SuporteBasico(Suporte proximoSuporte) {
        super(proximoSuporte);
    }

    @Override
    public void tratarProblema(String problema) {
        if ("problema básico".equals(problema)) {
            System.out.println("Suporte Básico: Resolvi o problema.");
        } else if (proximoSuporte != null) {
            proximoSuporte.tratarProblema(problema);
        } else {
            System.out.println("Problema não pode ser resolvido pelo Suporte Básico.");
        }
    }
}
