package com.ironsource;

import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class rj {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f19983a;

    /* renamed from: b  reason: collision with root package name */
    private String f19984b;

    /* renamed from: c  reason: collision with root package name */
    private String f19985c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f19986d;

    /* renamed from: e  reason: collision with root package name */
    private tg f19987e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, String> f19988f;

    /* renamed from: g  reason: collision with root package name */
    private io f19989g;

    /* renamed from: h  reason: collision with root package name */
    private String f19990h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f19991i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f19992j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public rj(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, String str3, Map<String, String> map, io ioVar, tg tgVar) {
        this.f19984b = str;
        this.f19985c = str2;
        this.f19983a = z10;
        this.f19986d = z11;
        this.f19988f = map;
        this.f19989g = ioVar;
        this.f19987e = tgVar;
        this.f19991i = z12;
        this.f19992j = z13;
        this.f19990h = str3;
    }

    public Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("instanceId", this.f19984b);
        hashMap.put("instanceName", this.f19985c);
        hashMap.put("rewarded", Boolean.toString(this.f19983a));
        hashMap.put("inAppBidding", Boolean.toString(this.f19986d));
        hashMap.put("isOneFlow", Boolean.toString(this.f19991i));
        hashMap.put(b9.f16523r, String.valueOf(2));
        tg tgVar = this.f19987e;
        hashMap.put("width", tgVar != null ? Integer.toString(tgVar.c()) : "0");
        tg tgVar2 = this.f19987e;
        hashMap.put("height", tgVar2 != null ? Integer.toString(tgVar2.a()) : "0");
        tg tgVar3 = this.f19987e;
        hashMap.put("label", tgVar3 != null ? tgVar3.b() : "");
        hashMap.put(b9.f16527v, Boolean.toString(i()));
        if (this.f19992j) {
            hashMap.put("isMultipleAdObjects", com.ironsource.mediationsdk.metadata.a.f18924g);
        }
        String str = this.f19990h;
        if (str != null) {
            hashMap.put("adUnitId", str);
        }
        Map<String, String> map = this.f19988f;
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public void a(io ioVar) {
        this.f19989g = ioVar;
    }

    public void a(String str) {
        this.f19990h = str;
    }

    public final io b() {
        return this.f19989g;
    }

    public String c() {
        return this.f19990h;
    }

    public Map<String, String> d() {
        return this.f19988f;
    }

    public String e() {
        return this.f19984b;
    }

    public String f() {
        return this.f19985c.replaceAll("IronSource_", "");
    }

    public String g() {
        return this.f19985c;
    }

    public tg h() {
        return this.f19987e;
    }

    public boolean i() {
        return h() != null && h().d();
    }

    public boolean j() {
        return this.f19986d;
    }

    public boolean k() {
        return j() || m();
    }

    public boolean l() {
        return this.f19992j;
    }

    public boolean m() {
        return this.f19991i;
    }

    public boolean n() {
        return this.f19983a;
    }
}
