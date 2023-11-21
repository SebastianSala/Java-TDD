package tendenciamusical.app.clases;

//import org.projectlombok;

import lombok.Getter;
import lombok.Setter;
import tendenciamusical.app.clases.clasesabstractas.Popularidad;
import tendenciamusical.app.clases.implementaciones.PopularidadNormal;

@Getter
@Setter
public class Cancion {

    private Popularidad popularidad;

    private Icono icono;

    private String nombreCancion;
    private String artista;
    private String album;
    private int anio;
    private int reproducciones;
    private int horasDesdeUltimaReproduccion;
    private int likes;
    private int dislikes;

    public Cancion(String nombreCancion, String artista, String album, int anio) {
        this.icono = Icono.MUSICAL_NOTE;
        this.popularidad = new PopularidadNormal();
        this.nombreCancion = nombreCancion;
        this.artista = artista;
        this.album = album;
        this.anio = anio;
    }

    public void cambiarPopularidad() {
        this.popularidad.cambiarPopularidad(this);
    }

    public String leyenda() {
        this.cambiarPopularidad();
        return this.popularidad.leyenda(this);
    }


}
