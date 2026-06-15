package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class dv {

    /* renamed from: b  reason: collision with root package name */
    private NetworkSettings f17135b;

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<String> f17134a = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f17136c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f17137d = true;

    public static dv a() {
        return new dv();
    }

    public void a(NetworkSettings networkSettings) {
        this.f17135b = networkSettings;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f17134a.add(str);
    }

    public void a(JSONObject jSONObject) {
        this.f17136c = jSONObject;
    }

    public void a(boolean z10) {
        this.f17137d = z10;
    }

    public JSONObject b() {
        return this.f17136c;
    }

    public NetworkSettings c() {
        return this.f17135b;
    }

    public ArrayList<String> d() {
        return this.f17134a;
    }

    public boolean e() {
        return this.f17137d;
    }
}
