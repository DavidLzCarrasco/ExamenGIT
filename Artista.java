package evf.javadoc.original;
// Comentario Examen1
public class Artista {
    String nombreArtista;
	//
    public Artista(String nombreArtista) {
	//Hola
        this.nombreArtista = nombreArtista;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombreArtista='" + nombreArtista + '\'' +
                '}';
    }

    public String getNombreArtista() {
        return nombreArtista;
	//Esto es un comentario
    }
    
    // Prueba Método David López Carrasco
    public String artistaSaluda() {
        return nombreArtista + " dice hola";
    }
}
