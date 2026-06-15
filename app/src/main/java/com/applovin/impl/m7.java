package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class m7 implements g4 {

    /* renamed from: a  reason: collision with root package name */
    private a f7511a;

    /* renamed from: b  reason: collision with root package name */
    private Uri f7512b;

    /* renamed from: c  reason: collision with root package name */
    private String f7513c;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    private m7() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m7 a(f8 f8Var, m7 m7Var, com.applovin.impl.sdk.j jVar) {
        if (f8Var != null) {
            if (jVar != null) {
                if (m7Var == null) {
                    try {
                        m7Var = new m7();
                    } catch (Throwable th) {
                        jVar.I();
                        if (com.applovin.impl.sdk.n.a()) {
                            jVar.I().a("VastNonVideoResource", "Error occurred while initializing", th);
                        }
                        jVar.D().a("VastNonVideoResource", th);
                        return null;
                    }
                }
                if (m7Var.f7512b == null && !StringUtils.isValidString(m7Var.f7513c)) {
                    String a10 = a(f8Var, "StaticResource");
                    if (URLUtil.isValidUrl(a10)) {
                        m7Var.f7512b = Uri.parse(a10);
                        m7Var.f7511a = a.STATIC;
                        return m7Var;
                    }
                    String a11 = a(f8Var, "IFrameResource");
                    if (StringUtils.isValidString(a11)) {
                        m7Var.f7511a = a.IFRAME;
                        if (URLUtil.isValidUrl(a11)) {
                            m7Var.f7512b = Uri.parse(a11);
                        } else {
                            m7Var.f7513c = a11;
                        }
                        return m7Var;
                    }
                    String a12 = a(f8Var, "HTMLResource");
                    if (StringUtils.isValidString(a12)) {
                        m7Var.f7511a = a.HTML;
                        if (URLUtil.isValidUrl(a12)) {
                            m7Var.f7512b = Uri.parse(a12);
                        } else {
                            m7Var.f7513c = a12;
                        }
                    }
                }
                return m7Var;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    public String b() {
        return this.f7513c;
    }

    public Uri c() {
        return this.f7512b;
    }

    public a d() {
        return this.f7511a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m7) {
            m7 m7Var = (m7) obj;
            if (this.f7511a != m7Var.f7511a) {
                return false;
            }
            Uri uri = this.f7512b;
            if (uri == null ? m7Var.f7512b == null : uri.equals(m7Var.f7512b)) {
                String str = this.f7513c;
                String str2 = m7Var.f7513c;
                return str != null ? str.equals(str2) : str2 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        a aVar = this.f7511a;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Uri uri = this.f7512b;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.f7513c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "VastNonVideoResource{type=" + this.f7511a + ", resourceUri=" + this.f7512b + ", resourceContents='" + this.f7513c + "'}";
    }

    private static String a(f8 f8Var, String str) {
        f8 c10 = f8Var.c(str);
        if (c10 != null) {
            return c10.d();
        }
        return null;
    }

    public void a(Uri uri) {
        this.f7512b = uri;
    }

    public void a(String str) {
        this.f7513c = str;
    }

    public static m7 a(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "type", null);
        a valueOf = string == null ? null : a.valueOf(string);
        String string2 = JsonUtils.getString(jSONObject, "resource_uri", null);
        Uri parse = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        m7 m7Var = new m7();
        m7Var.f7511a = valueOf;
        m7Var.f7512b = parse;
        m7Var.f7513c = JsonUtils.getString(jSONObject, "resource_contents", null);
        return m7Var;
    }

    @Override // com.applovin.impl.g4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        a aVar = this.f7511a;
        JsonUtils.putString(jSONObject, "type", aVar == null ? null : aVar.toString());
        Uri uri = this.f7512b;
        JsonUtils.putString(jSONObject, "resource_uri", uri != null ? uri.toString() : null);
        JsonUtils.putString(jSONObject, "resource_contents", this.f7513c);
        return jSONObject;
    }
}
