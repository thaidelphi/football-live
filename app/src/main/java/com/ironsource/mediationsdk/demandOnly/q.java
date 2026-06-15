package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.demandOnly.h;
import com.ironsource.mediationsdk.logger.IronSourceError;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface q {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f18785a;

        public a(String adFormat) {
            kotlin.jvm.internal.n.f(adFormat, "adFormat");
            this.f18785a = adFormat;
        }

        public final IronSourceError a(h loadParams) {
            kotlin.jvm.internal.n.f(loadParams, "loadParams");
            h.b bVar = (h.b) loadParams;
            if (bVar.f() == null) {
                return new IronSourceError(1060, this.f18785a + " was initialized and loaded without Activity");
            } else if (bVar.g() == null) {
                return new IronSourceError(510, "Missing banner layout");
            } else {
                if (bVar.g().isDestroyed()) {
                    return new IronSourceError(510, "Banner layout is destroyed");
                }
                ISBannerSize size = bVar.g().getSize();
                if (size == null) {
                    return new IronSourceError(510, "Missing banner size");
                }
                if (com.ironsource.mediationsdk.l.f18875f != size.getDescription() || (size.getHeight() > 0 && size.getWidth() > 0)) {
                    if (bVar.c() == null) {
                        return new IronSourceError(510, "Missing instance Id");
                    }
                    String b10 = bVar.b();
                    if ((b10 == null || b10.length() == 0) && loadParams.d()) {
                        return new IronSourceError(510, "Missing adm");
                    }
                    return null;
                }
                return new IronSourceError(510, "Unsupported banner size. Height and width must be bigger than 0");
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f18786a;

        public b(String adFormat) {
            kotlin.jvm.internal.n.f(adFormat, "adFormat");
            this.f18786a = adFormat;
        }

        public final IronSourceError a(h.d loadParams) {
            kotlin.jvm.internal.n.f(loadParams, "loadParams");
            if (loadParams.e() == null) {
                return new IronSourceError(1060, this.f18786a + " was initialized and loaded without Activity");
            } else if (loadParams.c() == null) {
                return new IronSourceError(510, "Missing instance Id");
            } else {
                String b10 = loadParams.b();
                if ((b10 == null || b10.length() == 0) && loadParams.d()) {
                    return new IronSourceError(510, "Missing adm");
                }
                return null;
            }
        }
    }

    IronSourceError a();
}
