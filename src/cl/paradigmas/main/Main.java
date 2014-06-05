package cl.paradigmas.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.util.HashMap;

import cl.paradigmas.gui.eventos.EventBuilder;

import javax.swing.ButtonGroup;
import javax.swing.JButton;

import cl.paradigmas.gui.Canvas;
import cl.paradigmas.gui.Ventana;


public class Main implements ActionListener {

private static final MouseListener MouseListener = null;

public static void main(String[] args) {
Ventana ventana = new Ventana();
JButton btnCirculo = new JButton("CIRCULO");
ventana.getCanvas().addMouseListener(EventBuilder.eventoCirculo(ventana));
ventana.setVisible(true);
}
//canvas(btnCirculo);

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}

}
