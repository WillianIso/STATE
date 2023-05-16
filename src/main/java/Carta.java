public class Carta {

    private String nomeCarta;
    private CartaEstado estado;
    public Carta() {
        this.estado = CartaEstadoEnviada.getInstance();
    }

    public CartaEstado getEstado() {
        return estado;
    }

    public void setEstado(CartaEstado estado) {
        this.estado = estado;
    }

    public boolean enviada() {
        return estado.enviada(this);
    }

    public boolean emTransito() {
        return estado.emTransito(this);
    }

    public boolean entregue() {
        return estado.entregue(this);
    }

    public String toString() {
        return "Carta " + estado.toString();
    }
}
