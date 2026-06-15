package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzayx {
    private final zzaym zza;
    private final int zzb;
    private final int zzc;

    public zzayx(int i10, int i11, int i12) {
        this.zzb = i10;
        i11 = (i11 > 64 || i11 < 0) ? 64 : i11;
        if (i12 <= 0) {
            this.zzc = 1;
        } else {
            this.zzc = i12;
        }
        this.zza = new zzayv(i11);
    }

    public final String zza(ArrayList arrayList, ArrayList arrayList2) {
        Collections.sort(arrayList2, new zzayw(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            String[] split = Normalizer.normalize((CharSequence) arrayList.get(((zzayl) arrayList2.get(i10)).zze()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (split.length != 0) {
                for (String str : split) {
                    if (str.contains("'")) {
                        StringBuilder sb = new StringBuilder(str);
                        int i11 = 1;
                        boolean z10 = false;
                        while (true) {
                            int i12 = i11 + 2;
                            if (i12 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i11) == '\'') {
                                if (sb.charAt(i11 - 1) != ' ') {
                                    int i13 = i11 + 1;
                                    if ((sb.charAt(i13) == 's' || sb.charAt(i13) == 'S') && (i12 == sb.length() || sb.charAt(i12) == ' ')) {
                                        sb.insert(i11, ' ');
                                        i11 = i12;
                                        z10 = true;
                                    }
                                }
                                sb.setCharAt(i11, ' ');
                                z10 = true;
                            }
                            i11++;
                        }
                        String sb2 = z10 ? sb.toString() : null;
                        if (sb2 != null) {
                            str = sb2;
                        }
                    }
                    String[] zzb = zzayq.zzb(str, true);
                    if (zzb.length >= this.zzc) {
                        for (int i14 = 0; i14 < zzb.length; i14++) {
                            String str2 = "";
                            for (int i15 = 0; i15 < this.zzc; i15++) {
                                int i16 = i14 + i15;
                                if (i16 >= zzb.length) {
                                    break;
                                }
                                if (i15 > 0) {
                                    str2 = str2.concat(" ");
                                }
                                str2 = str2.concat(String.valueOf(zzb[i16]));
                            }
                            hashSet.add(str2);
                            if (hashSet.size() >= this.zzb) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.zzb) {
                            break loop0;
                        }
                    }
                }
                continue;
            }
        }
        zzayo zzayoVar = new zzayo();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                zzayoVar.zzb.write(this.zza.zzb((String) it.next()));
            } catch (IOException e8) {
                int i17 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error while writing hash to byteStream", e8);
            }
        }
        return zzayoVar.toString();
    }
}
