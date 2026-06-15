package com.unity3d.services.ads.token;

import com.unity3d.services.core.di.IServiceComponent;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.o;
/* compiled from: IServiceComponent.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InMemoryTokenStorage$special$$inlined$inject$default$1 extends o implements t8.a<AsyncTokenStorage> {
    final /* synthetic */ String $named;
    final /* synthetic */ IServiceComponent $this_inject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMemoryTokenStorage$special$$inlined$inject$default$1(IServiceComponent iServiceComponent, String str) {
        super(0);
        this.$this_inject = iServiceComponent;
        this.$named = str;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.unity3d.services.ads.token.AsyncTokenStorage] */
    @Override // t8.a
    public final AsyncTokenStorage invoke() {
        IServiceComponent iServiceComponent = this.$this_inject;
        return iServiceComponent.getServiceProvider().getRegistry().getService(this.$named, b0.b(AsyncTokenStorage.class));
    }
}
