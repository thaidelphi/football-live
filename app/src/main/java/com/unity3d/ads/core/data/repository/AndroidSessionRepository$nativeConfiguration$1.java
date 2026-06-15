package com.unity3d.ads.core.data.repository;

import d9.o0;
import g9.e;
import g9.g;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidSessionRepository.kt */
@f(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$nativeConfiguration$1", f = "AndroidSessionRepository.kt", l = {157}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidSessionRepository$nativeConfiguration$1 extends l implements p<o0, d<? super NativeConfigurationOuterClass.NativeConfiguration>, Object> {
    int label;
    final /* synthetic */ AndroidSessionRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSessionRepository$nativeConfiguration$1(AndroidSessionRepository androidSessionRepository, d<? super AndroidSessionRepository$nativeConfiguration$1> dVar) {
        super(2, dVar);
        this.this$0 = androidSessionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidSessionRepository$nativeConfiguration$1(this.this$0, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super NativeConfigurationOuterClass.NativeConfiguration> dVar) {
        return ((AndroidSessionRepository$nativeConfiguration$1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        e eVar;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            eVar = this.this$0.persistedNativeConfiguration;
            this.label = 1;
            obj = g.r(eVar, this);
            if (obj == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i8.p.b(obj);
        }
        return obj;
    }
}
