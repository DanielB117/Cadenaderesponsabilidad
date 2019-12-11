public class Comisario extends Jurado {

    private final Jurado superior;
    private  String mensaje;

    public Comisario (Jurado superior) {
        this.superior = superior;
    }
    @Override
    public String evaluar (String tipo, String evento){
        if(tipo.equals ("Infraccion")){

            suceso = "Se esta revisando la infraccion ";
            mensaje = evento;

        }else{
            return superior.evaluar(tipo, evento);

        }
        return suceso;
    }
}
