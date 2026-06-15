package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CachedFile;
import i8.w;
import m8.d;
import org.json.JSONArray;
/* compiled from: CacheRepository.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface CacheRepository {

    /* compiled from: CacheRepository.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheRepository cacheRepository, String str, String str2, JSONArray jSONArray, int i10, d dVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 4) != 0) {
                    jSONArray = null;
                }
                JSONArray jSONArray2 = jSONArray;
                if ((i11 & 8) != 0) {
                    i10 = 0;
                }
                return cacheRepository.getFile(str, str2, jSONArray2, i10, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
        }
    }

    Object clearCache(d<? super w> dVar);

    Object doesFileExist(String str, d<? super Boolean> dVar);

    Object getCacheSize(d<? super Long> dVar);

    Object getFile(String str, String str2, JSONArray jSONArray, int i10, d<? super CacheResult> dVar);

    boolean removeFile(CachedFile cachedFile);

    CacheResult retrieveFile(String str);
}
