
package Controlador;

import Modelo.Reservas;
import Vista.frmReserva;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ctrlReservas implements ActionListener{

    //1.Mandar a llamar a las otras capas
    private Reservas modeloReservas;
    private frmReserva vistaReservas;
    
    //2.Crear el contructor
    public ctrlReservas(Reservas modeloReservas, frmReserva vistaReserva){
        this.modeloReservas=modeloReservas;
        this.vistaReservas=vistaReserva;
        this.vistaReservas.btnReservar.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
          if(e.getSource() == vistaReservas.btnReservar){
              modeloReservas.setPlatillo(vistaReservas.txtPlatillo.getText());
              modeloReservas.setCantidad(vistaReservas.txtCantidad.getText());
              modeloReservas.setNombreReserva(vistaReservas.txtReserva.getText());
              
              modeloReservas.agregarReserva(modeloReservas);
          }
        
    }
    
    
    
}
