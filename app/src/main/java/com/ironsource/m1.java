package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class m1 {

    /* renamed from: a  reason: collision with root package name */
    private IronSource.AD_UNIT f18367a;

    /* renamed from: b  reason: collision with root package name */
    private String f18368b;

    /* renamed from: c  reason: collision with root package name */
    private NetworkSettings f18369c;

    /* renamed from: d  reason: collision with root package name */
    private int f18370d;

    /* renamed from: e  reason: collision with root package name */
    private int f18371e;

    /* renamed from: f  reason: collision with root package name */
    private JSONObject f18372f;

    /* renamed from: g  reason: collision with root package name */
    private String f18373g;

    /* renamed from: h  reason: collision with root package name */
    private int f18374h;

    /* renamed from: i  reason: collision with root package name */
    private String f18375i;

    public m1(IronSource.AD_UNIT ad_unit, String str, int i10, JSONObject jSONObject, String str2, int i11, String str3, NetworkSettings networkSettings, int i12) {
        this.f18367a = ad_unit;
        this.f18368b = str;
        this.f18371e = i10;
        this.f18372f = jSONObject;
        this.f18373g = str2;
        this.f18374h = i11;
        this.f18375i = str3;
        this.f18369c = networkSettings;
        this.f18370d = i12;
    }

    public IronSource.AD_UNIT a() {
        return this.f18367a;
    }

    public String b() {
        return this.f18375i;
    }

    public String c() {
        return this.f18373g;
    }

    public int d() {
        return this.f18374h;
    }

    public JSONObject e() {
        return this.f18372f;
    }

    public int f() {
        return this.f18370d;
    }

    public NetworkSettings g() {
        return this.f18369c;
    }

    public int h() {
        return this.f18371e;
    }

    public String i() {
        return this.f18368b;
    }
}
