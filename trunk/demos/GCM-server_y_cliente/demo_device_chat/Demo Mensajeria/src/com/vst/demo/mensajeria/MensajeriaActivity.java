package com.vst.demo.mensajeria;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.vst.android.adapter.CustomListViewAdapter;
import com.vst.android.beans.RowItem;

public class MensajeriaActivity extends Activity implements OnItemClickListener {

	private Context context = this;
	private ProgressDialog pd;
	private ListView listView;
	private List<RowItem> rowItems;
	private CustomListViewAdapter adapter;
	private RowItem item;
	private AsyncTask<Void, Void, Void> task;
	
	public static final String[] titles = new String[] { "Strawberry", "Banana", "Orange", "Mixed" };
	public static final Integer[] images = { R.drawable.android_logo, R.drawable.android_logo, R.drawable.android_logo, R.drawable.android_logo };

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_activity_mensajeria_init);	
		Log.v(MensajeriaActivity.class.getName(), "onCreate  iniciando Activity");	
		validarDatosUsuario();		
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		RowItem row = rowItems.get(position);
		Toast toast = Toast.makeText(getApplicationContext(), "Item " + (position + 1) + ": " + row.getNombre() , Toast.LENGTH_SHORT);
		toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
		toast.show();
	}

	private void validarDatosUsuario() {
		Log.v(MensajeriaActivity.class.getName(), "validarDatosUsuario");
		task = new AsyncTask<Void, Void, Void>() {
			@Override
			protected void onPreExecute() {
				pd = ProgressDialog.show(context, "", "Cargando...", true);
				Log.v(MensajeriaActivity.class.getName(), "ProgressDialog");
			}
			@Override
			protected Void doInBackground(Void... arg0) {
				try {
					Log.v(MensajeriaActivity.class.getName(), "doInBackground init");
					listarUsuarios();				
					Log.v(MensajeriaActivity.class.getName(), "doInBackground termina");
				} catch (Exception e) {
					e.printStackTrace();
				}				
				return null;
			}
			
			@Override
			protected void onPostExecute(Void result) {
				if (pd != null) {
					pd.dismiss();
				}
				Log.v(MensajeriaActivity.class.getName(), "onPostExecute");
			}
		};
		task.execute((Void[]) null);
	}
	
	private void listarUsuarios() {		
		varialesNull();		
		rowItems = new ArrayList<RowItem>();
		for (int i = 0; i < titles.length; i++) {
			item = new RowItem(i, titles[i], null);
			rowItems.add(item);
		}
		listView = (ListView) findViewById(R.id.listview);
		adapter = new CustomListViewAdapter(this, R.layout.list_item, rowItems);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(this);
	}

	private void varialesNull() {
		Log.v(MensajeriaActivity.class.getName(), "rowItems:"+rowItems);
		Log.v(MensajeriaActivity.class.getName(), "item:"+item);
		Log.v(MensajeriaActivity.class.getName(), "listView:"+listView);
		Log.v(MensajeriaActivity.class.getName(), "adapter:"+adapter);
		rowItems = null;
		item = null;
		listView = null;
		adapter = null;		
	}

	@Override
	public void onBackPressed() {
		Log.v(MensajeriaActivity.class.getName(), "onBackPressed");
		super.onBackPressed();
	}
	
	@Override
	protected void onPostResume() {
		Log.v(MensajeriaActivity.class.getName(), "onPostResume");
		super.onPostResume();
	}
	
	@Override
	protected void onPause() {
		Log.v(MensajeriaActivity.class.getName(), "onPause");
		super.onPause();		
	}
	
	@Override
	protected void onDestroy() {
		Log.v(MensajeriaActivity.class.getName(), "onDestroy");
		if (pd != null) {
			pd.dismiss();
		}
		super.onDestroy();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.mensajeria, menu);
		return true;
	}

}
