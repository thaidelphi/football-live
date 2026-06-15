package com.applovin.impl;

import android.os.Bundle;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class n2 {

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f8009a = new StringBuilder();

    public n2 a(String str, Object obj) {
        return a(str, obj, "");
    }

    public n2 b(String str) {
        this.f8009a.append(str);
        return this;
    }

    public String toString() {
        return this.f8009a.toString();
    }

    public n2 a(String str, Object obj, String str2) {
        StringBuilder sb = this.f8009a;
        sb.append("\n");
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append(str2);
        return this;
    }

    public n2 b(com.applovin.impl.sdk.ad.b bVar) {
        a("Target", bVar.c0()).a("close_style", bVar.n()).a("close_delay_graphic", Long.valueOf(bVar.p()), "s");
        if (bVar instanceof com.applovin.impl.sdk.ad.a) {
            com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) bVar;
            a("HTML", aVar.e1().substring(0, Math.min(aVar.e1().length(), 64)));
        }
        if (bVar.hasVideoUrl()) {
            a("close_delay", Long.valueOf(bVar.i0()), "s").a("skip_style", bVar.a0()).a("Streaming", Boolean.valueOf(bVar.G0())).a("Video Location", bVar.Q()).a("video_button_properties", bVar.g0());
        }
        return this;
    }

    public n2 a(String str) {
        StringBuilder sb = this.f8009a;
        sb.append("\n");
        sb.append(str);
        return this;
    }

    public n2 a() {
        this.f8009a.append("\n========================================");
        return this;
    }

    public n2 a(com.applovin.impl.sdk.ad.b bVar) {
        boolean z10 = bVar instanceof e7;
        a("Format", bVar.getAdZone().d() != null ? bVar.getAdZone().d().getLabel() : null).a("Ad ID", Long.valueOf(bVar.getAdIdNumber())).a("Zone ID", bVar.getAdZone().e()).a("Ad Class", z10 ? "VastAd" : "AdServerAd");
        String dspName = bVar.getDspName();
        if (StringUtils.isValidString(dspName)) {
            a("DSP Name", dspName);
        }
        if (z10) {
            a("VAST DSP", ((e7) bVar).l1());
        }
        return this;
    }

    public n2 a(u2 u2Var) {
        return a(AndroidInitializeBoldSDK.MSG_NETWORK, u2Var.c()).a("Adapter Version", u2Var.z()).a("Format", u2Var.getFormat().getLabel()).a("Ad Unit ID", u2Var.getAdUnitId()).a("Placement", u2Var.getPlacement()).a("Network Placement", u2Var.U()).a("Serve ID", u2Var.S()).a("Creative ID", StringUtils.isValidString(u2Var.getCreativeId()) ? u2Var.getCreativeId() : "None").a("Ad Domain", StringUtils.isValidString(u2Var.v()) ? u2Var.v() : "None").a("DSP Name", StringUtils.isValidString(u2Var.getDspName()) ? u2Var.getDspName() : "None").a("DSP ID", StringUtils.isValidString(u2Var.getDspId()) ? u2Var.getDspId() : "None").a("Server Parameters", u2Var.l());
    }

    public n2 a(AppLovinAdView appLovinAdView) {
        return a("Size", appLovinAdView.getSize().getWidth() + "x" + appLovinAdView.getSize().getHeight()).a("Alpha", Float.valueOf(appLovinAdView.getAlpha())).a("Visibility", u7.a(appLovinAdView.getVisibility()));
    }

    public n2 a(com.applovin.impl.sdk.j jVar) {
        return a("Muted", Boolean.valueOf(jVar.f0().isMuted()));
    }

    public n2 a(Bundle bundle) {
        if (bundle == null) {
            return this;
        }
        for (String str : bundle.keySet()) {
            a(str, bundle.get(str));
        }
        return this;
    }
}
