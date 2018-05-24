package second.test.aseslib;

import android.app.ListActivity;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import second.test.aseslib.R;

/**
 * Created by Saurabh on 5/24/2018.
 */

public class EaseView extends ListView {
    public CustomAdapter test;
    public EaseView(Context context) {
        super(context);
    }

    public EaseView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        test = new CustomAdapter(getContext());
        setAdapter(test);
    }


    public  void init(Context c , ArrayList<String> upper , ArrayList<String> lower)
    {
        test = new CustomAdapter(c , upper , lower);
        test.notifyDataSetChanged();
        set();
    }

    private void set() {

        setAdapter(test);
    }


    public EaseView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }





}
