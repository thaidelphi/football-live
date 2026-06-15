package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzawk extends zzaws {
    private final StackTraceElement[] zzh;

    public zzawk(zzavf zzavfVar, String str, String str2, zzarf zzarfVar, int i10, int i11, StackTraceElement[] stackTraceElementArr) {
        super(zzavfVar, "DRZosogAisEOArK1SbKuv10KbVGKzJ5DHp2JnkR+iImfs1q87b6G3b1Ooqruee6b", "2FHp0bJQtrPbapHMX5Elki045HOFEBY5oxw0JLn9yqA=", zzarfVar, i10, 45);
        this.zzh = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaws
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.zzh;
        if (stackTraceElementArr != null) {
            zzauw zzauwVar = new zzauw((String) this.zze.invoke(null, stackTraceElementArr));
            synchronized (this.zzd) {
                this.zzd.zzD(zzauwVar.zza.longValue());
                if (zzauwVar.zzb.booleanValue()) {
                    this.zzd.zzZ(true != zzauwVar.zzc.booleanValue() ? 2 : 1);
                } else {
                    this.zzd.zzZ(3);
                }
            }
        }
    }
}
