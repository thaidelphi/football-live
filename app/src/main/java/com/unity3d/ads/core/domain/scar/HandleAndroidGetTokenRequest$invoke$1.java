package com.unity3d.ads.core.domain.scar;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HandleAndroidGetTokenRequest.kt */
@f(c = "com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest", f = "HandleAndroidGetTokenRequest.kt", l = {19, 23, 25}, m = "invoke")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class HandleAndroidGetTokenRequest$invoke$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HandleAndroidGetTokenRequest this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleAndroidGetTokenRequest$invoke$1(HandleAndroidGetTokenRequest handleAndroidGetTokenRequest, m8.d<? super HandleAndroidGetTokenRequest$invoke$1> dVar) {
        super(dVar);
        this.this$0 = handleAndroidGetTokenRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke(null, null, this);
    }
}
