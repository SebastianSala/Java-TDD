package tendenciamusical.app.clases.implementaciones;

import tendenciamusical.app.clases.Cancion;
import tendenciamusical.app.clases.Icono;
import tendenciamusical.app.clases.clasesabstractas.Popularidad;

public class PopularidadTendencia extends Popularidad {

    @Override
    public void cambiarPopularidad(Cancion cancion) {
        if (cancion.getHorasDesdeUltimaReproduccion() > 24) {
            cancion.setPopularidad(new PopularidadNormal());
            cancion.setIcono(Icono.MUSICAL_NOTE);
        }
    }

    @Override
    public String leyenda(Cancion cancion) {
        String texto = String.format(
                "%1$s - %2$s - %3$s (%4$s - %5$d)",
                cancion.getIcono().texto(),
                cancion.getNombreCancion(),
                cancion.getArtista(),
                cancion.getAlbum(),
                cancion.getAnio()
        );
        return texto;
    }

}
