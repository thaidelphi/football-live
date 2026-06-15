package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import d9.j0;
import d9.o0;
import d9.p0;
import g9.e;
import g9.g;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import i8.w;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TransactionEventObserver.kt */
@f(c = "com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2", f = "TransactionEventObserver.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class TransactionEventObserver$invoke$2 extends l implements p<o0, d<? super w>, Object> {
    int label;
    final /* synthetic */ TransactionEventObserver this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TransactionEventObserver.kt */
    @f(c = "com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2$2", f = "TransactionEventObserver.kt", l = {44, 46, 55}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2$2  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass2 extends l implements p<TransactionEventRequestOuterClass.TransactionEventRequest, d<? super w>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TransactionEventObserver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(TransactionEventObserver transactionEventObserver, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.this$0 = transactionEventObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<w> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // t8.p
        public final Object invoke(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest, d<? super w> dVar) {
            return ((AnonymousClass2) create(transactionEventRequest, dVar)).invokeSuspend(w.f26638a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
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
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2a
                if (r1 == r4) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                i8.p.b(r13)
                goto Lac
            L16:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1e:
                java.lang.Object r1 = r12.L$0
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r1 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r1
                i8.p.b(r13)
                goto L7d
            L26:
                i8.p.b(r13)
                goto L58
            L2a:
                i8.p.b(r13)
                java.lang.Object r13 = r12.L$0
                gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequest r13 = (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) r13
                gatewayprotocol.v1.UniversalRequestKt r1 = gatewayprotocol.v1.UniversalRequestKt.INSTANCE
                gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl$Companion r1 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload$Builder r5 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder()
                java.lang.String r6 = "newBuilder()"
                kotlin.jvm.internal.n.e(r5, r6)
                gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl r1 = r1._create(r5)
                r1.setTransactionEventRequest(r13)
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload r13 = r1._build()
                com.unity3d.ads.core.domain.events.TransactionEventObserver r1 = r12.this$0
                com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r1 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getGetUniversalRequestForPayLoad$p(r1)
                r12.label = r4
                java.lang.Object r13 = r1.invoke(r13, r12)
                if (r13 != r0) goto L58
                return r0
            L58:
                r1 = r13
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r1 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r1
                com.unity3d.ads.core.domain.events.TransactionEventObserver r13 = r12.this$0
                com.unity3d.ads.gatewayclient.GatewayClient r4 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getGatewayClient$p(r13)
                r5 = 0
                com.unity3d.ads.core.domain.events.TransactionEventObserver r13 = r12.this$0
                com.unity3d.ads.core.domain.GetRequestPolicy r13 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getGetRequestPolicy$p(r13)
                com.unity3d.ads.gatewayclient.RequestPolicy r7 = r13.invoke()
                com.unity3d.ads.core.data.model.OperationType r8 = com.unity3d.ads.core.data.model.OperationType.TRANSACTION_EVENT
                r10 = 1
                r11 = 0
                r12.L$0 = r1
                r12.label = r3
                r6 = r1
                r9 = r12
                java.lang.Object r13 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r4, r5, r6, r7, r8, r9, r10, r11)
                if (r13 != r0) goto L7d
                return r0
            L7d:
                gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r13 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r13
                gatewayprotocol.v1.ErrorOuterClass$Error r13 = r13.getError()
                if (r13 == 0) goto Lac
                com.unity3d.ads.core.domain.events.TransactionEventObserver r13 = r12.this$0
                com.unity3d.ads.core.data.datasource.ByteStringDataSource r13 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getIapTransactionStore$p(r13)
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedData r1 = r1.getSharedData()
                gatewayprotocol.v1.TimestampsOuterClass$Timestamps r1 = r1.getTimestamps()
                com.google.protobuf.Timestamp r1 = r1.getTimestamp()
                com.google.protobuf.ByteString r1 = r1.toByteString()
                java.lang.String r3 = "fullRequest.sharedData.t….timestamp.toByteString()"
                kotlin.jvm.internal.n.e(r1, r3)
                r3 = 0
                r12.L$0 = r3
                r12.label = r2
                java.lang.Object r13 = r13.set(r1, r12)
                if (r13 != r0) goto Lac
                return r0
            Lac:
                i8.w r13 = i8.w.f26638a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionEventObserver$invoke$2(TransactionEventObserver transactionEventObserver, d<? super TransactionEventObserver$invoke$2> dVar) {
        super(2, dVar);
        this.this$0 = transactionEventObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new TransactionEventObserver$invoke$2(this.this$0, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super w> dVar) {
        return ((TransactionEventObserver$invoke$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        g9.w wVar;
        Object value;
        Boolean bool;
        TransactionEventRepository transactionEventRepository;
        j0 j0Var;
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            wVar = this.this$0.isRunning;
            do {
                value = wVar.getValue();
                bool = (Boolean) value;
                bool.booleanValue();
            } while (!wVar.i(value, b.a(true)));
            if (bool.booleanValue()) {
                return w.f26638a;
            }
            transactionEventRepository = this.this$0.transactionEventRepository;
            e z10 = g.z(transactionEventRepository.getTransactionEvents(), new AnonymousClass2(this.this$0, null));
            j0Var = this.this$0.defaultDispatcher;
            g.w(z10, p0.a(j0Var));
            return w.f26638a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
