package com.unity3d.ads.core.data.datasource;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidStaticDeviceInfoDataSource.kt */
@f(c = "com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource", f = "AndroidStaticDeviceInfoDataSource.kt", l = {492}, m = "getGPUModel")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class AndroidStaticDeviceInfoDataSource$getGPUModel$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidStaticDeviceInfoDataSource this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidStaticDeviceInfoDataSource$getGPUModel$1(AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource, m8.d<? super AndroidStaticDeviceInfoDataSource$getGPUModel$1> dVar) {
        super(dVar);
        this.this$0 = androidStaticDeviceInfoDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object gPUModel;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        gPUModel = this.this$0.getGPUModel(this);
        return gPUModel;
    }
}
