package eventoscep.posgrado.unam.mx.eventos_cep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAcercade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAcercade = (Button)findViewById(R.id.envia_acerca);

        btnAcercade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Acercade = new Intent(MainActivity.this, AcerdaDe.class);
                startActivity(Acercade);

            }
        });


    }
}
