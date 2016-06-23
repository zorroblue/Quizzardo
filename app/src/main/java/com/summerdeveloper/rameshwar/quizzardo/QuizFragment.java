package com.summerdeveloper.rameshwar.quizzardo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by rameshwar on 23/6/16.
 */
public class QuizFragment extends Fragment {

    TextView tvQuestion;
    EditText etAnswer;
    Button button;
   public QuizFragment()
   {

   }

    public static QuizFragment createNewInstance()
    {
        return new QuizFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.quiz_fragment, container, false);
        tvQuestion=(TextView)view.findViewById(R.id.tvQuestion);
        etAnswer=(EditText)view.findViewById(R.id.etAnswer);
        button=(Button)view.findViewById(R.id.button);
        return view;
    }



}
