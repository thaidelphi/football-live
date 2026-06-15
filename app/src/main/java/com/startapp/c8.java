package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import java.util.UUID;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c8 {

    /* renamed from: d  reason: collision with root package name */
    public static final c8 f21846d = new c8();

    /* renamed from: a  reason: collision with root package name */
    public String f21847a = "";

    /* renamed from: b  reason: collision with root package name */
    public long f21848b = 0;

    /* renamed from: c  reason: collision with root package name */
    public MetaDataRequest.RequestReason f21849c = MetaDataRequest.RequestReason.LAUNCH;

    public final String a() {
        return this.f21847a;
    }

    public final long b() {
        return this.f21848b;
    }

    public final synchronized void a(Context context, MetaDataRequest.RequestReason requestReason) {
        this.f21847a = UUID.randomUUID().toString();
        this.f21848b = System.currentTimeMillis();
        this.f21849c = requestReason;
        WeakHashMap weakHashMap = o9.f22359a;
        f fVar = f.f21919d;
        fVar.f21920a.clear();
        fVar.f21921b.clear();
        fVar.f21922c.clear();
        MetaData.f23158k.a(context, new AdPreferences(), requestReason, false, null, true);
    }
}
