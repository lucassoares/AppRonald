package com.appronald.luas.appronald;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
    private Button sendMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendMsg = (Button)findViewById(R.id.btnSendMsg);

        sendMsg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("ForcaGame");
                intent.addCategory("Forca");
                intent.putExtra("game","Jogo7");
                Log.d("INFO","SUCESSO");
                startActivity(intent);
            }
        });
    }
}
