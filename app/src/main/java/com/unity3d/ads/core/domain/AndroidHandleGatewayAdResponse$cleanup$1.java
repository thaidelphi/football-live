package com.unity3d.ads.core.domain;

import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.j3;
import kotlin.coroutines.jvm.internal.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidHandleGatewayAdResponse.kt */
@f(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse", f = "AndroidHandleGatewayAdResponse.kt", l = {200, j3.c.b.f17916g}, m = "cleanup")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidHandleGatewayAdResponse$cleanup$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidHandleGatewayAdResponse this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleGatewayAdResponse$cleanup$1(AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse, m8.d<? super AndroidHandleGatewayAdResponse$cleanup$1> dVar) {
        super(dVar);
        this.this$0 = androidHandleGatewayAdResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object cleanup;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        cleanup = this.this$0.cleanup(null, null, null, null, this);
        return cleanup;
    }
}
