package com.unity3d.ads.core.data.datasource;

import com.google.android.gms.common.api.Api;
import com.unity3d.ads.core.data.model.CacheError;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CacheSource;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import java.io.File;
import kotlin.jvm.internal.n;
import m8.d;
/* compiled from: AndroidLocalCacheDataSource.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class AndroidLocalCacheDataSource implements CacheDataSource {
    private final CreateFile createFile;
    private final GetFileExtensionFromUrl getFileExtensionFromUrl;

    public AndroidLocalCacheDataSource(CreateFile createFile, GetFileExtensionFromUrl getFileExtensionFromUrl) {
        n.f(createFile, "createFile");
        n.f(getFileExtensionFromUrl, "getFileExtensionFromUrl");
        this.createFile = createFile;
        this.getFileExtensionFromUrl = getFileExtensionFromUrl;
    }

    public final CreateFile getCreateFile() {
        return this.createFile;
    }

    @Override // com.unity3d.ads.core.data.datasource.CacheDataSource
    public Object getFile(File file, String str, String str2, Integer num, d<? super CacheResult> dVar) {
        File invoke = this.createFile.invoke(file, str);
        if (invoke.exists()) {
            String invoke2 = str2 == null || str2.length() == 0 ? null : this.getFileExtensionFromUrl.invoke(str2);
            return new CacheResult.Success(new CachedFile("", str2 == null ? "" : str2, str, invoke, invoke2 == null ? "" : invoke2, invoke.length(), null, num != null ? num.intValue() : Api.BaseClientBuilder.API_PRIORITY_OTHER, 64, null), CacheSource.LOCAL);
        }
        return new CacheResult.Failure(CacheError.FILE_NOT_FOUND, CacheSource.LOCAL);
    }

    public final GetFileExtensionFromUrl getGetFileExtensionFromUrl() {
        return this.getFileExtensionFromUrl;
    }
}
