package suporte;

public class SuporteEspecializado extends Suporte {
    public SuporteEspecializado(Suporte proximoSuporte) {
        super(proximoSuporte);
    }

    @Override
    public void tratarProblema(String problema) {
        if ("problema especializado".equals(problema)) {
            System.out.println("Suporte Especializado: Resolvi o problema.");
        } else if (proximoSuporte != null) {
            proximoSuporte.tratarProblema(problema);
        } else {
            System.out.println("Problema não pode ser resolvido pelo Suporte Especializado.");
        }
    }
}
