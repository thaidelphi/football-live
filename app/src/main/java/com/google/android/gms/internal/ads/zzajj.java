package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzajj implements zzadp {
    private final zzadp zza;
    private final zzaje zzb;
    private zzajg zzg;
    private zzz zzh;
    private int zzd = 0;
    private int zze = 0;
    private byte[] zzf = zzeh.zzf;
    private final zzdx zzc = new zzdx();

    public zzajj(zzadp zzadpVar, zzaje zzajeVar) {
        this.zza = zzadpVar;
        this.zzb = zzajeVar;
    }

    public static /* synthetic */ void zza(zzajj zzajjVar, long j10, int i10, zzaiy zzaiyVar) {
        zzcv.zzb(zzajjVar.zzh);
        zzfvv<zzcn> zzfvvVar = zzaiyVar.zza;
        long j11 = zzaiyVar.zzc;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzfvvVar.size());
        for (zzcn zzcnVar : zzfvvVar) {
            arrayList.add(zzcnVar.zza());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j11);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        zzdx zzdxVar = zzajjVar.zzc;
        int length = marshall.length;
        zzdxVar.zzJ(marshall, length);
        zzajjVar.zza.zzr(zzajjVar.zzc, length);
        long j12 = zzaiyVar.zzb;
        if (j12 == -9223372036854775807L) {
            zzcv.zzf(zzajjVar.zzh.zzt == Long.MAX_VALUE);
        } else {
            long j13 = zzajjVar.zzh.zzt;
            j10 = j13 == Long.MAX_VALUE ? j10 + j12 : j12 + j13;
        }
        zzajjVar.zza.zzt(j10, i10 | 1, length, 0, null);
    }

    private final void zzb(int i10) {
        int length = this.zzf.length;
        int i11 = this.zze;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.zzd;
        int max = Math.max(i12 + i12, i10 + i12);
        byte[] bArr = this.zzf;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.zzd, bArr2, 0, i12);
        this.zzd = 0;
        this.zze = i12;
        this.zzf = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final /* synthetic */ int zzf(zzl zzlVar, int i10, boolean z10) {
        return zzadn.zza(this, zzlVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final int zzg(zzl zzlVar, int i10, boolean z10, int i11) throws IOException {
        if (this.zzg == null) {
            return this.zza.zzg(zzlVar, i10, z10, 0);
        }
        zzb(i10);
        int zza = zzlVar.zza(this.zzf, this.zze, i10);
        if (zza != -1) {
            this.zze += zza;
            return zza;
        } else if (z10) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final /* synthetic */ void zzl(long j10) {
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zzm(zzz zzzVar) {
        String str = zzzVar.zzo;
        Objects.requireNonNull(str);
        zzcv.zzd(zzay.zzb(str) == 3);
        if (!zzzVar.equals(this.zzh)) {
            this.zzh = zzzVar;
            this.zzg = this.zzb.zzc(zzzVar) ? this.zzb.zzb(zzzVar) : null;
        }
        if (this.zzg == null) {
            this.zza.zzm(zzzVar);
            return;
        }
        zzadp zzadpVar = this.zza;
        zzx zzb = zzzVar.zzb();
        zzb.zzad("application/x-media3-cues");
        zzb.zzC(zzzVar.zzo);
        zzb.zzah(Long.MAX_VALUE);
        zzb.zzG(this.zzb.zza(zzzVar));
        zzadpVar.zzm(zzb.zzaj());
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final /* synthetic */ void zzr(zzdx zzdxVar, int i10) {
        zzadn.zzb(this, zzdxVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zzs(zzdx zzdxVar, int i10, int i11) {
        if (this.zzg == null) {
            this.zza.zzs(zzdxVar, i10, i11);
            return;
        }
        zzb(i10);
        zzdxVar.zzH(this.zzf, this.zze, i10);
        this.zze += i10;
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zzt(final long j10, final int i10, int i11, int i12, zzado zzadoVar) {
        if (this.zzg == null) {
            this.zza.zzt(j10, i10, i11, i12, zzadoVar);
            return;
        }
        zzcv.zze(zzadoVar == null, "DRM on subtitles is not supported");
        int i13 = (this.zze - i12) - i11;
        this.zzg.zza(this.zzf, i13, i11, zzajf.zza(), new zzda() { // from class: com.google.android.gms.internal.ads.zzaji
            @Override // com.google.android.gms.internal.ads.zzda
            public final void zza(Object obj) {
                zzajj.zza(zzajj.this, j10, i10, (zzaiy) obj);
            }
        });
        int i14 = i13 + i11;
        this.zzd = i14;
        if (i14 == this.zze) {
            this.zzd = 0;
            this.zze = 0;
        }
    }
}
