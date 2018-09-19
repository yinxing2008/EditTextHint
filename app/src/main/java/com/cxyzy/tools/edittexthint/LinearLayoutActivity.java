package com.cxyzy.tools.edittexthint;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * @author 程序园中猿
 */
public class LinearLayoutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);
        new EditTextHint(this, "LinearLayout中为EditText添加hint", R.id.editText).hintColor(Color.RED).hintSizeInDp(12).showHint();
    }


}
