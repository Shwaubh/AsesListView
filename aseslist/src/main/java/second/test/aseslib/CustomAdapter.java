package second.test.aseslib;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Saurabh on 5/24/2018.
 */

public class CustomAdapter extends BaseAdapter {
    Context c;
    static int iy =0;
    ArrayList<String> upper;
    ArrayList<String> lower;
    public CustomAdapter(Context c, ArrayList<String> upper , ArrayList<String> lower)
    {
     this.c = c;
     this.upper = upper;
     this.lower = lower;
    }
    public CustomAdapter(Context c)
    {
        this.c = c;
    }
    @Override
    public int getCount() {
        if(upper!=null)
        return upper.size();
        else
            return 111;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View v = convertView ;
        if(v == null)
        {
            v = View.inflate(c , R.layout.list_items , null);

            //v.setTag();
        }
        if(upper != null) {
            TextView tv = (TextView) v.findViewById(R.id.text1);
            TextView tv1 = (TextView) v.findViewById(R.id.text2);
            try {
                tv.setText(upper.get(position));
                tv1.setText(lower.get(position));
            } catch (Exception e) {
                tv.setText("Incomplete");
                tv1.setText("Incomplete");
            }
        }
        return v;
    }
}
