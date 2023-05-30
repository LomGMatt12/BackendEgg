package guia11ext03.entidades;


public class Cliente {
    private String nombreApellido,eMail,domicilio;
    private int telefono,dni;

    public Cliente() {
    }

    public Cliente(String nombreApellido, String eMail, String domicilio, int telefono, int dni) {
        this.nombreApellido = nombreApellido;
        this.eMail = eMail;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.dni = dni;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombreApellido=" + nombreApellido + ", eMail=" + eMail + ", domicilio=" + domicilio + ", telefono=" + telefono + ", dni=" + dni + '}';
    }
}
