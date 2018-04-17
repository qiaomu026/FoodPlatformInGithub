package edu.ouc.foodplatform;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Qiao on 2018/4/16.
 */

public class foodFragment extends Fragment {
    private ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_food_layout,container,false);
        listView = (ListView)view.findViewById(R.id.food_lv);
        List<Map<String,Object>> list = getData();
        listView.setAdapter(new ListViewAdapter(getActivity(),list));
        return view;
    }

    public List<Map<String, Object>> getData(){
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        for (int i=0;i<10;i++){
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("image", R.drawable.ic_launcher_background);
        map.put("title","zheshiyigexinxi"+i);
        map.put("info","zheshixiangxixinxi "+i);
        list.add(map);
        }
        return list;
    }
}
