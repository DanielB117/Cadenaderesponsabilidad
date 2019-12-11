public class Supervisor extends Jurado {

    private final Jurado superior;
    private  String mensaje;

    public Supervisor (Jurado superior) {
        this.superior = superior;
    }
    @Override
    public String evaluar (String tipo, String evento){
        if(tipo.equals ("herido")){

            suceso = "en camino con ayuda medica";
            mensaje = evento;

        }else{
            return superior.evaluar(tipo, evento);

        }
        return suceso;
    }
}
