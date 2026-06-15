package com.google.android.gms.common;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.common.zzag;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class o {

    /* renamed from: a  reason: collision with root package name */
    private String f12648a = null;

    /* renamed from: b  reason: collision with root package name */
    private long f12649b = -1;

    /* renamed from: c  reason: collision with root package name */
    private zzag f12650c = zzag.zzl();

    /* renamed from: d  reason: collision with root package name */
    private zzag f12651d = zzag.zzl();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final o a(long j10) {
        this.f12649b = j10;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final o b(List list) {
        Preconditions.m(list);
        this.f12651d = zzag.zzk(list);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final o c(List list) {
        Preconditions.m(list);
        this.f12650c = zzag.zzk(list);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final o d(String str) {
        this.f12648a = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final b e() {
        if (this.f12648a != null) {
            if (this.f12649b >= 0) {
                if (this.f12650c.isEmpty() && this.f12651d.isEmpty()) {
                    throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
                }
                return new b(this.f12648a, this.f12649b, this.f12650c, this.f12651d, null);
            }
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        throw new IllegalStateException("packageName must be defined");
    }
}
