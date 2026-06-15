package com.unity3d.services;

import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.services.core.di.IServiceComponent;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.o;
import t8.a;
/* compiled from: IServiceComponent.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class UnityAdsSDK$finishOMIDSession$$inlined$inject$default$1 extends o implements a<GetAdObject> {
    final /* synthetic */ String $named;
    final /* synthetic */ IServiceComponent $this_inject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$finishOMIDSession$$inlined$inject$default$1(IServiceComponent iServiceComponent, String str) {
        super(0);
        this.$this_inject = iServiceComponent;
        this.$named = str;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.unity3d.ads.core.domain.GetAdObject] */
    @Override // t8.a
    public final GetAdObject invoke() {
        IServiceComponent iServiceComponent = this.$this_inject;
        return iServiceComponent.getServiceProvider().getRegistry().getService(this.$named, b0.b(GetAdObject.class));
    }
}
