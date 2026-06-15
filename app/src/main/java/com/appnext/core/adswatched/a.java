package com.appnext.core.adswatched;

import android.content.Context;
import android.text.TextUtils;
import com.appnext.core.adswatched.database.AdWatched;
import com.appnext.core.adswatched.database.AdWatchedDatabase;
import java.util.ArrayList;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a {
    private static a dS;
    private Context aO;

    private a(Context context) {
        try {
            this.aO = context.getApplicationContext();
        } catch (Throwable unused) {
        }
    }

    public static a m(Context context) {
        if (dS == null) {
            synchronized (com.appnext.core.ra.services.a.class) {
                if (dS == null) {
                    dS = new a(context);
                }
            }
        }
        return dS;
    }

    public final void j(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            AdWatched adWatched = new AdWatched();
            adWatched.bannerId = str;
            adWatched.auid = str2;
            adWatched.toString();
            AdWatchedDatabase.getInstance(this.aO).adWatchedDao().a(adWatched);
        } catch (Throwable th) {
            com.appnext.base.a.a("AdsWatchedManager$setBannerWatched", th);
        }
    }

    public final void k(String str, String str2) {
        try {
            AdWatchedDatabase.getInstance(this.aO).adWatchedDao().y(str2);
        } catch (Throwable unused) {
        }
    }

    public final List<String> w(String str) {
        try {
            List<String> x10 = AdWatchedDatabase.getInstance(this.aO).adWatchedDao().x(str);
            x10.toString();
            return x10;
        } catch (Throwable th) {
            com.appnext.base.a.a("AdsWatchedManager$getAdsWatchedIdsByPlacement", th);
            return new ArrayList();
        }
    }
}
