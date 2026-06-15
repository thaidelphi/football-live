package com.unity3d.ads.core.data.datasource;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidStaticDeviceInfoDataSource.kt */
@f(c = "com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource", f = "AndroidStaticDeviceInfoDataSource.kt", l = {97}, m = "fetch")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class AndroidStaticDeviceInfoDataSource$fetch$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidStaticDeviceInfoDataSource this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidStaticDeviceInfoDataSource$fetch$1(AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource, m8.d<? super AndroidStaticDeviceInfoDataSource$fetch$1> dVar) {
        super(dVar);
        this.this$0 = androidStaticDeviceInfoDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.fetch(null, this);
    }
}
