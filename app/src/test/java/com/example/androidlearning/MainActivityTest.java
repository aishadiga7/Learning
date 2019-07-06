package com.example.androidlearning;

import android.widget.Toast;

import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class MainActivityTest {



    @Test
    public void test(){


        performClick((a,b,c, __) -> {

            //Toast
        });




    }

    private void performClick(ClickListener clickListener) {
        clickListener.onClick(1,2,3, "");
    }

    interface ClickListener {
        void onClick(int length, int width, int height, String s);
    }

}


