package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzgg;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzgj;
import com.google.android.gms.internal.measurement.zzny;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class h4 {

    /* renamed from: a  reason: collision with root package name */
    private String f12988a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f12989b;

    /* renamed from: c  reason: collision with root package name */
    private zzgh f12990c;

    /* renamed from: d  reason: collision with root package name */
    private BitSet f12991d;

    /* renamed from: e  reason: collision with root package name */
    private BitSet f12992e;

    /* renamed from: f  reason: collision with root package name */
    private Map f12993f;

    /* renamed from: g  reason: collision with root package name */
    private Map f12994g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ b f12995h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ h4(b bVar, String str, zzt zztVar) {
        this.f12995h = bVar;
        this.f12988a = str;
        this.f12989b = true;
        this.f12991d = new BitSet();
        this.f12992e = new BitSet();
        this.f12993f = new androidx.collection.a();
        this.f12994g = new androidx.collection.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ BitSet b(h4 h4Var) {
        return h4Var.f12991d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfo a(int i10) {
        ArrayList arrayList;
        List list;
        zzfn zzb = zzfo.zzb();
        zzb.zza(i10);
        zzb.zzc(this.f12989b);
        zzgh zzghVar = this.f12990c;
        if (zzghVar != null) {
            zzb.zzd(zzghVar);
        }
        zzgg zzf = zzgh.zzf();
        zzf.zzb(zzlb.C(this.f12991d));
        zzf.zzd(zzlb.C(this.f12992e));
        Map map = this.f12993f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f12993f.keySet()) {
                int intValue = num.intValue();
                Long l10 = (Long) this.f12993f.get(Integer.valueOf(intValue));
                if (l10 != null) {
                    com.google.android.gms.internal.measurement.zzfp zzc = com.google.android.gms.internal.measurement.zzfq.zzc();
                    zzc.zzb(intValue);
                    zzc.zza(l10.longValue());
                    arrayList2.add((com.google.android.gms.internal.measurement.zzfq) zzc.zzaE());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            zzf.zza(arrayList);
        }
        Map map2 = this.f12994g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.f12994g.keySet()) {
                zzgi zzd = zzgj.zzd();
                zzd.zzb(num2.intValue());
                List list2 = (List) this.f12994g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    zzd.zza(list2);
                }
                arrayList3.add((zzgj) zzd.zzaE());
            }
            list = arrayList3;
        }
        zzf.zzc(list);
        zzb.zzb(zzf);
        return (zzfo) zzb.zzaE();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(k4 k4Var) {
        int a10 = k4Var.a();
        Boolean bool = k4Var.f13053c;
        if (bool != null) {
            this.f12992e.set(a10, bool.booleanValue());
        }
        Boolean bool2 = k4Var.f13054d;
        if (bool2 != null) {
            this.f12991d.set(a10, bool2.booleanValue());
        }
        if (k4Var.f13055e != null) {
            Map map = this.f12993f;
            Integer valueOf = Integer.valueOf(a10);
            Long l10 = (Long) map.get(valueOf);
            long longValue = k4Var.f13055e.longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                this.f12993f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (k4Var.f13056f != null) {
            Map map2 = this.f12994g;
            Integer valueOf2 = Integer.valueOf(a10);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f12994g.put(valueOf2, list);
            }
            if (k4Var.c()) {
                list.clear();
            }
            zzny.zzc();
            zzag u10 = this.f12995h.f13220a.u();
            String str = this.f12988a;
            zzea zzeaVar = zzeb.Y;
            if (u10.w(str, zzeaVar) && k4Var.b()) {
                list.clear();
            }
            zzny.zzc();
            if (this.f12995h.f13220a.u().w(this.f12988a, zzeaVar)) {
                Long valueOf3 = Long.valueOf(k4Var.f13056f.longValue() / 1000);
                if (list.contains(valueOf3)) {
                    return;
                }
                list.add(valueOf3);
                return;
            }
            list.add(Long.valueOf(k4Var.f13056f.longValue() / 1000));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ h4(b bVar, String str, zzgh zzghVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2, zzt zztVar) {
        this.f12995h = bVar;
        this.f12988a = str;
        this.f12991d = bitSet;
        this.f12992e = bitSet2;
        this.f12993f = map;
        this.f12994g = new androidx.collection.a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f12994g.put(num, arrayList);
        }
        this.f12989b = false;
        this.f12990c = zzghVar;
    }
}
