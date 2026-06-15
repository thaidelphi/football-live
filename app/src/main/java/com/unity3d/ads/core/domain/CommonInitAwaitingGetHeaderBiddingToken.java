package com.unity3d.ads.core.domain;

import c9.j;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.core.misc.Utilities;
import i8.s;
import i8.w;
import j8.i0;
import j8.j0;
import java.util.Map;
import kotlin.jvm.internal.n;
/* compiled from: CommonInitAwaitingGetHeaderBiddingToken.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CommonInitAwaitingGetHeaderBiddingToken implements GetAsyncHeaderBiddingToken {
    private final AwaitInitialization awaitInitialization;
    private boolean didAwaitInit;
    private final GetHeaderBiddingToken getHeaderBiddingToken;
    private final GetInitializationState getInitializationState;
    private IUnityAdsTokenListener listener;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private InitializationState startState;
    private final long startTime;

    public CommonInitAwaitingGetHeaderBiddingToken(GetHeaderBiddingToken getHeaderBiddingToken, SendDiagnosticEvent sendDiagnosticEvent, GetInitializationState getInitializationState, AwaitInitialization awaitInitialization, SessionRepository sessionRepository) {
        n.f(getHeaderBiddingToken, "getHeaderBiddingToken");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        n.f(getInitializationState, "getInitializationState");
        n.f(awaitInitialization, "awaitInitialization");
        n.f(sessionRepository, "sessionRepository");
        this.getHeaderBiddingToken = getHeaderBiddingToken;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getInitializationState = getInitializationState;
        this.awaitInitialization = awaitInitialization;
        this.sessionRepository = sessionRepository;
        this.startTime = j.f5618a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchToken(m8.d<? super i8.w> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1 r0 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1 r0 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken r0 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken) r0
            i8.p.b(r6)     // Catch: java.lang.Exception -> L2e
            goto L49
        L2e:
            r6 = move-exception
            goto L51
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            i8.p.b(r6)
            com.unity3d.ads.core.domain.GetHeaderBiddingToken r6 = r5.getHeaderBiddingToken     // Catch: java.lang.Exception -> L4f
            r0.L$0 = r5     // Catch: java.lang.Exception -> L4f
            r0.label = r3     // Catch: java.lang.Exception -> L4f
            java.lang.Object r6 = r6.invoke(r0)     // Catch: java.lang.Exception -> L4f
            if (r6 != r1) goto L48
            return r1
        L48:
            r0 = r5
        L49:
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L2e
            r1 = r4
            r4 = r6
            r6 = r1
            goto L58
        L4f:
            r6 = move-exception
            r0 = r5
        L51:
            r1 = 0
            java.lang.String r6 = com.unity3d.ads.core.extensions.ExceptionExtensionsKt.getShortenedStackTrace$default(r6, r1, r3, r4)
            java.lang.String r1 = "uncaught_exception"
        L58:
            if (r4 != 0) goto L5e
            r0.tokenFailure(r1, r6)
            goto L61
        L5e:
            r0.tokenSuccess(r4)
        L61:
            i8.w r6 = i8.w.f26638a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.fetchToken(m8.d):java.lang.Object");
    }

    private final void tokenFailure(String str, String str2) {
        Map b10;
        Map a10;
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        Double valueOf = Double.valueOf(TimeExtensionsKt.elapsedMillis(j.a.b(this.startTime)));
        b10 = i0.b();
        b10.put("sync", "false");
        b10.put("state", String.valueOf(this.startState));
        b10.put("complete_state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString());
        b10.put("awaited_init", String.valueOf(this.didAwaitInit));
        if (str != null) {
            String str3 = (String) b10.put("reason", str);
        }
        if (str2 != null) {
            b10.put("reason_debug", str2);
        }
        w wVar = w.f26638a;
        a10 = i0.a(b10);
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_gateway_token_failure_time", valueOf, a10, null, null, 24, null);
        Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.core.domain.a
            @Override // java.lang.Runnable
            public final void run() {
                CommonInitAwaitingGetHeaderBiddingToken.tokenFailure$lambda$4(CommonInitAwaitingGetHeaderBiddingToken.this);
            }
        });
    }

    static /* synthetic */ void tokenFailure$default(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        commonInitAwaitingGetHeaderBiddingToken.tokenFailure(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tokenFailure$lambda$4(CommonInitAwaitingGetHeaderBiddingToken this$0) {
        n.f(this$0, "this$0");
        IUnityAdsTokenListener iUnityAdsTokenListener = this$0.listener;
        if (iUnityAdsTokenListener != null) {
            iUnityAdsTokenListener.onUnityAdsTokenReady(null);
        }
    }

    private final void tokenStart() {
        Map g10;
        this.startState = GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null);
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        g10 = j0.g(s.a("sync", "false"), s.a("state", String.valueOf(this.startState)));
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_gateway_token_started", null, g10, null, null, 26, null);
    }

    private final void tokenSuccess(final String str) {
        Map g10;
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        Double valueOf = Double.valueOf(TimeExtensionsKt.elapsedMillis(j.a.b(this.startTime)));
        g10 = j0.g(s.a("sync", "false"), s.a("state", String.valueOf(this.startState)), s.a("complete_state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString()), s.a("awaited_init", String.valueOf(this.didAwaitInit)));
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_gateway_token_success_time", valueOf, g10, null, null, 24, null);
        Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.core.domain.b
            @Override // java.lang.Runnable
            public final void run() {
                CommonInitAwaitingGetHeaderBiddingToken.tokenSuccess$lambda$0(CommonInitAwaitingGetHeaderBiddingToken.this, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tokenSuccess$lambda$0(CommonInitAwaitingGetHeaderBiddingToken this$0, String token) {
        n.f(this$0, "this$0");
        n.f(token, "$token");
        IUnityAdsTokenListener iUnityAdsTokenListener = this$0.listener;
        if (iUnityAdsTokenListener != null) {
            iUnityAdsTokenListener.onUnityAdsTokenReady(token);
        }
    }

    public final AwaitInitialization getAwaitInitialization() {
        return this.awaitInitialization;
    }

    public final GetHeaderBiddingToken getGetHeaderBiddingToken() {
        return this.getHeaderBiddingToken;
    }

    public final GetInitializationState getGetInitializationState() {
        return this.getInitializationState;
    }

    public final IUnityAdsTokenListener getListener() {
        return this.listener;
    }

    public final SendDiagnosticEvent getSendDiagnosticEvent() {
        return this.sendDiagnosticEvent;
    }

    public final SessionRepository getSessionRepository() {
        return this.sessionRepository;
    }

    /* renamed from: getStartTime-z9LOYto  reason: not valid java name */
    public final long m48getStartTimez9LOYto() {
        return this.startTime;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    @Override // com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(com.unity3d.ads.IUnityAdsTokenListener r9, m8.d<? super i8.w> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1
            if (r0 == 0) goto L13
            r0 = r10
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1 r0 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1 r0 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.label
            java.lang.String r3 = "!sessionRepository.shouldInitialize"
            java.lang.String r4 = "gateway"
            r5 = 0
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L41
            if (r2 == r7) goto L39
            if (r2 != r6) goto L31
            i8.p.b(r10)
            goto L9c
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            java.lang.Object r9 = r0.L$0
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken r9 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken) r9
            i8.p.b(r10)
            goto L83
        L41:
            i8.p.b(r10)
            r8.listener = r9
            r8.tokenStart()
            if (r9 != 0) goto L55
            java.lang.String r9 = "listener_null"
            java.lang.String r10 = "IUnityAdsTokenListener is null"
            r8.tokenFailure(r9, r10)
            i8.w r9 = i8.w.f26638a
            return r9
        L55:
            com.unity3d.ads.core.data.repository.SessionRepository r9 = r8.sessionRepository
            boolean r9 = r9.getShouldInitialize()
            if (r9 != 0) goto L63
            r8.tokenFailure(r4, r3)
            i8.w r9 = i8.w.f26638a
            return r9
        L63:
            com.unity3d.ads.core.data.repository.SessionRepository r9 = r8.sessionRepository
            gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfiguration r9 = r9.getNativeConfiguration()
            gatewayprotocol.v1.NativeConfigurationOuterClass$AdOperationsConfiguration r9 = r9.getAdOperations()
            int r9 = r9.getGetTokenTimeoutMs()
            long r9 = (long) r9
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2 r2 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2
            r2.<init>(r8, r5)
            r0.L$0 = r8
            r0.label = r7
            java.lang.Object r9 = d9.z2.d(r9, r2, r0)
            if (r9 != r1) goto L82
            return r1
        L82:
            r9 = r8
        L83:
            com.unity3d.ads.core.data.repository.SessionRepository r10 = r9.sessionRepository
            boolean r10 = r10.getShouldInitialize()
            if (r10 != 0) goto L91
            r9.tokenFailure(r4, r3)
            i8.w r9 = i8.w.f26638a
            return r9
        L91:
            r0.L$0 = r5
            r0.label = r6
            java.lang.Object r9 = r9.fetchToken(r0)
            if (r9 != r1) goto L9c
            return r1
        L9c:
            i8.w r9 = i8.w.f26638a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.invoke(com.unity3d.ads.IUnityAdsTokenListener, m8.d):java.lang.Object");
    }

    public final void setListener(IUnityAdsTokenListener iUnityAdsTokenListener) {
        this.listener = iUnityAdsTokenListener;
    }
}
