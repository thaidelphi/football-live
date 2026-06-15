package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.extensions.FileExtensionsKt;
import d9.o0;
import i8.w;
import java.io.File;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* compiled from: AndroidCacheRepository.kt */
@f(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2", f = "AndroidCacheRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class AndroidCacheRepository$getCacheSize$2 extends l implements p<o0, d<? super Long>, Object> {
    int label;
    final /* synthetic */ AndroidCacheRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCacheRepository$getCacheSize$2(AndroidCacheRepository androidCacheRepository, d<? super AndroidCacheRepository$getCacheSize$2> dVar) {
        super(2, dVar);
        this.this$0 = androidCacheRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidCacheRepository$getCacheSize$2(this.this$0, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super Long> dVar) {
        return ((AndroidCacheRepository$getCacheSize$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        File file;
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            file = this.this$0.cacheDir;
            return b.d(FileExtensionsKt.getDirectorySize(file));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
