package tendenciamusical.app.clases.implementaciones;

import tendenciamusical.app.clases.Cancion;
import tendenciamusical.app.clases.Icono;
import tendenciamusical.app.clases.clasesabstractas.Popularidad;

public class PopularidadAuge extends Popularidad {

    @Override
    public void cambiarPopularidad(Cancion cancion) {
        if ((cancion.getReproducciones() > 50000) && (cancion.getLikes() > 20000)) {
            cancion.setPopularidad(new PopularidadTendencia());
            cancion.setIcono(Icono.FIRE);
        }
        if (cancion.getDislikes() > 5000) {
            cancion.setPopularidad(new PopularidadNormal());
            cancion.setIcono(Icono.MUSICAL_NOTE);
        }
    }

    @Override
    public String leyenda(Cancion cancion) {
        String texto = String.format(
                "%1$s - %2$s - %3$s (%4$s - %5$d)",
                cancion.getIcono().texto(),
                cancion.getArtista(),
                cancion.getNombreCancion(),
                cancion.getAlbum(),
                cancion.getAnio()
        );
        return texto;
    }

}
