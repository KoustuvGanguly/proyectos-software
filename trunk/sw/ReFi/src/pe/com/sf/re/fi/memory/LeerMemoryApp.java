package pe.com.sf.re.fi.memory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import pe.com.sf.re.fi.util.Constantes;

public class LeerMemoryApp {
		
	public static MemoryApp leerMemoryApp(){
		MemoryApp mapp = null;
		FileInputStream fis = null;
		ObjectInputStream in = null;
		try {
			System.out.println(Constantes.FILE_MemoryApp);
			File f= new File(Constantes.FILE_MemoryApp);
			if(f.exists()){
				fis = new FileInputStream(f);
				in = new ObjectInputStream(fis);
				mapp =  (MemoryApp) in.readObject();
				in.close();
			}		
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		System.out.println("leerMemoryApp");
		System.out.println(mapp);
		return mapp;
	}
	

}
