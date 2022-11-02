package informatico.to.aplicacionhf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    //creamos objetos de las clases
    Button btndate;
    TextView tvfecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //para el icono en el action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //llamamo a la imagen por su nombre que tiene que estar en drawable
        getSupportActionBar().setIcon(R.drawable.ic_action_name);
        //instanciar la variable local con id  de los componentes del xml
        btndate=(Button)findViewById(R.id.btndate);
        tvfecha=(TextView)findViewById(R.id.tvfecha);

        /*creamos un objeto de una clase y llamamo al metodo de la clase*/
        Time today=new Time(Time.getCurrentTimezone());

        /*Optenemos la fecha actual */
        today.setToNow();
        /*Creamos variables int y llamamos a los atributos de la clase time*/
        int dia=today.monthDay;
        int mes=today.month;
        int ano=today.year;
        /*El mes lo sumamos mas 1 por que la clase time me da un mes atrasado */
        mes=mes+1;
       // tvfecha.setText("Fecha   Dia : " + dia + " Mes : "+mes+" Año : "+ano);

        btndate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        btndate.setText(new Date().toString());
                    }
                });

        Calendar calendar = Calendar.getInstance();
        int dianow=calendar.get(Calendar.DATE);
        int mesnow=calendar.get(Calendar.MONTH);
        int anionow=calendar.get(Calendar.YEAR);

        /*El mes lo sumamos mas 1 por que la clase time me da un mes atrasado */
        mesnow++;
        tvfecha.setText("Fecha   Dia : " + dianow + " Mes : "+mesnow+" Año : "+anionow);
    }
}