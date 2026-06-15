package com.startapp;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class s7 {

    /* renamed from: o  reason: collision with root package name */
    public static final boolean f22501o = MetaData.f23158k.b0();

    /* renamed from: a  reason: collision with root package name */
    public final Handler f22502a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f22503b;

    /* renamed from: c  reason: collision with root package name */
    public final AdPreferences.Placement f22504c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f22505d;

    /* renamed from: e  reason: collision with root package name */
    public final TrackingParams f22506e;

    /* renamed from: f  reason: collision with root package name */
    public long f22507f;

    /* renamed from: g  reason: collision with root package name */
    public long f22508g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f22509h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f22510i;

    /* renamed from: j  reason: collision with root package name */
    public final AtomicInteger f22511j;

    /* renamed from: k  reason: collision with root package name */
    public final WeakReference<b> f22512k;

    /* renamed from: l  reason: collision with root package name */
    public a f22513l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f22514m;

    /* renamed from: n  reason: collision with root package name */
    public final Object f22515n;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22516a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ JSONObject f22517b;

        public a(String str, JSONObject jSONObject) {
            this.f22516a = str;
            this.f22517b = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            s7.this.c(this.f22516a, this.f22517b);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void onSent(String str);
    }

    public s7(Context context, AdPreferences.Placement placement, String[] strArr, TrackingParams trackingParams, long j10) {
        this(context, placement, strArr, trackingParams, j10, false, null);
    }

    public final void a() {
        if (this.f22509h && this.f22510i) {
            this.f22502a.removeCallbacksAndMessages(null);
            this.f22507f -= System.currentTimeMillis() - this.f22508g;
            this.f22510i = false;
        }
    }

    public final void b(String str, JSONObject jSONObject) {
        boolean z10;
        synchronized (this.f22515n) {
            z10 = this.f22514m;
            if (z10) {
                this.f22513l = new a(str, jSONObject);
            }
        }
        if (z10) {
            AnalyticsConfig analyticsConfig = MetaData.f23158k.analytics;
            ComponentInfoEventConfig i10 = analyticsConfig != null ? analyticsConfig.i() : null;
            if (i10 != null && i10.a((long) 4)) {
                l3 l3Var = new l3(m3.f22274d);
                l3Var.f22228d = "SI.defImp";
                l3Var.f22233i = "reason=" + str;
                l3Var.a();
                return;
            }
            return;
        }
        c(str, jSONObject);
    }

    public final void c() {
        if (this.f22511j.get() != 0) {
            return;
        }
        if (f22501o) {
            long j10 = this.f22507f;
            if (this.f22510i) {
                return;
            }
            this.f22510i = true;
            if (!this.f22509h) {
                this.f22509h = true;
            }
            this.f22508g = System.currentTimeMillis();
            this.f22502a.postDelayed(new r7(this), j10);
            return;
        }
        b(null, null);
    }

    public s7(Context context, AdPreferences.Placement placement, String[] strArr, TrackingParams trackingParams, long j10, boolean z10, b bVar) {
        this.f22502a = new Handler(Looper.getMainLooper());
        this.f22511j = new AtomicInteger();
        this.f22515n = new Object();
        this.f22503b = f0.b(context);
        this.f22504c = placement;
        this.f22505d = strArr;
        this.f22506e = trackingParams;
        this.f22507f = j10;
        this.f22514m = z10;
        this.f22512k = new WeakReference<>(bVar);
    }

    public final void a(String str, JSONObject jSONObject) {
        b(str, jSONObject);
        this.f22509h = false;
        this.f22502a.removeCallbacksAndMessages(null);
        this.f22510i = false;
        this.f22508g = 0L;
    }

    public final void c(String str, JSONObject jSONObject) {
        r3 = null;
        String str2 = null;
        if (!this.f22511j.compareAndSet(0, 1)) {
            int incrementAndGet = this.f22511j.incrementAndGet();
            int i10 = str == null ? 1 : 2;
            AnalyticsConfig analyticsConfig = MetaData.f23158k.analytics;
            ComponentInfoEventConfig i11 = analyticsConfig != null ? analyticsConfig.i() : null;
            if (i11 != null && i11.a(i10)) {
                r1 = 1;
            }
            if (r1 != 0) {
                l3 l3Var = new l3(m3.f22274d);
                l3Var.f22228d = "SI.repImp";
                l3Var.f22233i = "reason=" + str;
                l3Var.f22229e = String.valueOf(incrementAndGet);
                l3Var.a();
            }
        } else if (str == null) {
            Context context = this.f22503b;
            String[] strArr = this.f22505d;
            TrackingParams trackingParams = this.f22506e;
            if (context != null && strArr != null) {
                k3.a(context, (List<String>) Arrays.asList(strArr), trackingParams);
            }
            b bVar = this.f22512k.get();
            if (bVar != null) {
                String[] strArr2 = this.f22505d;
                if (strArr2 != null && strArr2.length > 0) {
                    str2 = com.startapp.sdk.adsbase.a.a(strArr2[0], (String) null);
                }
                bVar.onSent(str2);
            }
            try {
                AdPreferences.Placement placement = this.f22504c;
                ConcurrentHashMap concurrentHashMap = com.startapp.sdk.components.a.a(this.f22503b).N.a().f21808c;
                Integer num = (Integer) concurrentHashMap.get(placement);
                concurrentHashMap.put(placement, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            } catch (Throwable th) {
                l3.a(th);
            }
        } else {
            Context context2 = this.f22503b;
            String[] strArr3 = this.f22505d;
            TrackingParams trackingParams2 = this.f22506e;
            com.startapp.sdk.adsbase.a.a(context2, strArr3, trackingParams2 != null ? trackingParams2.a() : null, 0, str, jSONObject);
        }
    }

    public final void b() {
        a aVar;
        synchronized (this.f22515n) {
            aVar = this.f22513l;
            this.f22514m = false;
            this.f22513l = null;
        }
        if (aVar != null) {
            aVar.run();
        }
        AnalyticsConfig analyticsConfig = MetaData.f23158k.analytics;
        ComponentInfoEventConfig i10 = analyticsConfig != null ? analyticsConfig.i() : null;
        if (i10 != null && i10.a((long) 4)) {
            l3 l3Var = new l3(m3.f22274d);
            l3Var.f22228d = "SI.prcImp";
            StringBuilder sb = new StringBuilder("impr=");
            sb.append(aVar != null);
            l3Var.f22233i = sb.toString();
            l3Var.a();
        }
    }
}
