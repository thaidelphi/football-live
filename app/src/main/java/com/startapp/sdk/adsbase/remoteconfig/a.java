package com.startapp.sdk.adsbase.remoteconfig;

import android.content.Context;
import com.startapp.e3;
import com.startapp.l3;
import com.startapp.m4;
import com.startapp.o9;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.splash.SplashMetaData;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.z;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f23195a;

    /* renamed from: b  reason: collision with root package name */
    public final AdPreferences f23196b;

    /* renamed from: c  reason: collision with root package name */
    public final MetaDataRequest.RequestReason f23197c;

    /* renamed from: d  reason: collision with root package name */
    public MetaData f23198d;

    /* renamed from: e  reason: collision with root package name */
    public BannerMetaData f23199e;

    /* renamed from: f  reason: collision with root package name */
    public SplashMetaData f23200f;

    /* renamed from: g  reason: collision with root package name */
    public CacheMetaData f23201g;

    /* renamed from: h  reason: collision with root package name */
    public AdInformationMetaData f23202h;

    /* renamed from: i  reason: collision with root package name */
    public AdsCommonMetaData f23203i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f23204j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f23205k;

    public a(Context context, AdPreferences adPreferences, MetaDataRequest.RequestReason requestReason) {
        this.f23195a = context;
        this.f23196b = adPreferences;
        this.f23197c = requestReason;
    }

    public Boolean a() {
        try {
            MetaDataRequest metaDataRequest = new MetaDataRequest(this.f23195a, com.startapp.sdk.components.a.a(this.f23195a).E.a(), this.f23197c);
            metaDataRequest.a(this.f23195a, this.f23196b);
            e3 a10 = a(this.f23195a, metaDataRequest);
            if (a10 == null) {
                return Boolean.FALSE;
            }
            String str = a10.f21903b;
            if (str == null) {
                return Boolean.FALSE;
            }
            MetaData metaData = (MetaData) m4.a(MetaData.class, str);
            this.f23198d = metaData;
            if (metaData == null) {
                return Boolean.FALSE;
            }
            if (metaData.j() != null) {
                z a11 = com.startapp.sdk.components.a.a(this.f23195a).f23236l.a();
                String j10 = this.f23198d.j();
                if (j10 != null) {
                    j10 = j10.trim();
                }
                synchronized (a11.f23646a) {
                    a11.f23647b.edit().putString("31721150b470a3b9", j10).commit();
                }
            }
            WeakHashMap weakHashMap = o9.f22359a;
            AdsCommonMetaData adsCommonMetaData = (AdsCommonMetaData) m4.a(AdsCommonMetaData.class, str);
            if (adsCommonMetaData != null) {
                this.f23203i = adsCommonMetaData;
            }
            BannerMetaData bannerMetaData = (BannerMetaData) m4.a(BannerMetaData.class, str);
            if (bannerMetaData != null) {
                this.f23199e = bannerMetaData;
            }
            SplashMetaData splashMetaData = (SplashMetaData) m4.a(SplashMetaData.class, str);
            if (splashMetaData != null) {
                this.f23200f = splashMetaData;
            }
            CacheMetaData cacheMetaData = (CacheMetaData) m4.a(CacheMetaData.class, str);
            if (cacheMetaData != null) {
                this.f23201g = cacheMetaData;
            }
            AdInformationMetaData adInformationMetaData = (AdInformationMetaData) m4.a(AdInformationMetaData.class, str);
            if (adInformationMetaData != null) {
                this.f23202h = adInformationMetaData;
            }
            b();
            return Boolean.TRUE;
        } catch (Throwable th) {
            l3.a(th);
            return Boolean.FALSE;
        }
    }

    public final void b() {
        synchronized (MetaData.f23151d) {
            if (!this.f23204j && this.f23198d != null && this.f23195a != null) {
                WeakHashMap weakHashMap = o9.f22359a;
                AdsCommonMetaData adsCommonMetaData = this.f23203i;
                if (adsCommonMetaData != null && !o9.a(AdsCommonMetaData.f22889h, adsCommonMetaData)) {
                    this.f23205k = true;
                    AdsCommonMetaData.a(this.f23195a, this.f23203i);
                }
                WeakHashMap weakHashMap2 = o9.f22359a;
                if (this.f23199e != null && !o9.a(BannerMetaData.f22541b, this.f23199e)) {
                    this.f23205k = true;
                    BannerMetaData.a(this.f23195a, this.f23199e);
                }
                WeakHashMap weakHashMap3 = o9.f22359a;
                if (this.f23200f != null && !o9.a(SplashMetaData.f22718b, this.f23200f)) {
                    this.f23205k = true;
                    SplashMetaData.a(this.f23195a, this.f23200f);
                }
                WeakHashMap weakHashMap4 = o9.f22359a;
                if (this.f23201g != null && !o9.a(CacheMetaData.f23015a, this.f23201g)) {
                    this.f23205k = true;
                    CacheMetaData.a(this.f23195a, this.f23201g);
                }
                WeakHashMap weakHashMap5 = o9.f22359a;
                if (this.f23202h != null && !o9.a(AdInformationMetaData.f22954a, this.f23202h)) {
                    this.f23205k = true;
                    AdInformationMetaData.a(this.f23195a, this.f23202h);
                }
                try {
                    MetaData.a(this.f23195a, this.f23198d.h());
                } catch (Exception unused) {
                }
            }
        }
    }

    public void a(Boolean bool) {
        MetaData metaData;
        Context context;
        synchronized (MetaData.f23151d) {
            if (!this.f23204j) {
                if (bool.booleanValue() && (metaData = this.f23198d) != null && (context = this.f23195a) != null) {
                    MetaData.a(context, metaData, this.f23197c, this.f23205k);
                } else {
                    MetaData.a(this.f23197c);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.startapp.e3 a(android.content.Context r13, com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest r14) throws com.startapp.sdk.common.SDKException {
        /*
            java.lang.String r0 = "GET"
            com.startapp.sdk.adsbase.remoteconfig.MetaData r1 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f23158k
            java.util.List<java.lang.String> r1 = r1.metaDataHosts
            r2 = 1
            if (r1 == 0) goto Lf
            int r3 = r1.size()
            if (r3 >= r2) goto L11
        Lf:
            java.util.List<java.lang.String> r1 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f23154g
        L11:
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r3 = r1.hasNext()
            r4 = 0
            if (r3 == 0) goto L9f
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            com.startapp.sdk.components.a r5 = com.startapp.sdk.components.a.a(r13)
            com.startapp.t4<com.startapp.b3> r5 = r5.f23237m
            java.lang.Object r5 = r5.a()
            com.startapp.b3 r5 = (com.startapp.b3) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r3 = com.startapp.q.f22398d
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.lang.String r3 = r14.a(r3)
            java.util.HashMap r6 = r5.a()     // Catch: java.lang.Throwable -> L7f
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L7f
            long r9 = com.startapp.o9.a()     // Catch: java.lang.Throwable -> L7f
            com.startapp.t4<com.startapp.d6> r11 = r5.f21790d     // Catch: java.lang.Throwable -> L7f
            if (r11 == 0) goto L63
            java.lang.Object r11 = r11.a()     // Catch: java.lang.Throwable -> L7f
            com.startapp.d6 r11 = (com.startapp.d6) r11     // Catch: java.lang.Throwable -> L7f
            com.startapp.g6 r12 = new com.startapp.g6     // Catch: java.lang.Throwable -> L7f
            r12.<init>(r11)     // Catch: java.lang.Throwable -> L7f
            goto L64
        L63:
            r12 = r4
        L64:
            com.startapp.e3 r6 = com.startapp.b3.a(r6, r3)     // Catch: com.startapp.sdk.common.SDKException -> L78 java.lang.Throwable -> L7f
            if (r12 == 0) goto L6d
            r12.a(r0, r3, r4)     // Catch: com.startapp.sdk.common.SDKException -> L78 java.lang.Throwable -> L7f
        L6d:
            r6.f21906e = r7     // Catch: com.startapp.sdk.common.SDKException -> L78 java.lang.Throwable -> L7f
            r6.f21907f = r9     // Catch: com.startapp.sdk.common.SDKException -> L78 java.lang.Throwable -> L7f
            long r7 = com.startapp.o9.a()     // Catch: com.startapp.sdk.common.SDKException -> L78 java.lang.Throwable -> L7f
            r6.f21908g = r7     // Catch: com.startapp.sdk.common.SDKException -> L78 java.lang.Throwable -> L7f
            goto L8a
        L78:
            r6 = move-exception
            if (r12 == 0) goto L89
            r12.a(r0, r3, r6)     // Catch: java.lang.Throwable -> L7f
            goto L89
        L7f:
            r3 = move-exception
            boolean r5 = r5.a(r2)
            if (r5 == 0) goto L89
            com.startapp.l3.a(r3)
        L89:
            r6 = r4
        L8a:
            if (r6 == 0) goto L8d
            return r6
        L8d:
            com.startapp.sdk.components.a r3 = com.startapp.sdk.components.a.a(r13)
            com.startapp.t4<com.startapp.u1> r3 = r3.f23243s
            java.lang.Object r3 = r3.a()
            com.startapp.u1 r3 = (com.startapp.u1) r3
            boolean r3 = r3.b()
            if (r3 != 0) goto L19
        L9f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.remoteconfig.a.a(android.content.Context, com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest):com.startapp.e3");
    }
}
