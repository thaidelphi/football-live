package com.unity3d.ads.core.data.datasource;

import com.google.android.gms.common.api.Api;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import d9.i;
import d9.j0;
import i8.w;
import java.io.File;
import kotlin.jvm.internal.n;
import m8.d;
/* compiled from: AndroidRemoteCacheDataSource.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class AndroidRemoteCacheDataSource implements CacheDataSource {
    private final CreateFile createFile;
    private final GetFileExtensionFromUrl getFileExtensionFromUrl;
    private final HttpClient httpClient;
    private final j0 ioDispatcher;

    public AndroidRemoteCacheDataSource(j0 ioDispatcher, CreateFile createFile, GetFileExtensionFromUrl getFileExtensionFromUrl, HttpClient httpClient) {
        n.f(ioDispatcher, "ioDispatcher");
        n.f(createFile, "createFile");
        n.f(getFileExtensionFromUrl, "getFileExtensionFromUrl");
        n.f(httpClient, "httpClient");
        this.ioDispatcher = ioDispatcher;
        this.createFile = createFile;
        this.getFileExtensionFromUrl = getFileExtensionFromUrl;
        this.httpClient = httpClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object downloadFile(String str, Integer num, d<? super HttpResponse> dVar) {
        return this.httpClient.execute(new HttpRequest(str, null, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, num != null ? num.intValue() : Api.BaseClientBuilder.API_PRIORITY_OTHER, 65534, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object saveToCache(File file, Object obj, d<? super w> dVar) {
        Object c10;
        Object g10 = i.g(this.ioDispatcher, new AndroidRemoteCacheDataSource$saveToCache$2(obj, file, null), dVar);
        c10 = n8.d.c();
        return g10 == c10 ? g10 : w.f26638a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013f  */
    @Override // com.unity3d.ads.core.data.datasource.CacheDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getFile(java.io.File r15, java.lang.String r16, java.lang.String r17, java.lang.Integer r18, m8.d<? super com.unity3d.ads.core.data.model.CacheResult> r19) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.getFile(java.io.File, java.lang.String, java.lang.String, java.lang.Integer, m8.d):java.lang.Object");
    }
}
