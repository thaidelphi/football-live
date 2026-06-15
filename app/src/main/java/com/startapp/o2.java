package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.t0;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class o2 extends t0 {

    /* renamed from: e  reason: collision with root package name */
    public final t4<com.startapp.sdk.adsbase.e> f22340e;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h1 f22341a;

        public a(h1 h1Var) {
            this.f22341a = h1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            JSONObject jSONObject;
            this.f22341a.b();
            t0.b bVar = o2.this.f23364b;
            h1 h1Var = this.f22341a;
            h1Var.getClass();
            try {
                jSONObject = h1Var.f22011c.a();
            } catch (Exception unused) {
                jSONObject = null;
            }
            bVar.a(jSONObject);
        }
    }

    public o2(Context context, t4<com.startapp.sdk.adsbase.e> t4Var, n6 n6Var) {
        super(context, n6Var);
        this.f22340e = t4Var;
    }

    @Override // com.startapp.t0
    public final void a() {
        try {
            long millis = TimeUnit.SECONDS.toMillis(MetaData.f23158k.i().c());
            h1 h1Var = new h1(this.f23363a, this.f23364b);
            this.f23365c.postDelayed(new a(h1Var), millis);
            h1Var.a(b());
        } catch (Throwable th) {
            l3.a(th);
            this.f23364b.a(null);
        }
    }

    public final boolean b() {
        long currentTimeMillis = System.currentTimeMillis();
        boolean z10 = currentTimeMillis - this.f22340e.a().getLong("lastBtDiscoveringTime", 0L) >= ((long) MetaData.f23158k.i().a()) * 60000;
        if (z10) {
            this.f22340e.a().edit().putLong("lastBtDiscoveringTime", currentTimeMillis).apply();
        }
        return z10;
    }
}
