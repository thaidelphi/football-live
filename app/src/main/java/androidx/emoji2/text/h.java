package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
/* compiled from: EmojiSpan.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class h extends ReplacementSpan {

    /* renamed from: b  reason: collision with root package name */
    private final f f3097b;

    /* renamed from: a  reason: collision with root package name */
    private final Paint.FontMetricsInt f3096a = new Paint.FontMetricsInt();

    /* renamed from: c  reason: collision with root package name */
    private short f3098c = -1;

    /* renamed from: d  reason: collision with root package name */
    private short f3099d = -1;

    /* renamed from: e  reason: collision with root package name */
    private float f3100e = 1.0f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(f fVar) {
        androidx.core.util.i.g(fVar, "metadata cannot be null");
        this.f3097b = fVar;
    }

    public final f a() {
        return this.f3097b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        return this.f3098c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f3096a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f3096a;
        this.f3100e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f3097b.e();
        this.f3099d = (short) (this.f3097b.e() * this.f3100e);
        short i12 = (short) (this.f3097b.i() * this.f3100e);
        this.f3098c = i12;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f3096a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i12;
    }
}
