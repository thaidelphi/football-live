package com.unity3d.ads.core.domain.scar;

import d9.o0;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* compiled from: CommonScarEventReceiver.kt */
@f(c = "com.unity3d.ads.core.domain.scar.CommonScarEventReceiver$sendEvent$1", f = "CommonScarEventReceiver.kt", l = {35, 41, 52, 66, 73}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class CommonScarEventReceiver$sendEvent$1 extends l implements p<o0, d<? super w>, Object> {
    final /* synthetic */ Enum<?> $eventId;
    final /* synthetic */ Object[] $params;
    int label;
    final /* synthetic */ CommonScarEventReceiver this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonScarEventReceiver$sendEvent$1(Enum<?> r12, Object[] objArr, CommonScarEventReceiver commonScarEventReceiver, d<? super CommonScarEventReceiver$sendEvent$1> dVar) {
        super(2, dVar);
        this.$eventId = r12;
        this.$params = objArr;
        this.this$0 = commonScarEventReceiver;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new CommonScarEventReceiver$sendEvent$1(this.$eventId, this.$params, this.this$0, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super w> dVar) {
        return ((CommonScarEventReceiver$sendEvent$1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0104  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.scar.CommonScarEventReceiver$sendEvent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
