package com.startapp.sdk.adsbase;

import android.content.Context;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class JsonAd extends Ad {
    private static final long serialVersionUID = 4523075381486005923L;
    private List<AdDetails> adsDetails;

    public JsonAd(Context context, AdPreferences.Placement placement) {
        super(context, placement);
        this.adsDetails = null;
    }

    public final void a(ArrayList arrayList) {
        this.adsDetails = arrayList;
        Iterator it = arrayList.iterator();
        Long l10 = null;
        while (it.hasNext()) {
            AdDetails adDetails = (AdDetails) it.next();
            if (adDetails != null && adDetails.y() != null && (l10 == null || adDetails.y().longValue() < l10.longValue())) {
                l10 = adDetails.y();
            }
        }
        if (l10 != null) {
            this.adCacheTtl = Long.valueOf(TimeUnit.SECONDS.toMillis(l10.longValue()));
        }
        boolean z10 = true;
        Iterator<AdDetails> it2 = this.adsDetails.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (!it2.next().o()) {
                z10 = false;
                break;
            }
        }
        this.belowMinCPM = z10;
    }

    public final List<AdDetails> g() {
        return this.adsDetails;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final String getAdId() {
        List<AdDetails> list = this.adsDetails;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.adsDetails.get(0).a();
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final String getBidToken() {
        List<AdDetails> list = this.adsDetails;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.adsDetails.get(0).e();
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final String getDParam() {
        List<AdDetails> list = this.adsDetails;
        if (list != null) {
            try {
                String str = null;
                for (AdDetails adDetails : list) {
                    try {
                        if (adDetails != null) {
                            String h10 = adDetails.h();
                            String[] w10 = adDetails.w();
                            str = a.a(h10, (w10 == null || w10.length <= 0) ? null : w10[0]);
                            if (str != null) {
                                break;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                return str;
            } catch (Throwable unused2) {
                return null;
            }
        }
        return null;
    }
}
