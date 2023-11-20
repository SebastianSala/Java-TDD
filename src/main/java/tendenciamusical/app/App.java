package tendenciamusical.app;

import tendenciamusical.app.clases.Cancion;

public class App {

    public void runApp() {
        Cancion cancion = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the head", 2002);

        String tempText = cancion.leyenda();
        System.out.println(tempText);
    }

}
