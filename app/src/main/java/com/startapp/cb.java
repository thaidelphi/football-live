package com.startapp;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class cb implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f21853b;

    /* renamed from: c  reason: collision with root package name */
    public a f21854c;

    /* renamed from: e  reason: collision with root package name */
    public final WeakReference<View> f21856e;

    /* renamed from: f  reason: collision with root package name */
    public final s7 f21857f;

    /* renamed from: g  reason: collision with root package name */
    public final BannerOptions f21858g;

    /* renamed from: a  reason: collision with root package name */
    public NotDisplayedReason f21852a = NotDisplayedReason.AD_CLOSED_TOO_QUICKLY;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f21855d = new Handler(Looper.getMainLooper());

    /* renamed from: h  reason: collision with root package name */
    public boolean f21859h = true;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
    }

    public cb(View view, s7 s7Var, BannerOptions bannerOptions) {
        this.f21856e = new WeakReference<>(view);
        this.f21857f = s7Var;
        this.f21858g = bannerOptions;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00ba, blocks: (B:41:0x008d, B:43:0x0091, B:45:0x0095, B:46:0x009e, B:3:0x0001, B:5:0x0007, B:10:0x0014, B:15:0x0021, B:17:0x0036, B:19:0x003a, B:21:0x0044, B:26:0x0055, B:28:0x0059, B:39:0x0085, B:30:0x0063, B:32:0x0067, B:34:0x0072, B:36:0x007a, B:38:0x007e), top: B:55:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d A[Catch: all -> 0x00ba, TRY_ENTER, TryCatch #1 {all -> 0x00ba, blocks: (B:41:0x008d, B:43:0x0091, B:45:0x0095, B:46:0x009e, B:3:0x0001, B:5:0x0007, B:10:0x0014, B:15:0x0021, B:17:0x0036, B:19:0x003a, B:21:0x0044, B:26:0x0055, B:28:0x0059, B:39:0x0085, B:30:0x0063, B:32:0x0067, B:34:0x0072, B:36:0x007a, B:38:0x007e), top: B:55:0x0001 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            r0 = 0
            com.startapp.s7 r1 = r7.f21857f     // Catch: java.lang.Throwable -> La4
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            java.util.concurrent.atomic.AtomicInteger r1 = r1.f22511j     // Catch: java.lang.Throwable -> La4
            int r1 = r1.get()     // Catch: java.lang.Throwable -> La4
            if (r1 == 0) goto L11
            r1 = r3
            goto L12
        L11:
            r1 = r2
        L12:
            if (r1 != 0) goto L1e
            java.lang.ref.WeakReference<android.view.View> r1 = r7.f21856e     // Catch: java.lang.Throwable -> La4
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> La4
            if (r1 == 0) goto L1e
            r1 = r3
            goto L1f
        L1e:
            r1 = r2
        L1f:
            if (r1 == 0) goto L8d
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference     // Catch: java.lang.Throwable -> La4
            r1.<init>()     // Catch: java.lang.Throwable -> La4
            java.lang.ref.WeakReference<android.view.View> r4 = r7.f21856e     // Catch: java.lang.Throwable -> La4
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> La4
            android.view.View r4 = (android.view.View) r4     // Catch: java.lang.Throwable -> La4
            com.startapp.sdk.ads.banner.BannerOptions r5 = r7.f21858g     // Catch: java.lang.Throwable -> La4
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r4 = com.startapp.bb.a(r4, r5, r1)     // Catch: java.lang.Throwable -> La4
            if (r4 == 0) goto L4e
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r5 = r7.f21852a     // Catch: java.lang.Throwable -> La4
            if (r5 == 0) goto L44
            int r5 = r5.a()     // Catch: java.lang.Throwable -> La4
            int r6 = r4.a()     // Catch: java.lang.Throwable -> La4
            if (r5 > r6) goto L4e
        L44:
            r7.f21852a = r4     // Catch: java.lang.Throwable -> La4
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> La4
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Throwable -> La4
            r7.f21853b = r1     // Catch: java.lang.Throwable -> La4
        L4e:
            if (r4 != 0) goto L52
            r1 = r3
            goto L53
        L52:
            r1 = r2
        L53:
            if (r1 == 0) goto L61
            boolean r4 = r7.f21859h     // Catch: java.lang.Throwable -> La4
            if (r4 == 0) goto L61
            r7.f21859h = r2     // Catch: java.lang.Throwable -> La4
            com.startapp.s7 r1 = r7.f21857f     // Catch: java.lang.Throwable -> La4
            r1.c()     // Catch: java.lang.Throwable -> La4
            goto L85
        L61:
            if (r1 != 0) goto L85
            boolean r1 = r7.f21859h     // Catch: java.lang.Throwable -> La4
            if (r1 != 0) goto L85
            r7.f21859h = r3     // Catch: java.lang.Throwable -> La4
            com.startapp.s7 r1 = r7.f21857f     // Catch: java.lang.Throwable -> La4
            r1.a()     // Catch: java.lang.Throwable -> La4
            com.startapp.cb$a r1 = r7.f21854c     // Catch: java.lang.Throwable -> La4
            if (r1 == 0) goto L85
            com.startapp.sdk.ads.nativead.NativeAdDetails$e r1 = (com.startapp.sdk.ads.nativead.NativeAdDetails.e) r1     // Catch: java.lang.Throwable -> La4
            com.startapp.sdk.ads.nativead.NativeAdDetails r2 = com.startapp.sdk.ads.nativead.NativeAdDetails.this     // Catch: java.lang.Throwable -> La4
            com.startapp.sdk.ads.nativead.NativeAdDisplayListener r4 = r2.f22671j     // Catch: java.lang.Throwable -> La4
            if (r4 == 0) goto L85
            boolean r5 = r2.f22666e     // Catch: java.lang.Throwable -> La4
            if (r5 != 0) goto L85
            r4.adHidden(r2)     // Catch: java.lang.Throwable -> La4
            com.startapp.sdk.ads.nativead.NativeAdDetails r1 = com.startapp.sdk.ads.nativead.NativeAdDetails.this     // Catch: java.lang.Throwable -> La4
            r1.f22666e = r3     // Catch: java.lang.Throwable -> La4
        L85:
            android.os.Handler r1 = r7.f21855d     // Catch: java.lang.Throwable -> La4
            r2 = 100
            r1.postDelayed(r7, r2)     // Catch: java.lang.Throwable -> La4
            goto Lba
        L8d:
            com.startapp.s7 r1 = r7.f21857f     // Catch: java.lang.Throwable -> Lba
            if (r1 == 0) goto L9e
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r2 = r7.f21852a     // Catch: java.lang.Throwable -> Lba
            if (r2 == 0) goto L9e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lba
            org.json.JSONObject r3 = r7.f21853b     // Catch: java.lang.Throwable -> Lba
            r1.a(r2, r3)     // Catch: java.lang.Throwable -> Lba
        L9e:
            android.os.Handler r1 = r7.f21855d     // Catch: java.lang.Throwable -> Lba
            r1.removeCallbacksAndMessages(r0)     // Catch: java.lang.Throwable -> Lba
            goto Lba
        La4:
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r1 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.INTERNAL_ERROR
            r7.f21852a = r1
            com.startapp.s7 r2 = r7.f21857f     // Catch: java.lang.Throwable -> Lba
            if (r2 == 0) goto Lb5
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lba
            org.json.JSONObject r3 = r7.f21853b     // Catch: java.lang.Throwable -> Lba
            r2.a(r1, r3)     // Catch: java.lang.Throwable -> Lba
        Lb5:
            android.os.Handler r1 = r7.f21855d     // Catch: java.lang.Throwable -> Lba
            r1.removeCallbacksAndMessages(r0)     // Catch: java.lang.Throwable -> Lba
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.cb.run():void");
    }

    public cb(WeakReference<View> weakReference, s7 s7Var, BannerOptions bannerOptions) {
        this.f21856e = weakReference;
        this.f21857f = s7Var;
        this.f21858g = bannerOptions;
    }
}
