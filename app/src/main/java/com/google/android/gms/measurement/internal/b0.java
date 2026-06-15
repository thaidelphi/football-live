package com.google.android.gms.measurement.internal;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class b0 implements com.google.android.gms.internal.measurement.zzr {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzfp f12875a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(zzfp zzfpVar) {
        this.f12875a = zzfpVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i10, String str, List list, boolean z10, boolean z11) {
        zzem l10;
        int i11 = i10 - 1;
        if (i11 == 0) {
            l10 = this.f12875a.f13220a.zzay().l();
        } else if (i11 != 1) {
            if (i11 == 3) {
                l10 = this.f12875a.f13220a.zzay().q();
            } else if (i11 != 4) {
                l10 = this.f12875a.f13220a.zzay().p();
            } else if (z10) {
                l10 = this.f12875a.f13220a.zzay().t();
            } else if (!z11) {
                l10 = this.f12875a.f13220a.zzay().s();
            } else {
                l10 = this.f12875a.f13220a.zzay().r();
            }
        } else if (z10) {
            l10 = this.f12875a.f13220a.zzay().o();
        } else if (!z11) {
            l10 = this.f12875a.f13220a.zzay().n();
        } else {
            l10 = this.f12875a.f13220a.zzay().m();
        }
        int size = list.size();
        if (size == 1) {
            l10.b(str, list.get(0));
        } else if (size == 2) {
            l10.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            l10.a(str);
        } else {
            l10.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
