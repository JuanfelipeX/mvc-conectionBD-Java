package Controller;

import Model.Peliculas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author pipes
 */
public class PeliculasDAO {

    private Connection conecta = null;

    public void insertarNuevaPelicula(Peliculas peliculas) {
        try {
            if (conecta == null) {
                conecta = Conexion.getConnection();
            }

            String sql = "INSERT INTO peliculas(nombre_pelicula, anio, director, genero, duracion, resumen) VALUES (?, ?, ?, ?, ?, ?);";
            PreparedStatement statement = conecta.prepareStatement(sql);
            statement.setString(1, peliculas.getTitulo());
            statement.setInt(2, peliculas.getAnioPelicula());
            statement.setString(3, peliculas.getDirector());
            statement.setString(4, peliculas.getGenero());
            statement.setInt(5, peliculas.getDuracion());
            statement.setString(6, peliculas.getResumen());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "¡El registro fue agregado exitosamente!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }
    }

}
