package eventoscep.posgrado.unam.mx.eventos_cep;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;


/**
 * Created by Luis Alfredo on 07/02/2017.
 */

public class AcerdaDe extends AppCompatActivity implements View.OnClickListener {

    private TextView twitter;
    private TextView facebook;
    private ImageView twitter_logo;
    private ImageView facebook_logo;
    private ImageView cep;

    private String direccion_url;

    private String url_twitter = "https://twitter.com/cepunam";
    private String url_facebook = "https://www.facebook.com/UNAMPosgrado";
    private String url_cep = "http://www.posgrado.unam.mx";


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acerca_de);

        TextView twitter = (TextView) findViewById(R.id.twitter);
        twitter_logo = (ImageView) findViewById(R.id.twitter_logo);
        TextView facebook = (TextView) findViewById(R.id.facebook);
        facebook_logo = (ImageView) findViewById(R.id.facebook_logo);
        cep = (ImageView) findViewById(R.id.image_cep);

        direccion_url = "";

        twitter.setOnClickListener(this);
        twitter_logo.setOnClickListener(this);
        facebook.setOnClickListener(this);
        facebook_logo.setOnClickListener(this);
        cep.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.twitter:
                direccion_url = url_twitter;
                iraWeb(direccion_url);
                break;
            case R.id.twitter_logo:
                direccion_url = url_twitter;
                iraWeb(direccion_url);
                break;
            case R.id.facebook:
                direccion_url = url_facebook;
                iraWeb(direccion_url);
                break;
            case R.id.facebook_logo:
                direccion_url = url_facebook;
                iraWeb(direccion_url);
                break;
            case R.id.image_cep:
                direccion_url = url_cep;
                iraWeb(direccion_url);
                break;
            default:
                break;
        }

    }

    public void iraWeb(String d) {
        Uri uri = Uri.parse(d);
        Intent intentNav = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intentNav);
    }

}
