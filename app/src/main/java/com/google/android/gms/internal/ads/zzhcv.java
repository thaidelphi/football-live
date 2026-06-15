package com.google.android.gms.internal.ads;

import com.ironsource.b9;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zzhcv implements Iterator, Closeable, zzaqd {
    private static final zzaqc zza = new zzhcu("eof ");
    protected zzapz zzb;
    protected zzhcw zzc;
    zzaqc zzd = null;
    long zze = 0;
    long zzf = 0;
    private final List zzg = new ArrayList();

    static {
        zzhdc.zzb(zzhcv.class);
    }

    public void close() throws IOException {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzaqc zzaqcVar = this.zzd;
        if (zzaqcVar == zza) {
            return false;
        }
        if (zzaqcVar != null) {
            return true;
        }
        try {
            this.zzd = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zzd = zza;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(b9.i.f16696d);
        for (int i10 = 0; i10 < this.zzg.size(); i10++) {
            if (i10 > 0) {
                sb.append(";");
            }
            sb.append(((zzaqc) this.zzg.get(i10)).toString());
        }
        sb.append(b9.i.f16698e);
        return sb.toString();
    }

    @Override // java.util.Iterator
    /* renamed from: zzc */
    public final zzaqc next() {
        zzaqc zzb;
        zzaqc zzaqcVar = this.zzd;
        if (zzaqcVar != null && zzaqcVar != zza) {
            this.zzd = null;
            return zzaqcVar;
        }
        zzhcw zzhcwVar = this.zzc;
        if (zzhcwVar != null && this.zze < this.zzf) {
            try {
                synchronized (zzhcwVar) {
                    this.zzc.zze(this.zze);
                    zzb = this.zzb.zzb(this.zzc, this);
                    this.zze = this.zzc.zzb();
                }
                return zzb;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        }
        this.zzd = zza;
        throw new NoSuchElementException();
    }

    public final List zzd() {
        return (this.zzc == null || this.zzd == zza) ? this.zzg : new zzhdb(this.zzg, this);
    }

    public final void zze(zzhcw zzhcwVar, long j10, zzapz zzapzVar) throws IOException {
        this.zzc = zzhcwVar;
        this.zze = zzhcwVar.zzb();
        zzhcwVar.zze(zzhcwVar.zzb() + j10);
        this.zzf = zzhcwVar.zzb();
        this.zzb = zzapzVar;
    }
}
