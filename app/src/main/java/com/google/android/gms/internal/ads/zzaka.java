package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaka implements zzajg {
    private static final Pattern zza = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    private static final Pattern zzb = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder zzc = new StringBuilder();
    private final ArrayList zzd = new ArrayList();
    private final zzdx zze = new zzdx();

    public static float zzb(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return 0.92f;
                }
                throw new IllegalArgumentException();
            }
            return 0.5f;
        }
        return 0.08f;
    }

    private static long zzc(Matcher matcher, int i10) {
        String group = matcher.group(i10 + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i10 + 2);
        Objects.requireNonNull(group2);
        long parseLong2 = parseLong + (Long.parseLong(group2) * 60000);
        String group3 = matcher.group(i10 + 3);
        Objects.requireNonNull(group3);
        long parseLong3 = parseLong2 + (Long.parseLong(group3) * 1000);
        String group4 = matcher.group(i10 + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzajg
    public final void zza(byte[] bArr, int i10, int i11, zzajf zzajfVar, zzda zzdaVar) {
        String str;
        char c10;
        char c11;
        int i12;
        zzcn zzp;
        zzaka zzakaVar = this;
        zzakaVar.zze.zzJ(bArr, i10 + i11);
        zzakaVar.zze.zzL(i10);
        Charset zzC = zzakaVar.zze.zzC();
        if (zzC == null) {
            zzC = StandardCharsets.UTF_8;
        }
        while (true) {
            String zzz = zzakaVar.zze.zzz(zzC);
            if (zzz == null) {
                return;
            }
            if (zzz.length() != 0) {
                try {
                    Integer.parseInt(zzz);
                    String zzz2 = zzakaVar.zze.zzz(zzC);
                    if (zzz2 == null) {
                        zzdn.zzf("SubripParser", "Unexpected end");
                        return;
                    }
                    Matcher matcher = zza.matcher(zzz2);
                    if (matcher.matches()) {
                        long zzc = zzc(matcher, 1);
                        long zzc2 = zzc(matcher, 6);
                        int i13 = 0;
                        zzakaVar.zzc.setLength(0);
                        zzakaVar.zzd.clear();
                        String zzz3 = zzakaVar.zze.zzz(zzC);
                        while (!TextUtils.isEmpty(zzz3)) {
                            if (zzakaVar.zzc.length() > 0) {
                                zzakaVar.zzc.append("<br>");
                            }
                            StringBuilder sb = zzakaVar.zzc;
                            ArrayList arrayList = zzakaVar.zzd;
                            String trim = zzz3.trim();
                            StringBuilder sb2 = new StringBuilder(trim);
                            Matcher matcher2 = zzb.matcher(trim);
                            int i14 = i13;
                            while (matcher2.find()) {
                                String group = matcher2.group();
                                arrayList.add(group);
                                int start = matcher2.start() - i14;
                                int length = group.length();
                                sb2.replace(start, start + length, "");
                                i14 += length;
                            }
                            sb.append(sb2.toString());
                            zzz3 = zzakaVar.zze.zzz(zzC);
                            i13 = 0;
                        }
                        Spanned fromHtml = Html.fromHtml(zzakaVar.zzc.toString());
                        int i15 = 0;
                        while (true) {
                            if (i15 < zzakaVar.zzd.size()) {
                                str = (String) zzakaVar.zzd.get(i15);
                                if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                    i15++;
                                }
                            } else {
                                str = null;
                            }
                        }
                        zzcl zzclVar = new zzcl();
                        zzclVar.zzl(fromHtml);
                        if (str == null) {
                            zzp = zzclVar.zzp();
                        } else {
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (str.equals("{\\an1}")) {
                                        c10 = 0;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -685620648:
                                    if (str.equals("{\\an3}")) {
                                        c10 = 3;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -685620617:
                                    if (str.equals("{\\an4}")) {
                                        c10 = 1;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -685620555:
                                    if (str.equals("{\\an6}")) {
                                        c10 = 4;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -685620524:
                                    if (str.equals("{\\an7}")) {
                                        c10 = 2;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -685620462:
                                    if (str.equals("{\\an9}")) {
                                        c10 = 5;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                default:
                                    c10 = 65535;
                                    break;
                            }
                            if (c10 == 0 || c10 == 1 || c10 == 2) {
                                zzclVar.zzi(0);
                            } else if (c10 != 3 && c10 != 4 && c10 != 5) {
                                zzclVar.zzi(1);
                            } else {
                                zzclVar.zzi(2);
                            }
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (str.equals("{\\an1}")) {
                                        c11 = 0;
                                        break;
                                    }
                                    c11 = 65535;
                                    break;
                                case -685620679:
                                    if (str.equals("{\\an2}")) {
                                        c11 = 1;
                                        break;
                                    }
                                    c11 = 65535;
                                    break;
                                case -685620648:
                                    if (str.equals("{\\an3}")) {
                                        c11 = 2;
                                        break;
                                    }
                                    c11 = 65535;
                                    break;
                                case -685620524:
                                    if (str.equals("{\\an7}")) {
                                        c11 = 3;
                                        break;
                                    }
                                    c11 = 65535;
                                    break;
                                case -685620493:
                                    if (str.equals("{\\an8}")) {
                                        c11 = 4;
                                        break;
                                    }
                                    c11 = 65535;
                                    break;
                                case -685620462:
                                    if (str.equals("{\\an9}")) {
                                        c11 = 5;
                                        break;
                                    }
                                    c11 = 65535;
                                    break;
                                default:
                                    c11 = 65535;
                                    break;
                            }
                            if (c11 == 0 || c11 == 1) {
                                i12 = 2;
                            } else if (c11 != 2) {
                                if (c11 != 3 && c11 != 4 && c11 != 5) {
                                    zzclVar.zzf(1);
                                } else {
                                    zzclVar.zzf(0);
                                }
                                zzclVar.zzh(zzb(zzclVar.zzb()));
                                zzclVar.zze(zzb(zzclVar.zza()), 0);
                                zzp = zzclVar.zzp();
                            } else {
                                i12 = 2;
                            }
                            zzclVar.zzf(i12);
                            zzclVar.zzh(zzb(zzclVar.zzb()));
                            zzclVar.zze(zzb(zzclVar.zza()), 0);
                            zzp = zzclVar.zzp();
                        }
                        zzdaVar.zza(new zzaiy(zzfvv.zzo(zzp), zzc, zzc2 - zzc));
                    } else {
                        zzdn.zzf("SubripParser", "Skipping invalid timing: ".concat(zzz2));
                    }
                } catch (NumberFormatException unused) {
                    zzdn.zzf("SubripParser", "Skipping invalid index: ".concat(zzz));
                }
            }
            zzakaVar = this;
        }
    }
}
