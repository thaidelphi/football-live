package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ISBannerSize {

    /* renamed from: a  reason: collision with root package name */
    private final int f18477a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18478b;

    /* renamed from: c  reason: collision with root package name */
    private final String f18479c;
    public ISContainerParams containerParams;

    /* renamed from: d  reason: collision with root package name */
    private boolean f18480d;
    public static final ISBannerSize BANNER = l.a("BANNER", 320, 50);
    public static final ISBannerSize LARGE = l.a(l.f18871b, 320, 90);
    public static final ISBannerSize RECTANGLE = l.a(l.f18872c, 300, (int) IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);

    /* renamed from: e  reason: collision with root package name */
    protected static final ISBannerSize f18476e = l.a();
    public static final ISBannerSize SMART = l.a(l.f18874e, 0, 0);

    public ISBannerSize(int i10, int i11) {
        this(l.f18875f, i10, i11);
    }

    public ISBannerSize(String str, int i10, int i11) {
        this.f18479c = str;
        this.f18477a = i10;
        this.f18478b = i11;
        this.containerParams = new ISContainerParams(i10, i11);
    }

    public static int getMaximalAdaptiveHeight(int i10) {
        return l.b(i10);
    }

    public String getDescription() {
        return this.f18479c;
    }

    public int getHeight() {
        return this.f18478b;
    }

    public int getWidth() {
        return this.f18477a;
    }

    public boolean isAdaptive() {
        return this.f18480d;
    }

    public boolean isSmart() {
        return this.f18479c.equals(l.f18874e);
    }

    public void setAdaptive(boolean z10) {
        this.f18480d = z10;
    }

    public void setContainerParams(ISContainerParams iSContainerParams) {
        if (l.a(iSContainerParams, this.f18477a, this.f18478b)) {
            this.containerParams = iSContainerParams;
        }
    }
}
