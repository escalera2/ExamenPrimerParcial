public class Documento {
    String nombre;
    String datos;
    String titulo;
    String temas;
    Integer categoria;
    Integer tamaño;
    public Documento(){

    }

    public Documento(String nombre, String datos, String titulo, String temas, Integer categoria, Integer tamaño) {
        this.nombre = nombre;
        this.datos = datos;
        this.titulo = titulo;
        this.temas = temas;
        this.categoria = categoria;
        this.tamaño = tamaño;
    }
}
