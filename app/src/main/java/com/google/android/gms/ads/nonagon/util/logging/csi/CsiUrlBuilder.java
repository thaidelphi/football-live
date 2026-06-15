package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzbdg;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class CsiUrlBuilder {

    /* renamed from: a  reason: collision with root package name */
    private final String f11845a = (String) zzbdg.zza.zze();

    public String generateUrl(Map<String, String> map) {
        Uri.Builder buildUpon = Uri.parse(this.f11845a).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return buildUpon.build().toString();
    }
}
