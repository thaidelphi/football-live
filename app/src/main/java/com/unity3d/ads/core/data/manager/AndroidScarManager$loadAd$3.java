package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.domain.scar.GmaEventData;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* compiled from: AndroidScarManager.kt */
@f(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class AndroidScarManager$loadAd$3 extends l implements p<GmaEventData, d<? super Boolean>, Object> {
    final /* synthetic */ String $placementId;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidScarManager$loadAd$3(String str, d<? super AndroidScarManager$loadAd$3> dVar) {
        super(2, dVar);
        this.$placementId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        AndroidScarManager$loadAd$3 androidScarManager$loadAd$3 = new AndroidScarManager$loadAd$3(this.$placementId, dVar);
        androidScarManager$loadAd$3.L$0 = obj;
        return androidScarManager$loadAd$3;
    }

    @Override // t8.p
    public final Object invoke(GmaEventData gmaEventData, d<? super Boolean> dVar) {
        return ((AndroidScarManager$loadAd$3) create(gmaEventData, dVar)).invokeSuspend(w.f26638a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
        if (r0.contains(r6.getGmaEvent()) != false) goto L7;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            n8.b.c()
            int r0 = r5.label
            if (r0 != 0) goto L58
            i8.p.b(r6)
            java.lang.Object r6 = r5.L$0
            com.unity3d.ads.core.domain.scar.GmaEventData r6 = (com.unity3d.ads.core.domain.scar.GmaEventData) r6
            r0 = 2
            com.unity3d.scar.adapter.common.c[] r1 = new com.unity3d.scar.adapter.common.c[r0]
            com.unity3d.scar.adapter.common.c r2 = com.unity3d.scar.adapter.common.c.AD_LOADED
            r3 = 0
            r1[r3] = r2
            com.unity3d.scar.adapter.common.c r2 = com.unity3d.scar.adapter.common.c.LOAD_ERROR
            r4 = 1
            r1[r4] = r2
            java.util.List r1 = j8.o.f(r1)
            com.unity3d.scar.adapter.common.c r2 = r6.getGmaEvent()
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L35
            java.lang.String r1 = r6.getPlacementId()
            java.lang.String r2 = r5.$placementId
            boolean r1 = kotlin.jvm.internal.n.a(r1, r2)
            if (r1 != 0) goto L52
        L35:
            r1 = 3
            com.unity3d.scar.adapter.common.c[] r1 = new com.unity3d.scar.adapter.common.c[r1]
            com.unity3d.scar.adapter.common.c r2 = com.unity3d.scar.adapter.common.c.METHOD_ERROR
            r1[r3] = r2
            com.unity3d.scar.adapter.common.c r2 = com.unity3d.scar.adapter.common.c.SCAR_NOT_PRESENT
            r1[r4] = r2
            com.unity3d.scar.adapter.common.c r2 = com.unity3d.scar.adapter.common.c.INTERNAL_LOAD_ERROR
            r1[r0] = r2
            java.util.List r0 = j8.o.f(r1)
            com.unity3d.scar.adapter.common.c r6 = r6.getGmaEvent()
            boolean r6 = r0.contains(r6)
            if (r6 == 0) goto L53
        L52:
            r3 = r4
        L53:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r6
        L58:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
