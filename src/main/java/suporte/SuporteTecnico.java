package suporte;

public class SuporteTecnico extends Suporte {
    public SuporteTecnico(Suporte proximoSuporte) {
        super(proximoSuporte);
    }

    @Override
    public void tratarProblema(String problema) {
        if ("problema técnico".equals(problema)) {
            System.out.println("Suporte Técnico: Resolvi o problema.");
        } else if (proximoSuporte != null) {
            proximoSuporte.tratarProblema(problema);
        } else {
            System.out.println("Problema não pode ser resolvido pelo Suporte Técnico.");
        }
    }
}
