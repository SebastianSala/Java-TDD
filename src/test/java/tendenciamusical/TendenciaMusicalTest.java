package tendenciamusical;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import tendenciamusical.app.clases.Cancion;
import tendenciamusical.app.clases.Icono;
import tendenciamusical.app.clases.implementaciones.PopularidadAuge;
import tendenciamusical.app.clases.implementaciones.PopularidadTendencia;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TendenciaMusicalTest {

    private Cancion cancion;

    private final String normalOutput = "\uD83C\uDFB5 - Coldplay - A rush to the head - The Scientist";
    private final String augeOutput = "\uD83D\uDE80 - Coldplay - The Scientist (A rush to the head - 2002)";
    private final String tendenciaOutput = "\uD83D\uDD25 - The Scientist - Coldplay (A rush to the head - 2002)";

    @BeforeEach
//    @ParameterizedTest
//    @CsvSource(
//            value = {
//                    "nombreCancion:The Scientist",
//                    "artista:Coldplay",
//                    "album:A rush to the head",
//                    "anio:2002"
//            },
//            delimiter = '='
//    )
    public void BeforeTests() {
        this.cancion = new Cancion("The Scientist", "Coldplay", "A rush to the head", 2002);
    }

    @Test
    @Order(1)
    public void cancionLanzamientoPopularidadNormal() {

        assertEquals(this.normalOutput, this.cancion.leyenda());

    }

    @Test
    @Order(2)
    public void cancionAuguePorSuperarMinimoReproducciones() {
        this.cancion.setReproducciones(1001);

        assertEquals(this.augeOutput, this.cancion.leyenda());
    }

    @Test
    @Order(3)
    public void cancionBajaPopularidadPorLimiteDislikes() {
        this.cancion.setPopularidad(new PopularidadAuge());
        this.cancion.setDislikes(5001);

        assertEquals(this.normalOutput, this.cancion.leyenda());
    }

    @Test
    @Order(4)
    public void cancionTendenciaPorReproduccionesYLikes() {
        this.cancion.setReproducciones(50001);
        this.cancion.setLikes(20001);

        assertEquals(this.tendenciaOutput, cancion.leyenda());
    }

    @Test
    @Order(5)
    public void cancionEnTendenciaBajaPopularidadANormalPorNoReproducirseEn24Hs() {
        this.cancion.setPopularidad(new PopularidadTendencia());
        this.cancion.setIcono(Icono.FIRE);

        this.cancion.setHorasDesdeUltimaReproduccion(25);

        assertEquals(this.normalOutput, this.cancion.leyenda());
    }


}