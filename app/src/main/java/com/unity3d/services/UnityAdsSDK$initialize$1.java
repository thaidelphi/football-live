package com.unity3d.services;

import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.services.core.domain.task.EmptyParams;
import com.unity3d.services.core.domain.task.InitializeSDK;
import d9.o0;
import d9.p0;
import i8.g;
import i8.o;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UnityAdsSDK.kt */
@f(c = "com.unity3d.services.UnityAdsSDK$initialize$1", f = "UnityAdsSDK.kt", l = {84, 86}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class UnityAdsSDK$initialize$1 extends l implements p<o0, d<? super w>, Object> {
    final /* synthetic */ g<AlternativeFlowReader> $alternativeFlowReader$delegate;
    final /* synthetic */ o0 $initScope;
    final /* synthetic */ g<InitializeBoldSDK> $initializeBoldSDK$delegate;
    final /* synthetic */ g<InitializeSDK> $initializeSDK$delegate;
    final /* synthetic */ String $source;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnityAdsSDK$initialize$1(String str, o0 o0Var, g<AlternativeFlowReader> gVar, g<? extends InitializeBoldSDK> gVar2, g<InitializeSDK> gVar3, d<? super UnityAdsSDK$initialize$1> dVar) {
        super(2, dVar);
        this.$source = str;
        this.$initScope = o0Var;
        this.$alternativeFlowReader$delegate = gVar;
        this.$initializeBoldSDK$delegate = gVar2;
        this.$initializeSDK$delegate = gVar3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new UnityAdsSDK$initialize$1(this.$source, this.$initScope, this.$alternativeFlowReader$delegate, this.$initializeBoldSDK$delegate, this.$initializeSDK$delegate, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super w> dVar) {
        return ((UnityAdsSDK$initialize$1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        AlternativeFlowReader initialize$lambda$1;
        InitializeSDK initialize$lambda$2;
        InitializeBoldSDK initialize$lambda$3;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            initialize$lambda$1 = UnityAdsSDK.initialize$lambda$1(this.$alternativeFlowReader$delegate);
            if (initialize$lambda$1.invoke()) {
                initialize$lambda$3 = UnityAdsSDK.initialize$lambda$3(this.$initializeBoldSDK$delegate);
                String str = this.$source;
                this.label = 1;
                if (initialize$lambda$3.invoke(str, this) == c10) {
                    return c10;
                }
            } else {
                initialize$lambda$2 = UnityAdsSDK.initialize$lambda$2(this.$initializeSDK$delegate);
                EmptyParams emptyParams = EmptyParams.INSTANCE;
                this.label = 2;
                if (initialize$lambda$2.mo53invokegIAlus(emptyParams, this) == c10) {
                    return c10;
                }
            }
        } else if (i10 == 1) {
            i8.p.b(obj);
        } else if (i10 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i8.p.b(obj);
            ((o) obj).i();
        }
        p0.d(this.$initScope, null, 1, null);
        return w.f26638a;
    }
}
