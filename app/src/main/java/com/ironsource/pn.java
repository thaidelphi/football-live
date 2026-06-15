package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.b9;
import com.ironsource.eh;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class pn {

    /* renamed from: b  reason: collision with root package name */
    private final nf f19770b = mm.S().f();

    /* renamed from: a  reason: collision with root package name */
    je f19769a = new je();

    public void a() {
        JSONObject jSONObject = new JSONObject(IronSourceQaProperties.getInstance().getParameters());
        if (jSONObject.length() > 0) {
            this.f19769a.a("debug", jSONObject);
        }
    }

    public void a(Context context) {
        if (context instanceof Activity) {
            this.f19769a.a(fe.f17434n, Boolean.valueOf(this.f19770b.a((Activity) context)));
        }
    }

    public void a(eh.c cVar) {
        this.f19769a.a(fe.f17454t1, Integer.valueOf(cVar.ordinal()));
    }

    public void a(List<String> list) {
        this.f19769a.a(fe.f17463w1, list);
    }

    public void a(Map<String, JSONObject> map) {
        for (Map.Entry<String, JSONObject> entry : map.entrySet()) {
            this.f19769a.a(entry.getKey(), (Object) entry.getValue());
        }
    }

    public void a(JSONObject jSONObject) {
        this.f19769a.a(fe.f17428l, jSONObject);
    }

    public void a(boolean z10) {
        this.f19769a.a(fe.N0, Boolean.valueOf(z10));
    }

    public void b() {
        String controllerConfig = SDKUtils.getControllerConfig();
        if (TextUtils.isEmpty(controllerConfig)) {
            return;
        }
        try {
            this.f19769a.a(fe.f17419i, new JSONObject(controllerConfig).opt(b9.a.f16546q));
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    public void b(Context context) {
        this.f19769a.a("gpi", Boolean.valueOf(dp.d(context)));
    }

    public void c() {
        this.f19769a.a("uxt", Boolean.valueOf(IronSourceStorageUtils.isUxt()));
    }

    public void d() {
        this.f19769a.a(fe.S, "8.7.0");
    }

    public void e() {
        HashMap hashMap = new HashMap();
        hashMap.put(fe.D, ho.f17694f);
        hashMap.put(fe.C, ho.f17693e);
        this.f19769a.a(hashMap);
    }
}
