package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzie;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    private final zzie f12828a;

    public b(zzie zzieVar) {
        super(null);
        Preconditions.m(zzieVar);
        this.f12828a = zzieVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void a(String str, String str2, Bundle bundle) {
        this.f12828a.a(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final List b(String str, String str2) {
        return this.f12828a.b(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final Map c(String str, String str2, boolean z10) {
        return this.f12828a.c(str, str2, z10);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void d(Bundle bundle) {
        this.f12828a.d(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void e(String str, String str2, Bundle bundle) {
        this.f12828a.e(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final int zza(String str) {
        return this.f12828a.zza(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final long zzb() {
        return this.f12828a.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzh() {
        return this.f12828a.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzi() {
        return this.f12828a.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzj() {
        return this.f12828a.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzk() {
        return this.f12828a.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzp(String str) {
        this.f12828a.zzp(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzr(String str) {
        this.f12828a.zzr(str);
    }
}
