package com.example.satyam.tinder_view;


import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.TableRow.LayoutParams;

public class DynamicTable extends Activity {

   /* String companies[] = {"Google","Windows","iPhone","Nokia","Samsung",
            "Google","Windows","iPhone","Nokia","Samsung",
            "Google","Windows","iPhone","Nokia","Samsung"};
    String os[]       =  {"Android","Mango","iOS","Symbian","Bada",
            "Android","Mango","iOS","Symbian","Bada",
            "Android","Mango","iOS","Symbian","Bada"};*/

    String sub_code[] = {"SUB01","SUB02","SUB03","SUB04","SUB05"};
    String sub_name[] = {"Networking","Java","Apache Spark","Android","Clinical Research"};
    String sub_L[] = {"20","25","30","35","40"};
    String sub_T[] = {"15","20","25","30","35"};
    String sub_P[] = {"5","5","5","5","5"};
    String sub_C[] = {"40","50","60","70","80"};

    TableLayout tableLayout;
    TableRow tableRow;
    TextView codeTV,nameTV,lTV,tTV,pTV,cTV;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        tableLayout = findViewById(R.id.maintable);
        addHeaders();
        addData();
    }

    /** This function add the headers to the table **/
    public void addHeaders(){

        /** Create a TableRow dynamically **/
        tableRow = new TableRow(this);
        tableRow.setLayoutParams(new LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT));
        tableRow.setBackgroundResource(R.drawable.border_style);
        tableRow.setGravity(Gravity.CENTER_HORIZONTAL);


        TextView companyTV = new TextView(this);
        companyTV.setText("Syllabus");
        companyTV.setTextSize(23);
        companyTV.setGravity(Gravity.CENTER);
        companyTV.setTextColor(Color.GRAY);
        companyTV.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        companyTV.setPadding(10, 5, 10, 10);
        tableRow.addView(companyTV);  // Adding textView to tablerow.


        /*TextView valueTV = new TextView(this);
        valueTV.setText("Operating Systems");
        valueTV.setTextColor(Color.GRAY);
        valueTV.setPadding(5, 5, 5, 0);
        valueTV.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        tableRow.addView(valueTV); // Adding textView to tablerow.*/


        tableLayout.addView(tableRow, new TableLayout.LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT));

        // we are adding two textviews for the divider because we have two columns
        tableRow = new TableRow(this);
        tableRow.setLayoutParams(new LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT));
        //tableRow.setBackgroundResource(R.drawable.border_style);



        TextView divider = new TextView(this);
        divider.setText("Subject Code");
        divider.setTextSize(20);
        divider.setGravity(Gravity.CENTER);
        divider.setTextColor(Color.GRAY);
        divider.setPadding(5, 0, 0, 0);
        divider.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        tableRow.addView(divider); // Adding textView to tablerow.

        TextView divider2 = new TextView(this);
        divider2.setText("Subject Name");
        divider2.setTextSize(20);
        divider2.setGravity(Gravity.CENTER);
        divider2.setTextColor(Color.GRAY);
        divider2.setPadding(5, 0, 0, 0);
        divider2.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        tableRow.addView(divider2); // Adding textView to tablerow.

        TextView divider3 = new TextView(this);
        divider3.setText("L");
        divider3.setTextSize(20);
        divider3.setGravity(Gravity.CENTER);
        divider3.setTextColor(Color.GRAY);
        divider3.setPadding(5, 0, 0, 0);
        divider3.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        tableRow.addView(divider3); // Adding textView to tablerow.

        TextView divider4 = new TextView(this);
        divider4.setText("T");
        divider4.setGravity(Gravity.CENTER);
        divider4.setTextSize(20);
        divider4.setTextColor(Color.GRAY);
        divider4.setPadding(5, 0, 0, 0);
        divider4.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        tableRow.addView(divider4); // Adding textView to tablerow.

        TextView divider5 = new TextView(this);
        divider5.setText("P");
        divider5.setTextSize(20);
        divider5.setGravity(Gravity.CENTER);
        divider5.setTextColor(Color.GRAY);
        divider5.setPadding(5, 0, 0, 0);
        divider5.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        tableRow.addView(divider5); // Adding textView to tablerow.

        TextView divider6 = new TextView(this);
        divider6.setText("C");
        divider6.setTextSize(20);
        divider6.setGravity(Gravity.CENTER);
        divider6.setTextColor(Color.GRAY);
        divider6.setPadding(5, 0, 0, 0);
        divider6.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        tableRow.addView(divider6); // Adding textView to tablerow.

        // Add the TableRow to the TableLayout
        tableLayout.addView(tableRow, new TableLayout.LayoutParams(
                LayoutParams.FILL_PARENT,
                LayoutParams.WRAP_CONTENT));
    }

    /** This function add the data to the table **/
    public void addData(){

        for (int i = 0; i < sub_code.length; i++)
        {
            /** Create a TableRow dynamically **/
            tableRow = new TableRow(this);
            tableRow.setLayoutParams(new LayoutParams(
                    LayoutParams.MATCH_PARENT,
                    LayoutParams.WRAP_CONTENT));

            /** Creating a TextView to add to the row **/
            codeTV = new TextView(this);
            codeTV.setText(sub_code[i]);
            codeTV.setGravity(Gravity.CENTER);
            codeTV.setTextColor(Color.RED);
            codeTV.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
            codeTV.setPadding(5, 5, 5, 5);
            tableRow.addView(codeTV);  // Adding textView to tablerow.

            /** Creating another textview **/
            nameTV = new TextView(this);
            nameTV.setText(sub_name[i]);
            nameTV.setGravity(Gravity.CENTER);
            nameTV.setTextColor(Color.GREEN);
            nameTV.setPadding(5, 5, 5, 5);
            nameTV.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
            tableRow.addView(nameTV); // Adding textView to tablerow.

            lTV = new TextView(this);
            lTV.setText(sub_L[i]);
            lTV.setGravity(Gravity.CENTER);
            lTV.setTextColor(Color.GREEN);
            lTV.setPadding(5, 5, 5, 5);
            lTV.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
            tableRow.addView(lTV); // Adding textView to tablerow.

            tTV = new TextView(this);
            tTV.setText(sub_T[i]);
            tTV.setGravity(Gravity.CENTER);
            tTV.setTextColor(Color.GREEN);
            tTV.setPadding(5, 5, 5, 5);
            tTV.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
            tableRow.addView(tTV); // Adding textView to tablerow.

            pTV = new TextView(this);
            pTV.setText(sub_P[i]);
            pTV.setGravity(Gravity.CENTER);
            pTV.setTextColor(Color.GREEN);
            pTV.setPadding(5, 5, 5, 5);
            pTV.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
            tableRow.addView(pTV); // Adding textView to tablerow.

            cTV = new TextView(this);
            cTV.setText(sub_C[i]);
            cTV.setGravity(Gravity.CENTER);
            cTV.setTextColor(Color.GREEN);
            cTV.setPadding(5, 5, 5, 5);
            cTV.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
            tableRow.addView(cTV); // Adding textView to tablerow.

            // Add the TableRow to the TableLayout
            tableLayout.addView(tableRow, new TableLayout.LayoutParams(
                    LayoutParams.MATCH_PARENT,
                    LayoutParams.WRAP_CONTENT));
        }
    }
}