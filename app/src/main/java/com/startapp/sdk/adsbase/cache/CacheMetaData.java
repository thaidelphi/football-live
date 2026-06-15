package com.startapp.sdk.adsbase.cache;

import android.content.Context;
import com.startapp.common.parser.TypeInfo;
import com.startapp.g2;
import com.startapp.l3;
import com.startapp.m3;
import com.startapp.o9;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class CacheMetaData implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static volatile CacheMetaData f23015a = new CacheMetaData();
    private static final long serialVersionUID = -5733696220222242321L;
    @TypeInfo(complex = true)
    private ACMConfig ACM = new ACMConfig();
    private float sendCacheSizeProb = 20.0f;
    private String cacheMetaDataUpdateVersion = "4.11.5";

    public static CacheMetaData b() {
        return f23015a;
    }

    public static boolean d() {
        ACMConfig aCMConfig = f23015a.ACM;
        if (aCMConfig != null) {
            Object obj = StartAppSDKInternal.C;
            if (aCMConfig.a(StartAppSDKInternal.c.f22944a.f22930v)) {
                return true;
            }
        }
        return false;
    }

    public final ACMConfig a() {
        return this.ACM;
    }

    public final float c() {
        return this.sendCacheSizeProb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CacheMetaData cacheMetaData = (CacheMetaData) obj;
        return Float.compare(cacheMetaData.sendCacheSizeProb, this.sendCacheSizeProb) == 0 && o9.a(this.ACM, cacheMetaData.ACM) && o9.a(this.cacheMetaDataUpdateVersion, cacheMetaData.cacheMetaDataUpdateVersion);
    }

    public final int hashCode() {
        Object[] objArr = {this.ACM, Float.valueOf(this.sendCacheSizeProb), this.cacheMetaDataUpdateVersion};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }

    public static void a(Context context, CacheMetaData cacheMetaData) {
        cacheMetaData.cacheMetaDataUpdateVersion = "4.11.5";
        f23015a = cacheMetaData;
        g2.a(context, "StartappCacheMetadata", cacheMetaData);
    }

    public static void a(Context context) {
        CacheMetaData cacheMetaData = (CacheMetaData) g2.c(context, "StartappCacheMetadata");
        CacheMetaData cacheMetaData2 = new CacheMetaData();
        if (cacheMetaData != null) {
            boolean a10 = o9.a((Serializable) cacheMetaData, (Serializable) cacheMetaData2);
            if (!(!"4.11.5".equals(cacheMetaData.cacheMetaDataUpdateVersion)) && a10) {
                l3 l3Var = new l3(m3.f22275e);
                l3Var.f22228d = "metadata_null";
                l3Var.a();
            }
            f23015a = cacheMetaData;
            return;
        }
        f23015a = cacheMetaData2;
    }
}
