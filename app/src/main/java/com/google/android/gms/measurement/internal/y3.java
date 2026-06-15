package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzgc;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class y3 {

    /* renamed from: a  reason: collision with root package name */
    zzgc f13261a;

    /* renamed from: b  reason: collision with root package name */
    List f13262b;

    /* renamed from: c  reason: collision with root package name */
    List f13263c;

    /* renamed from: d  reason: collision with root package name */
    long f13264d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzkz f13265e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ y3(zzkz zzkzVar, zzkv zzkvVar) {
        this.f13265e = zzkzVar;
    }

    private static final long b(zzfs zzfsVar) {
        return ((zzfsVar.zzd() / 1000) / 60) / 60;
    }

    public final boolean a(long j10, zzfs zzfsVar) {
        Preconditions.m(zzfsVar);
        if (this.f13263c == null) {
            this.f13263c = new ArrayList();
        }
        if (this.f13262b == null) {
            this.f13262b = new ArrayList();
        }
        if (this.f13263c.isEmpty() || b((zzfs) this.f13263c.get(0)) == b(zzfsVar)) {
            long zzbw = this.f13264d + zzfsVar.zzbw();
            this.f13265e.P();
            if (zzbw >= Math.max(0, ((Integer) zzeb.f13422j.a(null)).intValue())) {
                return false;
            }
            this.f13264d = zzbw;
            this.f13263c.add(zzfsVar);
            this.f13262b.add(Long.valueOf(j10));
            int size = this.f13263c.size();
            this.f13265e.P();
            return size < Math.max(1, ((Integer) zzeb.f13424k.a(null)).intValue());
        }
        return false;
    }
}
