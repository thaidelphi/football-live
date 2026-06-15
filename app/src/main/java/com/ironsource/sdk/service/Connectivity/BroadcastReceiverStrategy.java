package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.ironsource.Cif;
import com.ironsource.hf;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.o9;
import com.ironsource.y8;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class BroadcastReceiverStrategy implements hf {

    /* renamed from: a  reason: collision with root package name */
    private final Cif f20631a;

    /* renamed from: b  reason: collision with root package name */
    private BroadcastReceiver f20632b = new BroadcastReceiver() { // from class: com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String b10 = y8.b(context);
            if (b10.equals("none")) {
                BroadcastReceiverStrategy.this.f20631a.a();
            } else {
                BroadcastReceiverStrategy.this.f20631a.a(b10, new JSONObject());
            }
        }
    };

    public BroadcastReceiverStrategy(Cif cif) {
        this.f20631a = cif;
    }

    @Override // com.ironsource.hf
    public void a() {
        this.f20632b = null;
    }

    @Override // com.ironsource.hf
    public void a(Context context) {
        try {
            context.unregisterReceiver(this.f20632b);
        } catch (IllegalArgumentException e8) {
            o9.d().a(e8);
        } catch (Exception e10) {
            o9.d().a(e10);
            Log.e("ContentValues", "unregisterConnectionReceiver - " + e10);
        }
    }

    @Override // com.ironsource.hf
    public void b(Context context) {
        try {
            context.registerReceiver(this.f20632b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    @Override // com.ironsource.hf
    public JSONObject c(Context context) {
        return new JSONObject();
    }
}
