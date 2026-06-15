package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzaer extends zzaet {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzaer() {
        super(new zzace());
        this.zzb = -9223372036854775807L;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static Double zzg(zzdx zzdxVar) {
        return Double.valueOf(Double.longBitsToDouble(zzdxVar.zzt()));
    }

    private static Object zzh(zzdx zzdxVar, int i10) {
        if (i10 == 0) {
            return zzg(zzdxVar);
        }
        if (i10 == 1) {
            return Boolean.valueOf(zzdxVar.zzm() == 1);
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 8) {
                    if (i10 != 10) {
                        if (i10 != 11) {
                            return null;
                        }
                        Date date = new Date((long) zzg(zzdxVar).doubleValue());
                        zzdxVar.zzM(2);
                        return date;
                    }
                    int zzp = zzdxVar.zzp();
                    ArrayList arrayList = new ArrayList(zzp);
                    for (int i11 = 0; i11 < zzp; i11++) {
                        Object zzh = zzh(zzdxVar, zzdxVar.zzm());
                        if (zzh != null) {
                            arrayList.add(zzh);
                        }
                    }
                    return arrayList;
                }
                return zzj(zzdxVar);
            }
            HashMap hashMap = new HashMap();
            while (true) {
                String zzi = zzi(zzdxVar);
                int zzm = zzdxVar.zzm();
                if (zzm == 9) {
                    return hashMap;
                }
                Object zzh2 = zzh(zzdxVar, zzm);
                if (zzh2 != null) {
                    hashMap.put(zzi, zzh2);
                }
            }
        } else {
            return zzi(zzdxVar);
        }
    }

    private static String zzi(zzdx zzdxVar) {
        int zzq = zzdxVar.zzq();
        int zzd = zzdxVar.zzd();
        zzdxVar.zzM(zzq);
        return new String(zzdxVar.zzN(), zzd, zzq);
    }

    private static HashMap zzj(zzdx zzdxVar) {
        int zzp = zzdxVar.zzp();
        HashMap hashMap = new HashMap(zzp);
        for (int i10 = 0; i10 < zzp; i10++) {
            String zzi = zzi(zzdxVar);
            Object zzh = zzh(zzdxVar, zzdxVar.zzm());
            if (zzh != null) {
                hashMap.put(zzi, zzh);
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    protected final boolean zza(zzdx zzdxVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    protected final boolean zzb(zzdx zzdxVar, long j10) {
        if (zzdxVar.zzm() == 2 && "onMetaData".equals(zzi(zzdxVar)) && zzdxVar.zzb() != 0 && zzdxVar.zzm() == 8) {
            HashMap zzj = zzj(zzdxVar);
            Object obj = zzj.get(IronSourceConstants.EVENTS_DURATION);
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.zzb = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = zzj.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.zzc = new long[size];
                    this.zzd = new long[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        Object obj5 = list.get(i10);
                        Object obj6 = list2.get(i10);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.zzc = new long[0];
                            this.zzd = new long[0];
                            break;
                        }
                        this.zzc[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.zzd[i10] = ((Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzd;
    }

    public final long[] zze() {
        return this.zzc;
    }
}
