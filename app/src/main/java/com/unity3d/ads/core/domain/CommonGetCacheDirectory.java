package com.unity3d.ads.core.domain;

import java.io.File;
import kotlin.jvm.internal.n;
/* compiled from: CommonGetCacheDirectory.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CommonGetCacheDirectory implements GetCacheDirectory {
    @Override // com.unity3d.ads.core.domain.GetCacheDirectory
    public File invoke(File cacheDirectoryBase, String cacheDirectoryPath) {
        n.f(cacheDirectoryBase, "cacheDirectoryBase");
        n.f(cacheDirectoryPath, "cacheDirectoryPath");
        return new File(cacheDirectoryBase, cacheDirectoryPath);
    }
}
