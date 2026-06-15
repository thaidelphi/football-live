package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;
/* compiled from: Insets.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f2610e = new b(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f2611a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2612b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2613c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2614d;

    /* compiled from: Insets.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class a {
        static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    private b(int i10, int i11, int i12, int i13) {
        this.f2611a = i10;
        this.f2612b = i11;
        this.f2613c = i12;
        this.f2614d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f2611a, bVar2.f2611a), Math.max(bVar.f2612b, bVar2.f2612b), Math.max(bVar.f2613c, bVar2.f2613c), Math.max(bVar.f2614d, bVar2.f2614d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return f2610e;
        }
        return new b(i10, i11, i12, i13);
    }

    public static b c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.f2611a, this.f2612b, this.f2613c, this.f2614d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2614d == bVar.f2614d && this.f2611a == bVar.f2611a && this.f2613c == bVar.f2613c && this.f2612b == bVar.f2612b;
    }

    public int hashCode() {
        return (((((this.f2611a * 31) + this.f2612b) * 31) + this.f2613c) * 31) + this.f2614d;
    }

    public String toString() {
        return "Insets{left=" + this.f2611a + ", top=" + this.f2612b + ", right=" + this.f2613c + ", bottom=" + this.f2614d + '}';
    }
}
