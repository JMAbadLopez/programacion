package es.gva.edu.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import es.gva.edu.model.Flight;
import es.gva.edu.database.ConexionBD;

public class FlightDAO {

    private Connection con = ConexionBD.conectar();

    public boolean insertar(Flight flight) {

        String sql = "INSERT INTO flight (num_flight, destination, departure, duration) VALUES (?, ?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, flight.getNumFlight());
            ps.setString(2, flight.getDestination());
            ps.setDate(3, java.sql.Date.valueOf(flight.getDeparture()));
            ps.setInt(4, flight.getDuration()); // Extracción mediante POJO

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public ArrayList<Flight> obtenerTodos() {
        ArrayList<Flight> lista = new ArrayList<>();
        // Realizamos un JOIN para obtener a la vez los datos del artículo y de su fabricante
        String sql = "SELECT num_flight, destination, departure, duration" +
                " FROM flight";

        try (PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Flight f = new Flight();

                f.setNumFlight(rs.getString("num_flight"));
                f.setDestination(rs.getString("destination"));

                java.sql.Date fechaSql = rs.getDate("departure");
                LocalDate departureSql = fechaSql.toLocalDate();
                f.setDeparture(departureSql);

                f.setDuration(rs.getInt("duration"));
                lista.add(f);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public boolean actualizar(Flight flight) {
        String sql = "UPDATE flight SET num_flight = ?, destination = ?, departure = ?, duration = ? WHERE num_flight = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, flight.getNumFlight());
            ps.setString(2, flight.getDestination());
            ps.setDate(3, java.sql.Date.valueOf(flight.getDeparture()));
            ps.setInt(4, flight.getDuration()); // Extracción mediante POJO
            ps.setString(5, flight.getNumFlight());
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean eliminar(String numFlight) {
        String sql = "DELETE FROM flight WHERE num_flight = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, numFlight);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public ArrayList<Flight> obtenerTodosFiltro(String param, String filter) {

        ArrayList<Flight> lista = new ArrayList<>();
        String sql;

        if(filter.equals("duration")) {
            sql = "SELECT num_flight, destination, departure, duration";
            sql += " FROM flight WHERE duration > 180";
        } else {
            sql = "SELECT num_flight, destination, departure, duration";
            sql += " FROM flight WHERE destination LIKE ?";
        }

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            if(filter.equals("destination")) ps.setString(1, param);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Flight f = new Flight();

                f.setNumFlight(rs.getString("num_flight"));
                f.setDestination(rs.getString("destination"));

                java.sql.Date fechaSql = rs.getDate("departure");
                LocalDate departureSql = fechaSql.toLocalDate();
                f.setDeparture(departureSql);

                f.setDuration(rs.getInt("duration"));
                lista.add(f);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
