package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.bk;
import com.ironsource.ec;
import com.ironsource.ek;
import com.ironsource.fh;
import com.ironsource.lh;
import com.ironsource.mh;
import com.ironsource.no;
import com.ironsource.o9;
import com.ironsource.rj;
import com.ironsource.sdk.controller.e;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.ironsource.vj;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class IronSourceNetwork {

    /* renamed from: a  reason: collision with root package name */
    static final String f20155a = "IronSourceNetwork";

    /* renamed from: b  reason: collision with root package name */
    private static bk f20156b;

    /* renamed from: c  reason: collision with root package name */
    private static List<no> f20157c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private static ek f20158d;

    private static synchronized void a() throws Exception {
        synchronized (IronSourceNetwork.class) {
            if (f20156b == null) {
                throw new NullPointerException("Call initSDK first");
            }
        }
    }

    private static void a(Context context, JSONObject jSONObject, String str, String str2, Map<String, String> map) throws Exception {
        if (jSONObject != null) {
            ec a10 = mh.a(jSONObject);
            if (a10.a()) {
                lh.a(a10, mh.a(context, str, str2, map));
            }
        }
    }

    public static synchronized void addInitListener(no noVar) {
        synchronized (IronSourceNetwork.class) {
            ek ekVar = f20158d;
            if (ekVar == null) {
                f20157c.add(noVar);
            } else if (ekVar.b()) {
                noVar.onSuccess();
            } else {
                noVar.onFail(f20158d.a());
            }
        }
    }

    public static synchronized void destroyAd(rj rjVar) throws Exception {
        synchronized (IronSourceNetwork.class) {
            a();
            f20156b.b(rjVar);
        }
    }

    public static synchronized e getControllerManager() {
        e a10;
        synchronized (IronSourceNetwork.class) {
            a10 = f20156b.a();
        }
        return a10;
    }

    public static String getVersion() {
        return SDKUtils.getSDKVersion();
    }

    public static synchronized void initSDK(Context context, String str, String str2, Map<String, String> map) {
        synchronized (IronSourceNetwork.class) {
            if (TextUtils.isEmpty(str)) {
                Logger.e(f20155a, "applicationKey is NULL");
                return;
            }
            if (f20156b == null) {
                SDKUtils.setInitSDKParams(map);
                try {
                    a(context, SDKUtils.getNetworkConfiguration().optJSONObject("events"), str2, str, map);
                } catch (Exception e8) {
                    o9.d().a(e8);
                    Logger.e(f20155a, "Failed to init event tracker: " + e8.getMessage());
                }
                f20156b = vj.a(context, str, str2);
            }
        }
    }

    public static synchronized boolean isAdAvailableForInstance(rj rjVar) {
        synchronized (IronSourceNetwork.class) {
            bk bkVar = f20156b;
            if (bkVar == null) {
                return false;
            }
            return bkVar.a(rjVar);
        }
    }

    public static synchronized void loadAd(rj rjVar, Map<String, String> map) throws Exception {
        synchronized (IronSourceNetwork.class) {
            a();
            f20156b.a(rjVar, map);
        }
    }

    public static synchronized void loadAdView(Activity activity, rj rjVar, Map<String, String> map) throws Exception {
        synchronized (IronSourceNetwork.class) {
            a();
            f20156b.b(activity, rjVar, map);
        }
    }

    public static void onPause(Activity activity) {
        bk bkVar = f20156b;
        if (bkVar == null) {
            return;
        }
        bkVar.onPause(activity);
    }

    public static void onResume(Activity activity) {
        bk bkVar = f20156b;
        if (bkVar == null) {
            return;
        }
        bkVar.onResume(activity);
    }

    public static synchronized void release(Activity activity) {
        synchronized (IronSourceNetwork.class) {
            bk bkVar = f20156b;
            if (bkVar == null) {
                return;
            }
            bkVar.a(activity);
        }
    }

    public static synchronized void showAd(Activity activity, rj rjVar, Map<String, String> map) throws Exception {
        synchronized (IronSourceNetwork.class) {
            a();
            f20156b.a(activity, rjVar, map);
        }
    }

    public static synchronized void updateInitFailed(fh fhVar) {
        synchronized (IronSourceNetwork.class) {
            f20158d = new ek(fhVar);
            for (no noVar : f20157c) {
                noVar.onFail(fhVar);
            }
            f20157c.clear();
        }
    }

    public static synchronized void updateInitSucceeded() {
        synchronized (IronSourceNetwork.class) {
            f20158d = new ek();
            for (no noVar : f20157c) {
                noVar.onSuccess();
            }
            f20157c.clear();
        }
    }
}
