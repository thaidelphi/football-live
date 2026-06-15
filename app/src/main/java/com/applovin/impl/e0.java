package com.applovin.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e0 {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f6845a;

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.n f6846b;

    /* renamed from: c  reason: collision with root package name */
    private final long f6847c;

    /* renamed from: d  reason: collision with root package name */
    private final long f6848d;

    /* renamed from: e  reason: collision with root package name */
    private final int f6849e;

    /* renamed from: f  reason: collision with root package name */
    private final int f6850f;

    /* renamed from: g  reason: collision with root package name */
    private final int f6851g;

    /* renamed from: k  reason: collision with root package name */
    private Handler f6855k;

    /* renamed from: l  reason: collision with root package name */
    private HandlerThread f6856l;

    /* renamed from: n  reason: collision with root package name */
    private c f6858n;

    /* renamed from: h  reason: collision with root package name */
    private WeakReference f6852h = new WeakReference(null);

    /* renamed from: i  reason: collision with root package name */
    private int f6853i = 0;

    /* renamed from: j  reason: collision with root package name */
    private Integer f6854j = null;

    /* renamed from: m  reason: collision with root package name */
    private final Runnable f6857m = new Runnable() { // from class: com.applovin.impl.aa
        @Override // java.lang.Runnable
        public final void run() {
            e0.this.a();
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements PixelCopy.OnPixelCopyFinishedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f6860a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Bitmap f6861b;

        b(d dVar, Bitmap bitmap) {
            this.f6860a = dVar;
            this.f6861b = bitmap;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int i10) {
            if (i10 == 0) {
                this.f6860a.a(this.f6861b);
                return;
            }
            com.applovin.impl.sdk.n unused = e0.this.f6846b;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = e0.this.f6846b;
                nVar.b("BlackViewDetector", "Failed to capture screenshot with error code: " + i10);
            }
            this.f6860a.a(true);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface c {
        void a(View view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface d {
        void a(Bitmap bitmap);

        void a(boolean z10);
    }

    public e0(com.applovin.impl.sdk.j jVar) {
        this.f6845a = jVar;
        this.f6846b = jVar.I();
        this.f6847c = ((Long) jVar.a(o4.M5)).longValue();
        this.f6848d = ((Long) jVar.a(o4.L5)).longValue();
        this.f6849e = ((Integer) jVar.a(o4.N5)).intValue();
        this.f6850f = ((Integer) jVar.a(o4.O5)).intValue();
        this.f6851g = ((Integer) jVar.a(o4.P5)).intValue();
    }

    static /* synthetic */ int e(e0 e0Var) {
        int i10 = e0Var.f6853i;
        e0Var.f6853i = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.f6858n = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        long j10 = this.f6847c;
        if (j10 > 0) {
            if (this.f6853i > 1) {
                e();
                g();
                return;
            }
            Handler handler = this.f6855k;
            if (handler != null) {
                handler.postDelayed(this.f6857m, j10);
                return;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.f6846b.k("BlackViewDetector", "Monitoring handler was unexpectedly null");
            }
            g();
            return;
        }
        if (this.f6853i == 1) {
            e();
        }
        g();
    }

    private void e() {
        final View view = (View) this.f6852h.get();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f6846b;
            nVar.k("BlackViewDetector", "Detected black view: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ca
            @Override // java.lang.Runnable
            public final void run() {
                e0.this.a(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f6853i = 0;
        this.f6854j = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f6852h.get() != null) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f6846b;
                nVar.a("BlackViewDetector", "Stopped monitoring view: " + this.f6852h.get());
            }
            this.f6852h.clear();
        }
        Handler handler = this.f6855k;
        if (handler != null) {
            handler.removeCallbacks(this.f6857m);
            this.f6855k = null;
        }
        if (this.f6858n != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ba
                @Override // java.lang.Runnable
                public final void run() {
                    e0.this.c();
                }
            });
        }
    }

    public void b() {
        g();
        HandlerThread handlerThread = this.f6856l;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f6856l = null;
        }
    }

    public void a(View view, c cVar) {
        if (((Boolean) this.f6845a.a(o4.K5)).booleanValue()) {
            View view2 = (View) this.f6852h.get();
            if (view2 != null) {
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar = this.f6846b;
                    nVar.k("BlackViewDetector", "Monitoring is already in progress for a view: " + view2);
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar2 = this.f6846b;
                nVar2.a("BlackViewDetector", "Started monitoring view: " + view);
            }
            try {
                if (this.f6856l == null) {
                    HandlerThread handlerThread = new HandlerThread("AppLovinSdk:black_view_detector");
                    this.f6856l = handlerThread;
                    handlerThread.start();
                } else {
                    this.f6845a.D().a(y1.f9665f0, "BlackViewDetector:maybeStartMonitoring() unexpectedly called multiple times");
                    g();
                }
                this.f6858n = cVar;
                this.f6852h = new WeakReference(view);
                f();
                Handler handler = new Handler(this.f6856l.getLooper());
                this.f6855k = handler;
                handler.postDelayed(this.f6857m, this.f6848d);
            } catch (Throwable th) {
                g();
                this.f6845a.D().a("BlackViewDetector", "maybeStartMonitoring", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements d {
        a() {
        }

        @Override // com.applovin.impl.e0.d
        public void a(Bitmap bitmap) {
            try {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i10 = width / e0.this.f6849e;
                int i11 = height / e0.this.f6849e;
                int i12 = i10 / 2;
                for (int i13 = i11 / 2; i13 < height; i13 += i11) {
                    for (int i14 = i12; i14 < width; i14 += i10) {
                        int pixel = bitmap.getPixel(i14, i13);
                        if (!e0.this.a(pixel)) {
                            if (e0.this.f6854j == null) {
                                e0.this.f6854j = Integer.valueOf(pixel);
                            }
                        } else {
                            bitmap.recycle();
                            e0.this.f();
                            e0.this.d();
                            return;
                        }
                    }
                }
                e0.e(e0.this);
                bitmap.recycle();
                e0.this.d();
            } catch (Exception e8) {
                e0.this.f6845a.D().a("BlackViewDetector", "onScreenshotCaptured", e8);
                e0.this.g();
            }
        }

        @Override // com.applovin.impl.e0.d
        public void a(boolean z10) {
            if (z10) {
                e0.this.g();
            } else {
                e0.this.d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ActivityManager.MemoryInfo a10;
        View view = (View) this.f6852h.get();
        if (view == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f6846b.k("BlackViewDetector", "Monitored view no longer exists.");
            }
            g();
            return;
        }
        Long l10 = (Long) this.f6845a.a(o4.T5);
        if (l10.longValue() > 0 && (a10 = d7.a((ActivityManager) com.applovin.impl.sdk.j.m().getSystemService("activity"))) != null && a10.availMem < l10.longValue()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f6846b.k("BlackViewDetector", "Cancelling black view detection due to low memory");
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f6846b;
            nVar.a("BlackViewDetector", "Checking for black view: " + view);
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0) {
            a(view, new a());
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar2 = this.f6846b;
            nVar2.k("BlackViewDetector", "Monitored view is not visible due to dimensions (width = " + measuredWidth + ", height = " + measuredHeight + ")");
        }
        f();
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        c cVar = this.f6858n;
        if (cVar != null) {
            cVar.a(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i10) {
        boolean z10;
        int red = Color.red(i10);
        int green = Color.green(i10);
        int blue = Color.blue(i10);
        Integer num = this.f6854j;
        if (num != null) {
            int red2 = Color.red(num.intValue());
            int green2 = Color.green(this.f6854j.intValue());
            int blue2 = Color.blue(this.f6854j.intValue());
            if (Math.abs(red - red2) > this.f6851g || Math.abs(green - green2) > this.f6851g || Math.abs(blue - blue2) > this.f6851g) {
                z10 = true;
                int i11 = this.f6850f;
                return red <= i11 ? true : true;
            }
        }
        z10 = false;
        int i112 = this.f6850f;
        return red <= i112 ? true : true;
    }

    private void a(View view, d dVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            Activity a10 = this.f6845a.e().a();
            if (a10 == null) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f6846b.b("BlackViewDetector", "Failed to capture screenshot due to no active activity");
                }
                dVar.a(false);
                return;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            Rect rect = new Rect(i10, i11, i10 + measuredWidth, i11 + measuredHeight);
            try {
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                PixelCopy.request(a10.getWindow(), rect, createBitmap, new b(dVar, createBitmap), new Handler());
                return;
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar = this.f6846b;
                    nVar.b("BlackViewDetector", "Failed to capture screenshot due to exception: " + th);
                }
                dVar.a(true);
                return;
            }
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f6846b.k("BlackViewDetector", "Unable to capture screenshots on views below API 26");
        }
        dVar.a(true);
    }
}
