package com.applovin.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class q3 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final List f8439a = Collections.synchronizedList(new ArrayList());

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void a();

        void b();
    }

    public q3(Context context) {
        context.getApplicationContext().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public void a(a aVar) {
        this.f8439a.add(aVar);
    }

    public void b(a aVar) {
        this.f8439a.remove(aVar);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE") || isInitialStickyBroadcast()) {
            return;
        }
        ArrayList<a> arrayList = new ArrayList(this.f8439a);
        if (a(intent)) {
            for (a aVar : arrayList) {
                aVar.a();
            }
            return;
        }
        for (a aVar2 : arrayList) {
            aVar2.b();
        }
    }

    private static boolean a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            Object obj = extras.get("networkInfo");
            if (obj instanceof NetworkInfo) {
                return ((NetworkInfo) obj).isConnected();
            }
            return false;
        }
        return false;
    }
}
