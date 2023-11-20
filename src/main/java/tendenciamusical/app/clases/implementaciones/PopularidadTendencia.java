package tendenciamusical.app.clases.implementaciones;

import tendenciamusical.app.clases.Cancion;
import tendenciamusical.app.clases.clasesabstractas.Popularidad;

public class PopularidadTendencia extends Popularidad {

    @Override
    public void cambiarPopularidad(Cancion cancion) {
        if ((cancion.getReproducciones() > 750000) && (cancion.getLikes() > 250000)) {
            cancion.setPopularidad(new PopularidadNormal());
        }
    }

    @Override
    public String leyenda(Cancion cancion) {
        String texto = String.format(
                "%1$s - %2$s - %3$s",
                cancion.getArtista(),
                cancion.getAlbum(),
                cancion.getNombreCancion()
        );
        return texto;
    }

}
