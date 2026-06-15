package p3;

import com.ironsource.mediationsdk.logger.IronSourceError;
/* compiled from: AuxEffectInfo.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final int f29836a;

    /* renamed from: b  reason: collision with root package name */
    public final float f29837b;

    public y(int i10, float f10) {
        this.f29836a = i10;
        this.f29837b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        return this.f29836a == yVar.f29836a && Float.compare(yVar.f29837b, this.f29837b) == 0;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f29836a) * 31) + Float.floatToIntBits(this.f29837b);
    }
}
