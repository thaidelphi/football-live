package com.google.android.gms.ads.internal.util;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.internal.ads.zzbbm;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzci {

    /* renamed from: d  reason: collision with root package name */
    private boolean f11472d;

    /* renamed from: e  reason: collision with root package name */
    private Context f11473e;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11471c = false;

    /* renamed from: b  reason: collision with root package name */
    private final Map f11470b = new WeakHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final BroadcastReceiver f11469a = new zzch(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void b(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f11470b.entrySet()) {
            if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                arrayList.add((BroadcastReceiver) entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((BroadcastReceiver) arrayList.get(i10)).onReceive(context, intent);
        }
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final synchronized void zzb(Context context) {
        if (this.f11471c) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        this.f11473e = applicationContext;
        if (applicationContext == null) {
            this.f11473e = context;
        }
        zzbbm.zza(this.f11473e);
        this.f11472d = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdV)).booleanValue();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkU)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            this.f11473e.registerReceiver(this.f11469a, intentFilter, 4);
        } else {
            this.f11473e.registerReceiver(this.f11469a, intentFilter);
        }
        this.f11471c = true;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final synchronized void zzc(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f11472d) {
            this.f11470b.put(broadcastReceiver, intentFilter);
            return;
        }
        zzbbm.zza(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkU)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public final synchronized void zzd(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f11472d) {
            this.f11470b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
