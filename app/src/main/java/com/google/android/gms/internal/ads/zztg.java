package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zztg extends zzsx {
    private final HashMap zza = new HashMap();
    private Handler zzb;
    private zzgr zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void zzA(Object obj, zzua zzuaVar, zzbn zzbnVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzB(final Object obj, zzua zzuaVar) {
        zzcv.zzd(!this.zza.containsKey(obj));
        zztz zztzVar = new zztz() { // from class: com.google.android.gms.internal.ads.zztd
            @Override // com.google.android.gms.internal.ads.zztz
            public final void zza(zzua zzuaVar2, zzbn zzbnVar) {
                zztg.this.zzA(obj, zzuaVar2, zzbnVar);
            }
        };
        zzte zzteVar = new zzte(this, obj);
        this.zza.put(obj, new zztf(zzuaVar, zztzVar, zzteVar));
        Handler handler = this.zzb;
        Objects.requireNonNull(handler);
        zzuaVar.zzh(handler, zzteVar);
        Handler handler2 = this.zzb;
        Objects.requireNonNull(handler2);
        zzuaVar.zzg(handler2, zzteVar);
        zzuaVar.zzm(zztzVar, this.zzc, zzb());
        if (zzu()) {
            return;
        }
        zzuaVar.zzi(zztzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsx
    protected final void zzj() {
        for (zztf zztfVar : this.zza.values()) {
            zztfVar.zza.zzi(zztfVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsx
    protected final void zzl() {
        for (zztf zztfVar : this.zza.values()) {
            zztfVar.zza.zzk(zztfVar.zzb);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsx
    public void zzn(zzgr zzgrVar) {
        this.zzc = zzgrVar;
        this.zzb = zzeh.zzy(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsx
    public void zzq() {
        for (zztf zztfVar : this.zza.values()) {
            zztfVar.zza.zzp(zztfVar.zzb);
            zztfVar.zza.zzs(zztfVar.zzc);
            zztfVar.zza.zzr(zztfVar.zzc);
        }
        this.zza.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int zzw(Object obj, int i10) {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long zzx(Object obj, long j10, zzty zztyVar) {
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public zzty zzy(Object obj, zzty zztyVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzua
    public void zzz() throws IOException {
        for (zztf zztfVar : this.zza.values()) {
            zztfVar.zza.zzz();
        }
    }
}
