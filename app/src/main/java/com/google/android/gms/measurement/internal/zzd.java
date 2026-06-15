package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzd extends o {

    /* renamed from: b  reason: collision with root package name */
    private final Map f13370b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f13371c;

    /* renamed from: d  reason: collision with root package name */
    private long f13372d;

    public zzd(zzfy zzfyVar) {
        super(zzfyVar);
        this.f13371c = new androidx.collection.a();
        this.f13370b = new androidx.collection.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void d(zzd zzdVar, String str, long j10) {
        zzdVar.c();
        Preconditions.g(str);
        if (zzdVar.f13371c.isEmpty()) {
            zzdVar.f13372d = j10;
        }
        Integer num = (Integer) zzdVar.f13371c.get(str);
        if (num != null) {
            zzdVar.f13371c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (zzdVar.f13371c.size() >= 100) {
            zzdVar.f13220a.zzay().r().a("Too many ads visible");
        } else {
            zzdVar.f13371c.put(str, 1);
            zzdVar.f13370b.put(str, Long.valueOf(j10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void e(zzd zzdVar, String str, long j10) {
        zzdVar.c();
        Preconditions.g(str);
        Integer num = (Integer) zzdVar.f13371c.get(str);
        if (num != null) {
            zzik n10 = zzdVar.f13220a.F().n(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                zzdVar.f13371c.remove(str);
                Long l10 = (Long) zzdVar.f13370b.get(str);
                if (l10 == null) {
                    zzdVar.f13220a.zzay().m().a("First ad unit exposure time was never set");
                } else {
                    long longValue = l10.longValue();
                    zzdVar.f13370b.remove(str);
                    zzdVar.k(str, j10 - longValue, n10);
                }
                if (zzdVar.f13371c.isEmpty()) {
                    long j11 = zzdVar.f13372d;
                    if (j11 == 0) {
                        zzdVar.f13220a.zzay().m().a("First ad exposure time was never set");
                        return;
                    }
                    zzdVar.j(j10 - j11, n10);
                    zzdVar.f13372d = 0L;
                    return;
                }
                return;
            }
            zzdVar.f13371c.put(str, Integer.valueOf(intValue));
            return;
        }
        zzdVar.f13220a.zzay().m().b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    private final void j(long j10, zzik zzikVar) {
        if (zzikVar == null) {
            this.f13220a.zzay().q().a("Not logging ad exposure. No active activity");
        } else if (j10 < 1000) {
            this.f13220a.zzay().q().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j10);
            zzlh.t(zzikVar, bundle, true);
            this.f13220a.D().p("am", "_xa", bundle);
        }
    }

    private final void k(String str, long j10, zzik zzikVar) {
        if (zzikVar == null) {
            this.f13220a.zzay().q().a("Not logging ad unit exposure. No active activity");
        } else if (j10 < 1000) {
            this.f13220a.zzay().q().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j10);
            zzlh.t(zzikVar, bundle, true);
            this.f13220a.D().p("am", "_xu", bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(long j10) {
        for (String str : this.f13370b.keySet()) {
            this.f13370b.put(str, Long.valueOf(j10));
        }
        if (this.f13370b.isEmpty()) {
            return;
        }
        this.f13372d = j10;
    }

    public final void g(String str, long j10) {
        if (str != null && str.length() != 0) {
            this.f13220a.zzaz().u(new a(this, str, j10));
        } else {
            this.f13220a.zzay().m().a("Ad unit id must be a non-empty string");
        }
    }

    public final void h(String str, long j10) {
        if (str != null && str.length() != 0) {
            this.f13220a.zzaz().u(new k(this, str, j10));
        } else {
            this.f13220a.zzay().m().a("Ad unit id must be a non-empty string");
        }
    }

    public final void i(long j10) {
        zzik n10 = this.f13220a.F().n(false);
        for (String str : this.f13370b.keySet()) {
            k(str, j10 - ((Long) this.f13370b.get(str)).longValue(), n10);
        }
        if (!this.f13370b.isEmpty()) {
            j(j10 - this.f13372d, n10);
        }
        l(j10);
    }
}
