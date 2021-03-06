package com.example.max.kikooworld.Acrobate;

import android.os.AsyncTask;

import com.example.max.kikooworld.Acrobate.AcrobateItems.PlanningGetItem;
import com.example.max.kikooworld.Shard.PlanningFragment;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Fox on 28/01/2016.
 */

public class PlanningGetResponse extends AsyncTask<HashMap, Void, PlanningGetResponse> {

    @Override
    protected PlanningGetResponse doInBackground(HashMap... s) {
        HashMap hm = s[0];
        ArrayList<PlanningGetItem> planningGetList = new ArrayList<PlanningGetItem>();
        JSONArray jA = null;
        PlanningFragment pf;
        pf = (PlanningFragment) hm.get("Fragment");
        try { jA = new JSONArray((String) hm.get("JSON")); }
        catch (JSONException e) { e.printStackTrace(); }
        try {
            if (jA == null)
                throw new JSONException("NULL");
            for (int i = 0; i < jA.length(); i++)
            {
                JSONObject json = jA.getJSONObject(i);
                String allowedPlanningEnd = json.getString("allowed_planning_end");
                String start = json.getString("start");
                String allowedPlanningStart = json.getString("allowed_planning_start");
                String event_registered = json.getString("event_registered");
                String totalStudentsRegistered = json.getString("total_students_registered");
                String allowRegister = json.getString("allow_register");
                String codemodule = json.getString("codemodule");
                String semester = json.getString("semester");
                String type_code = json.getString("type_code");
                String is_rdv = json.getString("is_rdv");
                String allow_token = json.getString("allow_token");
                String titlemodule = json.getString("titlemodule");
                String in_more_than_one_month = json.getString("in_more_than_one_month");
                String acti_title = json.getString("acti_title");
                String instance_location = json.getString("instance_location");
                String nb_hours = json.getString("nb_hours");
                String roomType;
                String roomSeats;
                try {
                    JSONObject room = json.getJSONObject("room");
                    roomType = room.getString("type");
                    roomSeats = room.getString("seats");
                }
                catch (JSONException e) {
                    roomType = "Not assigned";
                    roomSeats = "Not a Number";
                }
                String odeacti = json.getString("codeacti");
                String codeevent = json.getString("codeevent");
                String codeinstance = json.getString("codeinstance");
                String register_student = json.getString("register_student");
                String type_title = json.getString("type_title");
                String num_event = json.getString("num_event");
                String end = json.getString("end");
                String scolaryear = json.getString("scolaryear");
                String module_registered = json.getString("module_registered");
                String past = json.getString("past");
                String module_available = json.getString("module_available");
                String rdv_group_reg = json.getString("rdv_group_registered");
                String r2 = json.getString("rdv_indiv_registered");
                String p = json.getString("project");
                System.out.println("allow_token == " + allow_token + " event_registered = " + json.getString("event_registered"));
                planningGetList.add(new PlanningGetItem(allowedPlanningEnd, start, allowedPlanningStart, event_registered,
                    totalStudentsRegistered, allowRegister, codemodule, semester, type_code, is_rdv, allow_token,
                    titlemodule, in_more_than_one_month, acti_title, instance_location, nb_hours, roomType, roomSeats, odeacti, codeevent, codeinstance,
                    register_student, type_title, num_event, end, scolaryear, module_registered, past, module_available, rdv_group_reg, r2, p));
        }
            pf.setPlanning(planningGetList);
            } catch (JSONException e) {
            e.printStackTrace();
            pf.setPlanning(null);
        }
        return this;
    }

}
