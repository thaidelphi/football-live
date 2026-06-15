package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* compiled from: AndroidScarManager.kt */
@f(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$show$1", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class AndroidScarManager$show$1 extends l implements p<g9.f<? super GmaEventData>, d<? super w>, Object> {
    final /* synthetic */ String $placementId;
    final /* synthetic */ String $queryId;
    int label;
    final /* synthetic */ AndroidScarManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidScarManager$show$1(AndroidScarManager androidScarManager, String str, String str2, d<? super AndroidScarManager$show$1> dVar) {
        super(2, dVar);
        this.this$0 = androidScarManager;
        this.$placementId = str;
        this.$queryId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidScarManager$show$1(this.this$0, this.$placementId, this.$queryId, dVar);
    }

    @Override // t8.p
    public final Object invoke(g9.f<? super GmaEventData> fVar, d<? super w> dVar) {
        return ((AndroidScarManager$show$1) create(fVar, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        GMAScarAdapterBridge gMAScarAdapterBridge;
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            gMAScarAdapterBridge = this.this$0.gmaBridge;
            gMAScarAdapterBridge.show(this.$placementId, this.$queryId);
            return w.f26638a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
