package com.unity3d.ads.adplayer;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CommonWebViewBridge.kt */
@f(c = "com.unity3d.ads.adplayer.CommonWebViewBridge", f = "CommonWebViewBridge.kt", l = {63, 65}, m = "request")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class CommonWebViewBridge$request$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonWebViewBridge this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonWebViewBridge$request$1(CommonWebViewBridge commonWebViewBridge, m8.d<? super CommonWebViewBridge$request$1> dVar) {
        super(dVar);
        this.this$0 = commonWebViewBridge;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.request(null, null, null, this);
    }
}
