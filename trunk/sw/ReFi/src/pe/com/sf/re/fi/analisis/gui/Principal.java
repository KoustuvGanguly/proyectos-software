package pe.com.sf.re.fi.analisis.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.Serializable;

import javax.swing.JFrame;

import org.jdesktop.swingx.JXFrame;

import pe.com.sf.re.fi.memory.GuardarMemoryApp;
import pe.com.sf.re.fi.memory.LeerMemoryApp;
import pe.com.sf.re.fi.memory.MemoryApp;
import pe.com.sf.re.fi.util.Propes;

public class Principal extends JXFrame implements Serializable {

	private static final long serialVersionUID = -4550679687084521316L;

	public int ancho_pantalla;
	public int alto_pantalla;

	public PanelNorte panNorte = null;
	public PanelCentral panCentral = null;
	public MemoryApp memoryApp = LeerMemoryApp.leerMemoryApp();	
	
	
	@SuppressWarnings("deprecation")
	public Principal(String title) {
		super(title);
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		if(memoryApp!=null){
			ancho_pantalla = memoryApp.getAnchoPantalla();
			alto_pantalla = memoryApp.getAltoPantalla();
			this.setMinimumSize(new Dimension(ancho_pantalla / 2, alto_pantalla / 2));
			this.setSize(ancho_pantalla, alto_pantalla);
			// this.setPreferredSize(new Dimension(200, 200));
			// this.setLocation(ancho_pantalla - (ancho_pantalla/2), alto_pantalla - (alto_pantalla/2));
		}else{
			memoryApp = new MemoryApp();
			ancho_pantalla = Toolkit.getDefaultToolkit().getScreenSize().width - 150;
			alto_pantalla = Toolkit.getDefaultToolkit().getScreenSize().height - 150;
			this.setMinimumSize(new Dimension(ancho_pantalla / 2, alto_pantalla / 2));
			this.setSize(ancho_pantalla, alto_pantalla);
			// this.setPreferredSize(new Dimension(200, 200));
			// this.setLocation(ancho_pantalla - (ancho_pantalla/2), alto_pantalla - (alto_pantalla/2));
		}	
		componetPanels();
		cargarMemoryApp();
		this.pack();
		this.show();//levanta el jframe
//		this.setVisible(true);// lo hace visible
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

	public void cargarMemoryApp(){
		if(memoryApp!=null){
			System.out.println(memoryApp.getRuta());
			if(memoryApp.getRuta()!=null){
				panNorte.chooser.setCurrentDirectory(new File(memoryApp.getRuta()));					
			}		
		}		
	}
	
	public void guardarMemoryApp(){
		GuardarMemoryApp.guardarMemoryApp(memoryApp);
	}

}