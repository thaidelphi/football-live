package t5;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
/* compiled from: ShadowRenderer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a {

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f31031i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    private static final float[] f31032j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f31033k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    private static final float[] f31034l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private final Paint f31035a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f31036b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f31037c;

    /* renamed from: d  reason: collision with root package name */
    private int f31038d;

    /* renamed from: e  reason: collision with root package name */
    private int f31039e;

    /* renamed from: f  reason: collision with root package name */
    private int f31040f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f31041g;

    /* renamed from: h  reason: collision with root package name */
    private Paint f31042h;

    public a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f10, float f11) {
        boolean z10 = f11 < 0.0f;
        Path path = this.f31041g;
        if (z10) {
            int[] iArr = f31033k;
            iArr[0] = 0;
            iArr[1] = this.f31040f;
            iArr[2] = this.f31039e;
            iArr[3] = this.f31038d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f10, f11);
            path.close();
            float f12 = -i10;
            rectF.inset(f12, f12);
            int[] iArr2 = f31033k;
            iArr2[0] = 0;
            iArr2[1] = this.f31038d;
            iArr2[2] = this.f31039e;
            iArr2[3] = this.f31040f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f13 = 1.0f - (i10 / width);
        float[] fArr = f31034l;
        fArr[1] = f13;
        fArr[2] = ((1.0f - f13) / 2.0f) + f13;
        this.f31036b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f31033k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f31042h);
        }
        canvas.drawArc(rectF, f10, f11, true, this.f31036b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f31031i;
        iArr[0] = this.f31040f;
        iArr[1] = this.f31039e;
        iArr[2] = this.f31038d;
        Paint paint = this.f31037c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f31032j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f31037c);
        canvas.restore();
    }

    public Paint c() {
        return this.f31035a;
    }

    public void d(int i10) {
        this.f31038d = androidx.core.graphics.a.j(i10, 68);
        this.f31039e = androidx.core.graphics.a.j(i10, 20);
        this.f31040f = androidx.core.graphics.a.j(i10, 0);
        this.f31035a.setColor(this.f31038d);
    }

    public a(int i10) {
        this.f31041g = new Path();
        this.f31042h = new Paint();
        this.f31035a = new Paint();
        d(i10);
        this.f31042h.setColor(0);
        Paint paint = new Paint(4);
        this.f31036b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f31037c = new Paint(paint);
    }
}
