package com.ironsource;

import android.content.Context;
import com.ironsource.b9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class bh implements b3 {

    /* renamed from: b  reason: collision with root package name */
    private static final String f16746b = "bh";

    /* renamed from: c  reason: collision with root package name */
    private static bh f16747c;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, vh> f16748a = Collections.synchronizedMap(new HashMap());

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ah f16749a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f16750b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f16751c;

        a(ah ahVar, Context context, String str) {
            this.f16749a = ahVar;
            this.f16750b = context;
            this.f16751c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            bh.this.f16748a.put(this.f16751c, new vg(this.f16749a, this.f16750b));
        }
    }

    public static synchronized bh a() {
        bh bhVar;
        synchronized (bh.class) {
            if (f16747c == null) {
                f16747c = new bh();
            }
            bhVar = f16747c;
        }
        return bhVar;
    }

    private tg a(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString(b9.h.O));
            String obj = jSONObject2.get("height").toString();
            String obj2 = jSONObject2.get("width").toString();
            return new tg(Integer.parseInt(obj2), Integer.parseInt(obj), jSONObject2.get("label").toString());
        } catch (Exception e8) {
            o9.d().a(e8);
            return new tg();
        }
    }

    private tg b(JSONObject jSONObject) {
        tg tgVar = new tg();
        try {
            return a(jSONObject);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return tgVar;
        }
    }

    private boolean d(JSONObject jSONObject) {
        return jSONObject.optBoolean(b9.h.f16675s0);
    }

    @Override // com.ironsource.b3
    public vh a(String str) {
        if (str.isEmpty() || !this.f16748a.containsKey(str)) {
            return null;
        }
        return this.f16748a.get(str);
    }

    public void a(wg wgVar, JSONObject jSONObject, Context context, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(f16746b, "loadWithUrl fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        tg b10 = b(jSONObject);
        if (this.f16748a.containsKey(string)) {
            Logger.i(f16746b, "sendMessageToAd fail - collection already contain adViewId");
            throw new Exception("collection already contain adViewId");
        }
        ah ahVar = new ah(wgVar, context, string, b10);
        ahVar.e(IronSourceStorageUtils.getNetworkStorageDir(context));
        ahVar.b(jSONObject, str, str2);
        if (d(jSONObject)) {
            hg.f17676a.d(new a(ahVar, context, string));
        } else {
            this.f16748a.put(string, ahVar);
        }
    }

    public void a(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(f16746b, "removeAdView fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        } else if (!this.f16748a.containsKey(string)) {
            Logger.i(f16746b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        } else {
            vh vhVar = this.f16748a.get(string);
            if (vhVar != null) {
                vhVar.a(jSONObject, str, str2);
            }
        }
    }

    public void b(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(f16746b, "performWebViewAction fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        } else if (!this.f16748a.containsKey(string)) {
            Logger.i(f16746b, "performWebViewAction fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        } else {
            vh vhVar = this.f16748a.get(string);
            String string2 = jSONObject.getString(b9.h.f16681v0);
            if (vhVar != null) {
                vhVar.a(string2, str, str2);
            }
        }
    }

    public String c(JSONObject jSONObject) throws JSONException {
        return (jSONObject == null || !jSONObject.has("adViewId")) ? (jSONObject == null || !jSONObject.has("params")) ? "" : new JSONObject(jSONObject.getString("params")).getString("adViewId") : jSONObject.getString("adViewId");
    }

    public void c(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(f16746b, "removeAdView fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        } else if (!this.f16748a.containsKey(string)) {
            Logger.i(f16746b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        } else {
            vh vhVar = this.f16748a.get(string);
            this.f16748a.remove(string);
            if (vhVar != null) {
                vhVar.a(str, str2);
            }
        }
    }

    public void d(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = new JSONObject(jSONObject.getString("params")).getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(f16746b, "sendMessageToAd fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        } else if (!this.f16748a.containsKey(string)) {
            Logger.i(f16746b, "sendMessageToAd fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        } else {
            vh vhVar = this.f16748a.get(string);
            if (vhVar != null) {
                vhVar.c(jSONObject, str, str2);
            }
        }
    }
}
