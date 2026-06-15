package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.b9;
import com.ironsource.fe;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaky {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzc = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzd = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannedString zza(java.lang.String r17, java.lang.String r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaky.zza(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzcl zzb(String str) {
        zzakw zzakwVar = new zzakw();
        zzh(str, zzakwVar);
        return zzakwVar.zza();
    }

    public static zzakr zzc(zzdx zzdxVar, List list) {
        String zzz = zzdxVar.zzz(StandardCharsets.UTF_8);
        if (zzz != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(zzz);
            if (!matcher.matches()) {
                String zzz2 = zzdxVar.zzz(StandardCharsets.UTF_8);
                if (zzz2 != null) {
                    Matcher matcher2 = pattern.matcher(zzz2);
                    if (matcher2.matches()) {
                        return zze(zzz.trim(), matcher2, zzdxVar, list);
                    }
                }
            } else {
                return zze(null, matcher, zzdxVar, list);
            }
        }
        return null;
    }

    private static int zzd(List list, String str, zzaku zzakuVar) {
        List zzf = zzf(list, str, zzakuVar);
        for (int i10 = 0; i10 < zzf.size(); i10++) {
            zzakq zzakqVar = ((zzakv) zzf.get(i10)).zzb;
            if (zzakqVar.zze() != -1) {
                return zzakqVar.zze();
            }
        }
        return -1;
    }

    private static zzakr zze(String str, Matcher matcher, zzdx zzdxVar, List list) {
        zzakw zzakwVar = new zzakw();
        try {
            String group = matcher.group(1);
            Objects.requireNonNull(group);
            zzakwVar.zza = zzala.zzb(group);
            String group2 = matcher.group(2);
            Objects.requireNonNull(group2);
            zzakwVar.zzb = zzala.zzb(group2);
            String group3 = matcher.group(3);
            Objects.requireNonNull(group3);
            zzh(group3, zzakwVar);
            StringBuilder sb = new StringBuilder();
            String zzz = zzdxVar.zzz(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(zzz)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(zzz.trim());
                zzz = zzdxVar.zzz(StandardCharsets.UTF_8);
            }
            zzakwVar.zzc = zza(str, sb.toString(), list);
            return new zzakr(zzakwVar.zza().zzp(), zzakwVar.zza, zzakwVar.zzb);
        } catch (IllegalArgumentException unused) {
            zzdn.zzf("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    private static List zzf(List list, String str, zzaku zzakuVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzakq zzakqVar = (zzakq) list.get(i10);
            int zzf = zzakqVar.zzf(str, zzakuVar.zza, zzakuVar.zzd, zzakuVar.zzc);
            if (zzf > 0) {
                arrayList.add(new zzakv(zzf, zzakqVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void zzg(String str, zzaku zzakuVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c10;
        Comparator comparator;
        zzaku zzakuVar2;
        zzaku zzakuVar3;
        zzaku zzakuVar4;
        int i10;
        int i11 = zzakuVar.zzb;
        int length = spannableStringBuilder.length();
        String str2 = zzakuVar.zza;
        int hashCode = str2.hashCode();
        int i12 = -1;
        if (hashCode == 0) {
            if (str2.equals("")) {
                c10 = 7;
            }
            c10 = 65535;
        } else if (hashCode == 105) {
            if (str2.equals("i")) {
                c10 = 1;
            }
            c10 = 65535;
        } else if (hashCode == 3314158) {
            if (str2.equals(fe.f17443q)) {
                c10 = 6;
            }
            c10 = 65535;
        } else if (hashCode == 3511770) {
            if (str2.equals("ruby")) {
                c10 = 2;
            }
            c10 = 65535;
        } else if (hashCode == 98) {
            if (str2.equals("b")) {
                c10 = 0;
            }
            c10 = 65535;
        } else if (hashCode == 99) {
            if (str2.equals("c")) {
                c10 = 4;
            }
            c10 = 65535;
        } else if (hashCode != 117) {
            if (hashCode == 118 && str2.equals("v")) {
                c10 = 5;
            }
            c10 = 65535;
        } else {
            if (str2.equals("u")) {
                c10 = 3;
            }
            c10 = 65535;
        }
        switch (c10) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i11, length, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i11, length, 33);
                break;
            case 2:
                int zzd2 = zzd(list2, str, zzakuVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                comparator = zzakt.zza;
                Collections.sort(arrayList, comparator);
                int i13 = zzakuVar.zzb;
                int i14 = 0;
                int i15 = 0;
                while (i14 < arrayList.size()) {
                    zzakuVar2 = ((zzakt) arrayList.get(i14)).zzb;
                    if ("rt".equals(zzakuVar2.zza)) {
                        zzakt zzaktVar = (zzakt) arrayList.get(i14);
                        zzakuVar3 = zzaktVar.zzb;
                        int zzd3 = zzd(list2, str, zzakuVar3);
                        if (zzd3 == i12) {
                            zzd3 = zzd2 != i12 ? zzd2 : 1;
                        }
                        zzakuVar4 = zzaktVar.zzb;
                        int i16 = zzakuVar4.zzb - i15;
                        i10 = zzaktVar.zzc;
                        int i17 = i10 - i15;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i16, i17);
                        spannableStringBuilder.delete(i16, i17);
                        spannableStringBuilder.setSpan(new zzcr(subSequence.toString(), zzd3), i13, i16, 33);
                        i15 += subSequence.length();
                        i13 = i16;
                    }
                    i14++;
                    i12 = -1;
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
                break;
            case 4:
                for (String str3 : zzakuVar.zzd) {
                    Map map = zzc;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i11, length, 33);
                    } else {
                        Map map2 = zzd;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i11, length, 33);
                        }
                    }
                }
                break;
            case 5:
                spannableStringBuilder.setSpan(new zzcu(zzakuVar.zzc), i11, length, 33);
                break;
            case 6:
            case 7:
                break;
            default:
                return;
        }
        List zzf = zzf(list2, str, zzakuVar);
        for (int i18 = 0; i18 < zzf.size(); i18++) {
            zzakq zzakqVar = ((zzakv) zzf.get(i18)).zzb;
            if (zzakqVar != null) {
                if (zzakqVar.zzg() != -1) {
                    zzcs.zzb(spannableStringBuilder, new StyleSpan(zzakqVar.zzg()), i11, length, 33);
                }
                if (zzakqVar.zzz()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
                }
                if (zzakqVar.zzy()) {
                    zzcs.zzb(spannableStringBuilder, new ForegroundColorSpan(zzakqVar.zzc()), i11, length, 33);
                }
                if (zzakqVar.zzx()) {
                    zzcs.zzb(spannableStringBuilder, new BackgroundColorSpan(zzakqVar.zzb()), i11, length, 33);
                }
                if (zzakqVar.zzr() != null) {
                    zzcs.zzb(spannableStringBuilder, new TypefaceSpan(zzakqVar.zzr()), i11, length, 33);
                }
                int zzd4 = zzakqVar.zzd();
                if (zzd4 == 1) {
                    zzcs.zzb(spannableStringBuilder, new AbsoluteSizeSpan((int) zzakqVar.zza(), true), i11, length, 33);
                } else if (zzd4 == 2) {
                    zzcs.zzb(spannableStringBuilder, new RelativeSizeSpan(zzakqVar.zza()), i11, length, 33);
                } else if (zzd4 == 3) {
                    zzcs.zzb(spannableStringBuilder, new RelativeSizeSpan(zzakqVar.zza() / 100.0f), i11, length, 33);
                }
                if (zzakqVar.zzw()) {
                    spannableStringBuilder.setSpan(new zzcq(), i11, length, 33);
                }
            }
        }
    }

    private static void zzh(String str, zzakw zzakwVar) {
        Matcher matcher = zzb.matcher(str);
        while (matcher.find()) {
            int i10 = 1;
            String group = matcher.group(1);
            Objects.requireNonNull(group);
            int i11 = 2;
            String group2 = matcher.group(2);
            Objects.requireNonNull(group2);
            try {
                char c10 = 65535;
                if (!"line".equals(group)) {
                    if (!"align".equals(group)) {
                        if (!b9.h.L.equals(group)) {
                            if ("size".equals(group)) {
                                zzakwVar.zzj = zzala.zza(group2);
                            } else if ("vertical".equals(group)) {
                                int hashCode = group2.hashCode();
                                if (hashCode != 3462) {
                                    if (hashCode == 3642 && group2.equals("rl")) {
                                        c10 = 0;
                                    }
                                } else if (group2.equals("lr")) {
                                    c10 = 1;
                                }
                                if (c10 != 0) {
                                    if (c10 != 1) {
                                        zzdn.zzf("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                                        i10 = RecyclerView.UNDEFINED_DURATION;
                                    } else {
                                        i10 = 2;
                                    }
                                }
                                zzakwVar.zzk = i10;
                            } else {
                                zzdn.zzf("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                            }
                        } else {
                            int indexOf = group2.indexOf(44);
                            if (indexOf != -1) {
                                String substring = group2.substring(indexOf + 1);
                                switch (substring.hashCode()) {
                                    case -1842484672:
                                        if (substring.equals("line-left")) {
                                            c10 = 0;
                                            break;
                                        }
                                        break;
                                    case -1364013995:
                                        if (substring.equals("center")) {
                                            c10 = 2;
                                            break;
                                        }
                                        break;
                                    case -1276788989:
                                        if (substring.equals("line-right")) {
                                            c10 = 4;
                                            break;
                                        }
                                        break;
                                    case -1074341483:
                                        if (substring.equals("middle")) {
                                            c10 = 3;
                                            break;
                                        }
                                        break;
                                    case 100571:
                                        if (substring.equals("end")) {
                                            c10 = 5;
                                            break;
                                        }
                                        break;
                                    case 109757538:
                                        if (substring.equals("start")) {
                                            c10 = 1;
                                            break;
                                        }
                                        break;
                                }
                                if (c10 == 0 || c10 == 1) {
                                    i10 = 0;
                                } else if (c10 != 2 && c10 != 3) {
                                    if (c10 == 4 || c10 == 5) {
                                        i10 = 2;
                                    } else {
                                        zzdn.zzf("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                                        i10 = RecyclerView.UNDEFINED_DURATION;
                                    }
                                }
                                zzakwVar.zzi = i10;
                                group2 = group2.substring(0, indexOf);
                            }
                            zzakwVar.zzh = zzala.zza(group2);
                        }
                    } else {
                        switch (group2.hashCode()) {
                            case -1364013995:
                                if (group2.equals("center")) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (group2.equals("middle")) {
                                    c10 = 3;
                                    break;
                                }
                                break;
                            case 100571:
                                if (group2.equals("end")) {
                                    c10 = 4;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (group2.equals("left")) {
                                    c10 = 1;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (group2.equals("right")) {
                                    c10 = 5;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (group2.equals("start")) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                        }
                        if (c10 != 0) {
                            if (c10 != 1) {
                                if (c10 != 2 && c10 != 3) {
                                    if (c10 != 4) {
                                        i10 = 5;
                                        if (c10 != 5) {
                                            zzdn.zzf("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                                        }
                                    } else {
                                        i10 = 3;
                                    }
                                }
                                i10 = 2;
                            } else {
                                i10 = 4;
                            }
                        }
                        zzakwVar.zzd = i10;
                    }
                } else {
                    int indexOf2 = group2.indexOf(44);
                    if (indexOf2 != -1) {
                        String substring2 = group2.substring(indexOf2 + 1);
                        switch (substring2.hashCode()) {
                            case -1364013995:
                                if (substring2.equals("center")) {
                                    c10 = 1;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring2.equals("middle")) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring2.equals("end")) {
                                    c10 = 3;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring2.equals("start")) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                        }
                        if (c10 == 0) {
                            i11 = 0;
                        } else if (c10 == 1 || c10 == 2) {
                            i11 = 1;
                        } else if (c10 != 3) {
                            zzdn.zzf("WebvttCueParser", "Invalid anchor value: ".concat(substring2));
                            i11 = RecyclerView.UNDEFINED_DURATION;
                        }
                        zzakwVar.zzg = i11;
                        group2 = group2.substring(0, indexOf2);
                    }
                    if (group2.endsWith("%")) {
                        zzakwVar.zze = zzala.zza(group2);
                        zzakwVar.zzf = 0;
                    } else {
                        zzakwVar.zze = Integer.parseInt(group2);
                        zzakwVar.zzf = 1;
                    }
                }
            } catch (NumberFormatException unused) {
                zzdn.zzf("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }
}
