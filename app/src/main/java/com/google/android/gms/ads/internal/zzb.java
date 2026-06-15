package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzbwn;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzb {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11524a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f11525b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbwn f11526c;

    /* renamed from: d  reason: collision with root package name */
    private final zzbtl f11527d = new zzbtl(false, Collections.emptyList());

    public zzb(Context context, zzbwn zzbwnVar, zzbtl zzbtlVar) {
        this.f11524a = context;
        this.f11526c = zzbwnVar;
    }

    private final boolean a() {
        zzbwn zzbwnVar = this.f11526c;
        return (zzbwnVar != null && zzbwnVar.zza().zzf) || this.f11527d.zza;
    }

    public final void zza() {
        this.f11525b = true;
    }

    public final void zzb(String str) {
        List<String> list;
        if (a()) {
            if (str == null) {
                str = "";
            }
            zzbwn zzbwnVar = this.f11526c;
            if (zzbwnVar != null) {
                zzbwnVar.zze(str, null, 3);
                return;
            }
            zzbtl zzbtlVar = this.f11527d;
            if (!zzbtlVar.zza || (list = zzbtlVar.zzb) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    Context context = this.f11524a;
                    zzv.zzq();
                    com.google.android.gms.ads.internal.util.zzs.zzM(context, "", replace);
                }
            }
        }
    }

    public final boolean zzc() {
        return !a() || this.f11525b;
    }
}
