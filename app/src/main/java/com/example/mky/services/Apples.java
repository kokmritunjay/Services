package com.example.mky.services;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.content.Intent;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public class Apples extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apples);
        Intent intent= new Intent(this,MyService.class);
        startService(intent);
       /* Button button=(Button) findViewById(R.id.apples_button);
        button.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {

                         Intent i = new Intent(this,Bacon.class);
                        startActivity(i);

                    }
                }
        );
        randy
        */
    }
    public void onClick(View view){
        Intent i= new Intent(this,Bacon.class);

        startActivity(i);
    }



}
