package com.kuroh4su.krenol;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean player = false;
    final short[][] fields = new short[3][3];

    // Player 1 ; krest ; fields = 4 ; player = false
    // Player 2 ; nolik ; fields = 1 ; player = true

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        for (int i = 0; i<fields.length;i++){
            for (int j = 0;j<fields[i].length;j++){
                fields[i][j] = 0;
            }
        }

        final Drawable nolik = getResources().getDrawable(R.drawable.ic_nolik_black);
        final Drawable krest = getResources().getDrawable(R.drawable.ic_krest_black);

        final ImageButton button11 = findViewById(R.id.ib1);
        final ImageButton button12 = findViewById(R.id.ib2);
        final ImageButton button13 = findViewById(R.id.ib3);
        final ImageButton button21 = findViewById(R.id.ib4);
        final ImageButton button22 = findViewById(R.id.ib5);
        final ImageButton button23 = findViewById(R.id.ib6);
        final ImageButton button31 = findViewById(R.id.ib7);
        final ImageButton button32 = findViewById(R.id.ib8);
        final ImageButton button33 = findViewById(R.id.ib9);
        final TextView currentPlayer = findViewById(R.id.currentPlayer);

        int intPlayer = player ? 2 : 1;
        currentPlayer.setText(getString(R.string.currentPlayer, intPlayer));

        button11.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (fields[0][0] == 0) {
                    if (player) {
                        button11.setImageDrawable(nolik);
                        player = false;
                        fields[0][0] = 1;
                    }
                    else {
                        button11.setImageDrawable(krest);
                        player = true;
                        fields[0][0] = 4;
                    }
                    short cw = checkWin();
                    if (cw==2) alert(true);
                    else if (cw==1) alert(false);
                    int intPlayer = player ? 2 : 1;
                    if (cw == 0) currentPlayer.setText(getString(R.string.currentPlayer, intPlayer));
                }
            }
        });

        button12.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (fields[0][1] == 0) {
                    if (player) {
                        button12.setImageDrawable(nolik);
                        player = false;
                        fields[0][1] = 1;
                    }
                    else {
                        button12.setImageDrawable(krest);
                        player = true;
                        fields[0][1] = 4;
                    }
                    short cw = checkWin();
                    if (cw==2) alert(true);
                    else if (cw==1) alert(false);
                    int intPlayer = player ? 2 : 1;
                    if (cw == 0) currentPlayer.setText(getString(R.string.currentPlayer, intPlayer));
                }
            }
        });

        button13.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (fields[0][2] == 0) {
                    if (player) {
                        button13.setImageDrawable(nolik);
                        player = false;
                        fields[0][2] = 1;
                    }
                    else {
                        button13.setImageDrawable(krest);
                        player = true;
                        fields[0][2] = 4;
                    }
                    short cw = checkWin();
                    if (cw==2) alert(true);
                    else if (cw==1) alert(false);
                    int intPlayer = player ? 2 : 1;
                    if (cw == 0) currentPlayer.setText(getString(R.string.currentPlayer, intPlayer));
                }
            }
        });

        button21.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (fields[1][0] == 0) {
                    if (player) {
                        button21.setImageDrawable(nolik);
                        player = false;
                        fields[1][0] = 1;
                    }
                    else {
                        button21.setImageDrawable(krest);
                        player = true;
                        fields[1][0] = 4;
                    }
                    short cw = checkWin();
                    if (cw==2) alert(true);
                    else if (cw==1) alert(false);
                    int intPlayer = player ? 2 : 1;
                    if (cw == 0) currentPlayer.setText(getString(R.string.currentPlayer, intPlayer));
                }
            }
        });

        button22.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (fields[1][1] == 0) {
                    if (player) {
                        button22.setImageDrawable(nolik);
                        player = false;
                        fields[1][1] = 1;
                    }
                    else {
                        button22.setImageDrawable(krest);
                        player = true;
                        fields[1][1] = 4;
                    }
                    short cw = checkWin();
                    if (cw==2) alert(true);
                    else if (cw==1) alert(false);
                    int intPlayer = player ? 2 : 1;
                    if (cw == 0) currentPlayer.setText(getString(R.string.currentPlayer, intPlayer));
                }
            }
        });

        button23.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (fields[1][2] == 0) {
                    if (player) {
                        button23.setImageDrawable(nolik);
                        player = false;
                        fields[1][2] = 1;
                    }
                    else {
                        button23.setImageDrawable(krest);
                        player = true;
                        fields[1][2] = 4;
                    }
                    short cw = checkWin();
                    if (cw==2) alert(true);
                    else if (cw==1) alert(false);
                    int intPlayer = player ? 2 : 1;
                    if (cw == 0) currentPlayer.setText(getString(R.string.currentPlayer, intPlayer));
                }
            }
        });

        button31.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (fields[2][0] == 0) {
                    if (player) {
                        button31.setImageDrawable(nolik);
                        player = false;
                        fields[2][0] = 1;
                    }
                    else {
                        button31.setImageDrawable(krest);
                        player = true;
                        fields[2][0] = 4;
                    }
                    short cw = checkWin();
                    if (cw==2) alert(true);
                    else if (cw==1) alert(false);
                    int intPlayer = player ? 2 : 1;
                    if (cw == 0) currentPlayer.setText(getString(R.string.currentPlayer, intPlayer));
                }
            }
        });

        button32.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (fields[2][1] == 0) {
                    if (player) {
                        button32.setImageDrawable(nolik);
                        player = false;
                        fields[2][1] = 1;
                    }
                    else {
                        button32.setImageDrawable(krest);
                        player = true;
                        fields[2][1] = 4;
                    }
                    short cw = checkWin();
                    if (cw==2) alert(true);
                    else if (cw==1) alert(false);
                    int intPlayer = player ? 2 : 1;
                    if (cw == 0) currentPlayer.setText(getString(R.string.currentPlayer, intPlayer));
                }
            }
        });

        button33.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (fields[2][2] == 0) {
                    if (player) {
                        button33.setImageDrawable(nolik);
                        player = false;
                        fields[2][2] = 1;
                    }
                    else {
                        button33.setImageDrawable(krest);
                        player = true;
                        fields[2][2] = 4;
                    }
                    short cw = checkWin();
                    if (cw==2) alert(true);
                    else if (cw==1) alert(false);
                    int intPlayer = player ? 2 : 1;
                    if (cw == 0) currentPlayer.setText(getString(R.string.currentPlayer, intPlayer));
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.actRecreate) {
            actRecreate();
        }
        return true;
    }

    public void actRecreate() {
        ImageButton button11 = findViewById(R.id.ib1);
        ImageButton button12 = findViewById(R.id.ib2);
        ImageButton button13 = findViewById(R.id.ib3);
        ImageButton button21 = findViewById(R.id.ib4);
        ImageButton button22 = findViewById(R.id.ib5);
        ImageButton button23 = findViewById(R.id.ib6);
        ImageButton button31 = findViewById(R.id.ib7);
        ImageButton button32 = findViewById(R.id.ib8);
        ImageButton button33 = findViewById(R.id.ib9);
        final Drawable blank = getResources().getDrawable(R.drawable.ic_blank_black);
        final TextView currentPlayer = findViewById(R.id.currentPlayer);

        button11.setImageDrawable(blank);
        button11.setEnabled(true);
        button12.setImageDrawable(blank);
        button12.setEnabled(true);
        button13.setImageDrawable(blank);
        button13.setEnabled(true);
        button21.setImageDrawable(blank);
        button21.setEnabled(true);
        button22.setImageDrawable(blank);
        button22.setEnabled(true);
        button23.setImageDrawable(blank);
        button23.setEnabled(true);
        button31.setImageDrawable(blank);
        button31.setEnabled(true);
        button32.setImageDrawable(blank);
        button32.setEnabled(true);
        button33.setImageDrawable(blank);
        button33.setEnabled(true);

        for (int i = 0; i<fields.length;i++){
            for (int j = 0;j<fields[i].length;j++){
                fields[i][j] = 0;
            }
        }

        player = false;
        int intPlayer = player ? 2 : 1;
        currentPlayer.setText(getString(R.string.currentPlayer, intPlayer));
    }

    private short checkWin(){
        int ckRow, ckColumn, ckDiag1 = 0, ckDiag2 = 0, draw = 0;
        for (int i = 0, i1 = 2; i<fields.length; i++, i1--){
            ckRow = 0; ckColumn = 0;
            for (int j = 0; j<fields[i].length; j++){
                ckRow += fields[i][j];
                ckColumn += fields[j][i];
                draw += fields[i][j];
            }
            if (ckRow == 3 || ckRow == 12 || ckColumn == 3 || ckColumn == 12) return 1;

            ckDiag1 += fields[i][i];
            ckDiag2 += fields[i][i1];
        }
        if (draw == 24) return 2;
        else if (ckDiag1 == 3 || ckDiag1 == 12 || ckDiag2 == 3 || ckDiag2 == 12) return 1;
        else return 0;
    }

    private void alert(boolean draw){
        short pl;
        if (player) pl = 1;
        else pl = 2;
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        if (draw) {
            builder.setTitle("Игра закончена!")
                    .setMessage("Ничья!")
                    .setCancelable(true)
                    .setNegativeButton("Ок.",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            });
        }
        else {
            builder.setTitle("Игра закончена!")
                    .setMessage("Победитель: игрок " + pl + "!")
                    .setCancelable(true)
                    .setNegativeButton("Ок.",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            });
        }
        AlertDialog alert = builder.create();
        alert.show();
        disableButtons();
    }

    private void disableButtons(){
        ImageButton button11 = findViewById(R.id.ib1);
        ImageButton button12 = findViewById(R.id.ib2);
        ImageButton button13 = findViewById(R.id.ib3);
        ImageButton button21 = findViewById(R.id.ib4);
        ImageButton button22 = findViewById(R.id.ib5);
        ImageButton button23 = findViewById(R.id.ib6);
        ImageButton button31 = findViewById(R.id.ib7);
        ImageButton button32 = findViewById(R.id.ib8);
        ImageButton button33 = findViewById(R.id.ib9);

        button11.setEnabled(false);
        button12.setEnabled(false);
        button13.setEnabled(false);
        button21.setEnabled(false);
        button22.setEnabled(false);
        button23.setEnabled(false);
        button31.setEnabled(false);
        button32.setEnabled(false);
        button33.setEnabled(false);
    }
}