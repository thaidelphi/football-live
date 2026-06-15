package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
/* compiled from: TypefaceEmojiSpan.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class n extends h {

    /* renamed from: f  reason: collision with root package name */
    private static Paint f3126f;

    public n(f fVar) {
        super(fVar);
    }

    private static Paint c() {
        if (f3126f == null) {
            TextPaint textPaint = new TextPaint();
            f3126f = textPaint;
            textPaint.setColor(d.b().c());
            f3126f.setStyle(Paint.Style.FILL);
        }
        return f3126f;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        if (d.b().i()) {
            canvas.drawRect(f10, i12, f10 + b(), i14, c());
        }
        a().a(canvas, f10, i13, paint);
    }
}
