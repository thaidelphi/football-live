package com.applovin.impl;

import android.content.Context;
import android.util.Log;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u5;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.iab.omid.library.applovin.Omid;
import com.iab.omid.library.applovin.ScriptInjector;
import com.iab.omid.library.applovin.adsession.Partner;
import com.ironsource.b9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class z3 {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f9824a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f9825b = com.applovin.impl.sdk.j.m();

    /* renamed from: c  reason: collision with root package name */
    private String f9826c;

    public z3(com.applovin.impl.sdk.j jVar) {
        this.f9824a = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        if (this.f9826c != null) {
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f9825b.getResources().openRawResource(R.raw.omsdk_v1_4_12)));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    } else {
                        this.f9826c = sb.toString();
                        bufferedReader.close();
                        return;
                    }
                }
            } catch (IOException e8) {
                Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e8);
            }
        } catch (Throwable th) {
            this.f9824a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f9824a.I().a("OpenMeasurementService", "Failed to retrieve resource omsdk_v1_4_12.js", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        long currentTimeMillis = System.currentTimeMillis();
        Omid.activate(this.f9825b);
        this.f9824a.I();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n I = this.f9824a.I();
            StringBuilder sb = new StringBuilder();
            sb.append("Init ");
            sb.append(d() ? "succeeded" : b9.h.f16676t);
            sb.append(" and took ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append("ms");
            I.a("OpenMeasurementService", sb.toString());
        }
        h();
    }

    private void h() {
        this.f9824a.i0().a((z4) new k6(this.f9824a, "OpenMeasurementService", new Runnable() { // from class: com.applovin.impl.xf
            @Override // java.lang.Runnable
            public final void run() {
                z3.this.f();
            }
        }), u5.b.OTHER);
    }

    public String a() {
        return this.f9826c;
    }

    public Partner b() {
        return Partner.createPartner((String) this.f9824a.a(o4.f8131i0), AppLovinSdk.VERSION);
    }

    public String c() {
        return Omid.getVersion();
    }

    public boolean d() {
        return Omid.isActive();
    }

    public boolean e() {
        String str = this.f9824a.f0().getExtraParameters().get("enable_omsdk_testing");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return false;
    }

    public void i() {
        if (((Boolean) this.f9824a.a(o4.f8123h0)).booleanValue()) {
            this.f9824a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I = this.f9824a.I();
                I.a("OpenMeasurementService", "Initializing Open Measurement SDK v" + c() + "...");
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.wf
                @Override // java.lang.Runnable
                public final void run() {
                    z3.this.g();
                }
            });
        }
    }

    public String a(String str) {
        String str2;
        try {
            if (e()) {
                String a10 = a4.a(this.f9824a);
                if (StringUtils.isValidString(a10)) {
                    str2 = ScriptInjector.injectScriptContentIntoHtml(a10, str);
                    return ScriptInjector.injectScriptContentIntoHtml(this.f9826c, str2);
                }
            }
            str2 = str;
            return ScriptInjector.injectScriptContentIntoHtml(this.f9826c, str2);
        } catch (Throwable th) {
            this.f9824a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f9824a.I().a("OpenMeasurementService", "Failed to inject JavaScript SDK into HTML", th);
            }
            return str;
        }
    }
}
