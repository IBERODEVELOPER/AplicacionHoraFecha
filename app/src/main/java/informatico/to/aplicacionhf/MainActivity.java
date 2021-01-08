package informatico.to.aplicacionhf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    //creamos objetos de las clases
    Button btnDate;
    TextView vt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //para el icono en el action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //llamamo a la imagen por su nombre que tiene que estar en drawable
        getSupportActionBar().setIcon(R.drawable.ic_action_name);
        //instanciar la variable local con id  de los componentes del xml
        btnDate=(Button)findViewById(R.id.btnDate);
        vt=(TextView)findViewById(R.id.txtview);
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
        vt.setText("Fecha   Dia : " + dia + " Mes : "+mes+" Año : "+ano);

        btnDate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        btnDate.setText(new Date().toString());
                    }
                });
    }
}