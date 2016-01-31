package com.example.max.kikooworld.Shard;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.max.kikooworld.Acrobate.AcrobateItems.PlanningGetItem;
import com.example.max.kikooworld.R;
import com.example.max.kikooworld.Token;
import com.example.max.kikooworld.home;
import com.loopj.android.http.RequestParams;

import java.util.ArrayList;
import java.util.HashMap;

public class PlanningFragment extends Fragment {
    private ArrayList<PlanningGetItem> list;
    private ListView live;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        home acti = (home) getActivity();
        RequestParams tok = new RequestParams();
        tok.put("token", Token.value);
        tok.put("start", "2016-01-01");
        tok.put("end", "2016-02-01");
        HashMap hm = new HashMap();
        hm.put("Fragment", this);
        acti.getIntraClient().planningGetRequest(tok, hm);
        return inflater.inflate(R.layout.fragment_planning, container, false);
    }

    public void doPlanning() {

    }

    public void setPlanning(ArrayList<PlanningGetItem> planning) {
        this.list = planning;
    }
}
