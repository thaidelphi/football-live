package y4;

import a5.p0;
import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
/* compiled from: CaptionStyleCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b {

    /* renamed from: g  reason: collision with root package name */
    public static final b f33059g = new b(-1, -16777216, 0, 0, -1, null);

    /* renamed from: a  reason: collision with root package name */
    public final int f33060a;

    /* renamed from: b  reason: collision with root package name */
    public final int f33061b;

    /* renamed from: c  reason: collision with root package name */
    public final int f33062c;

    /* renamed from: d  reason: collision with root package name */
    public final int f33063d;

    /* renamed from: e  reason: collision with root package name */
    public final int f33064e;

    /* renamed from: f  reason: collision with root package name */
    public final Typeface f33065f;

    public b(int i10, int i11, int i12, int i13, int i14, Typeface typeface) {
        this.f33060a = i10;
        this.f33061b = i11;
        this.f33062c = i12;
        this.f33063d = i13;
        this.f33064e = i14;
        this.f33065f = typeface;
    }

    public static b a(CaptioningManager.CaptionStyle captionStyle) {
        if (p0.f482a >= 21) {
            return c(captionStyle);
        }
        return b(captionStyle);
    }

    private static b b(CaptioningManager.CaptionStyle captionStyle) {
        return new b(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    private static b c(CaptioningManager.CaptionStyle captionStyle) {
        return new b(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f33059g.f33060a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f33059g.f33061b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f33059g.f33062c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f33059g.f33063d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f33059g.f33064e, captionStyle.getTypeface());
    }
}
