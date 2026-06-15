package com.unity3d.ads.core.domain;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CommonClearCache.kt */
@f(c = "com.unity3d.ads.core.domain.CommonClearCache", f = "CommonClearCache.kt", l = {18, 19}, m = "invoke")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CommonClearCache$invoke$1 extends kotlin.coroutines.jvm.internal.d {
    long J$0;
    long J$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonClearCache this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonClearCache$invoke$1(CommonClearCache commonClearCache, m8.d<? super CommonClearCache$invoke$1> dVar) {
        super(dVar);
        this.this$0 = commonClearCache;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke(this);
    }
}
