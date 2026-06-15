package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.browser.customtabs.b;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzbck extends b {
    final /* synthetic */ zzbcl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbck(zzbcl zzbclVar) {
        this.zza = zzbclVar;
    }

    @Override // androidx.browser.customtabs.b
    public final void onNavigationEvent(int i10, Bundle bundle) {
        this.zza.zze(i10);
    }
}
