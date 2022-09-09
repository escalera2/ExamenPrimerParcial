import java.util.Date;

public class Registro {
    String documentos;
    Date fecha;
    Integer numero;
    String tipo;
    public Registro(){

    }

    public Registro(String documentos, Date fecha, Integer numero, String tipo) {
        this.documentos = documentos;
        this.fecha = fecha;
        this.numero = numero;
        this.tipo = tipo;
    }
}
