package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zn {

    /* renamed from: a  reason: collision with root package name */
    private final String f21664a;

    /* renamed from: b  reason: collision with root package name */
    private final String f21665b;

    /* renamed from: c  reason: collision with root package name */
    private final String f21666c;

    /* renamed from: d  reason: collision with root package name */
    private final String f21667d;

    /* renamed from: e  reason: collision with root package name */
    private final String f21668e;

    /* renamed from: f  reason: collision with root package name */
    private final JSONObject f21669f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, JSONObject> f21670g;

    /* renamed from: h  reason: collision with root package name */
    private final String f21671h;

    /* renamed from: i  reason: collision with root package name */
    private final String f21672i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f21673j;

    /* renamed from: k  reason: collision with root package name */
    private zn f21674k;

    /* renamed from: l  reason: collision with root package name */
    private final i8.g f21675l;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class a extends kotlin.jvm.internal.o implements t8.a<NetworkSettings> {
        a() {
            super(0);
        }

        @Override // t8.a
        /* renamed from: a */
        public final NetworkSettings invoke() {
            String j10 = zn.this.j();
            String l10 = zn.this.l();
            String h10 = zn.this.h();
            String k10 = zn.this.k();
            JSONObject c10 = zn.this.c();
            zn znVar = zn.this.f21674k;
            JSONObject mergeJsons = IronSourceUtils.mergeJsons(c10, znVar != null ? znVar.c() : null);
            JSONObject m7 = zn.this.m();
            zn znVar2 = zn.this.f21674k;
            JSONObject mergeJsons2 = IronSourceUtils.mergeJsons(m7, znVar2 != null ? znVar2.m() : null);
            JSONObject e8 = zn.this.e();
            zn znVar3 = zn.this.f21674k;
            JSONObject mergeJsons3 = IronSourceUtils.mergeJsons(e8, znVar3 != null ? znVar3.e() : null);
            JSONObject d10 = zn.this.d();
            zn znVar4 = zn.this.f21674k;
            JSONObject mergeJsons4 = IronSourceUtils.mergeJsons(d10, znVar4 != null ? znVar4.d() : null);
            JSONObject g10 = zn.this.g();
            zn znVar5 = zn.this.f21674k;
            NetworkSettings networkSettings = new NetworkSettings(j10, l10, h10, k10, mergeJsons, mergeJsons2, mergeJsons3, mergeJsons4, IronSourceUtils.mergeJsons(g10, znVar5 != null ? znVar5.g() : null));
            networkSettings.setIsMultipleInstances(zn.this.o());
            networkSettings.setSubProviderId(zn.this.n());
            networkSettings.setAdSourceNameForEvents(zn.this.b());
            return networkSettings;
        }
    }

    public zn(String providerName, JSONObject networkSettings) {
        int k10;
        int c10;
        int a10;
        i8.g b10;
        kotlin.jvm.internal.n.f(providerName, "providerName");
        kotlin.jvm.internal.n.f(networkSettings, "networkSettings");
        this.f21664a = providerName;
        this.f21665b = providerName;
        String optString = networkSettings.optString(ao.f16390d, providerName);
        kotlin.jvm.internal.n.e(optString, "networkSettings.optStrin…,\n          providerName)");
        this.f21666c = optString;
        String optString2 = networkSettings.optString(ao.f16391e, optString);
        kotlin.jvm.internal.n.e(optString2, "networkSettings.optStrin…roviderTypeForReflection)");
        this.f21667d = optString2;
        Object opt = networkSettings.opt(ao.f16392f);
        this.f21668e = opt instanceof String ? (String) opt : null;
        this.f21669f = networkSettings.optJSONObject("application");
        LevelPlay.AdFormat[] values = LevelPlay.AdFormat.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (LevelPlay.AdFormat adFormat : values) {
            arrayList.add(vt.a(adFormat));
        }
        k10 = j8.r.k(arrayList, 10);
        c10 = j8.i0.c(k10);
        a10 = y8.i.a(c10, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(a10);
        for (Object obj : arrayList) {
            String str = (String) obj;
            JSONObject optJSONObject = networkSettings.optJSONObject("adFormats");
            JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject(str) : null;
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
            }
            linkedHashMap.put(obj, optJSONObject2);
        }
        this.f21670g = linkedHashMap;
        String optString3 = networkSettings.optString("spId", "0");
        kotlin.jvm.internal.n.e(optString3, "networkSettings.optStrin…B_PROVIDER_ID_FIELD, \"0\")");
        this.f21671h = optString3;
        String optString4 = networkSettings.optString(ao.f16387a);
        kotlin.jvm.internal.n.e(optString4, "networkSettings.optString(AD_SOURCE_NAME_FIELD)");
        this.f21672i = optString4;
        this.f21673j = networkSettings.optBoolean(ao.f16389c, false);
        b10 = i8.i.b(new a());
        this.f21675l = b10;
    }

    public final Map<String, JSONObject> a() {
        return this.f21670g;
    }

    public final String b() {
        return this.f21672i;
    }

    public final void b(zn znVar) {
        this.f21674k = znVar;
    }

    public final JSONObject c() {
        return this.f21669f;
    }

    public final JSONObject d() {
        JSONObject mergeJsons = IronSourceUtils.mergeJsons(this.f21670g.get("banner"), this.f21669f);
        kotlin.jvm.internal.n.e(mergeJsons, "mergeJsons(\n            …EY], applicationSettings)");
        return mergeJsons;
    }

    public final JSONObject e() {
        JSONObject mergeJsons = IronSourceUtils.mergeJsons(this.f21670g.get("interstitial"), this.f21669f);
        kotlin.jvm.internal.n.e(mergeJsons, "mergeJsons(\n            …EY], applicationSettings)");
        return mergeJsons;
    }

    public final NetworkSettings f() {
        return (NetworkSettings) this.f21675l.getValue();
    }

    public final JSONObject g() {
        JSONObject mergeJsons = IronSourceUtils.mergeJsons(this.f21670g.get("nativeAd"), this.f21669f);
        kotlin.jvm.internal.n.e(mergeJsons, "mergeJsons(\n            …EY], applicationSettings)");
        return mergeJsons;
    }

    public final String h() {
        return this.f21667d;
    }

    public final String i() {
        return this.f21665b;
    }

    public final String j() {
        return this.f21664a;
    }

    public final String k() {
        return this.f21668e;
    }

    public final String l() {
        return this.f21666c;
    }

    public final JSONObject m() {
        JSONObject mergeJsons = IronSourceUtils.mergeJsons(this.f21670g.get("rewarded"), this.f21669f);
        kotlin.jvm.internal.n.e(mergeJsons, "mergeJsons(\n            …     applicationSettings)");
        return mergeJsons;
    }

    public final String n() {
        return this.f21671h;
    }

    public final boolean o() {
        return this.f21673j;
    }
}
