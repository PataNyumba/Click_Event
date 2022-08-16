package com.example.event;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.os.Bundle;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.event.databinding.ActivityMainBinding;



public class MainActivity extends AppCompatActivity {
    Button valider;
    TextView Montexte;
    EditText Champ;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Montexte = (TextView) findViewById(R.id.textView2); //afficher le calcul
        valider = (Button) findViewById(R.id.button); //vouton c'est parti
        Champ = (EditText) findViewById(R.id.editTextTextPersonName); // bouton c'est parti



        // un click normal
        valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String maChaine = Champ.getText().toString();
                Montexte.setText("Click normal "+maChaine+" !");
            }
        });
        // un long click
        valider.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                String maChaine = Champ.getText().toString();
                Montexte.setText("Long click "+maChaine+" !");
                return  false;
            }
        });
    }

}