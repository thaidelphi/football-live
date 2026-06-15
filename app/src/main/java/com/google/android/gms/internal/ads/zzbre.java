package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbre extends zzbrh {
    private final Map zza;
    private final Context zzb;

    public zzbre(zzcdq zzcdqVar, Map map) {
        super(zzcdqVar, "storePicture");
        this.zza = map;
        this.zzb = zzcdqVar.zzi();
    }

    public final void zzb() {
        if (this.zzb == null) {
            zzh("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        if (!new zzbau(this.zzb).zzc()) {
            zzh("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzh("Image url cannot be empty.");
        } else if (URLUtil.isValidUrl(str)) {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            com.google.android.gms.ads.internal.zzv.zzq();
            if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                Resources zze = com.google.android.gms.ads.internal.zzv.zzp().zze();
                com.google.android.gms.ads.internal.zzv.zzq();
                AlertDialog.Builder zzL = com.google.android.gms.ads.internal.util.zzs.zzL(this.zzb);
                zzL.setTitle(zze != null ? zze.getString(R.string.f11134s1) : "Save image");
                zzL.setMessage(zze != null ? zze.getString(R.string.f11135s2) : "Allow Ad to store image in Picture gallery?");
                zzL.setPositiveButton(zze != null ? zze.getString(R.string.f11136s3) : "Accept", new zzbrc(this, str, lastPathSegment));
                zzL.setNegativeButton(zze != null ? zze.getString(R.string.f11137s4) : "Decline", new zzbrd(this));
                zzL.create().show();
                return;
            }
            zzh("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
        } else {
            zzh("Invalid image url: ".concat(String.valueOf(str)));
        }
    }
}
