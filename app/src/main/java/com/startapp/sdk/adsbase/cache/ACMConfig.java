package com.startapp.sdk.adsbase.cache;

import com.startapp.common.parser.TypeInfo;
import com.startapp.o9;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.utils.UniversalIntParser;
import java.io.Serializable;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ACMConfig implements Serializable {
    private static final long serialVersionUID = 5818859951358287830L;
    private long adCacheTTL = 3600;
    private long returnAdCacheTTL = 3600;
    @TypeInfo(type = EnumSet.class, value = StartAppAd.AdMode.class)
    private Set<StartAppAd.AdMode> autoLoad = EnumSet.of(StartAppAd.AdMode.FULLPAGE);
    @TypeInfo(parser = UniversalIntParser.class)
    private int autoLoadEnabled = 1;
    private boolean localCache = true;
    private boolean returnAdShouldLoadInBg = true;
    @TypeInfo(complex = true)
    private FailuresHandler failuresHandler = new FailuresHandler();
    private int maxCacheSize = 7;

    public final long a() {
        return TimeUnit.SECONDS.toMillis(this.adCacheTTL);
    }

    public final Set<StartAppAd.AdMode> b() {
        return this.autoLoad;
    }

    public final FailuresHandler c() {
        return this.failuresHandler;
    }

    public final int d() {
        return this.maxCacheSize;
    }

    public final long e() {
        return TimeUnit.SECONDS.toMillis(this.returnAdCacheTTL);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ACMConfig aCMConfig = (ACMConfig) obj;
        return this.adCacheTTL == aCMConfig.adCacheTTL && this.returnAdCacheTTL == aCMConfig.returnAdCacheTTL && this.autoLoadEnabled == aCMConfig.autoLoadEnabled && this.localCache == aCMConfig.localCache && this.returnAdShouldLoadInBg == aCMConfig.returnAdShouldLoadInBg && this.maxCacheSize == aCMConfig.maxCacheSize && o9.a(this.autoLoad, aCMConfig.autoLoad) && o9.a(this.failuresHandler, aCMConfig.failuresHandler);
    }

    public final boolean f() {
        return this.localCache;
    }

    public final boolean g() {
        return this.returnAdShouldLoadInBg;
    }

    public final int hashCode() {
        Object[] objArr = {Long.valueOf(this.adCacheTTL), Long.valueOf(this.returnAdCacheTTL), this.autoLoad, Integer.valueOf(this.autoLoadEnabled), Boolean.valueOf(this.localCache), Boolean.valueOf(this.returnAdShouldLoadInBg), this.failuresHandler, Integer.valueOf(this.maxCacheSize)};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }

    public final boolean a(boolean z10) {
        int i10 = this.autoLoadEnabled;
        return i10 == 2 ? !z10 : i10 == 1;
    }
}
