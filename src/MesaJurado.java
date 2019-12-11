public class MesaJurado extends Jurado{
    private Jurado superior;

    @Override
    public String evaluar (String tipo, String evento){
        Jurado presidente = new Presidente();
        Jurado comisario = new Comisario(presidente);
        Jurado juezdellegada = new JuezDeLlegada(comisario);
        Jurado supervisor = new Supervisor(juezdellegada);
        superior= supervisor;
        return superior.evaluar(tipo, evento);

    }
}
