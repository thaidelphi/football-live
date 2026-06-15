package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d3 {

    /* renamed from: a  reason: collision with root package name */
    protected final com.applovin.impl.sdk.j f6792a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f6793b;

    /* renamed from: d  reason: collision with root package name */
    protected final JSONObject f6795d;

    /* renamed from: f  reason: collision with root package name */
    private final Map f6797f;

    /* renamed from: g  reason: collision with root package name */
    private final y4 f6798g;

    /* renamed from: h  reason: collision with root package name */
    protected final y4 f6799h;

    /* renamed from: i  reason: collision with root package name */
    private String f6800i;

    /* renamed from: j  reason: collision with root package name */
    private String f6801j;

    /* renamed from: c  reason: collision with root package name */
    private final Object f6794c = new Object();

    /* renamed from: e  reason: collision with root package name */
    protected final Object f6796e = new Object();

    public d3(Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No full response specified");
        }
        if (jSONObject != null) {
            this.f6792a = jVar;
            if (((Boolean) jVar.a(o4.f8089c6)).booleanValue()) {
                this.f6798g = new y4(jSONObject2);
                this.f6799h = new y4(jSONObject);
                this.f6793b = null;
                this.f6795d = null;
            } else {
                this.f6793b = jSONObject2;
                this.f6795d = jSONObject;
                this.f6798g = null;
                this.f6799h = null;
            }
            this.f6797f = map;
            return;
        }
        throw new IllegalArgumentException("No ad object specified");
    }

    private int j() {
        return a("mute_state", b("mute_state", ((Integer) this.f6792a.a(j3.f7313p7)).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JSONObject a() {
        JSONObject jSONObject;
        y4 y4Var = this.f6799h;
        if (y4Var != null) {
            return y4Var.a();
        }
        synchronized (this.f6796e) {
            jSONObject = this.f6795d;
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Boolean b(String str, Boolean bool) {
        Boolean bool2;
        y4 y4Var = this.f6798g;
        if (y4Var != null) {
            return y4Var.a(str, bool);
        }
        synchronized (this.f6794c) {
            bool2 = JsonUtils.getBoolean(this.f6793b, str, bool);
        }
        return bool2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean c(String str) {
        boolean has;
        y4 y4Var = this.f6799h;
        if (y4Var != null) {
            return y4Var.a(str);
        }
        synchronized (this.f6796e) {
            has = this.f6795d.has(str);
        }
        return has;
    }

    protected boolean d(String str) {
        boolean has;
        y4 y4Var = this.f6798g;
        if (y4Var != null) {
            return y4Var.a(str);
        }
        synchronized (this.f6794c) {
            has = this.f6793b.has(str);
        }
        return has;
    }

    protected Object e(String str) {
        Object opt;
        y4 y4Var = this.f6799h;
        if (y4Var != null) {
            return y4Var.b(str);
        }
        synchronized (this.f6796e) {
            opt = this.f6795d.opt(str);
        }
        return opt;
    }

    public Bundle f() {
        return BundleUtils.getBundle("custom_parameters", new Bundle(), l());
    }

    public JSONObject g() {
        JSONObject jSONObject;
        y4 y4Var = this.f6798g;
        if (y4Var != null) {
            return y4Var.a();
        }
        synchronized (this.f6794c) {
            jSONObject = this.f6793b;
        }
        return jSONObject;
    }

    public String getAdUnitId() {
        return b("ad_unit_id", "");
    }

    public String getPlacement() {
        return this.f6800i;
    }

    public long h() {
        return a("init_completion_delay_ms", -1L);
    }

    public Map i() {
        return this.f6797f;
    }

    public String k() {
        return c().split("_")[0];
    }

    public Bundle l() {
        Bundle bundle;
        if (e("server_parameters") instanceof JSONObject) {
            y4 y4Var = this.f6799h;
            if (y4Var != null) {
                bundle = (Bundle) y4Var.a(new m.a() { // from class: com.applovin.impl.w9
                    @Override // m.a
                    public final Object apply(Object obj) {
                        Bundle a10;
                        a10 = d3.a((y4) obj);
                        return a10;
                    }
                });
            } else {
                bundle = JsonUtils.toBundle(a("server_parameters", (JSONObject) null));
            }
        } else {
            bundle = new Bundle();
        }
        int j10 = j();
        if (j10 != -1) {
            if (j10 == 2) {
                bundle.putBoolean("is_muted", this.f6792a.f0().isMuted());
            } else {
                bundle.putBoolean("is_muted", j10 == 0);
            }
        }
        if (!bundle.containsKey("amount")) {
            bundle.putLong("amount", b("amount", 0L));
        }
        if (!bundle.containsKey("currency")) {
            bundle.putString("currency", b("currency", ""));
        }
        return bundle;
    }

    public long m() {
        return a("adapter_timeout_ms", ((Long) this.f6792a.a(j3.M6)).longValue());
    }

    public Boolean n() {
        String str = this.f6792a.f0().getExtraParameters().get("huc");
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str);
        }
        if (c("huc")) {
            return a("huc", Boolean.FALSE);
        }
        return b("huc", (Boolean) null);
    }

    public Boolean o() {
        String str = this.f6792a.f0().getExtraParameters().get("dns");
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str);
        }
        if (c("dns")) {
            return a("dns", Boolean.FALSE);
        }
        return b("dns", (Boolean) null);
    }

    public boolean p() {
        return a("is_testing", Boolean.FALSE).booleanValue();
    }

    public boolean q() {
        return a("reinitialize_if_init_fails", Boolean.FALSE).booleanValue();
    }

    public boolean r() {
        return a("run_on_ui_thread", Boolean.TRUE).booleanValue();
    }

    public boolean s() {
        return a("eagerly_initialize", Boolean.TRUE).booleanValue();
    }

    public String toString() {
        return "MediationAdapterSpec{adapterClass='" + b() + "', adapterName='" + c() + "', isTesting=" + p() + '}';
    }

    public void f(String str) {
        this.f6801j = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        y4 y4Var = this.f6799h;
        if (y4Var != null) {
            return y4Var.a(str, bool);
        }
        synchronized (this.f6796e) {
            bool2 = JsonUtils.getBoolean(this.f6795d, str, bool);
        }
        return bool2;
    }

    protected int b(String str, int i10) {
        int i11;
        y4 y4Var = this.f6798g;
        if (y4Var != null) {
            return y4Var.a(str, i10);
        }
        synchronized (this.f6794c) {
            i11 = JsonUtils.getInt(this.f6793b, str, i10);
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(String str, int i10) {
        y4 y4Var = this.f6799h;
        if (y4Var != null) {
            y4Var.b(str, i10);
            return;
        }
        synchronized (this.f6796e) {
            JsonUtils.putInt(this.f6795d, str, i10);
        }
    }

    public String d() {
        if (c("consent_string")) {
            return a("consent_string", (String) null);
        }
        if (d("consent_string")) {
            return b("consent_string", (String) null);
        }
        return this.f6792a.j0().k();
    }

    public String e() {
        return this.f6801j;
    }

    public void g(String str) {
        this.f6800i = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public double a(String str, float f10) {
        double d10;
        y4 y4Var = this.f6799h;
        if (y4Var != null) {
            return y4Var.a(str, f10);
        }
        synchronized (this.f6796e) {
            d10 = JsonUtils.getDouble(this.f6795d, str, f10);
        }
        return d10;
    }

    protected JSONArray b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        y4 y4Var = this.f6798g;
        if (y4Var != null) {
            return y4Var.a(str, jSONArray);
        }
        synchronized (this.f6794c) {
            jSONArray2 = JsonUtils.getJSONArray(this.f6793b, str, jSONArray);
        }
        return jSONArray2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(String str, long j10) {
        y4 y4Var = this.f6799h;
        if (y4Var != null) {
            y4Var.b(str, j10);
            return;
        }
        synchronized (this.f6796e) {
            JsonUtils.putLong(this.f6795d, str, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int a(String str, int i10) {
        int i11;
        y4 y4Var = this.f6799h;
        if (y4Var != null) {
            return y4Var.a(str, i10);
        }
        synchronized (this.f6796e) {
            i11 = JsonUtils.getInt(this.f6795d, str, i10);
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long b(String str, long j10) {
        long j11;
        y4 y4Var = this.f6798g;
        if (y4Var != null) {
            return y4Var.a(str, j10);
        }
        synchronized (this.f6794c) {
            j11 = JsonUtils.getLong(this.f6793b, str, j10);
        }
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(String str, String str2) {
        y4 y4Var = this.f6799h;
        if (y4Var != null) {
            y4Var.b(str, str2);
            return;
        }
        synchronized (this.f6796e) {
            JsonUtils.putString(this.f6795d, str, str2);
        }
    }

    protected JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        y4 y4Var = this.f6799h;
        if (y4Var != null) {
            return y4Var.a(str, jSONArray);
        }
        synchronized (this.f6796e) {
            jSONArray2 = JsonUtils.getJSONArray(this.f6795d, str, jSONArray);
        }
        return jSONArray2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String b(String str, String str2) {
        String string;
        y4 y4Var = this.f6798g;
        if (y4Var != null) {
            return y4Var.a(str, str2);
        }
        synchronized (this.f6794c) {
            string = JsonUtils.getString(this.f6793b, str, str2);
        }
        return string;
    }

    public String c() {
        return a("name", (String) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        y4 y4Var = this.f6799h;
        if (y4Var != null) {
            return y4Var.a(str, jSONObject);
        }
        synchronized (this.f6796e) {
            jSONObject2 = JsonUtils.getJSONObject(this.f6795d, str, jSONObject);
        }
        return jSONObject2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float b(String str, float f10) {
        float f11;
        y4 y4Var = this.f6799h;
        if (y4Var != null) {
            return y4Var.a(str, f10);
        }
        synchronized (this.f6796e) {
            f11 = JsonUtils.getFloat(this.f6795d, str, f10);
        }
        return f11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long a(String str, long j10) {
        long j11;
        y4 y4Var = this.f6799h;
        if (y4Var != null) {
            return y4Var.a(str, j10);
        }
        synchronized (this.f6796e) {
            j11 = JsonUtils.getLong(this.f6795d, str, j10);
        }
        return j11;
    }

    public String b() {
        return a("class", (String) null);
    }

    public List b(String str) {
        List optList;
        List optList2;
        if (str != null) {
            y4 y4Var = this.f6798g;
            if (y4Var != null) {
                optList = y4Var.b(str, Collections.emptyList());
            } else {
                optList = JsonUtils.optList(b(str, new JSONArray()), Collections.emptyList());
            }
            y4 y4Var2 = this.f6799h;
            if (y4Var2 != null) {
                optList2 = y4Var2.b(str, Collections.emptyList());
            } else {
                optList2 = JsonUtils.optList(a(str, new JSONArray()), Collections.emptyList());
            }
            ArrayList arrayList = new ArrayList(optList.size() + optList2.size());
            arrayList.addAll(optList);
            arrayList.addAll(optList2);
            return arrayList;
        }
        throw new IllegalArgumentException("No key specified");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String a(String str, String str2) {
        String string;
        y4 y4Var = this.f6799h;
        if (y4Var != null) {
            return y4Var.a(str, str2);
        }
        synchronized (this.f6796e) {
            string = JsonUtils.getString(this.f6795d, str, str2);
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str, Object obj) {
        y4 y4Var = this.f6799h;
        if (y4Var != null) {
            y4Var.a(str, obj);
            return;
        }
        synchronized (this.f6796e) {
            JsonUtils.putObject(this.f6795d, str, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Bundle a(y4 y4Var) {
        return JsonUtils.toBundle(y4Var.a("server_parameters", (JSONObject) null));
    }

    public String a(String str) {
        String a10 = a(str, "");
        return StringUtils.isValidString(a10) ? a10 : b(str, "");
    }
}
