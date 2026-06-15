package com.startapp;

import android.bluetooth.BluetoothDevice;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e1 {

    /* renamed from: a  reason: collision with root package name */
    public Set<BluetoothDevice> f21900a;

    /* renamed from: b  reason: collision with root package name */
    public HashSet f21901b;

    public final JSONObject a() {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject = new JSONObject();
        try {
            Set<BluetoothDevice> set = this.f21900a;
            if (set != null && set.size() > 0) {
                Set<BluetoothDevice> set2 = this.f21900a;
                try {
                    jSONArray2 = new JSONArray();
                    for (BluetoothDevice bluetoothDevice : set2) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("bluetoothClass", bluetoothDevice.getBluetoothClass().getDeviceClass());
                        jSONObject2.put("name", bluetoothDevice.getName());
                        jSONObject2.put("mac", bluetoothDevice.getAddress());
                        jSONObject2.put("bondState", bluetoothDevice.getBondState());
                        jSONArray2.put(jSONObject2);
                    }
                } catch (Exception unused) {
                    jSONArray2 = null;
                }
                jSONObject.put("paired", jSONArray2);
            }
            HashSet hashSet = this.f21901b;
            if (hashSet != null && hashSet.size() > 0) {
                HashSet hashSet2 = this.f21901b;
                try {
                    jSONArray = new JSONArray();
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        BluetoothDevice bluetoothDevice2 = (BluetoothDevice) it.next();
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("bluetoothClass", bluetoothDevice2.getBluetoothClass().getDeviceClass());
                        jSONObject3.put("name", bluetoothDevice2.getName());
                        jSONObject3.put("mac", bluetoothDevice2.getAddress());
                        jSONObject3.put("bondState", bluetoothDevice2.getBondState());
                        jSONArray.put(jSONObject3);
                    }
                } catch (Exception unused2) {
                    jSONArray = null;
                }
                jSONObject.put("available", jSONArray);
            }
        } catch (Exception unused3) {
        }
        if (jSONObject.length() > 0) {
            return jSONObject;
        }
        return null;
    }
}
