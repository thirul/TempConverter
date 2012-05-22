package thiru.sudagoni.tempconverter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

 

public class UnitsActivity extends Activity {

	   @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.units);
	    }
	   
	   @Override
	    public boolean onCreateOptionsMenu(Menu menu)
	    {
	    	MenuInflater inflater = getMenuInflater();
	    	inflater.inflate(R.layout.mainmenu, menu);
	    
	    	return true;
	    }
	    
	    @Override
	    public boolean onOptionsItemSelected(MenuItem item)
	    {
	    	switch(item.getItemId())
	    	{
	    	case R.id.menuitemPreferences:
	    		Toast.makeText(this, "You are selected Preferences menu ", Toast.LENGTH_LONG).show();
	    		break;
	    	case R.id.menuitemUnits:
	    		Toast.makeText(this, "You are selected Units menu  ", Toast.LENGTH_LONG).show();
	    		
	    		final Context context = this;
	        	Intent intent = new Intent(context,UnitsActivity.class);
	        	startActivity(intent);
	    		break;
	    	case R.id.menuitemHome:
	    		final Context context2 = this;
	        	Intent intent2 = new Intent(context2,TempConverterActivity.class);
	        	startActivity(intent2);
	    		break;
	    	}
	    	
	    	return true;
	    }


}
