package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzakd {
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;
    public final zzakj zzf;
    public final String zzg;
    public final String zzh;
    public final zzakd zzi;
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    private zzakd(String str, String str2, long j10, long j11, zzakj zzakjVar, String[] strArr, String str3, String str4, zzakd zzakdVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzakjVar;
        this.zzj = strArr;
        this.zzc = str2 != null;
        this.zzd = j10;
        this.zze = j11;
        Objects.requireNonNull(str3);
        this.zzg = str3;
        this.zzi = zzakdVar;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }

    public static zzakd zzb(String str, long j10, long j11, zzakj zzakjVar, String[] strArr, String str2, String str3, zzakd zzakdVar) {
        return new zzakd(str, null, j10, j11, zzakjVar, strArr, str2, str3, zzakdVar);
    }

    public static zzakd zzc(String str) {
        return new zzakd(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static SpannableStringBuilder zzi(String str, Map map) {
        if (!map.containsKey(str)) {
            zzcl zzclVar = new zzcl();
            zzclVar.zzl(new SpannableStringBuilder());
            map.put(str, zzclVar);
        }
        CharSequence zzq = ((zzcl) map.get(str)).zzq();
        Objects.requireNonNull(zzq);
        return (SpannableStringBuilder) zzq;
    }

    private final void zzj(TreeSet treeSet, boolean z10) {
        String str = this.zza;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z10 || equals || (equals2 && this.zzh != null)) {
            long j10 = this.zzd;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.zze;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.zzm != null) {
            for (int i10 = 0; i10 < this.zzm.size(); i10++) {
                zzakd zzakdVar = (zzakd) this.zzm.get(i10);
                boolean z11 = true;
                if (!z10 && !equals) {
                    z11 = false;
                }
                zzakdVar.zzj(treeSet, z11);
            }
        }
    }

    private final void zzk(long j10, String str, List list) {
        String str2;
        if (!"".equals(this.zzg)) {
            str = this.zzg;
        }
        if (zzg(j10) && "div".equals(this.zza) && (str2 = this.zzh) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i10 = 0; i10 < zza(); i10++) {
            zzd(i10).zzk(j10, str, list);
        }
    }

    private final void zzl(long j10, Map map, Map map2, String str, Map map3) {
        Iterator it;
        zzakd zzakdVar;
        zzakj zza;
        int i10;
        if (zzg(j10)) {
            String str2 = !"".equals(this.zzg) ? this.zzg : str;
            Iterator it2 = this.zzl.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str3 = (String) entry.getKey();
                int intValue = this.zzk.containsKey(str3) ? ((Integer) this.zzk.get(str3)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    zzcl zzclVar = (zzcl) map3.get(str3);
                    Objects.requireNonNull(zzclVar);
                    zzakh zzakhVar = (zzakh) map2.get(str2);
                    Objects.requireNonNull(zzakhVar);
                    int i11 = zzakhVar.zzj;
                    zzakj zza2 = zzaki.zza(this.zzf, this.zzj, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzclVar.zzq();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        zzclVar.zzl(spannableStringBuilder);
                    }
                    if (zza2 != null) {
                        zzakd zzakdVar2 = this.zzi;
                        if (zza2.zzh() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(zza2.zzh()), intValue, intValue2, 33);
                        }
                        if (zza2.zzM()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, 33);
                        }
                        if (zza2.zzN()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, 33);
                        }
                        if (zza2.zzL()) {
                            zzcs.zzb(spannableStringBuilder, new ForegroundColorSpan(zza2.zzd()), intValue, intValue2, 33);
                        }
                        if (zza2.zzK()) {
                            zzcs.zzb(spannableStringBuilder, new BackgroundColorSpan(zza2.zzc()), intValue, intValue2, 33);
                        }
                        if (zza2.zzG() != null) {
                            zzcs.zzb(spannableStringBuilder, new TypefaceSpan(zza2.zzG()), intValue, intValue2, 33);
                        }
                        if (zza2.zzk() != null) {
                            zzakc zzk = zza2.zzk();
                            Objects.requireNonNull(zzk);
                            int i12 = zzk.zza;
                            it = it2;
                            if (i12 == -1) {
                                i12 = (i11 == 2 || i11 == 1) ? 3 : 1;
                                i10 = 1;
                            } else {
                                i10 = zzk.zzb;
                            }
                            int i13 = zzk.zzc;
                            if (i13 == -2) {
                                i13 = 1;
                            }
                            zzcs.zzb(spannableStringBuilder, new zzct(i12, i10, i13), intValue, intValue2, 33);
                        } else {
                            it = it2;
                        }
                        int zzg = zza2.zzg();
                        if (zzg == 2) {
                            while (true) {
                                if (zzakdVar2 == null) {
                                    zzakdVar2 = null;
                                    break;
                                }
                                zzakj zza3 = zzaki.zza(zzakdVar2.zzf, zzakdVar2.zzj, map);
                                if (zza3 != null && zza3.zzg() == 1) {
                                    break;
                                }
                                zzakdVar2 = zzakdVar2.zzi;
                            }
                            if (zzakdVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(zzakdVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        zzakdVar = null;
                                        break;
                                    }
                                    zzakd zzakdVar3 = (zzakd) arrayDeque.pop();
                                    zzakj zza4 = zzaki.zza(zzakdVar3.zzf, zzakdVar3.zzj, map);
                                    if (zza4 != null && zza4.zzg() == 3) {
                                        zzakdVar = zzakdVar3;
                                        break;
                                    }
                                    for (int zza5 = zzakdVar3.zza() - 1; zza5 >= 0; zza5--) {
                                        arrayDeque.push(zzakdVar3.zzd(zza5));
                                    }
                                }
                                if (zzakdVar != null) {
                                    if (zzakdVar.zza() == 1 && zzakdVar.zzd(0).zzb != null) {
                                        String str4 = zzakdVar.zzd(0).zzb;
                                        int i14 = zzeh.zza;
                                        zzakj zza6 = zzaki.zza(zzakdVar.zzf, zzakdVar.zzj, map);
                                        int zzf = zza6 != null ? zza6.zzf() : -1;
                                        if (zzf == -1 && (zza = zzaki.zza(zzakdVar2.zzf, zzakdVar2.zzj, map)) != null) {
                                            zzf = zza.zzf();
                                        }
                                        spannableStringBuilder.setSpan(new zzcr(str4, zzf), intValue, intValue2, 33);
                                    } else {
                                        zzdn.zze("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    }
                                }
                            }
                        } else if (zzg == 3 || zzg == 4) {
                            spannableStringBuilder.setSpan(new zzakb(), intValue, intValue2, 33);
                        }
                        if (zza2.zzJ()) {
                            zzcs.zzb(spannableStringBuilder, new zzcq(), intValue, intValue2, 33);
                        }
                        int zze = zza2.zze();
                        if (zze == 1) {
                            zzcs.zzb(spannableStringBuilder, new AbsoluteSizeSpan((int) zza2.zza(), true), intValue, intValue2, 33);
                        } else if (zze == 2) {
                            zzcs.zzb(spannableStringBuilder, new RelativeSizeSpan(zza2.zza()), intValue, intValue2, 33);
                        } else if (zze == 3) {
                            zzcs.zza(spannableStringBuilder, zza2.zza() / 100.0f, intValue, intValue2, 33);
                        }
                        if ("p".equals(this.zza)) {
                            if (zza2.zzb() != Float.MAX_VALUE) {
                                zzclVar.zzj((zza2.zzb() * (-90.0f)) / 100.0f);
                            }
                            if (zza2.zzj() != null) {
                                zzclVar.zzm(zza2.zzj());
                            }
                            if (zza2.zzi() != null) {
                                zzclVar.zzg(zza2.zzi());
                            }
                        }
                        it2 = it;
                    }
                }
            }
            for (int i15 = 0; i15 < zza(); i15++) {
                zzd(i15).zzl(j10, map, map2, str2, map3);
            }
        }
    }

    private final void zzm(long j10, boolean z10, String str, Map map) {
        this.zzk.clear();
        this.zzl.clear();
        if ("metadata".equals(this.zza)) {
            return;
        }
        if (!"".equals(this.zzg)) {
            str = this.zzg;
        }
        if (this.zzc && z10) {
            SpannableStringBuilder zzi = zzi(str, map);
            String str2 = this.zzb;
            Objects.requireNonNull(str2);
            zzi.append((CharSequence) str2);
        } else if ("br".equals(this.zza) && z10) {
            zzi(str, map).append('\n');
        } else if (zzg(j10)) {
            for (Map.Entry entry : map.entrySet()) {
                CharSequence zzq = ((zzcl) entry.getValue()).zzq();
                Objects.requireNonNull(zzq);
                this.zzk.put((String) entry.getKey(), Integer.valueOf(zzq.length()));
            }
            boolean equals = "p".equals(this.zza);
            for (int i10 = 0; i10 < zza(); i10++) {
                zzd(i10).zzm(j10, z10 || equals, str, map);
            }
            if (equals) {
                SpannableStringBuilder zzi2 = zzi(str, map);
                int length = zzi2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (zzi2.charAt(length) == ' ');
                if (length >= 0 && zzi2.charAt(length) != '\n') {
                    zzi2.append('\n');
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                CharSequence zzq2 = ((zzcl) entry2.getValue()).zzq();
                Objects.requireNonNull(zzq2);
                this.zzl.put((String) entry2.getKey(), Integer.valueOf(zzq2.length()));
            }
        }
    }

    public final int zza() {
        List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final zzakd zzd(int i10) {
        List list = this.zzm;
        if (list != null) {
            return (zzakd) list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List zze(long j10, Map map, Map map2, Map map3) {
        zzakb[] zzakbVarArr;
        List arrayList = new ArrayList();
        zzk(j10, this.zzg, arrayList);
        TreeMap treeMap = new TreeMap();
        zzm(j10, false, this.zzg, treeMap);
        zzl(j10, map, map2, this.zzg, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair pair = (Pair) arrayList.get(i10);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                zzakh zzakhVar = (zzakh) map2.get(pair.first);
                Objects.requireNonNull(zzakhVar);
                zzcl zzclVar = new zzcl();
                zzclVar.zzc(decodeByteArray);
                zzclVar.zzh(zzakhVar.zzb);
                zzclVar.zzi(0);
                zzclVar.zze(zzakhVar.zzc, 0);
                zzclVar.zzf(zzakhVar.zze);
                zzclVar.zzk(zzakhVar.zzf);
                zzclVar.zzd(zzakhVar.zzg);
                zzclVar.zzo(zzakhVar.zzj);
                arrayList2.add(zzclVar.zzp());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzakh zzakhVar2 = (zzakh) map2.get(entry.getKey());
            Objects.requireNonNull(zzakhVar2);
            zzcl zzclVar2 = (zzcl) entry.getValue();
            CharSequence zzq = zzclVar2.zzq();
            Objects.requireNonNull(zzq);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzq;
            for (zzakb zzakbVar : (zzakb[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzakb.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzakbVar), spannableStringBuilder.getSpanEnd(zzakbVar), (CharSequence) "");
            }
            int i11 = 0;
            while (i11 < spannableStringBuilder.length()) {
                int i12 = i11 + 1;
                if (spannableStringBuilder.charAt(i11) == ' ') {
                    int i13 = i12;
                    while (i13 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i13) == ' ') {
                        i13++;
                    }
                    int i14 = i13 - i12;
                    if (i14 > 0) {
                        spannableStringBuilder.delete(i11, i14 + i11);
                    }
                }
                i11 = i12;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i15 = 0;
            while (i15 < spannableStringBuilder.length() - 1) {
                int i16 = i15 + 1;
                if (spannableStringBuilder.charAt(i15) == '\n' && spannableStringBuilder.charAt(i16) == ' ') {
                    spannableStringBuilder.delete(i16, i15 + 2);
                }
                i15 = i16;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i17 = 0;
            while (i17 < spannableStringBuilder.length() - 1) {
                int i18 = i17 + 1;
                if (spannableStringBuilder.charAt(i17) == ' ' && spannableStringBuilder.charAt(i18) == '\n') {
                    spannableStringBuilder.delete(i17, i18);
                }
                i17 = i18;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzclVar2.zze(zzakhVar2.zzc, zzakhVar2.zzd);
            zzclVar2.zzf(zzakhVar2.zze);
            zzclVar2.zzh(zzakhVar2.zzb);
            zzclVar2.zzk(zzakhVar2.zzf);
            zzclVar2.zzn(zzakhVar2.zzi, zzakhVar2.zzh);
            zzclVar2.zzo(zzakhVar2.zzj);
            arrayList2.add(zzclVar2.zzp());
        }
        return arrayList2;
    }

    public final void zzf(zzakd zzakdVar) {
        if (this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzakdVar);
    }

    public final boolean zzg(long j10) {
        long j11 = this.zzd;
        if (j11 == -9223372036854775807L) {
            if (this.zze != -9223372036854775807L) {
                j11 = -9223372036854775807L;
            }
            return true;
        }
        int i10 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if ((i10 > 0 || this.zze != -9223372036854775807L) && ((j11 != -9223372036854775807L || j10 >= this.zze) && (i10 > 0 || j10 >= this.zze))) {
            return false;
        }
        return true;
    }

    public final long[] zzh() {
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        zzj(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        return jArr;
    }
}
