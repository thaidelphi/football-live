package com.unity3d.ads.core.data.datasource;

import com.google.android.gms.common.api.Api;
import com.unity3d.ads.core.data.model.CacheResult;
import java.io.File;
import m8.d;
/* compiled from: CacheDataSource.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface CacheDataSource {

    /* compiled from: CacheDataSource.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheDataSource cacheDataSource, File file, String str, String str2, Integer num, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    str2 = null;
                }
                String str3 = str2;
                if ((i10 & 8) != 0) {
                    num = Integer.valueOf((int) Api.BaseClientBuilder.API_PRIORITY_OTHER);
                }
                return cacheDataSource.getFile(file, str, str3, num, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
        }
    }

    Object getFile(File file, String str, String str2, Integer num, d<? super CacheResult> dVar);
}
