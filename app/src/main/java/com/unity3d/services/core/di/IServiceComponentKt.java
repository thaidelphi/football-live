package com.unity3d.services.core.di;

import com.google.android.gms.ads.RequestConfiguration;
import i8.g;
import i8.i;
import i8.k;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.n;
/* compiled from: IServiceComponent.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class IServiceComponentKt {
    public static final /* synthetic */ <T> T get(IServiceComponent iServiceComponent, String named) {
        n.f(iServiceComponent, "<this>");
        n.f(named, "named");
        IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
        n.k(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return (T) registry.getService(named, b0.b(Object.class));
    }

    public static /* synthetic */ Object get$default(IServiceComponent iServiceComponent, String named, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        n.f(iServiceComponent, "<this>");
        n.f(named, "named");
        IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
        n.k(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return registry.getService(named, b0.b(Object.class));
    }

    public static final /* synthetic */ <T> g<T> inject(IServiceComponent iServiceComponent, String named, k mode) {
        g<T> a10;
        n.f(iServiceComponent, "<this>");
        n.f(named, "named");
        n.f(mode, "mode");
        n.j();
        a10 = i.a(mode, new IServiceComponentKt$inject$1(iServiceComponent, named));
        return a10;
    }

    public static /* synthetic */ g inject$default(IServiceComponent iServiceComponent, String named, k mode, int i10, Object obj) {
        g a10;
        if ((i10 & 1) != 0) {
            named = "";
        }
        if ((i10 & 2) != 0) {
            mode = k.NONE;
        }
        n.f(iServiceComponent, "<this>");
        n.f(named, "named");
        n.f(mode, "mode");
        n.j();
        a10 = i.a(mode, new IServiceComponentKt$inject$1(iServiceComponent, named));
        return a10;
    }
}
