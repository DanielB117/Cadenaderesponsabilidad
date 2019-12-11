public class Presidente extends Jurado {
    private  String mensaje;


    @Override
    public String evaluar (String tipo, String evento){
            suceso = "El problema se evaluara de inmediato";
        return suceso;
    }
}

