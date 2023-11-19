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
}
