package com.ironsource;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.WaterfallConfiguration;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class ak {

    /* renamed from: a  reason: collision with root package name */
    je f16370a = new je();

    public void a(int i10) {
        this.f16370a.a(fe.f17408e0, Integer.valueOf(i10));
    }

    public void a(Context context) {
        this.f16370a.a(context);
    }

    public void a(gg ggVar) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(fe.D, ggVar.a());
            hashMap.put(fe.C, ggVar.b());
            hashMap.put(fe.S, ggVar.c());
            this.f16370a.a(hashMap);
        } catch (Exception e8) {
            o9.d().a(e8);
        }
    }

    public void a(IronSource.AD_UNIT ad_unit, WaterfallConfiguration waterfallConfiguration) {
        JSONObject jSONObject = new JSONObject();
        if (waterfallConfiguration != null) {
            try {
                jSONObject.put(fe.f17442p1, waterfallConfiguration.getFloor());
                jSONObject.put(fe.f17445q1, waterfallConfiguration.getCeiling());
            } catch (JSONException e8) {
                o9.d().a(e8);
            }
        }
        if (jSONObject.length() == 0) {
            this.f16370a.a(fe.f17439o1, x2.a(ad_unit));
        } else {
            this.f16370a.a(fe.f17439o1, jSONObject, x2.a(ad_unit));
        }
    }

    public void a(Boolean bool) {
        this.f16370a.a(fe.P0, bool);
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f16370a.a(fe.K0, str);
    }

    public void a(JSONObject jSONObject) {
        this.f16370a.a(fe.f17455u, (Object) jSONObject);
    }

    public void a(boolean z10) {
        this.f16370a.a(fe.M0, Boolean.valueOf(z10));
    }

    public void b(int i10) {
        if (i10 >= 0) {
            this.f16370a.a(fe.O0, Integer.valueOf(i10));
        }
    }

    public void b(Context context) {
        nf f10 = mm.S().f();
        ActivityManager.MemoryInfo z10 = f10.z(context);
        this.f16370a.a(fe.f17461w, f10.c(z10));
        this.f16370a.a(fe.f17464x, f10.b(z10));
    }

    public void b(String str) {
        this.f16370a.a(fe.F0, str);
    }

    public void b(JSONObject jSONObject) {
        this.f16370a.a(fe.f17397a1, (Object) jSONObject);
    }

    public void b(boolean z10) {
        this.f16370a.a("gpi", Boolean.valueOf(z10));
    }

    public void c(int i10) {
        this.f16370a.a(fe.f17402c0, Integer.valueOf(i10));
    }

    public void c(String str) {
        this.f16370a.a(fe.H0, str);
    }

    public void d(String str) {
        this.f16370a.a(com.ironsource.mediationsdk.metadata.a.f18926i, str);
    }

    public void e(String str) {
        this.f16370a.a(fe.V0, str);
    }

    public void f(String str) {
        this.f16370a.a(fe.A, str);
    }

    public void g(String str) {
        this.f16370a.a(fe.K, str);
    }

    public void h(String str) {
        this.f16370a.a(fe.Y0, str);
    }

    public void i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f16370a.a(fe.f17399b0, str);
    }
}
