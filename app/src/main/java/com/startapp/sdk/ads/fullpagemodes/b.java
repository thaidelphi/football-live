package com.startapp.sdk.ads.fullpagemodes;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.g0;
import com.startapp.h4;
import com.startapp.j9;
import com.startapp.l3;
import com.startapp.n5;
import com.startapp.o5;
import com.startapp.o9;
import com.startapp.p5;
import com.startapp.q5;
import com.startapp.r5;
import com.startapp.s7;
import com.startapp.sdk.adsbase.mraid.bridge.MraidState;
import com.startapp.sdk.adsbase.mraid.bridge.a;
import com.startapp.w5;
import java.util.Map;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b extends g0 {

    /* renamed from: a  reason: collision with root package name */
    public final h4 f22605a;

    /* renamed from: c  reason: collision with root package name */
    public a f22607c;

    /* renamed from: d  reason: collision with root package name */
    public q5 f22608d;

    /* renamed from: e  reason: collision with root package name */
    public r5 f22609e;

    /* renamed from: f  reason: collision with root package name */
    public w5 f22610f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f22611g;

    /* renamed from: h  reason: collision with root package name */
    public ImageView f22612h;

    /* renamed from: b  reason: collision with root package name */
    public MraidState f22606b = MraidState.LOADING;

    /* renamed from: i  reason: collision with root package name */
    public boolean f22613i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f22614j = false;

    /* renamed from: k  reason: collision with root package name */
    public Handler f22615k = null;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends com.startapp.sdk.adsbase.mraid.bridge.a {
        public a(a.InterfaceC0252a interfaceC0252a) {
            super(interfaceC0252a);
        }

        @Override // com.startapp.sdk.adsbase.mraid.bridge.a, com.startapp.l5
        public void close() {
            b bVar = b.this;
            bVar.f22606b = MraidState.HIDDEN;
            o9.a(bVar.f22605a.f22015x, true, "mraid.fireStateChangeEvent", "HIDDEN".toLowerCase());
            b.this.f22605a.M.run();
        }

        public void fireViewableChangeEvent() {
            s7 s7Var;
            b bVar = b.this;
            o9.a(bVar.f22605a.f22015x, true, "mraid.fireViewableChangeEvent", Boolean.valueOf(bVar.f22614j));
            b bVar2 = b.this;
            if (!bVar2.f22614j || (s7Var = bVar2.f22605a.B) == null) {
                return;
            }
            s7Var.b();
        }

        @Override // com.startapp.sdk.adsbase.mraid.bridge.a
        public boolean isFeatureSupported(String str) {
            b bVar = b.this;
            if (bVar.f22608d == null) {
                bVar.f22608d = new q5(bVar.f22605a.f22201b);
            }
            return bVar.f22608d.f22415b.contains(str);
        }

        @Override // com.startapp.sdk.adsbase.mraid.bridge.a, com.startapp.l5
        public void setOrientationProperties(Map<String, String> map) {
            boolean parseBoolean = Boolean.parseBoolean(map.get("allowOrientationChange"));
            String str = map.get("forceOrientation");
            b bVar = b.this;
            if (bVar.f22609e == null) {
                bVar.f22609e = new r5(0);
            }
            r5 r5Var = bVar.f22609e;
            if (r5Var.f22466a == parseBoolean) {
                int i10 = r5Var.f22467b;
                int indexOf = r5.f22465c.indexOf(str);
                if (indexOf == -1) {
                    indexOf = 2;
                }
                if (i10 == indexOf) {
                    return;
                }
            }
            r5Var.f22466a = parseBoolean;
            int indexOf2 = r5.f22465c.indexOf(str);
            r5Var.f22467b = indexOf2 != -1 ? indexOf2 : 2;
            applyOrientationProperties(b.this.f22605a.f22201b, r5Var);
        }

        @Override // com.startapp.sdk.adsbase.mraid.bridge.a, com.startapp.l5
        public void useCustomClose(String str) {
            boolean parseBoolean = Boolean.parseBoolean(str);
            b bVar = b.this;
            if (bVar.f22613i != parseBoolean) {
                bVar.f22613i = parseBoolean;
                if (parseBoolean) {
                    h4 h4Var = bVar.f22605a;
                    h4Var.getClass();
                    try {
                        ImageButton imageButton = h4Var.f22017z;
                        if (imageButton != null) {
                            imageButton.setVisibility(4);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        l3.a(th);
                        return;
                    }
                }
                bVar.f22605a.t();
            }
        }
    }

    public b(h4 h4Var) {
        this.f22605a = h4Var;
    }

    @Override // com.startapp.g0
    public final void a(WebView webView, String str) {
        if (this.f22610f == null) {
            if (this.f22607c == null) {
                this.f22607c = new a(new com.startapp.sdk.ads.fullpagemodes.a(this));
            }
            this.f22610f = new w5(this.f22607c, null);
        }
        this.f22610f.onPageFinished(webView, str);
        if (this.f22606b == MraidState.LOADING) {
            o9.a(webView, true, "mraid.setPlacementType", "interstitial");
            Activity activity = this.f22605a.f22201b;
            if (this.f22608d == null) {
                this.f22608d = new q5(activity);
            }
            p5.a(activity, webView, this.f22608d);
            h4 h4Var = this.f22605a;
            Activity activity2 = h4Var.f22201b;
            WebView webView2 = h4Var.f22015x;
            try {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                activity2.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                int i10 = displayMetrics.widthPixels;
                int i11 = displayMetrics.heightPixels;
                float f10 = i10;
                float f11 = i11;
                o9.a(webView2, true, "mraid.setScreenSize", Integer.valueOf(Math.round(f10 / activity2.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(f11 / activity2.getResources().getDisplayMetrics().density)));
                o9.a(webView2, true, "mraid.setMaxSize", Integer.valueOf(Math.round(f10 / activity2.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(f11 / activity2.getResources().getDisplayMetrics().density)));
                n5.a(activity2, 0, 0, i10, i11, webView2);
                n5.b(activity2, 0, 0, i10, i11, webView2);
            } catch (Throwable th) {
                l3.a(th);
            }
            this.f22605a.j();
            if (!this.f22613i) {
                this.f22605a.t();
            }
            this.f22606b = MraidState.DEFAULT;
            o9.a(webView, true, "mraid.fireStateChangeEvent", "DEFAULT".toLowerCase());
            o9.a(webView, true, "mraid.fireReadyEvent", new Object[0]);
            if (this.f22614j) {
                if (this.f22607c == null) {
                    this.f22607c = new a(new com.startapp.sdk.ads.fullpagemodes.a(this));
                }
                this.f22607c.fireViewableChangeEvent();
            }
            Handler handler = this.f22615k;
            if (handler != null) {
                handler.post(new o5(this));
            }
            this.f22605a.q();
        }
    }

    @Override // com.startapp.g0
    public final boolean b(WebView webView, String str) {
        if (webView == null || str == null) {
            return true;
        }
        if (this.f22610f == null) {
            if (this.f22607c == null) {
                this.f22607c = new a(new com.startapp.sdk.ads.fullpagemodes.a(this));
            }
            this.f22610f = new w5(this.f22607c, null);
        }
        return this.f22610f.shouldOverrideUrlLoading(webView, str);
    }

    @Override // com.startapp.g0
    public final boolean c() {
        return !(this.f22605a.k() >= ((long) this.f22605a.f22219t));
    }

    @Override // com.startapp.g0
    public final void d() {
        if (this.f22605a.k() >= ((long) this.f22605a.f22219t)) {
            if (this.f22607c == null) {
                this.f22607c = new a(new com.startapp.sdk.ads.fullpagemodes.a(this));
            }
            this.f22607c.close();
        }
    }

    @Override // com.startapp.g0
    public final void e() {
        h4 h4Var = this.f22605a;
        Activity activity = h4Var.f22201b;
        WebView webView = h4Var.f22015x;
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i10 = displayMetrics.widthPixels;
            int i11 = displayMetrics.heightPixels;
            float f10 = i10;
            float f11 = i11;
            o9.a(webView, true, "mraid.setScreenSize", Integer.valueOf(Math.round(f10 / activity.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(f11 / activity.getResources().getDisplayMetrics().density)));
            o9.a(webView, true, "mraid.setMaxSize", Integer.valueOf(Math.round(f10 / activity.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(f11 / activity.getResources().getDisplayMetrics().density)));
            n5.a(activity, 0, 0, i10, i11, webView);
            n5.b(activity, 0, 0, i10, i11, webView);
        } catch (Throwable th) {
            l3.a(th);
        }
    }

    @Override // com.startapp.g0
    public final void f() {
        this.f22614j = false;
        if (this.f22606b == MraidState.DEFAULT) {
            if (this.f22607c == null) {
                this.f22607c = new a(new com.startapp.sdk.ads.fullpagemodes.a(this));
            }
            this.f22607c.fireViewableChangeEvent();
        }
    }

    @Override // com.startapp.g0
    public final void g() {
        if (this.f22615k == null && this.f22605a.o()) {
            this.f22615k = new Handler();
        }
        this.f22614j = true;
        if (this.f22606b == MraidState.DEFAULT) {
            if (this.f22607c == null) {
                this.f22607c = new a(new com.startapp.sdk.ads.fullpagemodes.a(this));
            }
            this.f22607c.fireViewableChangeEvent();
        }
    }

    @Override // com.startapp.g0
    public final boolean b() {
        return this.f22605a.f22219t > 0;
    }

    @Override // com.startapp.g0
    public final void a() {
        this.f22606b = MraidState.HIDDEN;
        o9.a(this.f22605a.f22015x, true, "mraid.fireStateChangeEvent", "HIDDEN".toLowerCase());
    }

    @Override // com.startapp.g0
    public final void a(RelativeLayout relativeLayout) {
        if (this.f22605a.o()) {
            h4 h4Var = this.f22605a;
            if (h4Var.f22220u) {
                return;
            }
            Activity activity = h4Var.f22201b;
            int a10 = j9.a(activity, 32);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a10, a10);
            layoutParams.addRule(13);
            ImageView imageView = new ImageView(activity);
            this.f22612h = imageView;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(-16777216);
            gradientDrawable.setStroke(2, -1);
            int a11 = j9.a(this.f22605a.f22201b, 32);
            gradientDrawable.setSize(a11, a11);
            imageView.setImageDrawable(gradientDrawable);
            this.f22612h.setScaleType(ImageView.ScaleType.FIT_CENTER);
            relativeLayout.addView(this.f22612h, layoutParams);
            TextView textView = new TextView(activity);
            this.f22611g = textView;
            textView.setTextColor(-1);
            this.f22611g.setGravity(17);
            relativeLayout.addView(this.f22611g, layoutParams);
        }
    }
}
