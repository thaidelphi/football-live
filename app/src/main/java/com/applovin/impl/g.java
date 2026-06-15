package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f7013a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7014b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");
        

        /* renamed from: a  reason: collision with root package name */
        private final String f7019a;

        a(String str) {
            this.f7019a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f7019a;
        }
    }

    public g(String str, com.applovin.impl.sdk.j jVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Identifier is empty");
        }
        if (jVar != null) {
            this.f7014b = str;
            this.f7013a = jVar;
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public JSONObject a() {
        if (c() == a.AD_RESPONSE_JSON) {
            try {
                try {
                    JSONObject jSONObject = new JSONObject(new String(Base64.decode(this.f7014b.substring(d().length()), 0), "UTF-8"));
                    this.f7013a.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.sdk.n I = this.f7013a.I();
                        I.a("AdToken", "Decoded token into ad response: " + jSONObject);
                    }
                    return jSONObject;
                } catch (JSONException e8) {
                    this.f7013a.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.sdk.n I2 = this.f7013a.I();
                        I2.a("AdToken", "Unable to decode token '" + this.f7014b + "' into JSON", e8);
                    }
                    this.f7013a.D().a("AdToken", "decodeFullAdResponseStr", e8);
                    return null;
                }
            } catch (UnsupportedEncodingException e10) {
                this.f7013a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n I3 = this.f7013a.I();
                    I3.a("AdToken", "Unable to process ad response from token '" + this.f7014b + "'", e10);
                }
                this.f7013a.D().a("AdToken", "decodeFullAdResponse", e10);
                return null;
            }
        }
        return null;
    }

    public String b() {
        return this.f7014b;
    }

    public a c() {
        if (a(o4.A0) != null) {
            return a.REGULAR;
        }
        if (a(o4.B0) != null) {
            return a.AD_RESPONSE_JSON;
        }
        return a.UNSPECIFIED;
    }

    public String d() {
        String a10 = a(o4.A0);
        if (TextUtils.isEmpty(a10)) {
            String a11 = a(o4.B0);
            if (TextUtils.isEmpty(a11)) {
                return null;
            }
            return a11;
        }
        return a10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            String str = this.f7014b;
            String str2 = ((g) obj).f7014b;
            return str != null ? str.equals(str2) : str2 == null;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f7014b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String prefixToIndex = StringUtils.prefixToIndex(32, this.f7014b);
        return "AdToken{id=" + prefixToIndex + ", type=" + c() + '}';
    }

    private String a(o4 o4Var) {
        for (String str : this.f7013a.c(o4Var)) {
            if (this.f7014b.startsWith(str)) {
                return str;
            }
        }
        return null;
    }
}
