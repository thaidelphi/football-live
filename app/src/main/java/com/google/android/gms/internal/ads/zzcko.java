package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.ironsource.cc;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcko implements zzcjs {
    private final CookieManager zza;

    public zzcko(Context context) {
        this.zza = com.google.android.gms.ads.internal.zzv.zzr().zza(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final void zza(Map map) {
        String cookie;
        if (this.zza == null) {
            return;
        }
        if (((String) map.get("clear")) != null) {
            String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaY);
            CookieManager cookieManager = this.zza;
            if (cookieManager == null || (cookie = cookieManager.getCookie(str)) == null) {
                return;
            }
            List zzf = zzftk.zzb(zzfsg.zzc(';')).zzf(cookie);
            for (int i10 = 0; i10 < zzf.size(); i10++) {
                CookieManager cookieManager2 = this.zza;
                Iterator it = zzftk.zzb(zzfsg.zzc(cc.T)).zzd((String) zzf.get(i10)).iterator();
                Objects.requireNonNull(it);
                if (it.hasNext()) {
                    cookieManager2.setCookie(str, String.valueOf((String) it.next()).concat(String.valueOf((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaK))));
                } else {
                    throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (0)");
                }
            }
            return;
        }
        String str2 = (String) map.get("cookie");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.setCookie((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaY), str2);
    }
}
