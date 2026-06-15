package com.appnext.core;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g {
    private ArrayList<f> cD;

    public g(ArrayList<f> arrayList) {
        this.cD = arrayList;
    }

    public final String U() {
        JSONArray jSONArray = new JSONArray();
        Iterator<f> it = this.cD.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().T());
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("apps", jSONArray);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }
}
