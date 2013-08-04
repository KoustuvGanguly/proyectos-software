package sekth.droid.mostrarnotificacion;

import android.app.Activity;
import android.app.NotificationManager;
import android.os.Bundle;
import android.widget.TextView;

public class NotificationView extends Activity {
	private TextView tv1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
//		System.out.println("Anis");
//		System.out.println("Anis" + getIntent().getExtras().getString("texto"));
		setContentView(R.layout.notification);
		tv1 = (TextView) findViewById(R.id.ani);
		tv1.setText("Anis " + getIntent().getExtras().getString("texto"));

		NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
//		System.out.println("Anis");
		System.out.println("Anis " + getIntent().getExtras().getString("texto"));
		// Cancelamos la Notificacion que hemos comenzado
		nm.cancel(getIntent().getExtras().getInt("notificationID"));
	}

}
