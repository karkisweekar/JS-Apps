package com.js.nepalidateconverter.tab;

import java.util.Calendar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.js.nepalidateconverter.R;
import com.js.nepalidateconverter.dateconverter.NepaliCalendar;
import com.js.nepalidateconverter.dateconverter.NepaliDate;
import com.js.nepalidateconverter.dateconverter.NepaliDateException;
import com.js.nepalidateconverter.util.DateUtil;

/**
 * Created by Sweekar karki
 */
public class BStoADTab extends Fragment implements AdapterView.OnItemSelectedListener{

    TextView t;
    int startingNepYear = 1900;

    int startingNepMonth = 1;

    int startingNepDay = 1;

    int dayOfWeek = Calendar.WEDNESDAY;

    int startingEngYear = 1943;

    int startingEngMonth = 4;

    int startingEngDay = 14;

    Button convert;
    Spinner spinner1, spinner2, spinner3;
    String s1, s2, s3;
    int nepYear, nepMonth, nepDate;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.bstoad,container,false);

        t = (TextView) v.findViewById(R.id.text);
        spinner1 = (Spinner) v.findViewById(R.id.engspiner1);
        spinner2 = (Spinner) v.findViewById(R.id.engspinner2);
        spinner3 = (Spinner) v.findViewById(R.id.engspinner3);

        ArrayAdapter<?> adapter3 = ArrayAdapter.createFromResource(
                getActivity(), R.array.nepdays,
                android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<?> adapter2 = ArrayAdapter.createFromResource(
                getActivity(), R.array.monthInNepali,
                android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter<?> adapter1 = ArrayAdapter.createFromResource(
                getActivity(), R.array.nepyear,
                android.R.layout.simple_spinner_dropdown_item);
        // Specify the layout to use when the list of choices appears
        // Apply the adapter to the spinner
        spinner1.setAdapter(adapter1);
        spinner2.setAdapter(adapter2);
        spinner3.setAdapter(adapter3);
        spinner1.setOnItemSelectedListener(this);
        spinner2.setOnItemSelectedListener(this);
        spinner3.setOnItemSelectedListener(this);

        return v;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        s1 = spinner1.getSelectedItem().toString();
        nepYear = Integer.valueOf(s1);

        s3 = spinner3.getSelectedItem().toString();
        nepDate = Integer.valueOf(s3);

        nepMonth = 1 + spinner2.getSelectedItemPosition();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);

        convert = (Button)getActivity().findViewById(R.id.convertB);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int nepaliYear = nepYear;
                int nepaliMonth = nepMonth;
                int nepaliDate = nepDate;

                int engYear = startingEngYear;
                int engMonth = startingEngMonth;
                int engDay = startingEngDay;


                try {
                    NepaliCalendar nepCal = new NepaliCalendar();
                    NepaliDate nd = new NepaliDate(nepaliYear,nepaliMonth,nepaliDate);
                    String adDate = nepCal.convertNepaliToGregorianDate(nd).toString();
                    engYear = (Integer.valueOf(adDate.substring(24,28)));
                    String englMonth = adDate.substring(4,7);
                    engDay = Integer.valueOf(adDate.substring(8,10));
                    String day = adDate.substring(0,3);

                    DateUtil du = new DateUtil();
                    String monInNepali = du.getMonthInNepali((nepaliMonth));
                    String yeaInNepali = du.getYearInNepali(String.valueOf(nepaliYear));
                    String dayInNepali = du.getDayInNepali(nepaliDate);

                    t.setText("Converted date is:  \n\n" + engYear + " - " + englMonth + " - " + engDay + "  " + day);
                } catch (NepaliDateException e) {
                    e.printStackTrace();
                }


                long totalNepDaysCount = 0;



            }
        });
    }
}
