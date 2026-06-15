package com.google.android.gms.internal.measurement;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzx extends zzai {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzx(zzy zzyVar, String str) {
        super(MobileAdsBridge.versionMethodName);
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        return new zzah(Double.valueOf(0.0d));
    }
}
