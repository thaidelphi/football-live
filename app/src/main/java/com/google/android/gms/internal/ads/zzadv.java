package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.ironsource.b9;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzadv {
    public static int zza(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i10 >>>= 1;
            i11++;
        }
        return i11;
    }

    public static zzav zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            int i11 = zzeh.zza;
            String[] split = str.split(b9.i.f16692b, 2);
            if (split.length != 2) {
                zzdn.zzf("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzafh.zzb(new zzdx(Base64.decode(split[1], 0))));
                } catch (RuntimeException e8) {
                    zzdn.zzg("VorbisUtil", "Failed to parse vorbis picture", e8);
                }
            } else {
                arrayList.add(new zzage(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzav(arrayList);
    }

    public static zzads zzc(zzdx zzdxVar, boolean z10, boolean z11) throws zzaz {
        if (z10) {
            zzd(3, zzdxVar, false);
        }
        String zzB = zzdxVar.zzB((int) zzdxVar.zzs(), StandardCharsets.UTF_8);
        int length = zzB.length();
        long zzs = zzdxVar.zzs();
        String[] strArr = new String[(int) zzs];
        int i10 = length + 15;
        for (int i11 = 0; i11 < zzs; i11++) {
            String zzB2 = zzdxVar.zzB((int) zzdxVar.zzs(), StandardCharsets.UTF_8);
            strArr[i11] = zzB2;
            i10 = i10 + 4 + zzB2.length();
        }
        if (z11 && (zzdxVar.zzm() & 1) == 0) {
            throw zzaz.zza("framing bit expected to be set", null);
        }
        return new zzads(zzB, strArr, i10 + 1);
    }

    public static boolean zzd(int i10, zzdx zzdxVar, boolean z10) throws zzaz {
        if (zzdxVar.zzb() < 7) {
            if (z10) {
                return false;
            }
            int zzb = zzdxVar.zzb();
            throw zzaz.zza("too short header: " + zzb, null);
        } else if (zzdxVar.zzm() != i10) {
            if (z10) {
                return false;
            }
            throw zzaz.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i10))), null);
        } else if (zzdxVar.zzm() == 118 && zzdxVar.zzm() == 111 && zzdxVar.zzm() == 114 && zzdxVar.zzm() == 98 && zzdxVar.zzm() == 105 && zzdxVar.zzm() == 115) {
            return true;
        } else {
            if (z10) {
                return false;
            }
            throw zzaz.zza("expected characters 'vorbis'", null);
        }
    }
}
