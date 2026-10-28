
package uni1a;

public class Principal {

    public static void main(String[] args) {

        Pelicula pelicula = new Pelicula(
            "Interestelar", 169, "Ciencia ficción", "Paramount"
        );

        SerieDeTV serie = new SerieDeTV(
            "Dark", 60, "Suspenso", 3
        );

        Documental documental = new Documental(
            "El océano", 50, "Naturaleza", "Vida marina"
        );

        VideoYoutube video = new VideoYoutube(
            "Introducción a Java", 15, "Educativo", "Canal de programación"
        );

        Cortometraje corto = new Cortometraje(
            "El viaje", 20, "Drama", "Carlos Pérez"
        );

        pelicula.mostrarDetalles();
        serie.mostrarDetalles();
        documental.mostrarDetalles();
        video.mostrarDetalles();
        corto.mostrarDetalles();

        System.out.println("Prueba finalizada.");
    }
}
