package thiru.sudagoni.tempconverter;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class TempConverterActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
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
    	}
    	
    	return true;
    }
    
    public void onClickGo(View view)
    {
    	
    	EditText temp = (EditText)findViewById(R.id.txtTemp);
    	RadioButton rblCelcius = (RadioButton)findViewById(R.id.rdCelcius);
    	RadioButton rblFahrenheit = (RadioButton)findViewById(R.id.rdFarhenheit);
    	TextView lblResult = (TextView )findViewById(R.id.lblResult); 
    	
    	if(temp.getText().length()==0)
    	{
    		Toast.makeText(this, "Please enter temperature",Toast.LENGTH_LONG).show();
    		return;
    	}
    	
    	float tempVal = Float.parseFloat(temp.getText().toString());
    	
    	
    	if(rblFahrenheit.isChecked())
    	{
    		float result = ToFarhenheit(tempVal);
    		
    		lblResult.setText( "Result: "+ String.format("%.02f",result) +" Fahrenheit");
    		
    	}
    	else
    	{
    		float result = ToCelcius (tempVal);
    		
    		lblResult.setText("Result: "+ String.format("%.02f",result) +" Celsius");
    	}
    	
    
    }
    
    private float ToCelcius(float temp)
    {
    	return ((temp-32)*5/9);
    }
    private float ToFarhenheit(float temp)
    {
    	return ((temp*9)/5)+32;
    }
}














