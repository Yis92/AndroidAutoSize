package me.jessyan.autosize.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import me.jessyan.autosize.internal.UseAdapt;


/**
 * Created by liuyi on 2019-10-31.
 */
public class AutoSizeTryActivity extends AppCompatActivity  implements UseAdapt {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_auto_size_try);
    }
}
