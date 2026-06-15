package com.unity3d.ads.core.domain.events;

import kotlin.jvm.internal.n;
/* compiled from: EventObservers.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class EventObservers {
    private final DiagnosticEventObserver diagnosticEventObserver;
    private final OperativeEventObserver operativeEventObserver;
    private final TransactionEventObserver transactionEventObserver;

    public EventObservers(OperativeEventObserver operativeEventObserver, DiagnosticEventObserver diagnosticEventObserver, TransactionEventObserver transactionEventObserver) {
        n.f(operativeEventObserver, "operativeEventObserver");
        n.f(diagnosticEventObserver, "diagnosticEventObserver");
        n.f(transactionEventObserver, "transactionEventObserver");
        this.operativeEventObserver = operativeEventObserver;
        this.diagnosticEventObserver = diagnosticEventObserver;
        this.transactionEventObserver = transactionEventObserver;
    }

    public final DiagnosticEventObserver getDiagnosticEventObserver() {
        return this.diagnosticEventObserver;
    }

    public final OperativeEventObserver getOperativeEventObserver() {
        return this.operativeEventObserver;
    }

    public final TransactionEventObserver getTransactionEventObserver() {
        return this.transactionEventObserver;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(m8.d<? super i8.w> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.domain.events.EventObservers$invoke$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.domain.events.EventObservers$invoke$1 r0 = (com.unity3d.ads.core.domain.events.EventObservers$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.events.EventObservers$invoke$1 r0 = new com.unity3d.ads.core.domain.events.EventObservers$invoke$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            i8.p.b(r7)
            goto L73
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.events.EventObservers r2 = (com.unity3d.ads.core.domain.events.EventObservers) r2
            i8.p.b(r7)
            goto L65
        L3f:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.events.EventObservers r2 = (com.unity3d.ads.core.domain.events.EventObservers) r2
            i8.p.b(r7)
            goto L58
        L47:
            i8.p.b(r7)
            com.unity3d.ads.core.domain.events.OperativeEventObserver r7 = r6.operativeEventObserver
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 != r1) goto L57
            return r1
        L57:
            r2 = r6
        L58:
            com.unity3d.ads.core.domain.events.DiagnosticEventObserver r7 = r2.diagnosticEventObserver
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 != r1) goto L65
            return r1
        L65:
            com.unity3d.ads.core.domain.events.TransactionEventObserver r7 = r2.transactionEventObserver
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 != r1) goto L73
            return r1
        L73:
            i8.w r7 = i8.w.f26638a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.EventObservers.invoke(m8.d):java.lang.Object");
    }
}
