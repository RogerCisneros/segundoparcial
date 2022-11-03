public class Guitarra extends Instrumentos implements ISonidos {
    int numcuerdas=7;
    private String acustico;
    String tipo=acustico;


    @Override
    public void SonidoInstrumento() {
        System.out.println("Guitarra>>>>TIRURIRURU TURURURU");
    }
}
