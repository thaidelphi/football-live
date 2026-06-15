package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class s7 implements g4 {

    /* renamed from: a  reason: collision with root package name */
    private Uri f8618a;

    /* renamed from: b  reason: collision with root package name */
    private Uri f8619b;

    /* renamed from: c  reason: collision with root package name */
    private a f8620c;

    /* renamed from: d  reason: collision with root package name */
    private String f8621d;

    /* renamed from: e  reason: collision with root package name */
    private int f8622e;

    /* renamed from: f  reason: collision with root package name */
    private int f8623f;

    /* renamed from: g  reason: collision with root package name */
    private long f8624g;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum a {
        Progressive,
        Streaming
    }

    private s7() {
    }

    public static s7 a(f8 f8Var, com.applovin.impl.sdk.j jVar) {
        if (f8Var != null) {
            if (jVar != null) {
                try {
                    String d10 = f8Var.d();
                    if (URLUtil.isValidUrl(d10)) {
                        Uri parse = Uri.parse(d10);
                        s7 s7Var = new s7();
                        s7Var.f8618a = parse;
                        s7Var.f8619b = parse;
                        s7Var.f8624g = a(f8Var);
                        s7Var.f8620c = a((String) f8Var.a().get(com.ironsource.t.f20748g));
                        s7Var.f8623f = StringUtils.parseInt((String) f8Var.a().get("height"));
                        s7Var.f8622e = StringUtils.parseInt((String) f8Var.a().get("width"));
                        s7Var.f8621d = ((String) f8Var.a().get("type")).toLowerCase(Locale.ENGLISH);
                        return s7Var;
                    }
                    jVar.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        jVar.I().b("VastVideoFile", "Unable to create video file. Could not find URL.");
                        return null;
                    }
                    return null;
                } catch (Throwable th) {
                    jVar.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        jVar.I().a("VastVideoFile", "Error occurred while initializing", th);
                    }
                    jVar.D().a("VastVideoFile", th);
                    return null;
                }
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    public long b() {
        return this.f8624g;
    }

    public String c() {
        return this.f8621d;
    }

    public Uri d() {
        return this.f8618a;
    }

    public Uri e() {
        return this.f8619b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s7) {
            s7 s7Var = (s7) obj;
            if (this.f8622e == s7Var.f8622e && this.f8623f == s7Var.f8623f && this.f8624g == s7Var.f8624g) {
                Uri uri = this.f8618a;
                if (uri == null ? s7Var.f8618a == null : uri.equals(s7Var.f8618a)) {
                    Uri uri2 = this.f8619b;
                    if (uri2 == null ? s7Var.f8619b == null : uri2.equals(s7Var.f8619b)) {
                        if (this.f8620c != s7Var.f8620c) {
                            return false;
                        }
                        String str = this.f8621d;
                        String str2 = s7Var.f8621d;
                        return str != null ? str.equals(str2) : str2 == null;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Uri uri = this.f8618a;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.f8619b;
        int hashCode2 = (hashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        a aVar = this.f8620c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f8621d;
        return ((((((hashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.f8622e) * 31) + this.f8623f) * 31) + Long.valueOf(this.f8624g).hashCode();
    }

    public String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.f8618a + ", videoUri=" + this.f8619b + ", deliveryType=" + this.f8620c + ", fileType='" + this.f8621d + "', width=" + this.f8622e + ", height=" + this.f8623f + ", bitrate=" + this.f8624g + '}';
    }

    private static a a(String str) {
        if (StringUtils.isValidString(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return a.Streaming;
            }
        }
        return a.Progressive;
    }

    private static long a(f8 f8Var) {
        Map a10 = f8Var.a();
        long parseLong = StringUtils.parseLong((String) a10.get("bitrate"), 0L);
        return parseLong != 0 ? parseLong : (StringUtils.parseLong((String) a10.get("minBitrate"), 0L) + StringUtils.parseLong((String) a10.get("maxBitrate"), 0L)) / 2;
    }

    public void a(Uri uri) {
        this.f8619b = uri;
    }

    public static s7 a(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "source_video_uri", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        Uri parse = Uri.parse(string);
        if (TextUtils.isEmpty(JsonUtils.getString(jSONObject, "video_uri", null))) {
            return null;
        }
        Uri parse2 = Uri.parse(string);
        String string2 = JsonUtils.getString(jSONObject, "file_type", null);
        if (TextUtils.isEmpty(string2)) {
            return null;
        }
        a valueOf = a.valueOf(JsonUtils.getString(jSONObject, "delivery_type", a.Progressive.toString()));
        int i10 = JsonUtils.getInt(jSONObject, "width", 0);
        int i11 = JsonUtils.getInt(jSONObject, "height", 0);
        int i12 = JsonUtils.getInt(jSONObject, "bitrate", 0);
        s7 s7Var = new s7();
        s7Var.f8618a = parse;
        s7Var.f8619b = parse2;
        s7Var.f8620c = valueOf;
        s7Var.f8621d = string2;
        s7Var.f8622e = i10;
        s7Var.f8623f = i11;
        s7Var.f8624g = i12;
        return s7Var;
    }

    @Override // com.applovin.impl.g4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        Uri uri = this.f8618a;
        if (uri != null) {
            JsonUtils.putString(jSONObject, "source_video_uri", uri.toString());
        }
        Uri uri2 = this.f8619b;
        if (uri2 != null) {
            JsonUtils.putString(jSONObject, "video_uri", uri2.toString());
        }
        a aVar = this.f8620c;
        JsonUtils.putString(jSONObject, "delivery_type", aVar == null ? null : aVar.toString());
        JsonUtils.putString(jSONObject, "file_type", this.f8621d);
        JsonUtils.putInt(jSONObject, "width", this.f8622e);
        JsonUtils.putInt(jSONObject, "height", this.f8623f);
        JsonUtils.putLong(jSONObject, "bitrate", this.f8624g);
        return jSONObject;
    }
}
