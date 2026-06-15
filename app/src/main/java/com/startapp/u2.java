package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.t0;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class u2 extends t0 {

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ w7 f23431a;

        public a(w7 w7Var) {
            this.f23431a = w7Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            JSONArray jSONArray;
            this.f23431a.c();
            t0.b bVar = u2.this.f23364b;
            w7 w7Var = this.f23431a;
            w7Var.getClass();
            try {
                jSONArray = w7Var.f23511b.a();
            } catch (Exception unused) {
                jSONArray = null;
            }
            bVar.a(jSONArray);
        }
    }

    public u2(Context context, n6 n6Var) {
        super(context, n6Var);
    }

    @Override // com.startapp.t0
    public final void a() {
        try {
            long millis = TimeUnit.SECONDS.toMillis(MetaData.f23158k.J().k());
            w7 w7Var = new w7(this.f23363a, this.f23364b);
            this.f23365c.postDelayed(new a(w7Var), millis);
            w7Var.b();
        } catch (Throwable th) {
            l3.a(th);
            this.f23364b.a(null);
        }
    }
}
