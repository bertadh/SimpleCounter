package edu.upc.eseiaat.pma.simplecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edit_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_num = (EditText) findViewById(R.id.edit_num);
    }

    public void increase (View v){
        //Log.i("bertadh","Increment clicat");
        String snum = edit_num.getText().toString();
        int num = Integer.parseInt(snum)+1;
        snum = Integer.toString(num);
        edit_num.setText(snum);
    }

    public void decrement(View v){
        //Log.i("bertadh","Decrement clicat");
        String snum = edit_num.getText().toString();
        int num = Integer.parseInt(snum)-1;
        snum = Integer.toString(num);
        edit_num.setText(snum);
    }
}
