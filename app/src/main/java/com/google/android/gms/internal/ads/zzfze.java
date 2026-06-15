package com.google.android.gms.internal.ads;

import com.ironsource.b9;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzfze extends zzgaf implements Runnable {
    public static final /* synthetic */ int zzd = 0;
    b6.a zza;
    Class zzb;
    Object zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfze(b6.a aVar, Class cls, Object obj) {
        Objects.requireNonNull(aVar);
        this.zza = aVar;
        this.zzb = cls;
        this.zzc = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            b6.a r0 = r9.zza
            java.lang.Class r1 = r9.zzb
            java.lang.Object r2 = r9.zzc
            r3 = 1
            r4 = 0
            if (r0 != 0) goto Lc
            r5 = r3
            goto Ld
        Lc:
            r5 = r4
        Ld:
            if (r1 != 0) goto L11
            r6 = r3
            goto L12
        L11:
            r6 = r4
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            goto L17
        L16:
            r3 = r4
        L17:
            r3 = r3 | r5
            if (r3 != 0) goto La5
            boolean r3 = r9.isCancelled()
            if (r3 == 0) goto L22
            goto La5
        L22:
            r3 = 0
            r9.zza = r3
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzgbt     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
            if (r4 == 0) goto L31
            r4 = r0
            com.google.android.gms.internal.ads.zzgbt r4 = (com.google.android.gms.internal.ads.zzgbt) r4     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
            java.lang.Throwable r4 = r4.zzl()     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
            goto L32
        L31:
            r4 = r3
        L32:
            if (r4 != 0) goto L3a
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzgap.zzp(r0)     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
            goto L78
        L39:
            r4 = move-exception
        L3a:
            r5 = r3
            goto L78
        L3c:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L76
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Future type "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = " threw "
            r7.append(r6)
            r7.append(r4)
            java.lang.String r4 = " without a cause"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r5.<init>(r4)
        L76:
            r4 = r5
            goto L3a
        L78:
            if (r4 != 0) goto L7e
            r9.zzc(r5)
            return
        L7e:
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto La2
            java.lang.Object r0 = r9.zze(r2, r4)     // Catch: java.lang.Throwable -> L90
            r9.zzb = r3
            r9.zzc = r3
            r9.zzf(r0)
            return
        L90:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzgbi.zza(r0)     // Catch: java.lang.Throwable -> L9c
            r9.zzd(r0)     // Catch: java.lang.Throwable -> L9c
            r9.zzb = r3
            r9.zzc = r3
            return
        L9c:
            r0 = move-exception
            r9.zzb = r3
            r9.zzc = r3
            throw r0
        La2:
            r9.zzs(r0)
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfze.run():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfzf
    public final String zza() {
        String str;
        b6.a aVar = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        String zza = super.zza();
        if (aVar != null) {
            str = "inputFuture=[" + aVar.toString() + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (zza != null) {
                return str.concat(zza);
            }
            return null;
        }
        return str + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + b9.i.f16698e;
    }

    @Override // com.google.android.gms.internal.ads.zzfzf
    protected final void zzb() {
        zzr(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    abstract Object zze(Object obj, Throwable th) throws Exception;

    abstract void zzf(Object obj);
}
