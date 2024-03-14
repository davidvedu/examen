package evf.javadoc.original;

 public class Cancion {
    String nombreCancion;
    Artista artista;

	//MI CAMBIO
	private int numero;

    public Cancion(String nombreCancion, Artista artista) {
        this.nombreCancion = nombreCancion;
        this.artista = artista;
    }


    public void reproducirCancion(){
        System.out.println("Reproduciendo la canción "+nombreCancion);
    }


    public String getNombreCancion() {
        return nombreCancion;
    }


    public Artista getArtista() {
        return artista;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "nombreCancion='" + nombreCancion + '\'' +
                ", artista=" + artista +
                '}';
    }
  }

