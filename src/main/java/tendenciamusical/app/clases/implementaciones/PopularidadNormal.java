package tendenciamusical.app.clases.implementaciones;

import tendenciamusical.app.clases.Cancion;
import tendenciamusical.app.clases.clasesabstractas.Popularidad;

public class PopularidadNormal extends Popularidad {

    @Override
    public void cambiarPopularidad(Cancion cancion) {
        if (cancion.getReproducciones() > 1000) {
            cancion.setPopularidad(new PopularidadAuge());
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
