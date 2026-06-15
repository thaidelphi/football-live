package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzgvw extends zzgvv {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgvv
    public final void zza(Object obj) {
        ((zzgwg) obj).zza.zzg();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgvv
    public final void zzb(zzgzp zzgzpVar, Map.Entry entry) throws IOException {
        zzgwh zzgwhVar = (zzgwh) entry.getKey();
        if (zzgwhVar.zzc) {
            zzgzn zzgznVar = zzgzn.zza;
            switch (zzgwhVar.zzb.ordinal()) {
                case 0:
                    zzgyq.zzt(zzgwhVar.zza, (List) entry.getValue(), zzgzpVar, zzgwhVar.zzd);
                    return;
                case 1:
                    zzgyq.zzx(zzgwhVar.zza, (List) entry.getValue(), zzgzpVar, zzgwhVar.zzd);
                    return;
                case 2:
                    zzgyq.zzA(zzgwhVar.zza, (List) entry.getValue(), zzgzpVar, zzgwhVar.zzd);
                    return;
                case 3:
                    zzgyq.zzI(zzgwhVar.zza, (List) entry.getValue(), zzgzpVar, zzgwhVar.zzd);
                    return;
                case 4:
                    zzgyq.zzz(zzgwhVar.zza, (List) entry.getValue(), zzgzpVar, zzgwhVar.zzd);
                    return;
                case 5:
                    zzgyq.zzw(zzgwhVar.zza, (List) entry.getValue(), zzgzpVar, zzgwhVar.zzd);
                    return;
                case 6:
                    zzgyq.zzv(zzgwhVar.zza, (List) entry.getValue(), zzgzpVar, zzgwhVar.zzd);
                    return;
                case 7:
                    zzgyq.zzr(zzgwhVar.zza, (List) entry.getValue(), zzgzpVar, zzgwhVar.zzd);
                    return;
                case 8:
                    zzgyq.zzG(zzgwhVar.zza, (List) entry.getValue(), zzgzpVar);
                    return;
                case 9:
                    List list = (List) entry.getValue();
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    zzgyq.zzy(zzgwhVar.zza, (List) entry.getValue(), zzgzpVar, zzgyf.zza().zzb(list.get(0).getClass()));
                    return;
                case 10:
                    List list2 = (List) entry.getValue();
                    if (list2 == null || list2.isEmpty()) {
                        return;
                    }
                    zzgyq.zzB(zzgwhVar.zza, (List) entry.getValue(), zzgzpVar, zzgyf.zza().zzb(list2.get(0).getClass()));
                    return;
                case 11:
                    zzgyq.zzs(zzgwhVar.zza, (List) entry.getValue(), zzgzpVar);
                    return;
                case 12:
                    zzgyq.zzH(zzgwhVar.zza, (List) entry.getValue(), zzgzpVar, zzgwhVar.zzd);
                    return;
                case 13:
                    zzgyq.zzz(zzgwhVar.zza, (List) entry.getValue(), zzgzpVar, zzgwhVar.zzd);
                    return;
                case 14:
                    zzgyq.zzC(zzgwhVar.zza, (List) entry.getValue(), zzgzpVar, zzgwhVar.zzd);
                    return;
                case 15:
                    zzgyq.zzD(zzgwhVar.zza, (List) entry.getValue(), zzgzpVar, zzgwhVar.zzd);
                    return;
                case 16:
                    zzgyq.zzE(zzgwhVar.zza, (List) entry.getValue(), zzgzpVar, zzgwhVar.zzd);
                    return;
                case 17:
                    zzgyq.zzF(zzgwhVar.zza, (List) entry.getValue(), zzgzpVar, zzgwhVar.zzd);
                    return;
                default:
                    return;
            }
        }
        zzgzn zzgznVar2 = zzgzn.zza;
        switch (zzgwhVar.zzb.ordinal()) {
            case 0:
                zzgzpVar.zzf(zzgwhVar.zza, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                zzgzpVar.zzo(zzgwhVar.zza, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                zzgzpVar.zzt(zzgwhVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                zzgzpVar.zzK(zzgwhVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                zzgzpVar.zzr(zzgwhVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                zzgzpVar.zzm(zzgwhVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                zzgzpVar.zzk(zzgwhVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                zzgzpVar.zzb(zzgwhVar.zza, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                zzgzpVar.zzG(zzgwhVar.zza, (String) entry.getValue());
                return;
            case 9:
                zzgzpVar.zzq(zzgwhVar.zza, entry.getValue(), zzgyf.zza().zzb(entry.getValue().getClass()));
                return;
            case 10:
                zzgzpVar.zzv(zzgwhVar.zza, entry.getValue(), zzgyf.zza().zzb(entry.getValue().getClass()));
                return;
            case 11:
                zzgzpVar.zzd(zzgwhVar.zza, (zzgvc) entry.getValue());
                return;
            case 12:
                zzgzpVar.zzI(zzgwhVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                zzgzpVar.zzr(zzgwhVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                zzgzpVar.zzx(zzgwhVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                zzgzpVar.zzz(zzgwhVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                zzgzpVar.zzB(zzgwhVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                zzgzpVar.zzD(zzgwhVar.zza, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }
}
