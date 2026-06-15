package com.startapp;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.HashSet;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g1 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h1 f21980a;

    public g1(h1 h1Var) {
        this.f21980a = h1Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        JSONObject jSONObject;
        String action = intent.getAction();
        if ("android.bluetooth.device.action.FOUND".equals(action)) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            e1 e1Var = this.f21980a.f22011c;
            if (e1Var.f21901b == null) {
                e1Var.f21901b = new HashSet();
            }
            e1Var.f21901b.add(bluetoothDevice);
        } else if ("android.bluetooth.adapter.action.DISCOVERY_FINISHED".equals(action)) {
            this.f21980a.b();
            h1 h1Var = this.f21980a;
            n6 n6Var = h1Var.f22010b;
            try {
                jSONObject = h1Var.f22011c.a();
            } catch (Exception unused) {
                jSONObject = null;
            }
            n6Var.a(jSONObject);
        }
    }
}
