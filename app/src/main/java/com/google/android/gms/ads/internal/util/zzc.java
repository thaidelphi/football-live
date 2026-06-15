package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class zzc extends zzb {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11459a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzc(Context context) {
        this.f11459a = context;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        boolean z10;
        try {
            z10 = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.f11459a);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e8) {
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Fail to get isAdIdFakeForDebugLogging", e8);
            z10 = false;
        }
        com.google.android.gms.ads.internal.util.client.zzl.zzj(z10);
        int i11 = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Update ad debug logging enablement as " + z10);
    }
}
