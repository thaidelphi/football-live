package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzel;
import com.google.android.gms.internal.measurement.zzeq;
import com.google.android.gms.internal.measurement.zzes;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzga;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgj;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzjq;
import com.google.android.gms.internal.measurement.zzlk;
import com.google.android.gms.internal.measurement.zzoz;
import com.ironsource.b9;
import com.ironsource.fe;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzlb extends r3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlb(zzkz zzkzVar) {
        super(zzkzVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List C(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean G(List list, int i10) {
        if (i10 < list.size() * 64) {
            return ((1 << (i10 % 64)) & ((Long) list.get(i10 / 64)).longValue()) != 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean I(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void K(zzfr zzfrVar, String str, Object obj) {
        List zzp = zzfrVar.zzp();
        int i10 = 0;
        while (true) {
            if (i10 >= zzp.size()) {
                i10 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.zzfw) zzp.get(i10)).zzg())) {
                break;
            } else {
                i10++;
            }
        }
        com.google.android.gms.internal.measurement.zzfv zze = com.google.android.gms.internal.measurement.zzfw.zze();
        zze.zzj(str);
        if (obj instanceof Long) {
            zze.zzi(((Long) obj).longValue());
        }
        if (i10 >= 0) {
            zzfrVar.zzj(i10, zze);
        } else {
            zzfrVar.zze(zze);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean h(zzaw zzawVar, zzq zzqVar) {
        Preconditions.m(zzawVar);
        Preconditions.m(zzqVar);
        return (TextUtils.isEmpty(zzqVar.f13721b) && TextUtils.isEmpty(zzqVar.f13736q)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final com.google.android.gms.internal.measurement.zzfw i(zzfs zzfsVar, String str) {
        for (com.google.android.gms.internal.measurement.zzfw zzfwVar : zzfsVar.zzi()) {
            if (zzfwVar.zzg().equals(str)) {
                return zzfwVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Object j(zzfs zzfsVar, String str) {
        com.google.android.gms.internal.measurement.zzfw i10 = i(zzfsVar, str);
        if (i10 != null) {
            if (i10.zzy()) {
                return i10.zzh();
            }
            if (i10.zzw()) {
                return Long.valueOf(i10.zzd());
            }
            if (i10.zzu()) {
                return Double.valueOf(i10.zza());
            }
            if (i10.zzc() > 0) {
                List<com.google.android.gms.internal.measurement.zzfw> zzi = i10.zzi();
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.zzfw zzfwVar : zzi) {
                    if (zzfwVar != null) {
                        Bundle bundle = new Bundle();
                        for (com.google.android.gms.internal.measurement.zzfw zzfwVar2 : zzfwVar.zzi()) {
                            if (zzfwVar2.zzy()) {
                                bundle.putString(zzfwVar2.zzg(), zzfwVar2.zzh());
                            } else if (zzfwVar2.zzw()) {
                                bundle.putLong(zzfwVar2.zzg(), zzfwVar2.zzd());
                            } else if (zzfwVar2.zzu()) {
                                bundle.putDouble(zzfwVar2.zzg(), zzfwVar2.zza());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
        return null;
    }

    private final void k(StringBuilder sb, int i10, List list) {
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzfw zzfwVar = (com.google.android.gms.internal.measurement.zzfw) it.next();
            if (zzfwVar != null) {
                m(sb, i11);
                sb.append("param {\n");
                p(sb, i11, "name", zzfwVar.zzx() ? this.f13220a.y().e(zzfwVar.zzg()) : null);
                p(sb, i11, "string_value", zzfwVar.zzy() ? zzfwVar.zzh() : null);
                p(sb, i11, "int_value", zzfwVar.zzw() ? Long.valueOf(zzfwVar.zzd()) : null);
                p(sb, i11, "double_value", zzfwVar.zzu() ? Double.valueOf(zzfwVar.zza()) : null);
                if (zzfwVar.zzc() > 0) {
                    k(sb, i11, zzfwVar.zzi());
                }
                m(sb, i11);
                sb.append("}\n");
            }
        }
    }

    private final void l(StringBuilder sb, int i10, zzel zzelVar) {
        String str;
        if (zzelVar == null) {
            return;
        }
        m(sb, i10);
        sb.append("filter {\n");
        if (zzelVar.zzh()) {
            p(sb, i10, "complement", Boolean.valueOf(zzelVar.zzg()));
        }
        if (zzelVar.zzj()) {
            p(sb, i10, "param_name", this.f13220a.y().e(zzelVar.zze()));
        }
        if (zzelVar.zzk()) {
            int i11 = i10 + 1;
            com.google.android.gms.internal.measurement.zzex zzd = zzelVar.zzd();
            if (zzd != null) {
                m(sb, i11);
                sb.append("string_filter {\n");
                if (zzd.zzi()) {
                    switch (zzd.zzj()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    p(sb, i11, "match_type", str);
                }
                if (zzd.zzh()) {
                    p(sb, i11, "expression", zzd.zzd());
                }
                if (zzd.zzg()) {
                    p(sb, i11, "case_sensitive", Boolean.valueOf(zzd.zzf()));
                }
                if (zzd.zza() > 0) {
                    m(sb, i11 + 1);
                    sb.append("expression_list {\n");
                    for (String str2 : zzd.zze()) {
                        m(sb, i11 + 2);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                m(sb, i11);
                sb.append("}\n");
            }
        }
        if (zzelVar.zzi()) {
            q(sb, i10 + 1, "number_filter", zzelVar.zzc());
        }
        m(sb, i10);
        sb.append("}\n");
    }

    private static final void m(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb.append("  ");
        }
    }

    private static final String n(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb = new StringBuilder();
        if (z10) {
            sb.append("Dynamic ");
        }
        if (z11) {
            sb.append("Sequence ");
        }
        if (z12) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    private static final void o(StringBuilder sb, int i10, String str, zzgh zzghVar) {
        if (zzghVar == null) {
            return;
        }
        m(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (zzghVar.zzb() != 0) {
            m(sb, 4);
            sb.append("results: ");
            int i11 = 0;
            for (Long l10 : zzghVar.zzk()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb.append(", ");
                }
                sb.append(l10);
                i11 = i12;
            }
            sb.append('\n');
        }
        if (zzghVar.zzd() != 0) {
            m(sb, 4);
            sb.append("status: ");
            int i13 = 0;
            for (Long l11 : zzghVar.zzn()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb.append(", ");
                }
                sb.append(l11);
                i13 = i14;
            }
            sb.append('\n');
        }
        if (zzghVar.zza() != 0) {
            m(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i15 = 0;
            for (com.google.android.gms.internal.measurement.zzfq zzfqVar : zzghVar.zzj()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb.append(", ");
                }
                sb.append(zzfqVar.zzh() ? Integer.valueOf(zzfqVar.zza()) : null);
                sb.append(":");
                sb.append(zzfqVar.zzg() ? Long.valueOf(zzfqVar.zzb()) : null);
                i15 = i16;
            }
            sb.append("}\n");
        }
        if (zzghVar.zzc() != 0) {
            m(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i17 = 0;
            for (zzgj zzgjVar : zzghVar.zzm()) {
                int i18 = i17 + 1;
                if (i17 != 0) {
                    sb.append(", ");
                }
                sb.append(zzgjVar.zzi() ? Integer.valueOf(zzgjVar.zzb()) : null);
                sb.append(": [");
                int i19 = 0;
                for (Long l12 : zzgjVar.zzf()) {
                    long longValue = l12.longValue();
                    int i20 = i19 + 1;
                    if (i19 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i19 = i20;
                }
                sb.append(b9.i.f16698e);
                i17 = i18;
            }
            sb.append("}\n");
        }
        m(sb, 3);
        sb.append("}\n");
    }

    private static final void p(StringBuilder sb, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m(sb, i10 + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    private static final void q(StringBuilder sb, int i10, String str, zzeq zzeqVar) {
        if (zzeqVar == null) {
            return;
        }
        m(sb, i10);
        sb.append(str);
        sb.append(" {\n");
        if (zzeqVar.zzg()) {
            int zzm = zzeqVar.zzm();
            p(sb, i10, "comparison_type", zzm != 1 ? zzm != 2 ? zzm != 3 ? zzm != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (zzeqVar.zzi()) {
            p(sb, i10, "match_as_float", Boolean.valueOf(zzeqVar.zzf()));
        }
        if (zzeqVar.zzh()) {
            p(sb, i10, "comparison_value", zzeqVar.zzc());
        }
        if (zzeqVar.zzk()) {
            p(sb, i10, "min_comparison_value", zzeqVar.zze());
        }
        if (zzeqVar.zzj()) {
            p(sb, i10, "max_comparison_value", zzeqVar.zzd());
        }
        m(sb, i10);
        sb.append("}\n");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(zzgb zzgbVar, String str) {
        if (zzgbVar != null) {
            for (int i10 = 0; i10 < zzgbVar.zzb(); i10++) {
                if (str.equals(zzgbVar.zzao(i10).zzf())) {
                    return i10;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzlk x(zzlk zzlkVar, byte[] bArr) throws com.google.android.gms.internal.measurement.zzko {
        zzjq zza = zzjq.zza();
        if (zza != null) {
            return zzlkVar.zzaA(bArr, zza);
        }
        return zzlkVar.zzaz(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String A(zzes zzesVar) {
        if (zzesVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (zzesVar.zzj()) {
            p(sb, 0, "filter_id", Integer.valueOf(zzesVar.zza()));
        }
        p(sb, 0, "property_name", this.f13220a.y().f(zzesVar.zze()));
        String n10 = n(zzesVar.zzg(), zzesVar.zzh(), zzesVar.zzi());
        if (!n10.isEmpty()) {
            p(sb, 0, "filter_type", n10);
        }
        l(sb, 1, zzesVar.zzb());
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List B(List list, List list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f13220a.zzay().r().b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f13220a.zzay().r().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r4 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r7 >= r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        r5.add(D((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        if ((r3 instanceof java.util.ArrayList) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r7 >= r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
        r5.add(D((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
        if ((r3 instanceof android.os.Bundle) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        r5.add(D((android.os.Bundle) r3, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
        r0.put(r2, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map D(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r12 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = r6
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.D(r8, r6)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = r6
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.D(r8, r6)
            r5.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.D(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlb.D(android.os.Bundle, boolean):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void E(com.google.android.gms.internal.measurement.zzfv zzfvVar, Object obj) {
        Bundle[] bundleArr;
        Preconditions.m(obj);
        zzfvVar.zzg();
        zzfvVar.zze();
        zzfvVar.zzd();
        zzfvVar.zzf();
        if (obj instanceof String) {
            zzfvVar.zzk((String) obj);
        } else if (obj instanceof Long) {
            zzfvVar.zzi(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzfvVar.zzh(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    com.google.android.gms.internal.measurement.zzfv zze = com.google.android.gms.internal.measurement.zzfw.zze();
                    for (String str : bundle.keySet()) {
                        com.google.android.gms.internal.measurement.zzfv zze2 = com.google.android.gms.internal.measurement.zzfw.zze();
                        zze2.zzj(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            zze2.zzi(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            zze2.zzk((String) obj2);
                        } else if (obj2 instanceof Double) {
                            zze2.zzh(((Double) obj2).doubleValue());
                        }
                        zze.zzc(zze2);
                    }
                    if (zze.zza() > 0) {
                        arrayList.add((com.google.android.gms.internal.measurement.zzfw) zze.zzaE());
                    }
                }
            }
            zzfvVar.zzb(arrayList);
        } else {
            this.f13220a.zzay().m().b("Ignoring invalid (type) event param value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F(zzgk zzgkVar, Object obj) {
        Preconditions.m(obj);
        zzgkVar.zzc();
        zzgkVar.zzb();
        zzgkVar.zza();
        if (obj instanceof String) {
            zzgkVar.zzh((String) obj);
        } else if (obj instanceof Long) {
            zzgkVar.zze(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzgkVar.zzd(((Double) obj).doubleValue());
        } else {
            this.f13220a.zzay().m().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean H(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(this.f13220a.zzav().a() - j10) > j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] J(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e8) {
            this.f13220a.zzay().m().b("Failed to gzip content", e8);
            throw e8;
        }
    }

    @Override // com.google.android.gms.measurement.internal.r3
    protected final boolean g() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long s(byte[] bArr) {
        Preconditions.m(bArr);
        this.f13220a.I().c();
        MessageDigest o10 = zzlh.o();
        if (o10 == null) {
            this.f13220a.zzay().m().a("Failed to get MD5");
            return 0L;
        }
        return zzlh.l0(o10.digest(bArr));
    }

    final Bundle t(Map map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(t((Map) arrayList.get(i10), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Parcelable u(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            this.f13220a.zzay().m().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzaw v(zzaa zzaaVar) {
        Object obj;
        Bundle t10 = t(zzaaVar.zze(), true);
        String obj2 = (!t10.containsKey("_o") || (obj = t10.get("_o")) == null) ? "app" : obj.toString();
        String b10 = zzgv.b(zzaaVar.zzd());
        if (b10 == null) {
            b10 = zzaaVar.zzd();
        }
        return new zzaw(b10, new zzau(t10), obj2, zzaaVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfs w(zzar zzarVar) {
        zzfr zze = zzfs.zze();
        zze.zzl(zzarVar.f13309e);
        j jVar = new j(zzarVar.f13310f);
        while (jVar.hasNext()) {
            String next = jVar.next();
            com.google.android.gms.internal.measurement.zzfv zze2 = com.google.android.gms.internal.measurement.zzfw.zze();
            zze2.zzj(next);
            Object z02 = zzarVar.f13310f.z0(next);
            Preconditions.m(z02);
            E(zze2, z02);
            zze.zze(zze2);
        }
        return (zzfs) zze.zzaE();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String y(zzga zzgaVar) {
        if (zzgaVar == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (zzgc zzgcVar : zzgaVar.zzd()) {
            if (zzgcVar != null) {
                m(sb, 1);
                sb.append("bundle {\n");
                if (zzgcVar.zzbj()) {
                    p(sb, 1, "protocol_version", Integer.valueOf(zzgcVar.zzd()));
                }
                zzoz.zzc();
                if (this.f13220a.u().w(null, zzeb.f13443t0) && zzgcVar.zzbm()) {
                    p(sb, 1, "session_stitching_token", zzgcVar.zzK());
                }
                p(sb, 1, fe.G, zzgcVar.zzI());
                if (zzgcVar.zzbf()) {
                    p(sb, 1, "gmp_version", Long.valueOf(zzgcVar.zzm()));
                }
                if (zzgcVar.zzbq()) {
                    p(sb, 1, "uploading_gmp_version", Long.valueOf(zzgcVar.zzr()));
                }
                if (zzgcVar.zzbd()) {
                    p(sb, 1, "dynamite_version", Long.valueOf(zzgcVar.zzj()));
                }
                if (zzgcVar.zzba()) {
                    p(sb, 1, "config_version", Long.valueOf(zzgcVar.zzh()));
                }
                p(sb, 1, "gmp_app_id", zzgcVar.zzF());
                p(sb, 1, "admob_app_id", zzgcVar.zzw());
                p(sb, 1, "app_id", zzgcVar.zzx());
                p(sb, 1, "app_version", zzgcVar.zzA());
                if (zzgcVar.zzaY()) {
                    p(sb, 1, "app_version_major", Integer.valueOf(zzgcVar.zza()));
                }
                p(sb, 1, "firebase_instance_id", zzgcVar.zzE());
                if (zzgcVar.zzbc()) {
                    p(sb, 1, "dev_cert_hash", Long.valueOf(zzgcVar.zzi()));
                }
                p(sb, 1, "app_store", zzgcVar.zzz());
                if (zzgcVar.zzbp()) {
                    p(sb, 1, "upload_timestamp_millis", Long.valueOf(zzgcVar.zzq()));
                }
                if (zzgcVar.zzbn()) {
                    p(sb, 1, "start_timestamp_millis", Long.valueOf(zzgcVar.zzp()));
                }
                if (zzgcVar.zzbe()) {
                    p(sb, 1, "end_timestamp_millis", Long.valueOf(zzgcVar.zzk()));
                }
                if (zzgcVar.zzbi()) {
                    p(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzgcVar.zzo()));
                }
                if (zzgcVar.zzbh()) {
                    p(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzgcVar.zzn()));
                }
                p(sb, 1, "app_instance_id", zzgcVar.zzy());
                p(sb, 1, "resettable_device_id", zzgcVar.zzJ());
                p(sb, 1, "ds_id", zzgcVar.zzD());
                if (zzgcVar.zzbg()) {
                    p(sb, 1, "limited_ad_tracking", Boolean.valueOf(zzgcVar.zzaW()));
                }
                p(sb, 1, "os_version", zzgcVar.zzH());
                p(sb, 1, "device_model", zzgcVar.zzC());
                p(sb, 1, "user_default_language", zzgcVar.zzL());
                if (zzgcVar.zzbo()) {
                    p(sb, 1, "time_zone_offset_minutes", Integer.valueOf(zzgcVar.zzf()));
                }
                if (zzgcVar.zzaZ()) {
                    p(sb, 1, "bundle_sequential_index", Integer.valueOf(zzgcVar.zzb()));
                }
                if (zzgcVar.zzbl()) {
                    p(sb, 1, "service_upload", Boolean.valueOf(zzgcVar.zzaX()));
                }
                p(sb, 1, "health_monitor", zzgcVar.zzG());
                if (zzgcVar.zzbk()) {
                    p(sb, 1, "retry_counter", Integer.valueOf(zzgcVar.zze()));
                }
                if (zzgcVar.zzbb()) {
                    p(sb, 1, "consent_signals", zzgcVar.zzB());
                }
                List<zzgl> zzO = zzgcVar.zzO();
                if (zzO != null) {
                    for (zzgl zzglVar : zzO) {
                        if (zzglVar != null) {
                            m(sb, 2);
                            sb.append("user_property {\n");
                            p(sb, 2, "set_timestamp_millis", zzglVar.zzs() ? Long.valueOf(zzglVar.zzc()) : null);
                            p(sb, 2, "name", this.f13220a.y().f(zzglVar.zzf()));
                            p(sb, 2, "string_value", zzglVar.zzg());
                            p(sb, 2, "int_value", zzglVar.zzr() ? Long.valueOf(zzglVar.zzb()) : null);
                            p(sb, 2, "double_value", zzglVar.zzq() ? Double.valueOf(zzglVar.zza()) : null);
                            m(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzfo> zzM = zzgcVar.zzM();
                if (zzM != null) {
                    for (zzfo zzfoVar : zzM) {
                        if (zzfoVar != null) {
                            m(sb, 2);
                            sb.append("audience_membership {\n");
                            if (zzfoVar.zzk()) {
                                p(sb, 2, "audience_id", Integer.valueOf(zzfoVar.zza()));
                            }
                            if (zzfoVar.zzm()) {
                                p(sb, 2, "new_audience", Boolean.valueOf(zzfoVar.zzj()));
                            }
                            o(sb, 2, "current_data", zzfoVar.zzd());
                            if (zzfoVar.zzn()) {
                                o(sb, 2, "previous_data", zzfoVar.zze());
                            }
                            m(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzfs> zzN = zzgcVar.zzN();
                if (zzN != null) {
                    for (zzfs zzfsVar : zzN) {
                        if (zzfsVar != null) {
                            m(sb, 2);
                            sb.append("event {\n");
                            p(sb, 2, "name", this.f13220a.y().d(zzfsVar.zzh()));
                            if (zzfsVar.zzu()) {
                                p(sb, 2, "timestamp_millis", Long.valueOf(zzfsVar.zzd()));
                            }
                            if (zzfsVar.zzt()) {
                                p(sb, 2, "previous_timestamp_millis", Long.valueOf(zzfsVar.zzc()));
                            }
                            if (zzfsVar.zzs()) {
                                p(sb, 2, "count", Integer.valueOf(zzfsVar.zza()));
                            }
                            if (zzfsVar.zzb() != 0) {
                                k(sb, 2, zzfsVar.zzi());
                            }
                            m(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                m(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String z(com.google.android.gms.internal.measurement.zzej zzejVar) {
        if (zzejVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (zzejVar.zzp()) {
            p(sb, 0, "filter_id", Integer.valueOf(zzejVar.zzb()));
        }
        p(sb, 0, "event_name", this.f13220a.y().d(zzejVar.zzg()));
        String n10 = n(zzejVar.zzk(), zzejVar.zzm(), zzejVar.zzn());
        if (!n10.isEmpty()) {
            p(sb, 0, "filter_type", n10);
        }
        if (zzejVar.zzo()) {
            q(sb, 1, "event_count_filter", zzejVar.zzf());
        }
        if (zzejVar.zza() > 0) {
            sb.append("  filters {\n");
            for (zzel zzelVar : zzejVar.zzh()) {
                l(sb, 2, zzelVar);
            }
        }
        m(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }
}
