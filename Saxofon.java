public  class Saxofon  implements ISonidos{
    private String viento;
    String tipo=viento;
    @Override
    public void SonidoInstrumento() {
        System.out.println("Saxofon>>>>> Careless Whisper\n" +
                "Canción de George Michael\n");
    }
}
