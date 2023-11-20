package tendenciamusical.app.clases.implementaciones;

import tendenciamusical.app.clases.Cancion;
import tendenciamusical.app.clases.clasesabstractas.Popularidad;

public class PopularidadAuge extends Popularidad {

    @Override
    public void cambiarPopularidad(Cancion cancion) {
        if ((cancion.getReproducciones() > 50000) && (cancion.getLikes() > 20000)) {
            cancion.setPopularidad(new PopularidadTendencia());
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
