package com.unity3d.ads.core.domain;

import android.content.Context;
import c9.i;
import c9.j;
import com.google.protobuf.ByteString;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.log.DeviceLog;
import d9.j0;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.BannerSizeKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import i8.s;
import i8.w;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
/* compiled from: LegacyLoadUseCase.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class LegacyLoadUseCase {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_AD_MARKUP = "adMarkup";
    public static final String KEY_OBJECT_ID = "objectId";
    private String adMarkup;
    private final AdRepository adRepository;
    private final AwaitInitialization awaitInitialization;
    private final j0 dispatcher;
    private final GetInitializationState getInitializationState;
    private boolean isBanner;
    private boolean isHeaderBidding;
    private IUnityAdsLoadListener listener;
    private final Load load;
    private UnityAdsLoadOptions loadOptions;
    private ByteString opportunity;
    private String placement;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private i startTime;

    /* compiled from: LegacyLoadUseCase.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public LegacyLoadUseCase(j0 dispatcher, Load load, SendDiagnosticEvent sendDiagnosticEvent, GetInitializationState getInitializationState, AwaitInitialization awaitInitialization, SessionRepository sessionRepository, AdRepository adRepository) {
        n.f(dispatcher, "dispatcher");
        n.f(load, "load");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        n.f(getInitializationState, "getInitializationState");
        n.f(awaitInitialization, "awaitInitialization");
        n.f(sessionRepository, "sessionRepository");
        n.f(adRepository, "adRepository");
        this.dispatcher = dispatcher;
        this.load = load;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getInitializationState = getInitializationState;
        this.awaitInitialization = awaitInitialization;
        this.sessionRepository = sessionRepository;
        this.adRepository = adRepository;
    }

    private final String getAdMarkup(UnityAdsLoadOptions unityAdsLoadOptions) {
        Object opt;
        JSONObject data = unityAdsLoadOptions.getData();
        if (data == null || (opt = data.opt("adMarkup")) == null) {
            return null;
        }
        return opt.toString();
    }

    private final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.isBanner ? DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER : DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN;
    }

    private final AdRequestOuterClass.BannerSize getBannerSize(UnityBannerSize unityBannerSize) {
        if (unityBannerSize != null) {
            BannerSizeKt.Dsl.Companion companion = BannerSizeKt.Dsl.Companion;
            AdRequestOuterClass.BannerSize.Builder newBuilder = AdRequestOuterClass.BannerSize.newBuilder();
            n.e(newBuilder, "newBuilder()");
            BannerSizeKt.Dsl _create = companion._create(newBuilder);
            _create.setWidth(unityBannerSize.getWidth());
            _create.setHeight(unityBannerSize.getHeight());
            return _create._build();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup getHeaderBiddingAdMarkup(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 == 0) goto Ld
            boolean r2 = b9.f.m(r4)
            if (r2 == 0) goto Lb
            goto Ld
        Lb:
            r2 = r0
            goto Le
        Ld:
            r2 = r1
        Le:
            if (r2 != 0) goto L1f
            r2 = 0
            com.google.protobuf.ByteString r4 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(r4, r0, r1, r2)     // Catch: java.lang.Exception -> L1e
            byte[] r4 = r4.toByteArray()     // Catch: java.lang.Exception -> L1e
            gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup r4 = gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.parseFrom(r4)     // Catch: java.lang.Exception -> L1e
            goto L23
        L1e:
            return r2
        L1f:
            gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup r4 = gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.getDefaultInstance()
        L23:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyLoadUseCase.getHeaderBiddingAdMarkup(java.lang.String):gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getOpportunityId(UnityAdsLoadOptions unityAdsLoadOptions) {
        Object opt;
        JSONObject data = unityAdsLoadOptions.getData();
        if (data == null || (opt = data.opt("objectId")) == null) {
            return null;
        }
        return opt.toString();
    }

    private final Map<String, String> getTags(String str, String str2) {
        Map<String, String> i10;
        boolean z10 = false;
        i10 = j8.j0.i(s.a("state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString()), s.a("operation", OperationType.LOAD.toString()));
        if (!(str == null || str.length() == 0)) {
            i10.put("reason", str);
        }
        if (str2 == null || str2.length() == 0) {
            z10 = true;
        }
        if (!z10) {
            i10.put("reason_debug", str2);
        }
        return i10;
    }

    static /* synthetic */ Map getTags$default(LegacyLoadUseCase legacyLoadUseCase, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return legacyLoadUseCase.getTags(str, str2);
    }

    private final AdObject getTmpAdObject(boolean z10) {
        ByteString byteString;
        UnityAdsLoadOptions unityAdsLoadOptions;
        UnityAdsLoadOptions unityAdsLoadOptions2 = this.loadOptions;
        if (unityAdsLoadOptions2 == null) {
            n.u(HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
            unityAdsLoadOptions2 = null;
        }
        String opportunityId = getOpportunityId(unityAdsLoadOptions2);
        if (opportunityId != null) {
            UUID fromString = UUID.fromString(opportunityId);
            n.e(fromString, "fromString(tmpOpportunityId)");
            byteString = ProtobufExtensionsKt.toByteString(fromString);
        } else {
            byteString = ByteString.EMPTY;
        }
        ByteString tmpOpportunityByteString = byteString;
        String str = this.placement;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        ByteString EMPTY = ByteString.EMPTY;
        UnityAdsLoadOptions unityAdsLoadOptions3 = this.loadOptions;
        if (unityAdsLoadOptions3 == null) {
            n.u(HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
            unityAdsLoadOptions = null;
        } else {
            unityAdsLoadOptions = unityAdsLoadOptions3;
        }
        boolean z11 = this.isHeaderBidding;
        DiagnosticEventRequestOuterClass.DiagnosticAdType adType = getAdType();
        n.e(tmpOpportunityByteString, "tmpOpportunityByteString");
        n.e(EMPTY, "EMPTY");
        return new AdObject(tmpOpportunityByteString, str2, EMPTY, z10, null, null, null, null, null, unityAdsLoadOptions, z11, adType, 368, null);
    }

    static /* synthetic */ AdObject getTmpAdObject$default(LegacyLoadUseCase legacyLoadUseCase, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return legacyLoadUseCase.getTmpAdObject(z10);
    }

    public static /* synthetic */ Object invoke$default(LegacyLoadUseCase legacyLoadUseCase, Context context, String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize, m8.d dVar, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            unityBannerSize = null;
        }
        return legacyLoadUseCase.invoke(context, str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadFailure(LoadResult.Failure failure, m8.d<? super w> dVar) {
        Object c10;
        DeviceLog.debug("Unity Ads Load Failure for placement: " + this.placement + " reason: " + failure.getError() + " :: " + failure.getMessage());
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        i iVar = this.startTime;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_load_failure_time", iVar != null ? kotlin.coroutines.jvm.internal.b.b(TimeExtensionsKt.elapsedMillis(iVar)) : null, getTags(failure.getReason(), failure.getReasonDebug()), null, getTmpAdObject(failure.isScarAd()), 8, null);
        Object g10 = d9.i.g(this.dispatcher, new LegacyLoadUseCase$loadFailure$2(this, failure, null), dVar);
        c10 = n8.d.c();
        return g10 == c10 ? g10 : w.f26638a;
    }

    private final i loadStart() {
        long a10 = j.f5618a.a();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_load_started", null, getTags$default(this, null, null, 3, null), null, getTmpAdObject$default(this, false, 1, null), 10, null);
        return j.a.b(a10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadSuccess(AdObject adObject, m8.d<? super w> dVar) {
        Object c10;
        DeviceLog.debug("Unity Ads Load Success for placement: " + this.placement);
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        i iVar = this.startTime;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_load_success_time", iVar != null ? kotlin.coroutines.jvm.internal.b.b(TimeExtensionsKt.elapsedMillis(iVar)) : null, getTags$default(this, null, null, 3, null), null, adObject, 8, null);
        Object g10 = d9.i.g(this.dispatcher, new LegacyLoadUseCase$loadSuccess$2(this, null), dVar);
        c10 = n8.d.c();
        return g10 == c10 ? g10 : w.f26638a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(10:5|6|(2:54|(4:(1:(1:(3:59|35|36)(2:60|61))(1:62))(1:64)|63|35|36)(3:65|66|67))(12:8|(2:10|(10:12|13|(1:15)(1:52)|16|17|18|19|20|21|(1:23)(1:25)))|53|13|(0)(0)|16|17|18|19|20|21|(0)(0))|26|27|(1:29)|30|(2:32|(1:34))(2:37|(2:39|(1:41)))|35|36))|70|6|(0)(0)|26|27|(0)|30|(0)(0)|35|36|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0138, code lost:
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6 A[Catch: all -> 0x0138, TryCatch #1 {all -> 0x0138, blocks: (B:44:0x00e2, B:46:0x00e6, B:47:0x010c, B:49:0x0110, B:52:0x0124, B:54:0x0128), top: B:70:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0110 A[Catch: all -> 0x0138, TryCatch #1 {all -> 0x0138, blocks: (B:44:0x00e2, B:46:0x00e6, B:47:0x010c, B:49:0x0110, B:52:0x0124, B:54:0x0128), top: B:70:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0124 A[Catch: all -> 0x0138, TryCatch #1 {all -> 0x0138, blocks: (B:44:0x00e2, B:46:0x00e6, B:47:0x010c, B:49:0x0110, B:52:0x0124, B:54:0x0128), top: B:70:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0166 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.unity3d.services.banners.UnityBannerSize] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.unity3d.ads.core.domain.LegacyLoadUseCase, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(android.content.Context r30, java.lang.String r31, com.unity3d.ads.UnityAdsLoadOptions r32, com.unity3d.ads.IUnityAdsLoadListener r33, com.unity3d.services.banners.UnityBannerSize r34, m8.d<? super i8.w> r35) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyLoadUseCase.invoke(android.content.Context, java.lang.String, com.unity3d.ads.UnityAdsLoadOptions, com.unity3d.ads.IUnityAdsLoadListener, com.unity3d.services.banners.UnityBannerSize, m8.d):java.lang.Object");
    }
}
