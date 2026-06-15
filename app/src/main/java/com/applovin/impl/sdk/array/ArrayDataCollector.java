package com.applovin.impl.sdk.array;

import com.applovin.array.apphub.aidl.IAppHubService;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ArrayDataCollector {
    private static final String TAG = "ArrayService";
    private final n logger;
    private final j sdk;

    public ArrayDataCollector(j jVar) {
        this.sdk = jVar;
        this.logger = jVar.I();
    }

    public long collectAppHubVersionCode(IAppHubService iAppHubService) {
        try {
            return iAppHubService.getAppHubVersionCode();
        } catch (Throwable th) {
            if (n.a()) {
                this.logger.a(TAG, "Failed to collect version code", th);
                return -1L;
            }
            return -1L;
        }
    }

    public Boolean collectDirectDownloadEnabled(IAppHubService iAppHubService) {
        try {
            return Boolean.valueOf(iAppHubService.getEnabledFeatures().getBoolean("DIRECT_DOWNLOAD"));
        } catch (Throwable th) {
            if (n.a()) {
                this.logger.a(TAG, "Failed to collect enabled features", th);
                return null;
            }
            return null;
        }
    }

    public String collectRandomUserToken(IAppHubService iAppHubService) {
        try {
            return iAppHubService.getRandomUserToken();
        } catch (Throwable th) {
            if (n.a()) {
                this.logger.a(TAG, "Failed to collect random user token", th);
                return null;
            }
            return null;
        }
    }
}
