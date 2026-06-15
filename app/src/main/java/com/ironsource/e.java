package com.ironsource;

import android.text.TextUtils;
import com.ironsource.da;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f17149a = "eventId";

    /* renamed from: b  reason: collision with root package name */
    private final String f17150b = da.a.f16995d;

    /* renamed from: c  reason: collision with root package name */
    private final String f17151c = "InterstitialEvents";

    /* renamed from: d  reason: collision with root package name */
    private final String f17152d = "events";

    /* renamed from: e  reason: collision with root package name */
    private final String f17153e = "events";

    /* renamed from: f  reason: collision with root package name */
    JSONObject f17154f;

    /* renamed from: g  reason: collision with root package name */
    int f17155g;

    /* renamed from: h  reason: collision with root package name */
    private String f17156h;

    private String a(int i10) {
        return i10 != 2 ? "events" : "InterstitialEvents";
    }

    protected abstract String a();

    public abstract String a(ArrayList<zb> arrayList, JSONObject jSONObject);

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(JSONArray jSONArray) {
        try {
            if (this.f17154f != null) {
                JSONObject jSONObject = new JSONObject(this.f17154f.toString());
                jSONObject.put(da.a.f16995d, IronSourceUtils.getTimestamp());
                jSONObject.put(a(this.f17155g), jSONArray);
                return jSONObject.toString();
            }
        } catch (Exception e8) {
            o9.d().a(e8);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONObject a(zb zbVar) {
        try {
            String a10 = zbVar.a();
            JSONObject jSONObject = !TextUtils.isEmpty(a10) ? new JSONObject(a10) : new JSONObject();
            jSONObject.put("eventId", zbVar.c());
            jSONObject.put(da.a.f16995d, zbVar.d());
            return jSONObject;
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        this.f17156h = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return TextUtils.isEmpty(this.f17156h) ? a() : this.f17156h;
    }

    public abstract String c();
}
