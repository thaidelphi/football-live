package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzglw {
    private final Class zza;
    private zzglx zzd;
    private Map zzb = new HashMap();
    private final List zzc = new ArrayList();
    private zzgki zze = zzgki.zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzglw(Class cls, zzgly zzglyVar) {
        this.zza = cls;
    }

    private final zzglw zze(Object obj, zzgcf zzgcfVar, zzgro zzgroVar, boolean z10) throws GeneralSecurityException {
        byte[] zzc;
        zzguh zzguhVar;
        zzguh zzguhVar2;
        if (this.zzb != null) {
            if (zzgroVar.zzk() == 3) {
                int ordinal = zzgroVar.zzf().ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            zzc = zzgca.zza;
                        } else if (ordinal != 4) {
                            throw new GeneralSecurityException("unknown output prefix type");
                        }
                    }
                    zzc = zzglf.zza(zzgroVar.zza()).zzc();
                } else {
                    zzc = zzglf.zzb(zzgroVar.zza()).zzc();
                }
                zzglx zzglxVar = new zzglx(obj, zzguh.zzb(zzc), zzgroVar.zzk(), zzgroVar.zzf(), zzgroVar.zza(), zzgroVar.zzb().zzg(), zzgcfVar, null);
                Map map = this.zzb;
                List list = this.zzc;
                ArrayList arrayList = new ArrayList();
                arrayList.add(zzglxVar);
                zzguhVar = zzglxVar.zzb;
                List list2 = (List) map.put(zzguhVar, Collections.unmodifiableList(arrayList));
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(list2);
                    arrayList2.add(zzglxVar);
                    zzguhVar2 = zzglxVar.zzb;
                    map.put(zzguhVar2, Collections.unmodifiableList(arrayList2));
                }
                list.add(zzglxVar);
                if (z10) {
                    if (this.zzd == null) {
                        this.zzd = zzglxVar;
                    } else {
                        throw new IllegalStateException("you cannot set two primary primitives");
                    }
                }
                return this;
            }
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        throw new IllegalStateException("addEntry cannot be called after build");
    }

    public final zzglw zza(Object obj, zzgcf zzgcfVar, zzgro zzgroVar) throws GeneralSecurityException {
        zze(obj, zzgcfVar, zzgroVar, false);
        return this;
    }

    public final zzglw zzb(Object obj, zzgcf zzgcfVar, zzgro zzgroVar) throws GeneralSecurityException {
        zze(obj, zzgcfVar, zzgroVar, true);
        return this;
    }

    public final zzglw zzc(zzgki zzgkiVar) {
        if (this.zzb != null) {
            this.zze = zzgkiVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build");
    }

    public final zzglz zzd() throws GeneralSecurityException {
        Map map = this.zzb;
        if (map != null) {
            zzglz zzglzVar = new zzglz(map, this.zzc, this.zzd, this.zze, this.zza, null);
            this.zzb = null;
            return zzglzVar;
        }
        throw new IllegalStateException("build cannot be called twice");
    }
}
