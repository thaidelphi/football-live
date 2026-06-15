package com.unity3d.ads.core.domain.events;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import m8.d;
/* compiled from: GetOperativeEventApi.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class GetOperativeEventApi {
    private final OperativeEventRepository operativeEventRepository;
    private final GetOperativeEventRequest operativeEventRequest;

    public GetOperativeEventApi(OperativeEventRepository operativeEventRepository, GetOperativeEventRequest operativeEventRequest) {
        n.f(operativeEventRepository, "operativeEventRepository");
        n.f(operativeEventRequest, "operativeEventRequest");
        this.operativeEventRepository = operativeEventRepository;
        this.operativeEventRequest = operativeEventRequest;
    }

    public static /* synthetic */ Object invoke$default(GetOperativeEventApi getOperativeEventApi, OperativeEventRequestOuterClass.OperativeEventType operativeEventType, ByteString byteString, ByteString byteString2, ByteString byteString3, String str, d dVar, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            str = null;
        }
        return getOperativeEventApi.invoke(operativeEventType, byteString, byteString2, byteString3, str, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType r9, com.google.protobuf.ByteString r10, com.google.protobuf.ByteString r11, com.google.protobuf.ByteString r12, java.lang.String r13, m8.d<? super i8.w> r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1
            if (r0 == 0) goto L13
            r0 = r14
            com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1 r0 = (com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1 r0 = new com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1
            r0.<init>(r8, r14)
        L18:
            r7 = r0
            java.lang.Object r14 = r7.result
            java.lang.Object r0 = n8.b.c()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r9 = r7.L$0
            com.unity3d.ads.core.domain.events.GetOperativeEventApi r9 = (com.unity3d.ads.core.domain.events.GetOperativeEventApi) r9
            i8.p.b(r14)
            goto L4c
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            i8.p.b(r14)
            com.unity3d.ads.core.domain.events.GetOperativeEventRequest r1 = r8.operativeEventRequest
            r7.L$0 = r8
            r7.label = r2
            r2 = r9
            r3 = r11
            r4 = r10
            r5 = r12
            r6 = r13
            java.lang.Object r14 = r1.invoke(r2, r3, r4, r5, r6, r7)
            if (r14 != r0) goto L4b
            return r0
        L4b:
            r9 = r8
        L4c:
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest r14 = (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) r14
            com.unity3d.ads.core.data.repository.OperativeEventRepository r9 = r9.operativeEventRepository
            r9.addOperativeEvent(r14)
            i8.w r9 = i8.w.f26638a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType, com.google.protobuf.ByteString, com.google.protobuf.ByteString, com.google.protobuf.ByteString, java.lang.String, m8.d):java.lang.Object");
    }

    public final Object invoke(OperativeEventRequestOuterClass.OperativeEventType operativeEventType, AdObject adObject, ByteString byteString, d<? super w> dVar) {
        Object c10;
        Object invoke = invoke(operativeEventType, adObject.getOpportunityId(), adObject.getTrackingToken(), byteString, adObject.getPlayerServerId(), dVar);
        c10 = n8.d.c();
        return invoke == c10 ? invoke : w.f26638a;
    }
}
