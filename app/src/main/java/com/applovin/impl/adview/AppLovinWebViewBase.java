package com.applovin.impl.adview;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.l0;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AppLovinWebViewBase extends WebView {
    public AppLovinWebViewBase(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void applySettings(com.applovin.impl.sdk.ad.b bVar) {
        Boolean m7;
        loadUrl(AndroidWebViewClient.BLANK_PAGE);
        int r02 = bVar.r0();
        if (r02 >= 0) {
            setLayerType(r02, null);
        }
        if (l0.d()) {
            getSettings().setMediaPlaybackRequiresUserGesture(bVar.H());
        }
        if (l0.e() && bVar.H0()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        m s02 = bVar.s0();
        if (s02 != null) {
            WebSettings settings = getSettings();
            WebSettings.PluginState b10 = s02.b();
            if (b10 != null) {
                settings.setPluginState(b10);
            }
            Boolean e8 = s02.e();
            if (e8 != null) {
                settings.setAllowFileAccess(e8.booleanValue());
            }
            Boolean i10 = s02.i();
            if (i10 != null) {
                settings.setLoadWithOverviewMode(i10.booleanValue());
            }
            Boolean q10 = s02.q();
            if (q10 != null) {
                settings.setUseWideViewPort(q10.booleanValue());
            }
            Boolean d10 = s02.d();
            if (d10 != null) {
                settings.setAllowContentAccess(d10.booleanValue());
            }
            Boolean p10 = s02.p();
            if (p10 != null) {
                settings.setBuiltInZoomControls(p10.booleanValue());
            }
            Boolean h10 = s02.h();
            if (h10 != null) {
                settings.setDisplayZoomControls(h10.booleanValue());
            }
            Boolean l10 = s02.l();
            if (l10 != null) {
                settings.setSaveFormData(l10.booleanValue());
            }
            Boolean c10 = s02.c();
            if (c10 != null) {
                settings.setGeolocationEnabled(c10.booleanValue());
            }
            Boolean j10 = s02.j();
            if (j10 != null) {
                settings.setNeedInitialFocus(j10.booleanValue());
            }
            Boolean f10 = s02.f();
            if (f10 != null) {
                settings.setAllowFileAccessFromFileURLs(f10.booleanValue());
            }
            Boolean g10 = s02.g();
            if (g10 != null) {
                settings.setAllowUniversalAccessFromFileURLs(g10.booleanValue());
            }
            Boolean o10 = s02.o();
            if (o10 != null) {
                settings.setLoadsImagesAutomatically(o10.booleanValue());
            }
            Boolean n10 = s02.n();
            if (n10 != null) {
                settings.setBlockNetworkImage(n10.booleanValue());
            }
            if (l0.f()) {
                Integer a10 = s02.a();
                if (a10 != null) {
                    settings.setMixedContentMode(a10.intValue());
                }
                if (l0.g()) {
                    Boolean k10 = s02.k();
                    if (k10 != null) {
                        settings.setOffscreenPreRaster(k10.booleanValue());
                    }
                    if (!l0.l() || (m7 = s02.m()) == null) {
                        return;
                    }
                    settings.setAlgorithmicDarkeningAllowed(m7.booleanValue());
                }
            }
        }
    }
}
