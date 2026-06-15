package com.unity3d.ads.core.data.datasource;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidRemoteCacheDataSource.kt */
@f(c = "com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource", f = "AndroidRemoteCacheDataSource.kt", l = {52, 60}, m = "getFile")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class AndroidRemoteCacheDataSource$getFile$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidRemoteCacheDataSource this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidRemoteCacheDataSource$getFile$1(AndroidRemoteCacheDataSource androidRemoteCacheDataSource, m8.d<? super AndroidRemoteCacheDataSource$getFile$1> dVar) {
        super(dVar);
        this.this$0 = androidRemoteCacheDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.getFile(null, null, null, null, this);
    }
}
