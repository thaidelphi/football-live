package com.unity3d.ads.core.domain;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import b9.p;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.jvm.internal.n;
/* compiled from: GetCachedAsset.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class GetCachedAsset {
    private final CacheRepository cacheRepository;
    private final Context context;

    public GetCachedAsset(CacheRepository cacheRepository, Context context) {
        n.f(cacheRepository, "cacheRepository");
        n.f(context, "context");
        this.cacheRepository = cacheRepository;
        this.context = context;
    }

    private final WebResourceResponse getBundledAsset(Uri uri) {
        String l02;
        l02 = p.l0(String.valueOf(uri.getPath()), "/", null, 2, null);
        try {
            InputStream open = this.context.getAssets().open(l02);
            n.e(open, "context.assets.open(fileName)");
            return new WebResourceResponse(StringExtensionsKt.guessMimeType(l02), null, open);
        } catch (Exception unused) {
            return null;
        }
    }

    private final WebResourceResponse getCachedAsset(Uri uri) {
        String p02;
        String x02;
        String uri2 = uri.toString();
        n.e(uri2, "uri.toString()");
        p02 = p.p0(uri2, "/", null, 2, null);
        x02 = p.x0(p02, ".", null, 2, null);
        CacheResult retrieveFile = this.cacheRepository.retrieveFile(x02);
        if (retrieveFile instanceof CacheResult.Success) {
            CacheResult.Success success = (CacheResult.Success) retrieveFile;
            File file = success.getCachedFile().getFile();
            if (file == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            return new WebResourceResponse(StringExtensionsKt.guessMimeType(file.getAbsolutePath() + '.' + success.getCachedFile().getExtension()), null, fileInputStream);
        }
        return null;
    }

    public final WebResourceResponse invoke(Uri uri) {
        n.f(uri, "uri");
        String host = uri.getHost();
        if (host != null) {
            int hashCode = host.hashCode();
            if (hashCode != -1921537799) {
                if (hashCode == -1920242293 && host.equals(UnityAdsConstants.DefaultUrls.AD_CACHE_DOMAIN)) {
                    return getCachedAsset(uri);
                }
            } else if (host.equals(UnityAdsConstants.DefaultUrls.AD_ASSET_DOMAIN)) {
                return getBundledAsset(uri);
            }
        }
        return null;
    }
}
