package tendenciamusical;

import tendenciamusical.app.App;

public class TendenciaMusical {

    public static void main(String[] args) {

        TendenciaMusical.appDescription();

        App app = new App();
        app.runApp();

    }

    private static void appDescription() {
        System.out.println("App tendencias musicales");
        System.out.println("------------------------");
        System.out.println();

    }

}
