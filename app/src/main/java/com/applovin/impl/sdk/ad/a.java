package com.applovin.impl.sdk.ad;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.adview.e;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w3;
import com.applovin.impl.y4;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a extends b {

    /* renamed from: k  reason: collision with root package name */
    private final String f8725k;

    /* renamed from: l  reason: collision with root package name */
    private final String f8726l;

    /* renamed from: m  reason: collision with root package name */
    private final String f8727m;

    /* renamed from: n  reason: collision with root package name */
    private final w3 f8728n;

    public a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
        super(jSONObject, jSONObject2, jVar);
        this.f8725k = e1();
        this.f8726l = i1();
        this.f8727m = h1();
        this.f8728n = new w3(this);
    }

    public static a a(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        JSONObject jSONObject2;
        if (jSONObject == null || (jSONObject2 = JsonUtils.getJSONObject(jSONObject, "full_response", (JSONObject) null)) == null) {
            return null;
        }
        JSONObject jSONObject3 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject2, "ads", new JSONArray()), 0, (JSONObject) null);
        if (jSONObject3 == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject3, "html", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String string2 = JsonUtils.getString(jSONObject3, "video", "");
        JsonUtils.putString(jSONObject3, "html", JsonUtils.getString(jSONObject, "original_html_source", ""));
        JsonUtils.putString(jSONObject3, "video", JsonUtils.getString(jSONObject, "original_video_uri_string", ""));
        a aVar = new a(jSONObject3, jSONObject2, jVar);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "cached_ad_html_resources_urls", new JSONArray());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray, i10, null);
            if (objectAtIndex instanceof String) {
                String str = (String) objectAtIndex;
                if (!TextUtils.isEmpty(str)) {
                    aVar.a(Uri.parse(str));
                }
            }
        }
        aVar.b(string);
        if (StringUtils.isValidString(string2)) {
            aVar.d(Uri.parse(string2));
        }
        return aVar;
    }

    private String h1() {
        return getStringFromAdObject("stream_url", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(y4 y4Var) {
        y4Var.b("html", this.f8725k);
        y4Var.b("stream_url", this.f8727m);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean C0() {
        return getBooleanFromFullResponse("is_persisted_ad", false);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean G0() {
        return containsKeyForAdObject("stream_url");
    }

    @Override // com.applovin.impl.sdk.ad.b
    public void I0() {
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            y4Var.a(new androidx.core.util.b() { // from class: com.applovin.impl.sdk.ad.d
                @Override // androidx.core.util.b
                public final void accept(Object obj) {
                    a.this.t((y4) obj);
                }
            });
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", this.f8725k);
            JsonUtils.putString(this.adObject, "stream_url", this.f8727m);
        }
    }

    @Override // com.applovin.impl.sdk.ad.b
    public String Q() {
        return this.f8726l;
    }

    public void b(String str) {
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            y4Var.b("html", str);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", str);
        }
    }

    public void d(Uri uri) {
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            y4Var.b("video", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "video", uri.toString());
        }
    }

    public e.a d1() {
        return a(getIntFromAdObject("expandable_style", e.a.INVISIBLE.b()));
    }

    public String e1() {
        return getStringFromAdObject("html", "");
    }

    public float f1() {
        return getFloatFromAdObject("mraid_close_delay_graphic", 0.0f);
    }

    public String g1() {
        return this.f8727m;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        JSONObject deepCopy;
        JSONObject jSONObject;
        y4 y4Var = this.synchronizedFullResponse;
        if (y4Var != null) {
            jSONObject = y4Var.a();
        } else {
            synchronized (this.fullResponseLock) {
                deepCopy = JsonUtils.deepCopy(this.fullResponse);
            }
            jSONObject = deepCopy;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, 0, new JSONObject());
            JsonUtils.putString(jSONObject2, "html", this.f8725k);
            JsonUtils.putString(jSONObject2, "video", this.f8726l);
            JsonUtils.putString(jSONObject2, "stream_url", this.f8727m);
        }
        return jSONObject;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri h0() {
        String stringFromAdObject = getStringFromAdObject("video_click_url", "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return j();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        return q0() != null;
    }

    public String i1() {
        return getStringFromAdObject("video", "");
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.u3
    public boolean isOpenMeasurementEnabled() {
        if (this.sdk.V().e()) {
            return true;
        }
        return getBooleanFromAdObject("omsdk_enabled", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri j() {
        String stringFromAdObject = getStringFromAdObject("click_url", "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public boolean j1() {
        if (this.adObject.has("close_button_expandable_hidden")) {
            return getBooleanFromAdObject("close_button_expandable_hidden", Boolean.FALSE);
        }
        return true;
    }

    public void k1() {
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            y4Var.c("stream_url");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("stream_url");
        }
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri q0() {
        String h12 = h1();
        if (StringUtils.isValidString(h12)) {
            return Uri.parse(h12);
        }
        String i12 = i1();
        if (StringUtils.isValidString(i12)) {
            return Uri.parse(i12);
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.u3
    public w3 getAdEventTracker() {
        return this.f8728n;
    }

    @Override // com.applovin.impl.g4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "original_html_source", this.f8725k);
        JsonUtils.putString(jSONObject, "original_video_uri_string", this.f8726l);
        JsonUtils.putString(jSONObject, "original_video_stream_uri_string", this.f8727m);
        ArrayList arrayList = new ArrayList();
        for (Uri uri : i()) {
            arrayList.add(uri.toString());
        }
        JsonUtils.putJsonArray(jSONObject, "cached_ad_html_resources_urls", new JSONArray((Collection) arrayList));
        y4 y4Var = this.synchronizedFullResponse;
        if (y4Var != null) {
            JsonUtils.putJSONObject(jSONObject, "full_response", y4Var.a());
        } else {
            synchronized (this.fullResponseLock) {
                JsonUtils.putJSONObject(jSONObject, "full_response", this.fullResponse);
            }
        }
        return jSONObject;
    }
}
