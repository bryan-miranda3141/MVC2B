
package Modelo;

import java.sql.*;

public class Reservas {
    
    //Parametros de la clase
    private String platillo;
    private String cantidad;
    private String nombreReserva;
    
    //Getter y Setter

    public String getPlatillo() {
        return platillo;
    }

    public void setPlatillo(String platillo) {
        this.platillo = platillo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombreReserva() {
        return nombreReserva;
    }

    public void setNombreReserva(String nombreReserva) {
        this.nombreReserva = nombreReserva;
    }
    
    //Metodo para los CRUDS
    
    public boolean agregarReserva(Reservas reservasModelo){
        
        try{
            PreparedStatement addReserva = ConexionSQL.getConexion().prepareStatement("insert into tbReservas values(?, ?, ?)");
            addReserva.setString(1, reservasModelo.getPlatillo());
            addReserva.setString(2, reservasModelo.getCantidad());
            addReserva.setString(3, reservasModelo.getNombreReserva());
            addReserva.executeUpdate();
            return true;
        }catch(SQLException ex){
            System.out.println(ex.toString());
            return false;
        }
        
    }
    
}
