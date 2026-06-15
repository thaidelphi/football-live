package com.startapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.startapp.h4;
import com.startapp.sdk.adsbase.commontracking.CloseTrackingParams;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class p4 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f22387a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f22388b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f22389c;

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f22390d;

    /* renamed from: e  reason: collision with root package name */
    public final Runnable f22391e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f22392f;

    /* renamed from: g  reason: collision with root package name */
    public final TrackingParams f22393g;

    public p4(Activity activity, h4.a aVar, CloseTrackingParams closeTrackingParams, boolean z10) {
        this(activity, aVar, closeTrackingParams);
        this.f22388b = z10;
    }

    @JavascriptInterface
    public void closeAd() {
        if (this.f22387a) {
            return;
        }
        this.f22387a = true;
        this.f22389c.run();
    }

    @JavascriptInterface
    public void enableScroll(String str) {
        Runnable runnable = this.f22391e;
        if (runnable != null) {
            runnable.run();
        }
    }

    @JavascriptInterface
    public void externalLinks(String str) {
        if (this.f22388b) {
            WeakHashMap weakHashMap = o9.f22359a;
            com.startapp.sdk.adsbase.a.a(this.f22392f, str, (String) null);
            return;
        }
        com.startapp.sdk.adsbase.a.a(this.f22392f, str);
    }

    @JavascriptInterface
    public void openApp(String str, String str2, String str3) {
        if (str != null && !TextUtils.isEmpty(str)) {
            com.startapp.sdk.adsbase.a.a(this.f22392f, str, this.f22393g);
        }
        Intent b10 = o9.b(this.f22392f, str2);
        if (b10 != null && str3 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str3);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String valueOf = String.valueOf(keys.next());
                    b10.putExtra(valueOf, String.valueOf(jSONObject.get(valueOf)));
                }
            } catch (JSONException unused) {
            }
        }
        if (b10 != null) {
            try {
                this.f22392f.startActivity(b10);
            } catch (Throwable th) {
                l3.a(th);
            }
        }
        Runnable runnable = this.f22390d;
        if (runnable != null) {
            runnable.run();
        }
    }

    public p4(Context context, Runnable runnable, TrackingParams trackingParams) {
        this.f22387a = false;
        this.f22388b = true;
        this.f22389c = null;
        this.f22390d = null;
        this.f22391e = null;
        this.f22389c = runnable;
        this.f22392f = context;
        this.f22393g = trackingParams;
    }

    public p4(Activity activity, h4.a aVar, h4.a aVar2, h4.b bVar, CloseTrackingParams closeTrackingParams, boolean z10) {
        this(activity, aVar, closeTrackingParams, z10);
        this.f22390d = aVar2;
        this.f22391e = bVar;
    }

    public p4(Activity activity, h4.a aVar, h4.a aVar2, TrackingParams trackingParams) {
        this(activity, aVar, trackingParams);
        this.f22390d = aVar2;
    }
}
