package Model;

/**
 *
 * @author pipes
 */
public class Peliculas {

    private int id;
    private String titulo;
    private int anioPelicula;
    private String director;
    private String genero;
    private int duracion;
    private String resumen;

    public Peliculas(String titulo, int anioPelicula, String director, String genero, int duracion, String resumen) {
        this.titulo = titulo;
        this.anioPelicula = anioPelicula;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.resumen = resumen;
    }

    public Peliculas() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPelicula() {
        return anioPelicula;
    }

    public void setAnioPelicula(int anioPelicula) {
        this.anioPelicula = anioPelicula;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
    
    
    
    
    

}
