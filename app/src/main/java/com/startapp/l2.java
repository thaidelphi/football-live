package com.startapp;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.model.AdPreferences;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class l2 {

    /* renamed from: a  reason: collision with root package name */
    public Intent f22200a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f22201b;

    /* renamed from: e  reason: collision with root package name */
    public String[] f22204e;

    /* renamed from: f  reason: collision with root package name */
    public boolean[] f22205f;

    /* renamed from: h  reason: collision with root package name */
    public String f22207h;

    /* renamed from: i  reason: collision with root package name */
    public String[] f22208i;

    /* renamed from: j  reason: collision with root package name */
    public String[] f22209j;

    /* renamed from: k  reason: collision with root package name */
    public String[] f22210k;

    /* renamed from: l  reason: collision with root package name */
    public Ad f22211l;

    /* renamed from: m  reason: collision with root package name */
    public String f22212m;

    /* renamed from: n  reason: collision with root package name */
    public AdPreferences.Placement f22213n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f22214o;

    /* renamed from: p  reason: collision with root package name */
    public AdInformationOverrides f22215p;

    /* renamed from: q  reason: collision with root package name */
    public String f22216q;

    /* renamed from: r  reason: collision with root package name */
    public Long f22217r;

    /* renamed from: v  reason: collision with root package name */
    public Long f22221v;

    /* renamed from: c  reason: collision with root package name */
    public AdInformationObject f22202c = null;

    /* renamed from: d  reason: collision with root package name */
    public a f22203d = new a();

    /* renamed from: g  reason: collision with root package name */
    public boolean[] f22206g = {true};

    /* renamed from: s  reason: collision with root package name */
    public Boolean[] f22218s = null;

    /* renamed from: t  reason: collision with root package name */
    public int f22219t = 0;

    /* renamed from: u  reason: collision with root package name */
    public boolean f22220u = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f22222w = false;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            l2.this.a();
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            l2.this.f22201b.finish();
        }
    }

    public void a() {
        this.f22201b.runOnUiThread(new b());
    }

    public abstract void a(Bundle bundle);

    public boolean a(int i10, KeyEvent keyEvent) {
        return false;
    }

    public void b(Bundle bundle) {
    }

    public boolean b() {
        return false;
    }

    public void c() {
    }

    public void d() {
        if (this.f22203d != null) {
            c5.a(this.f22201b).a(this.f22203d);
        }
        this.f22203d = null;
    }

    public void e() {
        a();
    }

    public abstract void f();

    public void g() {
    }

    public void h() {
        c5.a(this.f22201b).a(new Intent("com.startapp.android.HideDisplayBroadcastListener"));
    }
}
