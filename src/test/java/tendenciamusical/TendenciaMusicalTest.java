package tendenciamusical;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tendenciamusical.app.clases.Cancion;
import tendenciamusical.app.clases.implementaciones.PopularidadAuge;
import tendenciamusical.app.clases.implementaciones.PopularidadNormal;
import tendenciamusical.app.clases.implementaciones.PopularidadTendencia;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TendenciaMusicalTest {

    private Cancion cancion;

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

        this.cancion = new Cancion("The Scientist", "Coldplay", "A rush to the head", 2002) ;
        this.cancion.setDislikes(0);
        this.cancion.setLikes(0);
        this.cancion.setReproducciones(0);
        this.cancion.setHorasDesdeUltimaReproduccion(0);

//        this.cancion.setNombreCancion("The Scientist");
//        this.cancion.setNombreCancion("The Scientist");
//        this.cancion.setArtista("Coldplay");
//        this.cancion.setAlbum("A rush to the head");
//        this.cancion.setAnio(2002);
    }

    @Test
    @Order(1)
    public void cancionLanzamientoPopularidadNormal() {

        String output = this.cancion.leyenda();
//        System.out.println(output);
//        System.out.println("\uD83C\uDFB5 - Coldplay - A rush to the head - The Scientist");
//        assertTrue(this.cancion.leyenda().equals("\uD83C\uDFB5 - Coldplay - A rush to the head - The Scientist"));
        assertEquals("\uD83C\uDFB5 - Coldplay - A rush to the head - The Scientist", this.cancion.leyenda());

    }

    @Test
    @Order(2)
    public void cancionAuguePorSuperarMinimoReproducciones() {

        this.cancion.setReproducciones(1001);

//        this.cancion.setDislikes(5001);

//        this.cancion.cambiarPopularidad();

//        System.out.println(this.cancion.leyenda());

        assertEquals("\uD83D\uDE80 - Coldplay - The Scientist (A rush to the head - 2002)", this.cancion.leyenda());

    }

    @Test
    @Order(3)
    public void cancionBajaPopularidadPorLimiteDislikes() {
        cancion.setPopularidad(new PopularidadAuge());
//        cancion.setPopularidad(new PopularidadNormal());
        cancion.setDislikes(5001);

//        System.out.println(cancion.leyenda());
        assertEquals("\uD83C\uDFB5 - Coldplay - A rush to the head - The Scientist", cancion.leyenda());

    }

    @Test
    @Order(4)
    public void cancionTendenciaPorReproduccionesYLikes() {
        cancion.setReproducciones(50001);
        cancion.setLikes(20001);

//        System.out.println(cancion.leyenda());
        assertEquals("\uD83D\uDD25 - The Scientist - Coldplay (A rush to the head - 2002)", cancion.leyenda());
    }

    @Test
    @Order(5)
    public void cancionEnTendenciaBajaPopularidadANormalPorNoReproducirseEn24Hs() {
        cancion.setPopularidad(new PopularidadTendencia());
//        cancion.setHorasDesdeUltimaReproduccion(25);
//        cancion.setHorasDesdeUltimaReproduccion(20);

        System.out.println(cancion.leyenda());

    }

}
