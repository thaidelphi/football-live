package com.startapp.sdk.adsbase;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.l;
import com.startapp.l3;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
import com.startapp.v0;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f23002a;

    /* renamed from: b  reason: collision with root package name */
    public final Ad f23003b;

    /* renamed from: c  reason: collision with root package name */
    public final AdPreferences f23004c;

    /* renamed from: d  reason: collision with root package name */
    public AdEventListener f23005d;

    /* renamed from: e  reason: collision with root package name */
    public final AdPreferences.Placement f23006e;

    /* renamed from: f  reason: collision with root package name */
    public String f23007f = null;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            try {
                new Handler(Looper.getMainLooper()).post(new v0(bVar, bVar.b()));
            } catch (Throwable th) {
                l3.a(th);
            }
        }
    }

    public b(Context context, Ad ad, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement) {
        this.f23002a = context;
        this.f23003b = ad;
        this.f23004c = adPreferences;
        this.f23005d = adEventListener;
        this.f23006e = placement;
    }

    public final AdEventListener a() {
        AdEventListener adEventListener = this.f23005d;
        this.f23005d = null;
        return adEventListener;
    }

    public abstract boolean a(Object obj);

    public final boolean b() {
        try {
            return a(e());
        } catch (Throwable th) {
            l3.a(th);
            return false;
        }
    }

    public final void c() {
        try {
            com.startapp.sdk.components.a.a(this.f23002a).f23249y.a().execute(new a());
        } catch (Throwable th) {
            try {
                new Handler(Looper.getMainLooper()).post(new v0(this, false));
            } catch (Throwable th2) {
                l3.a(th2);
            }
            l3.a(th);
        }
    }

    public GetAdRequest d() {
        GetAdRequest a10 = a(new GetAdRequest());
        if (a10 != null) {
            a10.d(this.f23002a);
        }
        return a10;
    }

    public abstract Object e() throws Exception;

    public void a(boolean z10) {
        b(z10);
        if (z10) {
            return;
        }
        this.f23003b.setErrorMessage(this.f23007f);
        l.a(this.f23002a, a(), this.f23003b, false);
    }

    public void b(boolean z10) {
        this.f23003b.setState(z10 ? Ad.AdState.READY : Ad.AdState.UN_INITIALIZED);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cc, code lost:
        if (r0.equals(r6.second) != false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[Catch: all -> 0x013d, TryCatch #2 {, blocks: (B:4:0x001b, B:47:0x0141, B:7:0x0028, B:9:0x002e, B:13:0x0037, B:15:0x003b, B:16:0x003e, B:27:0x00ab, B:30:0x00b0, B:32:0x00c6, B:23:0x00a4, B:17:0x006d, B:19:0x0071, B:20:0x0074, B:36:0x00d2, B:38:0x00d6, B:39:0x00d9, B:40:0x0106, B:42:0x010a, B:43:0x010d), top: B:73:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0 A[Catch: all -> 0x013d, TryCatch #2 {, blocks: (B:4:0x001b, B:47:0x0141, B:7:0x0028, B:9:0x002e, B:13:0x0037, B:15:0x003b, B:16:0x003e, B:27:0x00ab, B:30:0x00b0, B:32:0x00c6, B:23:0x00a4, B:17:0x006d, B:19:0x0071, B:20:0x0074, B:36:0x00d2, B:38:0x00d6, B:39:0x00d9, B:40:0x0106, B:42:0x010a, B:43:0x010d), top: B:73:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.startapp.sdk.adsbase.model.GetAdRequest a(com.startapp.sdk.adsbase.model.GetAdRequest r14) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.b.a(com.startapp.sdk.adsbase.model.GetAdRequest):com.startapp.sdk.adsbase.model.GetAdRequest");
    }
}
