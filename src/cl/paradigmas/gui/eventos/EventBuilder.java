package cl.paradigmas.gui.eventos;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import cl.paradigmas.gui.Ventana;
import cl.paradigmas.modelo.Circulo;



final public class EventBuilder {
	static Point pressed = new Point();

	private EventBuilder(){}
	public static java.awt.event.MouseListener eventoCirculo(final Ventana ventana) {
MouseAdapter miMouseAdapter= new MouseAdapter(){
			
			@Override
			public void mouseClicked(MouseEvent e){
				if(ventana.getSeleccionado() == Ventana.CIRCULO){
					Circulo btnCirculo = new Circulo(e.getPoint(),90);
					ventana.getCanvas().addDibujable(btnCirculo);
					ventana.getCanvas().repaint();
				}
			}
			
		};
		
		return miMouseAdapter;
	}
}