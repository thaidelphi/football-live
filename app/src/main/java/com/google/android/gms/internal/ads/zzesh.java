package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzesh implements zzerw {
    private final zzgba zza;
    private final Context zzb;

    public zzesh(zzgba zzgbaVar, Context context) {
        this.zza = zzgbaVar;
        this.zzb = context;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:1|(3:3|(2:6|4)|7)|8|(3:65|66|(19:68|69|11|12|13|(13:15|16|(1:18)(2:48|(3:51|(3:54|(2:57|58)(1:56)|52)|59))|19|20|(2:22|(7:24|25|(5:27|28|29|(1:33)|44)(1:46)|(1:35)(1:42)|(1:37)(1:41)|38|39))|47|25|(0)(0)|(0)(0)|(0)(0)|38|39)|61|16|(0)(0)|19|20|(0)|47|25|(0)(0)|(0)(0)|(0)(0)|38|39))|10|11|12|13|(0)|61|16|(0)(0)|19|20|(0)|47|25|(0)(0)|(0)(0)|(0)(0)|38|39) */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1 A[Catch: Exception -> 0x00b8, TRY_LEAVE, TryCatch #2 {Exception -> 0x00b8, blocks: (B:19:0x0095, B:21:0x00a1), top: B:70:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.google.android.gms.internal.ads.zzesf zzc(com.google.android.gms.internal.ads.zzesh r25) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzesh.zzc(com.google.android.gms.internal.ads.zzesh):com.google.android.gms.internal.ads.zzesf");
    }

    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 38;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzesh.zzc(zzesh.this);
            }
        });
    }
}
