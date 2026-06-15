package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.ironsource.dp;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfg {

    /* renamed from: a  reason: collision with root package name */
    final zzfy f13522a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfg(zzkz zzkzVar) {
        this.f13522a = zzkzVar.X();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final boolean a() {
        try {
            PackageManagerWrapper a10 = Wrappers.a(this.f13522a.zzau());
            if (a10 != null) {
                return a10.f(dp.f17077b, 128).versionCode >= 80837300;
            }
            this.f13522a.zzay().q().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e8) {
            this.f13522a.zzay().q().b("Failed to retrieve Play Store version for Install Referrer", e8);
            return false;
        }
    }
}
