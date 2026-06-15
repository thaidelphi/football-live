package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzt extends LinkedHashMap {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzv f11821a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzt(zzv zzvVar) {
        this.f11821a = zzvVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        int i10;
        ArrayDeque arrayDeque;
        int i11;
        synchronized (this.f11821a) {
            int size = size();
            zzv zzvVar = this.f11821a;
            i10 = zzvVar.f11822a;
            if (size <= i10) {
                return false;
            }
            arrayDeque = zzvVar.f11827f;
            arrayDeque.add(new Pair((String) entry.getKey(), ((zzu) entry.getValue()).zzb));
            int size2 = size();
            i11 = this.f11821a.f11822a;
            return size2 > i11;
        }
    }
}
