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
}
