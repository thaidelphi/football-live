package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfh {
    private final zzfg zza;
    private final ArrayDeque zzb = new ArrayDeque();
    private final ArrayDeque zzc = new ArrayDeque();
    private final PriorityQueue zzd = new PriorityQueue();
    private int zze = -1;
    private zzff zzf;

    public zzfh(zzfg zzfgVar) {
        this.zza = zzfgVar;
    }

    private final void zzf(int i10) {
        while (this.zzd.size() > i10) {
            zzff zzffVar = (zzff) this.zzd.poll();
            int i11 = zzeh.zza;
            for (int i12 = 0; i12 < zzffVar.zza.size(); i12++) {
                this.zza.zza(zzffVar.zzb, (zzdx) zzffVar.zza.get(i12));
                this.zzb.push((zzdx) zzffVar.zza.get(i12));
            }
            zzffVar.zza.clear();
            zzff zzffVar2 = this.zzf;
            if (zzffVar2 != null && zzffVar2.zzb == zzffVar.zzb) {
                this.zzf = null;
            }
            this.zzc.push(zzffVar);
        }
    }

    public final int zza() {
        return this.zze;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r7 < ((com.google.android.gms.internal.ads.zzff) r6.zzd.peek()).zzb) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(long r7, com.google.android.gms.internal.ads.zzdx r9) {
        /*
            r6 = this;
            int r0 = r6.zze
            if (r0 == 0) goto La7
            r1 = -1
            if (r0 == r1) goto L23
            java.util.PriorityQueue r0 = r6.zzd
            int r0 = r0.size()
            int r2 = r6.zze
            if (r0 < r2) goto L23
            java.util.PriorityQueue r0 = r6.zzd
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.zzff r0 = (com.google.android.gms.internal.ads.zzff) r0
            int r2 = com.google.android.gms.internal.ads.zzeh.zza
            long r2 = r0.zzb
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 >= 0) goto L23
            goto La7
        L23:
            java.util.ArrayDeque r0 = r6.zzb
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L31
            com.google.android.gms.internal.ads.zzdx r0 = new com.google.android.gms.internal.ads.zzdx
            r0.<init>()
            goto L39
        L31:
            java.util.ArrayDeque r0 = r6.zzb
            java.lang.Object r0 = r0.pop()
            com.google.android.gms.internal.ads.zzdx r0 = (com.google.android.gms.internal.ads.zzdx) r0
        L39:
            int r2 = r9.zzb()
            r0.zzI(r2)
            byte[] r2 = r9.zzN()
            int r9 = r9.zzd()
            byte[] r3 = r0.zzN()
            int r4 = r0.zzb()
            r5 = 0
            java.lang.System.arraycopy(r2, r9, r3, r5, r4)
            com.google.android.gms.internal.ads.zzff r9 = r6.zzf
            if (r9 == 0) goto L65
            long r2 = r9.zzb
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L5f
            goto L65
        L5f:
            java.util.List r7 = r9.zza
            r7.add(r0)
            return
        L65:
            java.util.ArrayDeque r9 = r6.zzc
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L73
            com.google.android.gms.internal.ads.zzff r9 = new com.google.android.gms.internal.ads.zzff
            r9.<init>()
            goto L7b
        L73:
            java.util.ArrayDeque r9 = r6.zzc
            java.lang.Object r9 = r9.pop()
            com.google.android.gms.internal.ads.zzff r9 = (com.google.android.gms.internal.ads.zzff) r9
        L7b:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L85
            r5 = 1
        L85:
            com.google.android.gms.internal.ads.zzcv.zzd(r5)
            java.util.List r2 = r9.zza
            boolean r2 = r2.isEmpty()
            com.google.android.gms.internal.ads.zzcv.zzf(r2)
            r9.zzb = r7
            java.util.List r7 = r9.zza
            r7.add(r0)
            java.util.PriorityQueue r7 = r6.zzd
            r7.add(r9)
            r6.zzf = r9
            int r7 = r6.zze
            if (r7 == r1) goto La6
            r6.zzf(r7)
        La6:
            return
        La7:
            com.google.android.gms.internal.ads.zzfg r0 = r6.zza
            r0.zza(r7, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfh.zzb(long, com.google.android.gms.internal.ads.zzdx):void");
    }

    public final void zzc() {
        this.zzd.clear();
    }

    public final void zzd() {
        zzf(0);
    }

    public final void zze(int i10) {
        zzcv.zzf(i10 >= 0);
        this.zze = i10;
        zzf(i10);
    }
}
