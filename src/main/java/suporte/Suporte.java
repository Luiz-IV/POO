package suporte;

public abstract class Suporte {
    protected Suporte proximoSuporte;

    public Suporte(Suporte proximoSuporte) {
        this.proximoSuporte = proximoSuporte;
    }

    public abstract void tratarProblema(String problema);
}