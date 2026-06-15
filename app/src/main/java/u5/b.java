package u5;

import android.graphics.RectF;
import java.util.Arrays;
/* compiled from: AdjustedCornerSize.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final c f31451a;

    /* renamed from: b  reason: collision with root package name */
    private final float f31452b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f31451a;
            f10 += ((b) cVar).f31452b;
        }
        this.f31451a = cVar;
        this.f31452b = f10;
    }

    @Override // u5.c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f31451a.a(rectF) + this.f31452b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f31451a.equals(bVar.f31451a) && this.f31452b == bVar.f31452b;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31451a, Float.valueOf(this.f31452b)});
    }
}
