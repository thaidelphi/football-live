package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzgvz {
    private static final zzgvz zzb = new zzgvz(true);
    final zzgyw zza = new zzgyr();
    private boolean zzc;
    private boolean zzd;

    private zzgvz() {
    }

    static int zza(zzgzn zzgznVar, int i10, Object obj) {
        int zzD = zzgvp.zzD(i10 << 3);
        if (zzgznVar == zzgzn.zzj) {
            zzgxv zzgxvVar = (zzgxv) obj;
            byte[] bArr = zzgwx.zzb;
            if (zzgxvVar instanceof zzgum) {
                zzgum zzgumVar = (zzgum) zzgxvVar;
                throw null;
            }
            zzD += zzD;
        }
        return zzD + zzb(zzgznVar, obj);
    }

    static int zzb(zzgzn zzgznVar, Object obj) {
        int zzd;
        int zzD;
        zzgzn zzgznVar2 = zzgzn.zza;
        zzgzo zzgzoVar = zzgzo.INT;
        switch (zzgznVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                int i10 = zzgvp.zzf;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                int i11 = zzgvp.zzf;
                return 4;
            case 2:
                return zzgvp.zzE(((Long) obj).longValue());
            case 3:
                return zzgvp.zzE(((Long) obj).longValue());
            case 4:
                return zzgvp.zzE(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                int i12 = zzgvp.zzf;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                int i13 = zzgvp.zzf;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                int i14 = zzgvp.zzf;
                return 1;
            case 8:
                if (obj instanceof zzgvc) {
                    int i15 = zzgvp.zzf;
                    zzd = ((zzgvc) obj).zzd();
                    zzD = zzgvp.zzD(zzd);
                    break;
                } else {
                    return zzgvp.zzC((String) obj);
                }
            case 9:
                int i16 = zzgvp.zzf;
                return ((zzgxv) obj).zzaY();
            case 10:
                if (obj instanceof zzgxf) {
                    int i17 = zzgvp.zzf;
                    zzd = ((zzgxf) obj).zza();
                    zzD = zzgvp.zzD(zzd);
                    break;
                } else {
                    return zzgvp.zzz((zzgxv) obj);
                }
            case 11:
                if (obj instanceof zzgvc) {
                    int i18 = zzgvp.zzf;
                    zzd = ((zzgvc) obj).zzd();
                    zzD = zzgvp.zzD(zzd);
                    break;
                } else {
                    int i19 = zzgvp.zzf;
                    zzd = ((byte[]) obj).length;
                    zzD = zzgvp.zzD(zzd);
                    break;
                }
            case 12:
                return zzgvp.zzD(((Integer) obj).intValue());
            case 13:
                if (obj instanceof zzgwo) {
                    return zzgvp.zzE(((zzgwo) obj).zza());
                }
                return zzgvp.zzE(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                int i20 = zzgvp.zzf;
                return 4;
            case 15:
                ((Long) obj).longValue();
                int i21 = zzgvp.zzf;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return zzgvp.zzD((intValue >> 31) ^ (intValue + intValue));
            case 17:
                long longValue = ((Long) obj).longValue();
                return zzgvp.zzE((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return zzD + zzd;
    }

    public static int zzc(zzgvy zzgvyVar, Object obj) {
        zzgzn zzb2 = zzgvyVar.zzb();
        int zza = zzgvyVar.zza();
        if (zzgvyVar.zze()) {
            List list = (List) obj;
            int size = list.size();
            int i10 = 0;
            if (!zzgvyVar.zzd()) {
                int i11 = 0;
                while (i10 < size) {
                    i11 += zza(zzb2, zza, list.get(i10));
                    i10++;
                }
                return i11;
            } else if (list.isEmpty()) {
                return 0;
            } else {
                int i12 = 0;
                while (i10 < size) {
                    i12 += zzb(zzb2, list.get(i10));
                    i10++;
                }
                return zzgvp.zzD(zza << 3) + i12 + zzgvp.zzD(i12);
            }
        }
        return zza(zzb2, zza, obj);
    }

    public static zzgvz zze() {
        return zzb;
    }

    private static boolean zzj(Map.Entry entry) {
        zzgvy zzgvyVar = (zzgvy) entry.getKey();
        if (zzgvyVar.zzc() == zzgzo.MESSAGE) {
            if (zzgvyVar.zze()) {
                List list = (List) entry.getValue();
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (!zzk(list.get(i10))) {
                        return false;
                    }
                }
                return true;
            }
            return zzk(entry.getValue());
        }
        return true;
    }

    private static boolean zzk(Object obj) {
        if (obj instanceof zzgxw) {
            return ((zzgxw) obj).zzbw();
        }
        if (obj instanceof zzgxf) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzl(Map.Entry entry) {
        int i10;
        int zzD;
        int zzD2;
        zzgvy zzgvyVar = (zzgvy) entry.getKey();
        Object value = entry.getValue();
        if (zzgvyVar.zzc() != zzgzo.MESSAGE || zzgvyVar.zze() || zzgvyVar.zzd()) {
            return zzc(zzgvyVar, value);
        }
        if (value instanceof zzgxf) {
            int zza = ((zzgvy) entry.getKey()).zza();
            int zzD3 = zzgvp.zzD(8);
            i10 = zzD3 + zzD3;
            zzD = zzgvp.zzD(16) + zzgvp.zzD(zza);
            int zzD4 = zzgvp.zzD(24);
            int zza2 = ((zzgxf) value).zza();
            zzD2 = zzD4 + zzgvp.zzD(zza2) + zza2;
        } else {
            int zza3 = ((zzgvy) entry.getKey()).zza();
            int zzD5 = zzgvp.zzD(8);
            i10 = zzD5 + zzD5;
            zzD = zzgvp.zzD(16) + zzgvp.zzD(zza3);
            zzD2 = zzgvp.zzD(24) + zzgvp.zzz((zzgxv) value);
        }
        return i10 + zzD + zzD2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void zzm(com.google.android.gms.internal.ads.zzgvy r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.ads.zzgzn r0 = r4.zzb()
            byte[] r1 = com.google.android.gms.internal.ads.zzgwx.zzb
            java.util.Objects.requireNonNull(r5)
            com.google.android.gms.internal.ads.zzgzn r1 = com.google.android.gms.internal.ads.zzgzn.zza
            com.google.android.gms.internal.ads.zzgzo r1 = com.google.android.gms.internal.ads.zzgzo.INT
            com.google.android.gms.internal.ads.zzgzo r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L43;
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L2b;
                case 7: goto L22;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L48
        L19:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzgxv
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzgxf
            if (r0 == 0) goto L48
            goto L47
        L22:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzgwo
            if (r0 == 0) goto L48
            goto L47
        L2b:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzgvc
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L48
            goto L47
        L34:
            boolean r0 = r5 instanceof java.lang.String
            goto L45
        L37:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L45
        L3a:
            boolean r0 = r5 instanceof java.lang.Double
            goto L45
        L3d:
            boolean r0 = r5 instanceof java.lang.Float
            goto L45
        L40:
            boolean r0 = r5 instanceof java.lang.Long
            goto L45
        L43:
            boolean r0 = r5 instanceof java.lang.Integer
        L45:
            if (r0 == 0) goto L48
        L47:
            return
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            com.google.android.gms.internal.ads.zzgzn r4 = r4.zzb()
            com.google.android.gms.internal.ads.zzgzo r4 = r4.zza()
            r1[r2] = r4
            r4 = 2
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r1[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgvz.zzm(com.google.android.gms.internal.ads.zzgvy, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzgvz zzgvzVar = new zzgvz();
        int zzc = this.zza.zzc();
        for (int i10 = 0; i10 < zzc; i10++) {
            Map.Entry zzg = this.zza.zzg(i10);
            zzgvzVar.zzh((zzgvy) ((zzgys) zzg).zza(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzd()) {
            zzgvzVar.zzh((zzgvy) entry.getKey(), entry.getValue());
        }
        zzgvzVar.zzd = this.zzd;
        return zzgvzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgvz) {
            return this.zza.equals(((zzgvz) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzd() {
        int zzc = this.zza.zzc();
        int i10 = 0;
        for (int i11 = 0; i11 < zzc; i11++) {
            i10 += zzl(this.zza.zzg(i11));
        }
        for (Map.Entry entry : this.zza.zzd()) {
            i10 += zzl(entry);
        }
        return i10;
    }

    public final Iterator zzf() {
        if (this.zza.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (this.zzd) {
            return new zzgxd(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        int zzc = this.zza.zzc();
        for (int i10 = 0; i10 < zzc; i10++) {
            Object value = this.zza.zzg(i10).getValue();
            if (value instanceof zzgwk) {
                ((zzgwk) value).zzbU();
            }
        }
        for (Map.Entry entry : this.zza.zzd()) {
            Object value2 = entry.getValue();
            if (value2 instanceof zzgwk) {
                ((zzgwk) value2).zzbU();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzgvy zzgvyVar, Object obj) {
        if (zzgvyVar.zze()) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj2 = list.get(i10);
                    zzm(zzgvyVar, obj2);
                    arrayList.add(obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            zzm(zzgvyVar, obj);
        }
        if (obj instanceof zzgxf) {
            this.zzd = true;
        }
        this.zza.put(zzgvyVar, obj);
    }

    public final boolean zzi() {
        int zzc = this.zza.zzc();
        for (int i10 = 0; i10 < zzc; i10++) {
            if (!zzj(this.zza.zzg(i10))) {
                return false;
            }
        }
        for (Map.Entry entry : this.zza.zzd()) {
            if (!zzj(entry)) {
                return false;
            }
        }
        return true;
    }

    private zzgvz(boolean z10) {
        zzg();
        zzg();
    }
}
