package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class sj {

    /* renamed from: a  reason: collision with root package name */
    private String f20692a;

    /* renamed from: e  reason: collision with root package name */
    private String f20696e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, String> f20697f;

    /* renamed from: g  reason: collision with root package name */
    private final io f20698g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f20699h;

    /* renamed from: b  reason: collision with root package name */
    private boolean f20693b = false;

    /* renamed from: c  reason: collision with root package name */
    private boolean f20694c = false;

    /* renamed from: d  reason: collision with root package name */
    private tg f20695d = null;

    /* renamed from: i  reason: collision with root package name */
    protected boolean f20700i = false;

    /* renamed from: j  reason: collision with root package name */
    protected String f20701j = null;

    public sj(String str, io ioVar) throws NullPointerException {
        this.f20692a = SDKUtils.requireNonEmptyOrNull(str, "Instance name can't be null");
        this.f20698g = (io) SDKUtils.requireNonNull(ioVar, "AdListener name can't be null");
    }

    public rj a() {
        return new rj(b(), this.f20692a, this.f20693b, this.f20694c, this.f20699h, this.f20700i, this.f20701j, this.f20697f, this.f20698g, this.f20695d);
    }

    public sj a(tg tgVar) {
        this.f20695d = tgVar;
        return this;
    }

    public sj a(String str) {
        this.f20696e = str;
        return this;
    }

    public sj a(Map<String, String> map) {
        this.f20697f = map;
        return this;
    }

    public sj a(boolean z10) {
        this.f20694c = z10;
        return this;
    }

    public sj b(String str) {
        this.f20701j = str;
        return this;
    }

    public sj b(boolean z10) {
        this.f20700i = z10;
        return this;
    }

    public String b() {
        String str = this.f20696e;
        if (str != null) {
            return str;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f20692a);
            jSONObject.put("rewarded", this.f20693b);
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
        return (this.f20694c || this.f20699h) ? ck.a() : ck.a(jSONObject);
    }

    public sj c() {
        this.f20693b = true;
        return this;
    }

    public sj c(boolean z10) {
        this.f20699h = z10;
        return this;
    }
}
