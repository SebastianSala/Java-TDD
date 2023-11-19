package tendenciamusical;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tendenciamusical.app.clases.Cancion;

public class TendenciaMusicalTest {

    private Cancion cancion;

    @BeforeEach
    @ParameterizedTest
    @CsvSource(
            value = {
                    ""
            }
    )
    public void BeforeTests(String nombreCancion, String artista, String album, int anio) {

//        this.cancion.setNombreCancion(nombreCancion);
//        this.cancion.setArtista(artista);
//        this.cancion.setAlbum(album);
//        this.cancion.setAnio(anio);
    }

    @Test
    @Order(1)
    public void cancionLanzamientoPopularidadNormal() {

    }

    @Test
    @Order(2)
    public void cancionAuguePorSuperarMinimoReproducciones() {

    }

    @Test
    @Order(3)
    public void cancionBajaPopularidadPorLimiteDislikes() {

    }

    @Test
    @Order(4)
    public void cancionTendenciaPorReproduccionesYLikes() {

    }

    @Test
    @Order(5)
    public void cancionEnTendenciaBajaPopularidadANormalPorNoReproducirseEn24Hs() {

    }

}
