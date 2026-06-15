package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzel;
import com.google.android.gms.internal.measurement.zzes;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzny;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class l4 extends k4 {

    /* renamed from: g  reason: collision with root package name */
    private final zzes f13071g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ b f13072h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(b bVar, String str, int i10, zzes zzesVar) {
        super(str, i10);
        this.f13072h = bVar;
        this.f13071g = zzesVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.k4
    public final int a() {
        return this.f13071g.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.k4
    public final boolean b() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.k4
    public final boolean c() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k(Long l10, Long l11, zzgl zzglVar, boolean z10) {
        zzny.zzc();
        boolean w10 = this.f13072h.f13220a.u().w(this.f13051a, zzeb.W);
        boolean zzg = this.f13071g.zzg();
        boolean zzh = this.f13071g.zzh();
        boolean zzi = this.f13071g.zzi();
        Object[] objArr = (zzg || zzh || zzi) ? 1 : null;
        Boolean bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z10 && objArr == null) {
            this.f13072h.f13220a.zzay().q().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f13052b), this.f13071g.zzj() ? Integer.valueOf(this.f13071g.zza()) : null);
            return true;
        }
        zzel zzb = this.f13071g.zzb();
        boolean zzg2 = zzb.zzg();
        if (zzglVar.zzr()) {
            if (!zzb.zzi()) {
                this.f13072h.f13220a.zzay().r().b("No number filter for long property. property", this.f13072h.f13220a.y().f(zzglVar.zzf()));
            } else {
                bool = k4.j(k4.h(zzglVar.zzb(), zzb.zzc()), zzg2);
            }
        } else if (zzglVar.zzq()) {
            if (!zzb.zzi()) {
                this.f13072h.f13220a.zzay().r().b("No number filter for double property. property", this.f13072h.f13220a.y().f(zzglVar.zzf()));
            } else {
                bool = k4.j(k4.g(zzglVar.zza(), zzb.zzc()), zzg2);
            }
        } else if (zzglVar.zzt()) {
            if (!zzb.zzk()) {
                if (!zzb.zzi()) {
                    this.f13072h.f13220a.zzay().r().b("No string or number filter defined. property", this.f13072h.f13220a.y().f(zzglVar.zzf()));
                } else if (zzlb.I(zzglVar.zzg())) {
                    bool = k4.j(k4.i(zzglVar.zzg(), zzb.zzc()), zzg2);
                } else {
                    this.f13072h.f13220a.zzay().r().c("Invalid user property value for Numeric number filter. property, value", this.f13072h.f13220a.y().f(zzglVar.zzf()), zzglVar.zzg());
                }
            } else {
                bool = k4.j(k4.f(zzglVar.zzg(), zzb.zzd(), this.f13072h.f13220a.zzay()), zzg2);
            }
        } else {
            this.f13072h.f13220a.zzay().r().b("User property has no value, property", this.f13072h.f13220a.y().f(zzglVar.zzf()));
        }
        this.f13072h.f13220a.zzay().q().b("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.f13053c = Boolean.TRUE;
        if (!zzi || bool.booleanValue()) {
            if (!z10 || this.f13071g.zzg()) {
                this.f13054d = bool;
            }
            if (bool.booleanValue() && objArr != null && zzglVar.zzs()) {
                long zzc = zzglVar.zzc();
                if (l10 != null) {
                    zzc = l10.longValue();
                }
                if (w10 && this.f13071g.zzg() && !this.f13071g.zzh() && l11 != null) {
                    zzc = l11.longValue();
                }
                if (this.f13071g.zzh()) {
                    this.f13056f = Long.valueOf(zzc);
                } else {
                    this.f13055e = Long.valueOf(zzc);
                }
            }
            return true;
        }
        return true;
    }
}
