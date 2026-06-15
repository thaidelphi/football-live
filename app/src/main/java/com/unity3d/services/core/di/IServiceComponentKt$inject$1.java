package com.unity3d.services.core.di;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import t8.a;
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: IServiceComponent.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class IServiceComponentKt$inject$1<T> extends o implements a<T> {
    final /* synthetic */ String $named;
    final /* synthetic */ IServiceComponent $this_inject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IServiceComponentKt$inject$1(IServiceComponent iServiceComponent, String str) {
        super(0);
        this.$this_inject = iServiceComponent;
        this.$named = str;
    }

    @Override // t8.a
    public final T invoke() {
        IServiceComponent iServiceComponent = this.$this_inject;
        String str = this.$named;
        IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
        n.k(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return (T) registry.getService(str, b0.b(Object.class));
    }
}
