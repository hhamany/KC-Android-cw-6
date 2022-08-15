package com.example.students;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Students> studentsList = new ArrayList<>();
    int studentnum = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        ImageView pic = findViewById(R.id.imageView);
        EditText name = findViewById(R.id.name);
        EditText age = findViewById(R.id.age);
        EditText degree = findViewById(R.id.degree);
        Button next = findViewById(R.id.button);
        Button back = findViewById(R.id.button2);
        Button reset = findViewById(R.id.button3);

        //************************ take rest*******************************************//



                Students student1 = new Students(R.drawable.eren2,"  ايرين  ديبيازا ",17,100);
                Students student2 = new Students(R.drawable.rainer2," راينر احمد كنباوي ",+16,99);
                Students student3 = new Students(R.drawable.mikasa2,"ميكاسا عبد الصمد",19,100);
                Students student4 = new Students(R.drawable.levi,"ليفاي ششة ",18,97);
                Students student5 = new Students(R.drawable.sash,"ساشا برقاوي",19,100);


                studentsList.add(student1);
                studentsList.add(student2);
                studentsList.add(student3);
                studentsList.add(student4);
                studentsList.add(student5);

                pic.setImageResource(studentsList.get(studentnum).getPics());
                name.setText(studentsList.get(studentnum).getNames());
                age.setText(String.valueOf(studentsList.get(studentnum).getAges()));
                degree.setText(String.valueOf(studentsList.get(studentnum).getDegrees()));

               //************************ take rest*******************************************//

         next.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 studentnum++;
               if( studentnum == studentsList.size()){
               studentnum = 0 ;
               }

                 pic.setImageResource(studentsList.get(studentnum).getPics());
                 name.setText(studentsList.get(studentnum).getNames());
                 age.setText(String.valueOf(studentsList.get(studentnum).getAges()));
                 degree.setText(String.valueOf(studentsList.get(studentnum).getDegrees()));


             }
         });

         back.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 studentnum-- ;

                 pic.setImageResource(studentsList.get(studentnum).getPics());
                 name.setText(studentsList.get(studentnum).getNames());
                 age.setText(String.valueOf(studentsList.get(studentnum).getAges()));
                 degree.setText(String.valueOf(studentsList.get(studentnum).getDegrees()));

             }
         });

reset.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        studentnum--;
        if(studentnum > 0){
            studentnum = 0 ;
        }
        pic.setImageResource(studentsList.get(studentnum).getPics());
        name.setText(studentsList.get(studentnum).getNames());
        age.setText(String.valueOf(studentsList.get(studentnum).getAges()));
        degree.setText(String.valueOf(studentsList.get(studentnum).getDegrees()));

    }
});









    }
}