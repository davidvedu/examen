package evf.javadoc.original;
//ESTO ES UN COMENTARIO
public class Artista {
    String nombreArtista;

    public Artista(String nombreArtista) {
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

	//DAVID VELASCO DURAN 
	public void cambiarNombreArtista(String nombre){
		this.nombreArtista = nombre;
	}
    
}


