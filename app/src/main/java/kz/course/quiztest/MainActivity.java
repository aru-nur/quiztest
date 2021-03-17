package kz.course.quiztest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_surak1, tv_surak2, tv_surak3, tv_surak4;
    RadioButton rb_s1_jauap1, rb_s1_jauap2;
    RadioButton rb_s2_jauap1, rb_s2_jauap2;
    RadioButton rb_s3_jauap1, rb_s3_jauap2;
    RadioButton rb_s4_jauap1, rb_s4_jauap2;
    Button btn_tekseris;
    String [] suraktar = {"1+1=?", "2+2=?", "4+4=?", "10+10=?",};

    String [][] variznt = {
            {"2", "3"},
            {"13", "4"},
            {"16", "8"},
            {"20", "100"},
    };
    String [] jauaptar = {"2", "4", "8", "20"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_surak1 = findViewById(R.id.tv_surak1);
        tv_surak2 = findViewById(R.id.tv_surak2);
        tv_surak3 = findViewById(R.id.tv_surak3);
        tv_surak4 = findViewById(R.id.tv_surak4);

        rb_s1_jauap1 = findViewById(R.id.rb_s1_jauap1);
        rb_s1_jauap2 = findViewById(R.id.rb_s1_jauap2);

        rb_s2_jauap1 = findViewById(R.id.rb_s2_jauap1);
        rb_s2_jauap2 = findViewById(R.id.rb_s2_jauap2);

        rb_s3_jauap1 = findViewById(R.id.rb_s3_jauap1);
        rb_s3_jauap2 = findViewById(R.id.rb_s3_jauap2);

        rb_s4_jauap1 = findViewById(R.id.rb_s4_jauap1);
        rb_s4_jauap2 = findViewById(R.id.rb_s4_jauap2);

        btn_tekseris = findViewById(R.id.btn_tekseris);
        suraktarJinau();

        btn_tekseris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rb_s1_jauap1.isChecked() &&
                       rb_s1_jauap1.getText().toString().equals(jauaptar[0])){
                    tv_surak1.setText(suraktar[0]+"\ncorrect");
                    tv_surak1.setTextColor(getResources().getColor(R.color.black));
                }else if(rb_s1_jauap2.isChecked() &&
                rb_s1_jauap2.getText().toString().equals(jauaptar[0])){
                    tv_surak1.setText(suraktar[0]+"\ncorrect");
            }else{
                    tv_surak1.setText(suraktar[0]+"\nwrong");
                }
        });
    }
    public void suraktarJinau(){
        tv_surak1.setText(suraktar[0]);
        rb_s1_jauap1.setText(variznt[0][0]);
        rb_s1_jauap2.setText(variznt[0][1]);

        tv_surak2.setText(suraktar[1]);
        rb_s2_jauap1.setText(variznt[1][0]);
        rb_s2_jauap2.setText(variznt[1][1]);

        tv_surak3.setText(suraktar[2]);
        rb_s3_jauap1.setText(variznt[2][0]);
        rb_s3_jauap2.setText(variznt[2][1]);

        tv_surak4.setText(suraktar[3]);
        rb_s4_jauap1.setText(variznt[3][0]);
        rb_s4_jauap2.setText(variznt[3][1]);
    }
}