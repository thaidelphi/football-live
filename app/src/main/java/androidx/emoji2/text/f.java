package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
/* compiled from: EmojiMetadata.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f {

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal<d0.a> f3077d = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    private final int f3078a;

    /* renamed from: b  reason: collision with root package name */
    private final l f3079b;

    /* renamed from: c  reason: collision with root package name */
    private volatile int f3080c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(l lVar, int i10) {
        this.f3079b = lVar;
        this.f3078a = i10;
    }

    private d0.a g() {
        ThreadLocal<d0.a> threadLocal = f3077d;
        d0.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new d0.a();
            threadLocal.set(aVar);
        }
        this.f3079b.d().j(aVar, this.f3078a);
        return aVar;
    }

    public void a(Canvas canvas, float f10, float f11, Paint paint) {
        Typeface g10 = this.f3079b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(g10);
        canvas.drawText(this.f3079b.c(), this.f3078a * 2, 2, f10, f11, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i10) {
        return g().h(i10);
    }

    public int c() {
        return g().i();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int d() {
        return this.f3080c;
    }

    public short e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public short i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void k(boolean z10) {
        this.f3080c = z10 ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(f()));
        sb.append(", codepoints:");
        int c10 = c();
        for (int i10 = 0; i10 < c10; i10++) {
            sb.append(Integer.toHexString(b(i10)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
