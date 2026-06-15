package u5;

import android.graphics.RectF;
import java.util.Arrays;
/* compiled from: RelativeCornerSize.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class i implements c {

    /* renamed from: a  reason: collision with root package name */
    private final float f31504a;

    public i(float f10) {
        this.f31504a = f10;
    }

    @Override // u5.c
    public float a(RectF rectF) {
        return this.f31504a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f31504a == ((i) obj).f31504a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f31504a)});
    }
}
