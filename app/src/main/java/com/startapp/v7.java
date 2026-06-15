package com.startapp;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import com.ironsource.da;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class v7 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<Integer, SensorEvent> f23477a = new HashMap<>();

    public final int a(SensorEvent sensorEvent) {
        int size;
        synchronized (this) {
            int type = sensorEvent.sensor.getType();
            SensorEvent sensorEvent2 = this.f23477a.get(Integer.valueOf(type));
            if (sensorEvent2 == null || sensorEvent2.accuracy <= sensorEvent.accuracy) {
                this.f23477a.put(Integer.valueOf(type), sensorEvent);
            }
            size = this.f23477a.size();
        }
        return size;
    }

    public final JSONArray a() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (SensorEvent sensorEvent : this.f23477a.values()) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            Sensor sensor = sensorEvent.sensor;
            jSONObject2.put("name", sensor.getName());
            jSONObject2.put("vendor", sensor.getVendor());
            jSONObject2.put("version", sensor.getVersion());
            jSONObject2.put("maximum range", sensor.getMaximumRange());
            jSONObject2.put("power", sensor.getPower());
            jSONObject2.put("resolution", sensor.getResolution());
            jSONObject2.put("accuracy", sensorEvent.accuracy);
            jSONObject2.put(da.a.f16995d, sensorEvent.timestamp);
            JSONArray jSONArray2 = new JSONArray();
            for (float f10 : sensorEvent.values) {
                jSONArray2.put(f10);
            }
            jSONObject2.put("values", jSONArray2);
            jSONObject.put(String.valueOf(sensor.getType()), jSONObject2);
            jSONArray.put(jSONObject);
        }
        if (jSONArray.length() > 0) {
            return jSONArray;
        }
        return null;
    }
}
