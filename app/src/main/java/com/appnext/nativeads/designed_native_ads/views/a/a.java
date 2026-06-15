package com.appnext.nativeads.designed_native_ads.views.a;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.appnext.core.AppnextError;
import com.appnext.core.SettingsManager;
import com.appnext.core.i;
import com.appnext.core.k;
import com.appnext.nativeads.R;
import com.appnext.nativeads.designed_native_ads.AppnextDesignedNativeAdData;
import com.appnext.nativeads.designed_native_ads.DesignNativeAd;
import com.appnext.nativeads.designed_native_ads.DesignNativeAdsRequest;
import com.appnext.nativeads.designed_native_ads.a;
import com.appnext.nativeads.designed_native_ads.c;
import com.appnext.nativeads.designed_native_ads.d;
import com.appnext.nativeads.designed_native_ads.views.models.AppnextSuggestedAppsImageSide;
import com.ironsource.b9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a extends LinearLayout implements a.InterfaceC0163a {
    private Context aO;
    private String fT;
    private com.appnext.nativeads.designed_native_ads.a gm;
    private d gn;
    private ImageView go;
    private ViewGroup gp;
    private ViewGroup gq;
    private int gr;
    private InterfaceC0165a gs;
    private int mBackgroundColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.appnext.nativeads.designed_native_ads.views.a.a$5  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] gl;

        static {
            int[] iArr = new int[AppnextSuggestedAppsImageSide.values().length];
            gl = iArr;
            try {
                iArr[AppnextSuggestedAppsImageSide.Right.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                gl[AppnextSuggestedAppsImageSide.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.appnext.nativeads.designed_native_ads.views.a.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface InterfaceC0165a {
        void onAdClicked(AppnextDesignedNativeAdData appnextDesignedNativeAdData);

        void onAdsLoadedSuccessfully();

        void onError(AppnextError appnextError);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void aQ();
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.aO = context;
        try {
            setVisibility(8);
            LinearLayout.inflate(this.aO, R.layout.design_native_ads_layout, this);
            setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            setSuggestedAppsBackgroundColor(-1);
            ((FrameLayout) findViewById(R.id.design_native_ads_container)).addView(((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(getContentResource(), (ViewGroup) null), new LinearLayout.LayoutParams(-1, -1));
        } catch (Throwable th) {
            com.appnext.base.a.a("DesignedNativeAdView$buildView", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aR() {
        try {
            setTitle(c.aK().t(b9.h.D0));
            setTitleTextColor(Color.parseColor(c.aK().t("title_text_color")));
            setAmountOfApps(Integer.parseInt(c.aK().t("amount_of_icons")));
            a(Boolean.parseBoolean(c.aK().t("present_titles")));
            setIconAppTitleTextColor(Color.parseColor(c.aK().t("app_title_text_color")));
            setLocalDirection(Boolean.parseBoolean(c.aK().t("local_direction")));
            setSuggestedBackgroundColor(Color.parseColor(c.aK().t("background_color")));
            setTransparency(Integer.parseInt(c.aK().t("transparency")));
        } catch (Throwable th) {
            com.appnext.base.a.a("DesignedNativeAdView$initParameters", th);
        }
    }

    private void setPrivacyIcon(final ArrayList<DesignNativeAd> arrayList) {
        this.gp.setOnClickListener(new View.OnClickListener() { // from class: com.appnext.nativeads.designed_native_ads.views.a.a.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(i.d(arrayList)));
                    intent.setFlags(268435456);
                    a.this.getContext().startActivity(intent);
                } catch (Throwable th) {
                    com.appnext.base.a.a("DesignedNativeAdView$buildView", th);
                }
            }
        });
        if (k.a(arrayList.get(0), c.aK())) {
            k.a(getContext(), this.go);
        } else {
            this.go.setImageResource(R.drawable.apnxt_na_i_icon_dark);
        }
    }

    private void setSuggestedAppsBackgroundColor(int i10) {
        try {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(i10);
            gradientDrawable.setCornerRadius(30.0f);
            setBackground(gradientDrawable);
        } catch (Throwable th) {
            com.appnext.base.a.a("DesignedNativeAdView$setSuggestedAppsBackgroundColor", th);
        }
    }

    public final void a(String str, final b bVar) {
        com.appnext.nativeads.designed_native_ads.a aVar = new com.appnext.nativeads.designed_native_ads.a();
        this.gm = aVar;
        aVar.a(this);
        c.aK().a(getContext().getApplicationContext(), str, new SettingsManager.ConfigCallback() { // from class: com.appnext.nativeads.designed_native_ads.views.a.a.1
            @Override // com.appnext.core.SettingsManager.ConfigCallback
            public final void error(String str2) {
                try {
                    a.this.aR();
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.aQ();
                    }
                } catch (Throwable th) {
                    com.appnext.base.a.a("DesignedNativeAdView$init", th);
                }
            }

            @Override // com.appnext.core.SettingsManager.ConfigCallback
            public final void loaded(HashMap<String, Object> hashMap) {
                try {
                    a.this.aR();
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.aQ();
                    }
                } catch (Throwable th) {
                    com.appnext.base.a.a("DesignedNativeAdView$init", th);
                }
            }
        });
    }

    protected abstract void a(boolean z10);

    @Override // com.appnext.nativeads.designed_native_ads.a.InterfaceC0163a
    public final void d(List<DesignNativeAd> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    setVisibility(0);
                    setPrivacyIcon(new ArrayList<>(list));
                    this.gn = new d(this.aO, list, this.fT);
                    f(list);
                    InterfaceC0165a interfaceC0165a = this.gs;
                    if (interfaceC0165a != null) {
                        interfaceC0165a.onAdsLoadedSuccessfully();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                com.appnext.base.a.a("DesignedNativeAdView$onLoaded", th);
                return;
            }
        }
        setVisibility(8);
        InterfaceC0165a interfaceC0165a2 = this.gs;
        if (interfaceC0165a2 != null) {
            interfaceC0165a2.onError(new AppnextError("Internal error"));
        }
    }

    protected abstract void f(List<DesignNativeAd> list);

    public int getAmountOfApps() {
        return this.gr;
    }

    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    protected abstract int getContentResource();

    @Override // com.appnext.nativeads.designed_native_ads.a.InterfaceC0163a
    public final void onError(AppnextError appnextError) {
        try {
            setVisibility(8);
            InterfaceC0165a interfaceC0165a = this.gs;
            if (interfaceC0165a != null) {
                interfaceC0165a.onError(appnextError);
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("DesignedNativeAdView$onError", th);
        }
    }

    public void setAmountOfApps(int i10) {
        this.gr = i10;
    }

    public void setIconAppTitleTextColor(int i10) {
        setIconTitleTextColor(i10);
    }

    protected abstract void setIconTitleTextColor(int i10);

    public void setLocalDirection(boolean z10) {
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                if (z10) {
                    setLayoutDirection(3);
                } else {
                    setLayoutDirection(0);
                }
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("DesignedNativeAdView$setLocalDirection", th);
        }
    }

    public void setPresentTitles(boolean z10) {
        a(z10);
    }

    public void setPrivacyIconSide(AppnextSuggestedAppsImageSide appnextSuggestedAppsImageSide) {
        int i10 = AnonymousClass5.gl[appnextSuggestedAppsImageSide.ordinal()];
        if (i10 == 1) {
            this.go = (ImageView) findViewById(R.id.privacy_icon_right);
            this.gp = (ViewGroup) findViewById(R.id.privacy_icon_container_right);
            this.gq = (ViewGroup) findViewById(R.id.privacy_icon_container_left);
        } else if (i10 == 2) {
            this.go = (ImageView) findViewById(R.id.privacy_icon_left);
            this.gp = (ViewGroup) findViewById(R.id.privacy_icon_container_left);
            this.gq = (ViewGroup) findViewById(R.id.privacy_icon_container_right);
        }
        this.gp.setVisibility(0);
        this.gq.setVisibility(4);
    }

    public void setSuggestedBackgroundColor(int i10) {
        this.mBackgroundColor = i10;
        setSuggestedAppsBackgroundColor(i10);
    }

    public void setSuggestedTitleTextSize(float f10) {
        setTitleTextSize(f10);
    }

    public void setTitle(String str) {
        setTitleText(str);
    }

    protected abstract void setTitleText(String str);

    public void setTitleTextColor(int i10) {
        setTitleTextColorForAdUnit(i10);
    }

    protected abstract void setTitleTextColorForAdUnit(int i10);

    protected abstract void setTitleTextSize(float f10);

    public void setTransparency(int i10) {
        try {
            float min = Math.min(100, i10);
            if (min < 0.0f) {
                min = 0.0f;
            }
            setAlpha(min / 100.0f);
        } catch (Throwable th) {
            com.appnext.base.a.a("DesignedNativeAdView$setTransparency", th);
        }
    }

    public final void a(String str, DesignNativeAdsRequest designNativeAdsRequest, InterfaceC0165a interfaceC0165a) {
        try {
            this.gs = interfaceC0165a;
            this.fT = str;
            this.gm.a(this.aO, str, designNativeAdsRequest, this.gr);
        } catch (Throwable th) {
            com.appnext.base.a.a("DesignedNativeAdView$load", th);
        }
    }
}
