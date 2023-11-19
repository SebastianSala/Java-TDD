package tendenciamusical.app.clases;

public class Icono {

    public static Icono MUSICAL_NOTE = new Icono(new int[]{0xD83C, 0XDFB5});
    public static Icono ROCKET = new Icono(new int[]{0xD93D, 0xDE80});
    public static Icono FIRE = new Icono(new int[]{0xD83D, 0xDD25});

    private final int[] internalEncoding;

    public Icono(int[] internalEncoding) {
        this.internalEncoding = internalEncoding;
    }

    public String texto() {
        return new String(this.internalEncoding, 0, this.internalEncoding.length);
    }

}
