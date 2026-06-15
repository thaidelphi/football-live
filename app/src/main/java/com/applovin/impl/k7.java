package com.applovin.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class k7 implements g4 {

    /* renamed from: a  reason: collision with root package name */
    public final Set f7402a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final Set f7403b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private Uri f7404c;

    /* renamed from: d  reason: collision with root package name */
    private Uri f7405d;

    /* renamed from: e  reason: collision with root package name */
    private int f7406e;

    /* renamed from: f  reason: collision with root package name */
    private int f7407f;

    public static k7 a(f8 f8Var, com.applovin.impl.sdk.j jVar) {
        if (f8Var != null) {
            if (jVar != null) {
                f8 c10 = f8Var.c("StaticResource");
                if (c10 != null && URLUtil.isValidUrl(c10.d())) {
                    k7 k7Var = new k7();
                    k7Var.f7404c = Uri.parse(c10.d());
                    f8 b10 = f8Var.b("IconClickThrough");
                    if (b10 != null && URLUtil.isValidUrl(b10.d())) {
                        k7Var.f7405d = Uri.parse(b10.d());
                    }
                    String str = (String) f8Var.a().get("width");
                    int i10 = 0;
                    int parseInt = (str == null || Integer.parseInt(str) <= 0) ? 0 : Integer.parseInt(str);
                    String str2 = (String) f8Var.a().get("height");
                    if (str2 != null && Integer.parseInt(str2) > 0) {
                        i10 = Integer.parseInt(str2);
                    }
                    int intValue = ((Integer) jVar.a(o4.E4)).intValue();
                    if (parseInt > 0 && i10 > 0) {
                        double d10 = parseInt / i10;
                        int min = Math.min(Math.max(parseInt, i10), intValue);
                        if (parseInt >= i10) {
                            k7Var.f7406e = min;
                            k7Var.f7407f = (int) (min / d10);
                        } else {
                            k7Var.f7407f = min;
                            k7Var.f7406e = (int) (min * d10);
                        }
                    } else {
                        k7Var.f7407f = intValue;
                        k7Var.f7406e = intValue;
                    }
                    return k7Var;
                }
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.I().b("VastIndustryIcon", "Unable to create industry icon.  No valid image URL found.");
                    return null;
                }
                return null;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    public Set b() {
        return this.f7402a;
    }

    public Uri c() {
        return this.f7405d;
    }

    public int d() {
        return this.f7407f;
    }

    public Uri e() {
        return this.f7404c;
    }

    public Set f() {
        return this.f7403b;
    }

    public int g() {
        return this.f7406e;
    }

    public String toString() {
        return "VastIndustryIcon{imageUri='" + e() + "', clickUri='" + c() + "', width=" + g() + ", height=" + d() + "}";
    }

    public static ImageView a(Uri uri, Context context, com.applovin.impl.sdk.j jVar) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setClickable(true);
        imageView.setVisibility(8);
        ImageViewUtils.setImageUri(imageView, uri, jVar);
        return imageView;
    }

    public static k7 a(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        o7 a10;
        o7 a11;
        if (jSONObject == null) {
            return null;
        }
        k7 k7Var = new k7();
        String string = JsonUtils.getString(jSONObject, "image_uri", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        k7Var.f7404c = Uri.parse(string);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "click_trackers", new JSONArray());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null && (a11 = o7.a(jSONObject2, jVar)) != null) {
                k7Var.f7402a.add(a11);
            }
        }
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "view_trackers", new JSONArray());
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i11, (JSONObject) null);
            if (jSONObject3 != null && (a10 = o7.a(jSONObject3, jVar)) != null) {
                k7Var.f7403b.add(a10);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "click_uri", null);
        k7Var.f7405d = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        k7Var.f7406e = JsonUtils.getInt(jSONObject, "width", 0);
        k7Var.f7407f = JsonUtils.getInt(jSONObject, "height", 0);
        return k7Var;
    }

    @Override // com.applovin.impl.g4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (o7 o7Var : this.f7402a) {
            jSONArray.put(o7Var.a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        for (o7 o7Var2 : this.f7403b) {
            jSONArray.put(o7Var2.a());
        }
        JsonUtils.putJsonArray(jSONObject, "view_trackers", jSONArray2);
        Uri uri = this.f7404c;
        JsonUtils.putString(jSONObject, "image_uri", uri == null ? null : uri.toString());
        Uri uri2 = this.f7405d;
        JsonUtils.putString(jSONObject, "click_uri", uri2 != null ? uri2.toString() : null);
        JsonUtils.putInt(jSONObject, "width", this.f7406e);
        JsonUtils.putInt(jSONObject, "height", this.f7407f);
        return jSONObject;
    }
}
