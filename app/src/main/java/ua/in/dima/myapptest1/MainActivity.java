package ua.in.dima.myapptest1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnTouchListener {
    TextView tv;
    String down;
    String current;
    String up;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tv= new TextView(this);
        tv.setOnTouchListener(this);
        setContentView(tv);

        }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch( event.getAction()){
            case MotionEvent.ACTION_DOWN:
down="x = "+event.getX()+" y = "+event.getY();
               current="";
                up=" ";
                break;
            case MotionEvent.ACTION_MOVE:
                current="x = "+event.getX()+" y = "+event.getY();
                break;
            case MotionEvent.ACTION_UP:
               up="x = "+event.getX()+" y = "+event.getY();
                break;
        }
        tv.setText(down+"\n"+current+"\n"+up);
        return true;
    }
}
