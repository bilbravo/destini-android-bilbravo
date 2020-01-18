package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mBottomButton;
    Button mTopButton;
    int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find the views
        mStoryTextView = findViewById(R.id.storyTextView);
        mBottomButton = findViewById(R.id.buttonBottom);
        mTopButton = findViewById(R.id.buttonTop);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if( mStoryIndex == 1 || mStoryIndex == 2) {
                    mStoryIndex = 3;
                    mStoryTextView.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);
                } else if ( mStoryIndex == 3 ) {
                    mStoryTextView.setText(R.string.T6_End);

                }


            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if( mStoryIndex == 1 ) {
                    mStoryIndex = 2;
                    mStoryTextView.setText(R.string.T2_Story);
                    mTopButton.setText(R.string.T2_Ans1);
                    mBottomButton.setText(R.string.T2_Ans2);
                } else if (mStoryIndex == 2 ) {
                    mStoryTextView.setText(R.string.T4_End);
                } else if (mStoryIndex == 3 ) {
                    mStoryTextView.setText(R.string.T5_End);
                }


            }
        });

    }
}
