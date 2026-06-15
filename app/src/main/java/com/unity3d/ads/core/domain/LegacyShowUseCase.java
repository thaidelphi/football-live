package com.unity3d.ads.core.domain;

import c9.i;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import d9.j0;
import g9.l0;
import g9.w;
import gatewayprotocol.v1.OperativeEventErrorDataKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import i8.s;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
import t8.t;
/* compiled from: LegacyShowUseCase.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class LegacyShowUseCase {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_OBJECT_ID = "objectId";
    public static final String MESSAGE_AD_PLAYER_UNAVAILABLE = "Ad player is unavailable.";
    public static final String MESSAGE_ALREADY_SHOWING = "Can't show a new ad unit when ad unit is already open";
    public static final String MESSAGE_NO_AD_OBJECT = "No ad object found for opportunity id: ";
    public static final String MESSAGE_OPPORTUNITY_ID = "No valid opportunity id provided";
    public static final String MESSAGE_OPT_TIMEOUT = "timeout";
    public static final String MESSAGE_TIMEOUT = "[UnityAds] Timeout while trying to show ";
    public static final String MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING = "[UnityAds] Object ID and Placement ID provided does not match previously loaded ad";
    private static volatile boolean isFullscreenAdShowing;
    private AdObject adObject;
    private final AdRepository adRepository;
    private final j0 dispatcher;
    private final GetInitializationState getInitializationState;
    private final GetOperativeEventApi getOperativeEventApi;
    private final w<Boolean> hasStarted;
    private String placement;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final Show show;
    private final w<Boolean> timeoutCancellationRequested;
    private UnityAdsShowOptions unityAdsShowOptions;

    /* compiled from: LegacyShowUseCase.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public LegacyShowUseCase(j0 dispatcher, Show show, AdRepository adRepository, SendDiagnosticEvent sendDiagnosticEvent, GetOperativeEventApi getOperativeEventApi, GetInitializationState getInitializationState, SessionRepository sessionRepository) {
        n.f(dispatcher, "dispatcher");
        n.f(show, "show");
        n.f(adRepository, "adRepository");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        n.f(getOperativeEventApi, "getOperativeEventApi");
        n.f(getInitializationState, "getInitializationState");
        n.f(sessionRepository, "sessionRepository");
        this.dispatcher = dispatcher;
        this.show = show;
        this.adRepository = adRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getInitializationState = getInitializationState;
        this.sessionRepository = sessionRepository;
        Boolean bool = Boolean.FALSE;
        this.hasStarted = l0.a(bool);
        this.timeoutCancellationRequested = l0.a(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bannerLeftApplication(i iVar, String str, Listeners listeners) {
        DeviceLog.debug("Unity Ads Show Left Application for placement " + str);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_left_app", Double.valueOf(TimeExtensionsKt.elapsedMillis(iVar)), null, null, this.adObject, 12, null);
        listeners.onLeftApplication(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelTimeout(i iVar) {
        this.timeoutCancellationRequested.setValue(Boolean.TRUE);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_cancel_timeout", Double.valueOf(TimeExtensionsKt.elapsedMillis(iVar)), null, null, this.adObject, 12, null);
    }

    private final String getOpportunityId(UnityAdsShowOptions unityAdsShowOptions) {
        Object opt;
        JSONObject data = unityAdsShowOptions.getData();
        try {
            return UUID.fromString((data == null || (opt = data.opt("objectId")) == null) ? null : opt.toString()).toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> getTags(String str, Integer num, String str2) {
        Map<String, String> i10;
        i10 = j8.j0.i(s.a("operation", OperationType.SHOW.toString()), s.a("reason", str), s.a("show_has_started", String.valueOf(this.hasStarted.getValue().booleanValue())));
        if (num != null) {
            i10.put("reason_code", String.valueOf(num.intValue()));
        }
        if (str2 != null) {
            i10.put("reason_debug", str2);
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getTmpAdObject(m8.d<? super com.unity3d.ads.core.data.model.AdObject> r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r1 instanceof com.unity3d.ads.core.domain.LegacyShowUseCase$getTmpAdObject$1
            if (r2 == 0) goto L17
            r2 = r1
            com.unity3d.ads.core.domain.LegacyShowUseCase$getTmpAdObject$1 r2 = (com.unity3d.ads.core.domain.LegacyShowUseCase$getTmpAdObject$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.unity3d.ads.core.domain.LegacyShowUseCase$getTmpAdObject$1 r2 = new com.unity3d.ads.core.domain.LegacyShowUseCase$getTmpAdObject$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = n8.b.c()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            java.lang.Object r2 = r2.L$0
            com.unity3d.ads.core.domain.LegacyShowUseCase r2 = (com.unity3d.ads.core.domain.LegacyShowUseCase) r2
            i8.p.b(r1)
            goto L6b
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            i8.p.b(r1)
            com.unity3d.ads.UnityAdsShowOptions r1 = r0.unityAdsShowOptions
            if (r1 == 0) goto L45
            java.lang.String r1 = r0.getOpportunityId(r1)
            goto L46
        L45:
            r1 = 0
        L46:
            if (r1 != 0) goto L4b
            com.google.protobuf.ByteString r1 = com.google.protobuf.ByteString.EMPTY
            goto L58
        L4b:
            java.util.UUID r1 = java.util.UUID.fromString(r1)
            java.lang.String r4 = "fromString(opportunityId)"
            kotlin.jvm.internal.n.e(r1, r4)
            com.google.protobuf.ByteString r1 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toByteString(r1)
        L58:
            com.unity3d.ads.core.data.repository.AdRepository r4 = r0.adRepository
            java.lang.String r6 = "opportunityIdByteString"
            kotlin.jvm.internal.n.e(r1, r6)
            r2.L$0 = r0
            r2.label = r5
            java.lang.Object r1 = r4.getAd(r1, r2)
            if (r1 != r3) goto L6a
            return r3
        L6a:
            r2 = r0
        L6b:
            com.unity3d.ads.core.data.model.AdObject r1 = (com.unity3d.ads.core.data.model.AdObject) r1
            if (r1 == 0) goto L70
            return r1
        L70:
            com.unity3d.ads.UnityAdsShowOptions r1 = r2.unityAdsShowOptions
            if (r1 != 0) goto L79
            com.unity3d.ads.UnityAdsShowOptions r1 = new com.unity3d.ads.UnityAdsShowOptions
            r1.<init>()
        L79:
            com.unity3d.ads.core.data.model.AdObject r18 = new com.unity3d.ads.core.data.model.AdObject
            java.lang.String r1 = r2.getOpportunityId(r1)
            if (r1 == 0) goto L87
            com.google.protobuf.ByteString r1 = com.google.protobuf.kotlin.ByteStringsKt.toByteStringUtf8(r1)
            if (r1 != 0) goto L89
        L87:
            com.google.protobuf.ByteString r1 = com.google.protobuf.ByteString.EMPTY
        L89:
            r4 = r1
            java.lang.String r1 = "getOpportunityId(showOpt…tf8() ?: ByteString.EMPTY"
            kotlin.jvm.internal.n.e(r4, r1)
            java.lang.String r1 = r2.placement
            if (r1 != 0) goto L95
            java.lang.String r1 = ""
        L95:
            r5 = r1
            com.google.protobuf.ByteString r6 = com.google.protobuf.ByteString.EMPTY
            java.lang.String r1 = "EMPTY"
            kotlin.jvm.internal.n.e(r6, r1)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            com.unity3d.ads.UnityAdsLoadOptions r13 = new com.unity3d.ads.UnityAdsLoadOptions
            r13.<init>()
            r14 = 0
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType r15 = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_UNSPECIFIED
            r16 = 376(0x178, float:5.27E-43)
            r17 = 0
            r3 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase.getTmpAdObject(m8.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendOperativeError(OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType, String str, AdObject adObject, m8.d<? super i8.w> dVar) {
        Object c10;
        OperativeEventErrorDataKt.Dsl.Companion companion = OperativeEventErrorDataKt.Dsl.Companion;
        OperativeEventRequestOuterClass.OperativeEventErrorData.Builder newBuilder = OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder();
        n.e(newBuilder, "newBuilder()");
        OperativeEventErrorDataKt.Dsl _create = companion._create(newBuilder);
        _create.setErrorType(operativeEventErrorType);
        _create.setMessage(str);
        OperativeEventRequestOuterClass.OperativeEventErrorData _build = _create._build();
        GetOperativeEventApi getOperativeEventApi = this.getOperativeEventApi;
        OperativeEventRequestOuterClass.OperativeEventType operativeEventType = OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_SHOW_ERROR;
        ByteString byteString = _build.toByteString();
        n.e(byteString, "errorData.toByteString()");
        Object invoke = getOperativeEventApi.invoke(operativeEventType, adObject, byteString, dVar);
        c10 = n8.d.c();
        return invoke == c10 ? invoke : i8.w.f26638a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showClicked(i iVar, String str, Listeners listeners, m8.d<? super i8.w> dVar) {
        Object c10;
        DeviceLog.debug("Unity Ads Show Clicked for placement " + str);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_clicked", kotlin.coroutines.jvm.internal.b.b(TimeExtensionsKt.elapsedMillis(iVar)), null, null, this.adObject, 12, null);
        Object g10 = d9.i.g(this.dispatcher, new LegacyShowUseCase$showClicked$2(listeners, str, null), dVar);
        c10 = n8.d.c();
        return g10 == c10 ? g10 : i8.w.f26638a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showCompleted(i iVar, String str, ShowStatus showStatus, Listeners listeners, m8.d<? super i8.w> dVar) {
        Object c10;
        DeviceLog.debug("Unity Ads Show Completed for placement " + str);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_success_time", kotlin.coroutines.jvm.internal.b.b(TimeExtensionsKt.elapsedMillis(iVar)), null, null, this.adObject, 12, null);
        Object g10 = d9.i.g(this.dispatcher, new LegacyShowUseCase$showCompleted$2(listeners, str, showStatus, null), dVar);
        c10 = n8.d.c();
        return g10 == c10 ? g10 : i8.w.f26638a;
    }

    private final t<String, UnityAds.UnityAdsShowError, String, Integer, String, m8.d<? super i8.w>, Object> showError(i iVar, String str, Listeners listeners) {
        return new LegacyShowUseCase$showError$1(str, this, iVar, listeners, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object showStart(m8.d<? super i8.w> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.unity3d.ads.core.domain.LegacyShowUseCase$showStart$1
            if (r0 == 0) goto L13
            r0 = r10
            com.unity3d.ads.core.domain.LegacyShowUseCase$showStart$1 r0 = (com.unity3d.ads.core.domain.LegacyShowUseCase$showStart$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.LegacyShowUseCase$showStart$1 r0 = new com.unity3d.ads.core.domain.LegacyShowUseCase$showStart$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.SendDiagnosticEvent r0 = (com.unity3d.ads.core.domain.SendDiagnosticEvent) r0
            i8.p.b(r10)
            goto L51
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L39:
            i8.p.b(r10)
            com.unity3d.ads.core.domain.SendDiagnosticEvent r10 = r9.sendDiagnosticEvent
            java.lang.String r2 = "native_show_started"
            r0.L$0 = r10
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r0 = r9.getTmpAdObject(r0)
            if (r0 != r1) goto L4d
            return r1
        L4d:
            r1 = r2
            r8 = r0
            r0 = r10
            r10 = r8
        L51:
            r4 = 0
            r3 = 0
            r2 = 0
            r5 = r10
            com.unity3d.ads.core.data.model.AdObject r5 = (com.unity3d.ads.core.data.model.AdObject) r5
            r6 = 14
            r7 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r0, r1, r2, r3, r4, r5, r6, r7)
            i8.w r10 = i8.w.f26638a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase.showStart(m8.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showStarted(i iVar, String str, Listeners listeners, m8.d<? super i8.w> dVar) {
        Object c10;
        DeviceLog.debug("Unity Ads Show WV Start for placement " + str);
        this.hasStarted.setValue(kotlin.coroutines.jvm.internal.b.a(true));
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_wv_started", kotlin.coroutines.jvm.internal.b.b(TimeExtensionsKt.elapsedMillis(iVar)), null, null, this.adObject, 12, null);
        Object g10 = d9.i.g(this.dispatcher, new LegacyShowUseCase$showStarted$2(listeners, str, null), dVar);
        c10 = n8.d.c();
        return g10 == c10 ? g10 : i8.w.f26638a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(android.app.Activity r29, java.lang.String r30, com.unity3d.ads.UnityAdsShowOptions r31, com.unity3d.ads.core.data.model.Listeners r32, m8.d<? super i8.w> r33) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase.invoke(android.app.Activity, java.lang.String, com.unity3d.ads.UnityAdsShowOptions, com.unity3d.ads.core.data.model.Listeners, m8.d):java.lang.Object");
    }
}
