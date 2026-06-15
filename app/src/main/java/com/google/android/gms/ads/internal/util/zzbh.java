package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzbh {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f11432a;

    /* renamed from: b  reason: collision with root package name */
    private final double[] f11433b;

    /* renamed from: c  reason: collision with root package name */
    private final double[] f11434c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f11435d;

    /* renamed from: e  reason: collision with root package name */
    private int f11436e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbh(zzbf zzbfVar, zzbg zzbgVar) {
        List list;
        List list2;
        List list3;
        List list4;
        list = zzbfVar.f11430b;
        int size = list.size();
        list2 = zzbfVar.f11429a;
        this.f11432a = (String[]) list2.toArray(new String[size]);
        list3 = zzbfVar.f11430b;
        this.f11433b = a(list3);
        list4 = zzbfVar.f11431c;
        this.f11434c = a(list4);
        this.f11435d = new int[size];
        this.f11436e = 0;
    }

    private static final double[] a(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = ((Double) list.get(i10)).doubleValue();
        }
        return dArr;
    }

    public final List zza() {
        zzbh zzbhVar = this;
        ArrayList arrayList = new ArrayList(zzbhVar.f11432a.length);
        int i10 = 0;
        while (true) {
            String[] strArr = zzbhVar.f11432a;
            if (i10 >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i10];
            double[] dArr = zzbhVar.f11434c;
            double[] dArr2 = zzbhVar.f11433b;
            int[] iArr = zzbhVar.f11435d;
            double d10 = dArr[i10];
            double d11 = dArr2[i10];
            int i11 = iArr[i10];
            arrayList.add(new zzbe(str, d10, d11, i11 / zzbhVar.f11436e, i11));
            i10++;
            zzbhVar = this;
        }
    }

    public final void zzb(double d10) {
        this.f11436e++;
        int i10 = 0;
        while (true) {
            double[] dArr = this.f11434c;
            if (i10 >= dArr.length) {
                return;
            }
            double d11 = dArr[i10];
            if (d11 <= d10 && d10 < this.f11433b[i10]) {
                int[] iArr = this.f11435d;
                iArr[i10] = iArr[i10] + 1;
            }
            if (d10 < d11) {
                return;
            }
            i10++;
        }
    }
}
