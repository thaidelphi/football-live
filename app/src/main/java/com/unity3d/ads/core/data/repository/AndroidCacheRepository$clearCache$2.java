package com.unity3d.ads.core.data.repository;

import com.unity3d.services.core.network.domain.CleanupDirectory;
import d9.o0;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import i8.w;
import java.io.File;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* compiled from: AndroidCacheRepository.kt */
@f(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2", f = "AndroidCacheRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class AndroidCacheRepository$clearCache$2 extends l implements p<o0, d<? super w>, Object> {
    int label;
    final /* synthetic */ AndroidCacheRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCacheRepository$clearCache$2(AndroidCacheRepository androidCacheRepository, d<? super AndroidCacheRepository$clearCache$2> dVar) {
        super(2, dVar);
        this.this$0 = androidCacheRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidCacheRepository$clearCache$2(this.this$0, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super w> dVar) {
        return ((AndroidCacheRepository$clearCache$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SessionRepository sessionRepository;
        SessionRepository sessionRepository2;
        CleanupDirectory cleanupDirectory;
        File file;
        File file2;
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            sessionRepository = this.this$0.sessionRepository;
            if (!sessionRepository.getNativeConfiguration().hasCachedAssetsConfiguration()) {
                file2 = this.this$0.cacheDir;
                File[] listFiles = file2.listFiles();
                if (listFiles != null) {
                    for (File file3 : listFiles) {
                        file3.delete();
                    }
                    return w.f26638a;
                }
                return null;
            }
            sessionRepository2 = this.this$0.sessionRepository;
            NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration = sessionRepository2.getNativeConfiguration().getCachedAssetsConfiguration();
            cleanupDirectory = this.this$0.cleanupDirectory;
            file = this.this$0.cacheDir;
            cleanupDirectory.invoke(file, cachedAssetsConfiguration.getMaxCachedAssetSizeMb(), cachedAssetsConfiguration.getMaxCachedAssetAgeMs());
            return w.f26638a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
