package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.NativeConfigurationOuterClass;
import i8.n;
import i8.p;
import i8.s;
import i8.w;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.q;
/* compiled from: AndroidSessionRepository.kt */
@f(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$persistedNativeConfiguration$1", f = "AndroidSessionRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class AndroidSessionRepository$persistedNativeConfiguration$1 extends l implements q<NativeConfigurationOuterClass.NativeConfiguration, Boolean, d<? super n<? extends NativeConfigurationOuterClass.NativeConfiguration, ? extends Boolean>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AndroidSessionRepository$persistedNativeConfiguration$1(d<? super AndroidSessionRepository$persistedNativeConfiguration$1> dVar) {
        super(3, dVar);
    }

    public final Object invoke(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, boolean z10, d<? super n<NativeConfigurationOuterClass.NativeConfiguration, Boolean>> dVar) {
        AndroidSessionRepository$persistedNativeConfiguration$1 androidSessionRepository$persistedNativeConfiguration$1 = new AndroidSessionRepository$persistedNativeConfiguration$1(dVar);
        androidSessionRepository$persistedNativeConfiguration$1.L$0 = nativeConfiguration;
        androidSessionRepository$persistedNativeConfiguration$1.Z$0 = z10;
        return androidSessionRepository$persistedNativeConfiguration$1.invokeSuspend(w.f26638a);
    }

    @Override // t8.q
    public /* bridge */ /* synthetic */ Object invoke(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, Boolean bool, d<? super n<? extends NativeConfigurationOuterClass.NativeConfiguration, ? extends Boolean>> dVar) {
        return invoke(nativeConfiguration, bool.booleanValue(), (d<? super n<NativeConfigurationOuterClass.NativeConfiguration, Boolean>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        n8.d.c();
        if (this.label == 0) {
            p.b(obj);
            return s.a((NativeConfigurationOuterClass.NativeConfiguration) this.L$0, b.a(this.Z$0));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
