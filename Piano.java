public class Piano implements ISonidos{
    private String cuerda;
    String tipo=cuerda;
    @Override
    public void SonidoInstrumento() {
        System.out.println("Piano>>>> " +
                "para elisa");
    }
}
