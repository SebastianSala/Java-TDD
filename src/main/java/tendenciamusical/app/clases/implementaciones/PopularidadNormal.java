package tendenciamusical.app.clases.implementaciones;

import tendenciamusical.app.clases.Cancion;
import tendenciamusical.app.clases.Icono;
import tendenciamusical.app.clases.clasesabstractas.Popularidad;

public class PopularidadNormal extends Popularidad {

    @Override
    public void cambiarPopularidad(Cancion cancion) {
        if ((cancion.getReproducciones() > 50000) && (cancion.getLikes() > 20000)) {
            cancion.setPopularidad(new PopularidadTendencia());
            cancion.setIcono(Icono.FIRE);
        } else if ((cancion.getReproducciones() > 1000)) {
            cancion.setPopularidad(new PopularidadAuge());
            cancion.setIcono(Icono.ROCKET);
        }
    }

    @Override
    public String leyenda(Cancion cancion) {
        String texto = String.format(
                "%1$s - %2$s - %3$s - %4$s",
                cancion.getIcono().texto(),
                cancion.getArtista(),
                cancion.getAlbum(),
                cancion.getNombreCancion()
        );
        return texto;
    }

}
