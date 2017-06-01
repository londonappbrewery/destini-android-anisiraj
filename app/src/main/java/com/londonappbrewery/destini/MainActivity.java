package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.R.attr.y;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView storyText;
    private Button topButton;
    private Button bottomButton;
    private int mStoryIndex=R.string.T1_Story;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyText=(TextView) findViewById(R.id.storyTextView);
        topButton=(Button)findViewById(R.id.buttonTop);
        bottomButton=(Button)findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mStoryIndex==R.string.T1_Story){
                    storyText.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    bottomButton.setText(R.string.T3_Ans2);
                    mStoryIndex=R.string.T3_Story;
                }else if(mStoryIndex==R.string.T2_Story){
                    storyText.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    bottomButton.setText(R.string.T3_Ans2);
                    mStoryIndex=R.string.T3_Story;

                }else if( mStoryIndex==R.string.T3_Story){
                    storyText.setText(R.string.T6_End);
                    topButton.setVisibility(view.GONE);
                    bottomButton.setVisibility(view.GONE);
                    mStoryIndex=R.string.T6_End;
                }
                else{

                }
            }
        });
        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex==R.string.T1_Story){
                    storyText.setText(R.string.T2_Story);
                    topButton.setText(R.string.T2_Ans1);
                    bottomButton.setText(R.string.T2_Ans2);
                    mStoryIndex=R.string.T2_Story;
                }else if(mStoryIndex==R.string.T2_Story){
                    storyText.setText(R.string.T4_End);
                    topButton.setVisibility(view.GONE);
                    bottomButton.setVisibility(view.GONE);
                    mStoryIndex=R.string.T4_End;

                }else if( mStoryIndex==R.string.T3_Story){
                    storyText.setText(R.string.T5_End);
                    topButton.setVisibility(view.GONE);
                    bottomButton.setVisibility(view.GONE);
                    mStoryIndex=R.string.T5_End;
                }
                else{

                }

            }
        });


    }
}
