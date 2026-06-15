package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzbf {

    /* renamed from: a  reason: collision with root package name */
    private final List f11429a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final List f11430b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final List f11431c = new ArrayList();

    public final zzbf zza(String str, double d10, double d11) {
        int i10 = 0;
        while (i10 < this.f11429a.size()) {
            double doubleValue = ((Double) this.f11431c.get(i10)).doubleValue();
            double doubleValue2 = ((Double) this.f11430b.get(i10)).doubleValue();
            if (d10 < doubleValue || (doubleValue == d10 && d11 < doubleValue2)) {
                break;
            }
            i10++;
        }
        this.f11429a.add(i10, str);
        this.f11431c.add(i10, Double.valueOf(d10));
        this.f11430b.add(i10, Double.valueOf(d11));
        return this;
    }

    public final zzbh zzb() {
        return new zzbh(this, null);
    }
}
