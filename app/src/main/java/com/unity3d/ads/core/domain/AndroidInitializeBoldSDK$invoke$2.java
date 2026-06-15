package com.unity3d.ads.core.domain;

import c9.j;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.UnityAdsConstants;
import d9.o0;
import d9.z2;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import t8.p;
/* compiled from: AndroidInitializeBoldSDK.kt */
@f(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2", f = "AndroidInitializeBoldSDK.kt", l = {64, 81}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class AndroidInitializeBoldSDK$invoke$2 extends l implements p<o0, m8.d<? super w>, Object> {
    final /* synthetic */ String $source;
    int I$0;
    long J$0;
    int label;
    final /* synthetic */ AndroidInitializeBoldSDK this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidInitializeBoldSDK.kt */
    @f(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1", f = "AndroidInitializeBoldSDK.kt", l = {65, 67, 69, 70}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass1 extends l implements p<o0, m8.d<? super w>, Object> {
        final /* synthetic */ boolean $isRetry;
        final /* synthetic */ String $source;
        int label;
        final /* synthetic */ AndroidInitializeBoldSDK this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AndroidInitializeBoldSDK androidInitializeBoldSDK, String str, boolean z10, m8.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = androidInitializeBoldSDK;
            this.$source = str;
            this.$isRetry = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final m8.d<w> create(Object obj, m8.d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$source, this.$isRetry, dVar);
        }

        @Override // t8.p
        public final Object invoke(o0 o0Var, m8.d<? super w> dVar) {
            return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0073 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0080 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = n8.b.c()
                int r1 = r12.label
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2c
                if (r1 == r5) goto L28
                if (r1 == r4) goto L24
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                i8.p.b(r13)
                goto L81
            L18:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L20:
                i8.p.b(r13)
                goto L74
            L24:
                i8.p.b(r13)
                goto L52
            L28:
                i8.p.b(r13)
                goto L3e
            L2c:
                i8.p.b(r13)
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
                java.lang.String r1 = r12.$source
                boolean r6 = r12.$isRetry
                r12.label = r5
                java.lang.Object r13 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$initializationStart(r13, r1, r6, r12)
                if (r13 != r0) goto L3e
                return r0
            L3e:
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$checkCanInitialize(r13)
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
                com.unity3d.ads.core.domain.GetInitializationRequest r13 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGetInitializeRequest$p(r13)
                r12.label = r4
                java.lang.Object r13 = r13.invoke(r12)
                if (r13 != r0) goto L52
                return r0
            L52:
                r6 = r13
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r6 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r6
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
                com.unity3d.ads.core.domain.GetRequestPolicy r13 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGetRequestPolicy$p(r13)
                com.unity3d.ads.gatewayclient.RequestPolicy r7 = r13.invoke()
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
                com.unity3d.ads.gatewayclient.GatewayClient r4 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGatewayClient$p(r13)
                r5 = 0
                com.unity3d.ads.core.data.model.OperationType r8 = com.unity3d.ads.core.data.model.OperationType.INITIALIZATION
                r10 = 1
                r11 = 0
                r12.label = r3
                r9 = r12
                java.lang.Object r13 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r4, r5, r6, r7, r8, r9, r10, r11)
                if (r13 != r0) goto L74
                return r0
            L74:
                gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r13 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r13
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r1 = r12.this$0
                r12.label = r2
                java.lang.Object r13 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$handleResponse(r1, r13, r12)
                if (r13 != r0) goto L81
                return r0
            L81:
                i8.w r13 = i8.w.f26638a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidInitializeBoldSDK$invoke$2(AndroidInitializeBoldSDK androidInitializeBoldSDK, String str, m8.d<? super AndroidInitializeBoldSDK$invoke$2> dVar) {
        super(2, dVar);
        this.this$0 = androidInitializeBoldSDK;
        this.$source = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final m8.d<w> create(Object obj, m8.d<?> dVar) {
        return new AndroidInitializeBoldSDK$invoke$2(this.this$0, this.$source, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, m8.d<? super w> dVar) {
        return ((AndroidInitializeBoldSDK$invoke$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [c9.j$a, c9.i, long] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        SessionRepository sessionRepository;
        long a10;
        SessionRepository sessionRepository2;
        ?? b10;
        Object initializationSuccess;
        c10 = n8.d.c();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                i8.p.b(obj);
                a10 = j.f5618a.a();
                sessionRepository2 = this.this$0.sessionRepository;
                i10 = !sessionRepository2.isFirstInitAttempt();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$source, i10 != 0, null);
                this.J$0 = a10;
                this.I$0 = i10;
                this.label = 1;
                if (z2.c(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, anonymousClass1, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 == 2) {
                    i8.p.b(obj);
                    return w.f26638a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                i10 = this.I$0;
                a10 = this.J$0;
                i8.p.b(obj);
            }
            AndroidInitializeBoldSDK androidInitializeBoldSDK = this.this$0;
            b10 = j.a.b(a10);
            String str = this.$source;
            boolean z10 = i10 != 0;
            this.label = 2;
            initializationSuccess = androidInitializeBoldSDK.initializationSuccess(b10, str, z10, this);
            if (initializationSuccess == c10) {
                return c10;
            }
            return w.f26638a;
        } catch (Exception e8) {
            InitializationException parseFrom = InitializationException.Companion.parseFrom(e8);
            if (e8 instanceof GatewayException) {
                sessionRepository = this.this$0.sessionRepository;
                sessionRepository.setShouldInitialize(false);
            }
            this.this$0.initializationFailure(j.a.b(b10), parseFrom, this.$source, i10 != 0);
            return w.f26638a;
        }
    }
}
