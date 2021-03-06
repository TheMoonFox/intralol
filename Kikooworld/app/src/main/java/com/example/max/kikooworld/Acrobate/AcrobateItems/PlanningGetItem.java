package com.example.max.kikooworld.Acrobate.AcrobateItems;

/**
 * Created by Fox on 29/01/2016.
 */

public class PlanningGetItem
{
    private final String event_registered;
    private String allowedPlanningEnd;
    private String start;
    private String allowedPlanningStart;
    private String totalStudentsRegistered;
    private String allowRegister;
    private String codemodule;
    private String semester;
    private String type_code;
    private String is_rdv;
    private String allow_token;
    private String titlemodule;
    private String in_more_than_one_month;
    private String acti_title;
    private String instance_location;
    private String nb_hours;
    private String roomType;
    private String roomSeats;
    private String codeacti;
    private String codeevent;
    private String codeinstance;
    private String register_student;
    private String type_title;
    private String num_event;
    private String end;
    private String scolaryear;
    private String module_registered;
    private String past;
    private String module_available;
    private String rdv_group_registered;
    private String rdv_indiv_registered;
    private String project;

    public PlanningGetItem(String allowedPlanningEnd, String start, String allowedPlanningStart, String event_registered,
                           String totalStudentsRegistered, String allowRegister, String codemodule, String semester,
                           String type_code, String is_rdv, String allow_token, String titlemodule,
                           String in_more_than_one_month,
                           String acti_title, String instance_location, String nb_hours, String roomType,
                           String roomSeats, String codeacti, String codeevent, String codeinstance,
                           String register_student, String type_title, String num_event, String end,
                           String scolaryear, String module_registered,String past,String module_available,
                           String rdv, String rdvBis, String p)
    {
        this.allowedPlanningEnd = allowedPlanningEnd;
        this.start = start;
        this.allowedPlanningStart = allowedPlanningStart;
        this.event_registered = event_registered;
        this.totalStudentsRegistered = totalStudentsRegistered;
        this.allowRegister = allowRegister;
        this.codemodule = codemodule;
        this.semester = semester;
        this.type_code = type_code;
        this.is_rdv = is_rdv;
        this.allow_token = allow_token;
        this.titlemodule = titlemodule;
        this.in_more_than_one_month = in_more_than_one_month;
        this.acti_title = acti_title;
        this.instance_location = instance_location;
        this.nb_hours = nb_hours;
        this.roomType = roomType;
        this.roomSeats = roomSeats;
        this.codeacti = codeacti;
        this.codeevent = codeevent;
        this.codeinstance = codeinstance;
        this.register_student = register_student;
        this.type_title = type_title;
        this.num_event = num_event;
        this.end = end;
        this.scolaryear = scolaryear;
        this.module_registered = module_registered;
        this.past = past;
        this.module_available = module_available;
        this.rdv_group_registered = rdv;
        this.rdv_indiv_registered = rdvBis;
        this.project = p;
    }

    public String getAllowedPlanningEnd() { return allowedPlanningEnd; }
    public String getStart() { return start; }
    public String getAllowedPlanningStart() { return allowedPlanningStart; }
    public String getEventRegistered() {return event_registered; }
    public String getTotalStudentsRegistered() { return totalStudentsRegistered; }
    public String getAllowRegister() { return allowRegister; }
    public String getCodemodule() { return codemodule; }
    public String getSemester() { return semester; }
    public String getType_code() { return type_code; }
    public String getIs_rdv() { return is_rdv; }
    public String getAllow_token() { return allow_token; }
    public String getTitlemodule() { return titlemodule; }
    public String getIn_more_than_one_month() { return in_more_than_one_month; }
    public String getActi_title() { return acti_title; }
    public String getInstance_location() { return instance_location; }
    public String getNb_hours() { return nb_hours; }
    public String getRoomType() { return roomType; }
    public String getRoomSeats() { return roomSeats; }
    public String getCodeacti() { return codeacti; }
    public String getCodeevent() { return codeevent; }
    public String getCodeinstance() { return codeinstance; }
    public String getRegister_student() { return register_student; }
    public String getType_title() { return type_title; }
    public String getNum_event() { return num_event; }
    public String getEnd() { return end; }
    public String getScolaryear() { return scolaryear; }
    public String getModule_registered() { return module_registered; }
    public String getPast() { return past; }
    public String getModule_available() { return module_available; }

    public String getRdv_group_registered() {
        return rdv_group_registered;
    }

    public String getRdv_indiv_registered() {
        return rdv_indiv_registered;
    }

    public String getProject() {
        return project;
    }
}
