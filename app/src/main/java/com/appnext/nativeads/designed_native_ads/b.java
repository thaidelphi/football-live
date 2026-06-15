package com.appnext.nativeads.designed_native_ads;

import com.appnext.core.Ad;
import com.appnext.core.SettingsManager;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b extends com.appnext.nativeads.b {
    private static b fO;

    public static synchronized b aJ() {
        b bVar;
        synchronized (b.class) {
            if (fO == null) {
                fO = new b();
            }
            bVar = fO;
        }
        return bVar;
    }

    @Override // com.appnext.nativeads.b, com.appnext.core.d
    protected final SettingsManager c(Ad ad) {
        return c.aK();
    }
}
