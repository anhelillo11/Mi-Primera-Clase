public class Partido    {
    
    //Atributo String
    private String arbitro;
    //Atributo int
    private int nTarjetas;
    //Atributo boolean
    private boolean tarjetaRoja;

    public Partido(String nombreArbitro, int numeroTarjetas) {
        arbitro = nombreArbitro;
        nTarjetas = numeroTarjetas;
        tarjetaRoja = true;
        
    
    }

    public String getArbitro() {
        return arbitro;
    }

    public int getnTarjetas() {
        return nTarjetas;
    }
    
    public boolean getTarjetaRoja() {
        return tarjetaRoja; 
    }

    public void setArbitro(String nArbitro) {
        arbitro = nArbitro;
    }
    
    /**
     * Se mete por parametro el numero de tarjetas que se van a añadir a mayores
     */
    public void nTarjetas(int numeroTarjetas) {
        nTarjetas = nTarjetas + numeroTarjetas;
    }
    
    public void estarALAVenta() {
        if(tarjetaRoja == false) {
            tarjetaRoja = true;
        }
        else {
            tarjetaRoja = false;
        }
    }

    public void imprimeVenta() {
        System.out.println("Arbitro " + arbitro + " Numero de tarjetas  " + nTarjetas
        + " Tarjeta  Roja: si");
       
        
    }

    public String estadoPartido() {
        return "Arbitro " + arbitro + ", Numero de tarjetas  " + nTarjetas
        + ", Tarjeta  Roja: si";
    }




}