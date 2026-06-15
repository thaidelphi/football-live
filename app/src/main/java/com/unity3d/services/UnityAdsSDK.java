package com.unity3d.services;

import android.app.Activity;
import android.content.Context;
import c9.j;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.ShouldAllowInitialization;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.domain.task.InitializeSDK;
import d9.e2;
import d9.o0;
import d9.z;
import d9.z1;
import i8.g;
import i8.i;
import i8.k;
import i8.s;
import i8.w;
import j8.i0;
import j8.j0;
import java.util.Map;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
import m8.d;
/* compiled from: UnityAdsSDK.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class UnityAdsSDK implements IServiceComponent {
    private final IServiceProvider serviceProvider;

    public UnityAdsSDK() {
        this(null, 1, null);
    }

    public UnityAdsSDK(IServiceProvider serviceProvider) {
        n.f(serviceProvider, "serviceProvider");
        this.serviceProvider = serviceProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchToken(String str, d<? super String> dVar) {
        g a10;
        g a11;
        g a12;
        Map g10;
        String str2;
        String str3;
        String str4;
        Object b10;
        Map b11;
        Map a13;
        k kVar = k.NONE;
        a10 = i.a(kVar, new UnityAdsSDK$fetchToken$$inlined$inject$default$1(this, ""));
        a11 = i.a(kVar, new UnityAdsSDK$fetchToken$$inlined$inject$default$2(this, ""));
        a12 = i.a(kVar, new UnityAdsSDK$fetchToken$$inlined$inject$default$3(this, ""));
        long a14 = j.f5618a.a();
        SendDiagnosticEvent fetchToken$lambda$10 = fetchToken$lambda$10(a12);
        g10 = j0.g(s.a("sync", str), s.a("state", GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$9(a11), false, 1, null).toString()));
        SendDiagnosticEvent.DefaultImpls.invoke$default(fetchToken$lambda$10, "native_gateway_token_started", null, g10, null, null, 26, null);
        if (GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$9(a11), false, 1, null) != InitializationState.INITIALIZED) {
            str2 = "not_initialized";
            str3 = null;
            str4 = null;
        } else {
            try {
                b10 = d9.j.b(null, new UnityAdsSDK$fetchToken$token$1(a10, null), 1, null);
                str4 = (String) b10;
                str2 = null;
                str3 = null;
            } catch (Exception e8) {
                String shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(e8, 0, 1, null);
                str2 = "uncaught_exception";
                str3 = shortenedStackTrace$default;
                str4 = null;
            }
        }
        SendDiagnosticEvent fetchToken$lambda$102 = fetchToken$lambda$10(a12);
        String str5 = str4 == null ? "native_gateway_token_failure_time" : "native_gateway_token_success_time";
        Double b12 = b.b(TimeExtensionsKt.elapsedMillis(j.a.b(a14)));
        b11 = i0.b();
        b11.put("sync", str);
        b11.put("state", GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$9(a11), false, 1, null).toString());
        if (str2 != null) {
            String str6 = (String) b11.put("reason", str2);
        }
        if (str3 != null) {
            b11.put("reason_debug", str3);
        }
        w wVar = w.f26638a;
        a13 = i0.a(b11);
        SendDiagnosticEvent.DefaultImpls.invoke$default(fetchToken$lambda$102, str5, b12, a13, null, null, 24, null);
        return str4;
    }

    private static final SendDiagnosticEvent fetchToken$lambda$10(g<? extends SendDiagnosticEvent> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetHeaderBiddingToken fetchToken$lambda$8(g<? extends GetHeaderBiddingToken> gVar) {
        return gVar.getValue();
    }

    private static final GetInitializationState fetchToken$lambda$9(g<? extends GetInitializationState> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAdObject finishOMIDSession$lambda$14(g<? extends GetAdObject> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OmFinishSession finishOMIDSession$lambda$15(g<? extends OmFinishSession> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlternativeFlowReader finishOMIDSession$lambda$16(g<AlternativeFlowReader> gVar) {
        return gVar.getValue();
    }

    private static final GetGameId getToken$lambda$6(g<? extends GetGameId> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAsyncHeaderBiddingToken getToken$lambda$7(g<? extends GetAsyncHeaderBiddingToken> gVar) {
        return gVar.getValue();
    }

    public static /* synthetic */ z1 initialize$default(UnityAdsSDK unityAdsSDK, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "api";
        }
        return unityAdsSDK.initialize(str, str2);
    }

    private static final ShouldAllowInitialization initialize$lambda$0(g<? extends ShouldAllowInitialization> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlternativeFlowReader initialize$lambda$1(g<AlternativeFlowReader> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InitializeSDK initialize$lambda$2(g<InitializeSDK> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InitializeBoldSDK initialize$lambda$3(g<? extends InitializeBoldSDK> gVar) {
        return gVar.getValue();
    }

    public static /* synthetic */ z1 load$default(UnityAdsSDK unityAdsSDK, String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            unityBannerSize = null;
        }
        return unityAdsSDK.load(str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize);
    }

    private static final GetGameId load$lambda$4(g<? extends GetGameId> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context load$lambda$5(g<? extends Context> gVar) {
        return gVar.getValue();
    }

    public final z1 finishOMIDSession(String opportunityId) {
        g a10;
        g a11;
        g a12;
        z1 d10;
        n.f(opportunityId, "opportunityId");
        k kVar = k.NONE;
        a10 = i.a(kVar, new UnityAdsSDK$finishOMIDSession$$inlined$inject$default$1(this, ""));
        a11 = i.a(kVar, new UnityAdsSDK$finishOMIDSession$$inlined$inject$default$2(this, ""));
        a12 = i.a(kVar, new UnityAdsSDK$finishOMIDSession$$inlined$inject$default$3(this, ""));
        o0 o0Var = (o0) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_OMID_SCOPE, b0.b(o0.class));
        d10 = d9.k.d(o0Var, null, null, new UnityAdsSDK$finishOMIDSession$1(opportunityId, o0Var, a12, a10, a11, null), 3, null);
        return d10;
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return this.serviceProvider;
    }

    public final String getToken() {
        Object b10;
        b10 = d9.j.b(null, new UnityAdsSDK$getToken$1(this, null), 1, null);
        return (String) b10;
    }

    public final synchronized z1 initialize(String str, String source) {
        g a10;
        g a11;
        g a12;
        g a13;
        z1 d10;
        z b10;
        n.f(source, "source");
        k kVar = k.NONE;
        a10 = i.a(kVar, new UnityAdsSDK$initialize$$inlined$inject$default$1(this, ""));
        if (!initialize$lambda$0(a10).invoke(str)) {
            b10 = e2.b(null, 1, null);
            return b10;
        }
        a11 = i.a(kVar, new UnityAdsSDK$initialize$$inlined$inject$default$2(this, ""));
        a12 = i.a(kVar, new UnityAdsSDK$initialize$$inlined$inject$default$3(this, ""));
        a13 = i.a(kVar, new UnityAdsSDK$initialize$$inlined$inject$default$4(this, ""));
        o0 o0Var = (o0) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_INIT_SCOPE, b0.b(o0.class));
        d10 = d9.k.d(o0Var, null, null, new UnityAdsSDK$initialize$1(source, o0Var, a11, a13, a12, null), 3, null);
        return d10;
    }

    public final z1 load(String str, UnityAdsLoadOptions loadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize) {
        g a10;
        g a11;
        z1 d10;
        n.f(loadOptions, "loadOptions");
        k kVar = k.NONE;
        a10 = i.a(kVar, new UnityAdsSDK$load$$inlined$inject$default$1(this, ""));
        initialize(load$lambda$4(a10).invoke(), "load");
        o0 o0Var = (o0) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_LOAD_SCOPE, b0.b(o0.class));
        a11 = i.a(kVar, new UnityAdsSDK$load$$inlined$inject$default$2(this, ""));
        d10 = d9.k.d(o0Var, null, null, new UnityAdsSDK$load$1(this, str, loadOptions, iUnityAdsLoadListener, unityBannerSize, o0Var, a11, null), 3, null);
        return d10;
    }

    public final z1 show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions, Listeners listener) {
        z1 d10;
        n.f(activity, "activity");
        n.f(listener, "listener");
        o0 o0Var = (o0) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_SHOW_SCOPE, b0.b(o0.class));
        d10 = d9.k.d(o0Var, null, null, new UnityAdsSDK$show$1((LegacyShowUseCase) getServiceProvider().getRegistry().getService("", b0.b(LegacyShowUseCase.class)), activity, str, unityAdsShowOptions, listener, o0Var, null), 3, null);
        return d10;
    }

    public final z1 getToken(IUnityAdsTokenListener iUnityAdsTokenListener) {
        g a10;
        g a11;
        z1 d10;
        k kVar = k.NONE;
        a10 = i.a(kVar, new UnityAdsSDK$getToken$$inlined$inject$default$1(this, ""));
        initialize(getToken$lambda$6(a10).invoke(), "get_token");
        a11 = i.a(kVar, new UnityAdsSDK$getToken$$inlined$inject$default$2(this, ""));
        o0 o0Var = (o0) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_GET_TOKEN_SCOPE, b0.b(o0.class));
        d10 = d9.k.d(o0Var, null, null, new UnityAdsSDK$getToken$2(iUnityAdsTokenListener, o0Var, a11, null), 3, null);
        return d10;
    }

    public /* synthetic */ UnityAdsSDK(IServiceProvider iServiceProvider, int i10, h hVar) {
        this((i10 & 1) != 0 ? ServiceProvider.INSTANCE : iServiceProvider);
    }
}
