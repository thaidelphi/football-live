package com.startapp.sdk.ads.banner;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import com.google.android.gms.ads.AdRequest;
import com.google.protobuf.CodedOutputStream;
import com.startapp.cb;
import com.startapp.j0;
import com.startapp.j9;
import com.startapp.s7;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.adrules.AdaptMetaData;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.Random;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class BannerBase extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f22522a;

    /* renamed from: b  reason: collision with root package name */
    public AdPreferences f22523b;

    /* renamed from: c  reason: collision with root package name */
    public AdRulesResult f22524c;

    /* renamed from: d  reason: collision with root package name */
    public int f22525d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f22526e;

    /* renamed from: f  reason: collision with root package name */
    public Point f22527f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f22528g;

    /* renamed from: h  reason: collision with root package name */
    public int f22529h;

    /* renamed from: i  reason: collision with root package name */
    public int f22530i;

    /* renamed from: j  reason: collision with root package name */
    public cb f22531j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f22532k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f22533l;

    /* renamed from: m  reason: collision with root package name */
    public String f22534m;

    /* renamed from: n  reason: collision with root package name */
    public final a f22535n;

    /* renamed from: o  reason: collision with root package name */
    public final Handler f22536o;

    /* renamed from: p  reason: collision with root package name */
    public final Object f22537p;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AdRulesResult adRulesResult;
            if (BannerBase.this.isShown() || !((adRulesResult = BannerBase.this.f22524c) == null || adRulesResult.b())) {
                BannerBase.this.i();
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Handler.Callback {
        public b() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1 || i10 == 2) {
                BannerBase bannerBase = BannerBase.this;
                bannerBase.k();
                bannerBase.i();
            }
            return true;
        }
    }

    public BannerBase(Context context) {
        super(context);
        this.f22522a = false;
        this.f22525d = 0;
        this.f22526e = true;
        this.f22528g = false;
        int nextInt = new Random().nextInt(100000) + 159868227;
        this.f22529h = nextInt;
        this.f22530i = nextInt + 1;
        this.f22532k = false;
        this.f22533l = false;
        this.f22535n = new a();
        this.f22536o = new Handler(Looper.getMainLooper(), new b());
        this.f22537p = new Object();
        try {
            com.startapp.sdk.components.a.a(context).d().a().a(AdRequest.MAX_CONTENT_URL_LENGTH);
        } catch (Throwable unused) {
        }
    }

    public abstract void a(int i10);

    public final void a(Context context, AttributeSet attributeSet) {
        setAdTag(new j0(context, attributeSet).f22118b);
    }

    public int b() {
        return e();
    }

    public abstract int c();

    public abstract String d();

    public abstract int e();

    public View f() {
        return this;
    }

    public final void g() {
        if (!isInEditMode()) {
            h();
            return;
        }
        setMinimumWidth(j9.a(getContext(), getWidthInDp()));
        setMinimumHeight(j9.a(getContext(), getHeightInDp()));
        setBackgroundColor(Color.rgb(169, 169, 169));
        TextView textView = new TextView(getContext());
        textView.setText(d());
        textView.setTextColor(-16777216);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        addView(textView, layoutParams);
    }

    public AdPreferences getAdPreferences() {
        AdPreferences adPreferences = this.f22523b;
        if (adPreferences == null) {
            AdPreferences adPreferences2 = new AdPreferences();
            this.f22523b = adPreferences2;
            return adPreferences2;
        }
        return adPreferences;
    }

    public abstract String getBidToken();

    public String getErrorMessage() {
        return this.f22534m;
    }

    @Keep
    public abstract int getHeightInDp();

    @Keep
    public abstract int getWidthInDp();

    public abstract void h();

    public abstract void hideBanner();

    public final void i() {
        NotDisplayedReason notDisplayedReason;
        cb cbVar = this.f22531j;
        if (cbVar != null) {
            try {
                s7 s7Var = cbVar.f21857f;
                if (s7Var != null && (notDisplayedReason = cbVar.f21852a) != null) {
                    s7Var.a(notDisplayedReason.toString(), cbVar.f21853b);
                }
                cbVar.f21855d.removeCallbacksAndMessages(null);
            } catch (Throwable unused) {
            }
            this.f22531j = null;
        }
        if (this.f22524c != null && !AdaptMetaData.f23001a.a().a()) {
            if (this.f22524c.b()) {
                j();
                return;
            }
            return;
        }
        AdRulesResult a10 = AdaptMetaData.f23001a.a().a(AdPreferences.Placement.INAPP_BANNER, getAdPreferences().getAdTag());
        this.f22524c = a10;
        if (a10.b()) {
            j();
        } else {
            hideBanner();
        }
    }

    public boolean isClicked() {
        return this.f22532k;
    }

    public boolean isFirstLoad() {
        return this.f22526e;
    }

    public abstract void j();

    public void k() {
        if (this.f22522a && !isInEditMode() && CacheMetaData.d()) {
            removeCallbacks(this.f22535n);
            postDelayed(this.f22535n, b());
            long D = MetaData.f23158k.D() * 1000;
            synchronized (this.f22537p) {
                this.f22536o.removeMessages(2);
                this.f22536o.sendEmptyMessageDelayed(2, D);
            }
        }
    }

    public void loadAd(int i10, int i11) {
        if (getParent() != null) {
            return;
        }
        try {
            com.startapp.sdk.components.a.a(getContext()).f23244t.a().a(1024);
        } catch (Throwable unused) {
        }
        this.f22527f = new Point(i10, i11);
        synchronized (this.f22537p) {
            if (!this.f22536o.hasMessages(1)) {
                this.f22536o.sendEmptyMessage(1);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            com.startapp.sdk.components.a.a(getContext()).f23244t.a().a(CodedOutputStream.DEFAULT_BUFFER_SIZE);
        } catch (Throwable unused) {
        }
        this.f22522a = true;
        k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        NotDisplayedReason notDisplayedReason;
        super.onDetachedFromWindow();
        this.f22522a = false;
        a();
        cb cbVar = this.f22531j;
        if (cbVar != null) {
            try {
                s7 s7Var = cbVar.f21857f;
                if (s7Var != null && (notDisplayedReason = cbVar.f21852a) != null) {
                    s7Var.a(notDisplayedReason.toString(), cbVar.f21853b);
                }
                cbVar.f21855d.removeCallbacksAndMessages(null);
            } catch (Throwable unused) {
            }
            this.f22531j = null;
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        a(bundle.getInt("bannerId"));
        this.f22524c = (AdRulesResult) bundle.getSerializable("adRulesResult");
        this.f22523b = (AdPreferences) bundle.getSerializable("adPreferences");
        this.f22525d = bundle.getInt("offset");
        this.f22526e = bundle.getBoolean("firstLoad");
        this.f22533l = bundle.getBoolean("shouldReloadBanner");
        super.onRestoreInstanceState(bundle.getParcelable("upperState"));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        if (isClicked()) {
            setClicked(false);
            this.f22533l = true;
        }
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putInt("bannerId", c());
        bundle.putParcelable("upperState", onSaveInstanceState);
        bundle.putSerializable("adRulesResult", this.f22524c);
        bundle.putSerializable("adPreferences", this.f22523b);
        bundle.putInt("offset", this.f22525d);
        bundle.putBoolean("firstLoad", this.f22526e);
        bundle.putBoolean("shouldReloadBanner", this.f22533l);
        return bundle;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            if (this.f22533l) {
                this.f22533l = false;
                i();
            }
            this.f22522a = true;
            k();
            return;
        }
        this.f22522a = false;
        a();
    }

    public void setAdPreferences(AdPreferences adPreferences) {
        this.f22523b = adPreferences != null ? new AdPreferences(adPreferences) : null;
    }

    public void setAdTag(String str) {
        getAdPreferences().setAdTag(str);
    }

    public void setClicked(boolean z10) {
        this.f22532k = z10;
    }

    public void setErrorMessage(String str) {
        this.f22534m = str;
    }

    public void setFirstLoad(boolean z10) {
        this.f22526e = z10;
    }

    public final void a() {
        if (isInEditMode()) {
            return;
        }
        removeCallbacks(this.f22535n);
        synchronized (this.f22537p) {
            this.f22536o.removeMessages(2);
        }
    }

    public void loadAd() {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        loadAd(j9.b(getContext(), displayMetrics.widthPixels), j9.b(getContext(), displayMetrics.heightPixels));
    }

    public BannerBase(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BannerBase(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f22522a = false;
        this.f22525d = 0;
        this.f22526e = true;
        this.f22528g = false;
        int nextInt = new Random().nextInt(100000) + 159868227;
        this.f22529h = nextInt;
        this.f22530i = nextInt + 1;
        this.f22532k = false;
        this.f22533l = false;
        this.f22535n = new a();
        this.f22536o = new Handler(Looper.getMainLooper(), new b());
        this.f22537p = new Object();
        a(context, attributeSet);
    }
}
