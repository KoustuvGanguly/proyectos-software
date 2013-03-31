package pe.com.sf.re.fi.analisis.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.Serializable;

import javax.swing.JFrame;

import org.jdesktop.swingx.JXFrame;

import pe.com.sf.re.fi.util.Propes;

public class Principal extends JXFrame implements Serializable {

	private static final long serialVersionUID = -4550679687084521316L;

	public int ancho_pantalla;
	public int alto_pantalla;

	public PanelNorte panNorte = null;
	public PanelCentral panCentral = null;
		
	public Principal(String title) {
		super(title);
		ancho_pantalla = Toolkit.getDefaultToolkit().getScreenSize().width - 150;
		alto_pantalla = Toolkit.getDefaultToolkit().getScreenSize().height - 150;
		this.setMinimumSize(new Dimension(ancho_pantalla / 2, alto_pantalla / 2));
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(ancho_pantalla, alto_pantalla);
		// this.setPreferredSize(new Dimension(200, 200));
		// this.setLocation(ancho_pantalla - (ancho_pantalla/2), alto_pantalla -
		// (alto_pantalla/2));
		componetPanels();
		this.pack();
		// addComponents();
	}

	private void componetPanels() {
		panNorte =  new PanelNorte(this);
		panNorte.setVisible(true);	
		
		panCentral = new PanelCentral(this);
		panCentral.setVisible(true);		

		this.add(panNorte, BorderLayout.NORTH);
		this.add(panCentral, BorderLayout.CENTER);

	}

	public void cambiarTitulo( String title) {
		setTitle(Propes.getProperty("titulo") + " - " + title);
	}

	public void resertTitulo() {
		setTitle(Propes.getProperty("titulo"));
	}

}