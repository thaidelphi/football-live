package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzaol;
import com.google.android.gms.internal.ads.zzaop;
import com.google.android.gms.internal.ads.zzaov;
import com.google.android.gms.internal.ads.zzapm;
import com.google.android.gms.internal.ads.zzbyu;
import com.ironsource.in;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzbm extends zzaop {

    /* renamed from: a  reason: collision with root package name */
    private final zzbyu f11443a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.android.gms.ads.internal.util.client.zzl f11444b;

    public zzbm(String str, Map map, zzbyu zzbyuVar) {
        super(0, str, new zzbl(zzbyuVar));
        this.f11443a = zzbyuVar;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        this.f11444b = zzlVar;
        zzlVar.zzd(str, in.f17848a, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaop
    public final zzaov zzh(zzaol zzaolVar) {
        return zzaov.zzb(zzaolVar, zzapm.zzb(zzaolVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaop
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzaol zzaolVar = (zzaol) obj;
        this.f11444b.zzf(zzaolVar.zzc, zzaolVar.zza);
        byte[] bArr = zzaolVar.zzb;
        if (com.google.android.gms.ads.internal.util.client.zzl.zzk() && bArr != null) {
            this.f11444b.zzh(bArr);
        }
        this.f11443a.zzc(zzaolVar);
    }
}
