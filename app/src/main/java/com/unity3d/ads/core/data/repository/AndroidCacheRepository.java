package com.unity3d.ads.core.data.repository;

import android.content.Context;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.model.CacheError;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CacheSource;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import d9.i;
import d9.j0;
import d9.m2;
import d9.n0;
import d9.o0;
import d9.p0;
import i8.w;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.n;
import m8.d;
import org.json.JSONArray;
/* compiled from: AndroidCacheRepository.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidCacheRepository implements CacheRepository {
    private final File cacheDir;
    private final ConcurrentHashMap<String, CachedFile> cachedFiles;
    private final CleanupDirectory cleanupDirectory;
    private final Context context;
    private final DownloadPriorityQueue downloadPriorityQueue;
    private final GetCacheDirectory getCacheDirectory;
    private final CacheDataSource localCacheDataSource;
    private final ConcurrentHashMap<String, Set<String>> neededFiles;
    private final CacheDataSource remoteCacheDataSource;
    private final o0 scope;
    private final SessionRepository sessionRepository;

    public AndroidCacheRepository(j0 ioDispatcher, GetCacheDirectory getCacheDirectory, CacheDataSource localCacheDataSource, CacheDataSource remoteCacheDataSource, Context context, SessionRepository sessionRepository, CleanupDirectory cleanupDirectory, DownloadPriorityQueue downloadPriorityQueue) {
        n.f(ioDispatcher, "ioDispatcher");
        n.f(getCacheDirectory, "getCacheDirectory");
        n.f(localCacheDataSource, "localCacheDataSource");
        n.f(remoteCacheDataSource, "remoteCacheDataSource");
        n.f(context, "context");
        n.f(sessionRepository, "sessionRepository");
        n.f(cleanupDirectory, "cleanupDirectory");
        n.f(downloadPriorityQueue, "downloadPriorityQueue");
        this.getCacheDirectory = getCacheDirectory;
        this.localCacheDataSource = localCacheDataSource;
        this.remoteCacheDataSource = remoteCacheDataSource;
        this.context = context;
        this.sessionRepository = sessionRepository;
        this.cleanupDirectory = cleanupDirectory;
        this.downloadPriorityQueue = downloadPriorityQueue;
        this.scope = p0.h(p0.h(p0.a(ioDispatcher), new n0("CacheRepository")), m2.f24489a);
        this.cachedFiles = new ConcurrentHashMap<>();
        this.neededFiles = new ConcurrentHashMap<>();
        this.cacheDir = initCacheDir();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addFileToCache(CachedFile cachedFile) {
        this.cachedFiles.put(cachedFile.getName(), cachedFile);
        Set<String> set = this.neededFiles.get(cachedFile.getName());
        if (set == null) {
            set = new LinkedHashSet<>();
        }
        set.add(cachedFile.getObjectId());
        this.neededFiles.put(cachedFile.getName(), set);
    }

    private final File getCacheDirBase() {
        File cacheDir = this.context.getCacheDir();
        n.e(cacheDir, "context.cacheDir");
        return cacheDir;
    }

    private final String getCacheDirPath() {
        return UnityAdsConstants.DefaultUrls.CACHE_DIR_NAME;
    }

    private final File initCacheDir() {
        File invoke = this.getCacheDirectory.invoke(getCacheDirBase(), getCacheDirPath());
        invoke.mkdirs();
        return invoke;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object clearCache(d<? super w> dVar) {
        return i.g(this.scope.getCoroutineContext(), new AndroidCacheRepository$clearCache$2(this, null), dVar);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object doesFileExist(String str, d<? super Boolean> dVar) {
        return b.a(this.cachedFiles.containsKey(str));
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getCacheSize(d<? super Long> dVar) {
        return i.g(this.scope.getCoroutineContext(), new AndroidCacheRepository$getCacheSize$2(this, null), dVar);
    }

    public final ConcurrentHashMap<String, CachedFile> getCachedFiles() {
        return this.cachedFiles;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getFile(String str, String str2, JSONArray jSONArray, int i10, d<? super CacheResult> dVar) {
        return i.g(this.scope.getCoroutineContext(), new AndroidCacheRepository$getFile$2(this, str, i10, str2, null), dVar);
    }

    public final String getFilename(String url) {
        n.f(url, "url");
        return StringExtensionsKt.getSHA256Hash(url);
    }

    public final ConcurrentHashMap<String, Set<String>> getNeededFiles() {
        return this.neededFiles;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public boolean removeFile(CachedFile cachedFile) {
        n.f(cachedFile, "cachedFile");
        this.cachedFiles.remove(cachedFile.getName());
        Set<String> set = this.neededFiles.get(cachedFile.getName());
        if (set != null) {
            set.remove(cachedFile.getObjectId());
        }
        File file = cachedFile.getFile();
        if (file != null) {
            if (!file.exists()) {
                file = null;
            }
            if (file != null) {
                return file.delete();
            }
        }
        return false;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public CacheResult retrieveFile(String fileName) {
        n.f(fileName, "fileName");
        CachedFile cachedFile = this.cachedFiles.get(fileName);
        if (cachedFile != null) {
            return new CacheResult.Success(cachedFile, CacheSource.LOCAL);
        }
        return new CacheResult.Failure(CacheError.FILE_NOT_FOUND, CacheSource.LOCAL);
    }
}
