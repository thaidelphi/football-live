package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzid;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    private final zzfy f12825a;

    /* renamed from: b  reason: collision with root package name */
    private final zzid f12826b;

    public a(zzfy zzfyVar) {
        super(null);
        Preconditions.m(zzfyVar);
        this.f12825a = zzfyVar;
        this.f12826b = zzfyVar.D();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void a(String str, String str2, Bundle bundle) {
        this.f12826b.m(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final List b(String str, String str2) {
        return this.f12826b.U(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final Map c(String str, String str2, boolean z10) {
        return this.f12826b.V(str, str2, z10);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void d(Bundle bundle) {
        this.f12826b.y(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void e(String str, String str2, Bundle bundle) {
        this.f12825a.D().j(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final int zza(String str) {
        this.f12826b.L(str);
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final long zzb() {
        return this.f12825a.I().m0();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzh() {
        return this.f12826b.Q();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzi() {
        return this.f12826b.R();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzj() {
        return this.f12826b.S();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzk() {
        return this.f12826b.Q();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzp(String str) {
        this.f12825a.t().g(str, this.f12825a.zzav().b());
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzr(String str) {
        this.f12825a.t().h(str, this.f12825a.zzav().b());
    }
}
