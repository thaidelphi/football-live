package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.a0;
import androidx.work.b;
import androidx.work.c;
import androidx.work.e;
import androidx.work.q;
import androidx.work.r;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class WorkManagerUtil extends zzbq {
    private static void Z(Context context) {
        try {
            a0.l(context.getApplicationContext(), new b.C0083b().a());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.t0(iObjectWrapper);
        Z(context);
        try {
            a0 j10 = a0.j(context);
            j10.c("offline_ping_sender_work");
            j10.e(new r.a(OfflinePingSender.class).e(new c.a().b(q.CONNECTED).a()).a("offline_ping_sender_work").b());
        } catch (IllegalStateException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to instantiate WorkManager.", e8);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(IObjectWrapper iObjectWrapper, String str, String str2) {
        return zzg(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Context context = (Context) ObjectWrapper.t0(iObjectWrapper);
        Z(context);
        c a10 = new c.a().b(q.CONNECTED).a();
        try {
            a0.j(context).e(new r.a(OfflineNotificationPoster.class).e(a10).g(new e.a().f("uri", zzaVar.zza).f("gws_query_id", zzaVar.zzb).f("image_url", zzaVar.zzc).a()).a("offline_notification_work").b());
            return true;
        } catch (IllegalStateException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to instantiate WorkManager.", e8);
            return false;
        }
    }
}
