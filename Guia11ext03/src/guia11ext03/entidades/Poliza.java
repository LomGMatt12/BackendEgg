package guia11ext03.entidades;

/**
 *
 * @author Matias
 */
import java.util.Date;
public class Poliza {

private Cliente cliente;
    private Vehiculo vehiculo;
    private int numPoliza,cantCuotas,montoAsegurado,maxGranizo;
    private Pagos pago;
    private Cobertura cobertura;
    private boolean granizo;
private Date Inicio = new Date();
    
    public Poliza() {
        
                this.numPoliza = (int)(Math.random()*17000);
    }

    public Poliza(Cliente cliente, Vehiculo vehiculo,  int cantCuotas, int montoAsegurado, int maxGranizo, Pagos pago, Cobertura cobertura, boolean granizo) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.numPoliza = (int)(Math.random()*17000);
        this.cantCuotas = cantCuotas;
        this.montoAsegurado = montoAsegurado;
        this.maxGranizo = maxGranizo;
        this.pago = pago;
        this.cobertura = cobertura;
        this.granizo = granizo;
    }

    public Date getInicio() {
        return Inicio;
    }

    public void setInicio(Date Inicio) {
        this.Inicio = Inicio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(int numPoliza) {
        this.numPoliza = numPoliza;
    }

    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public int getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(int montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public int getMaxGranizo() {
        return maxGranizo;
    }

    public void setMaxGranizo(int maxGranizo) {
        this.maxGranizo = maxGranizo;
    }

    public Pagos getPago() {
        return pago;
    }

    public void setPago(Pagos pago) {
        this.pago = pago;
    }

    public Cobertura getCobertura() {
        return cobertura;
    }

    public void setCobertura(Cobertura cobertura) {
        this.cobertura = cobertura;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    @Override
    public String toString() {
        return "Poliza{" + "cliente=" + cliente + ", vehiculo=" + vehiculo + ", numPoliza=" + numPoliza + ", cantCuotas=" + cantCuotas + ", montoAsegurado=" + montoAsegurado + ", maxGranizo=" + maxGranizo + ", pago=" + pago + ", cobertura=" + cobertura + ", granizo=" + granizo + '}';
    }
    
}
