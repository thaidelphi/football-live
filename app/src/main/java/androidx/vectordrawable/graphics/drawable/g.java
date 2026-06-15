package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.core.content.res.k;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.xmlpull.v1.XmlPullParser;
/* compiled from: PathInterpolatorCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private float[] f4476a;

    /* renamed from: b  reason: collision with root package name */
    private float[] f4477b;

    public g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    private void a(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f10, f11, f12, f13, 1.0f, 1.0f);
        b(path);
    }

    private void b(Path path) {
        int i10 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min((int) IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f4476a = new float[min];
            this.f4477b = new float[min];
            float[] fArr = new float[2];
            for (int i11 = 0; i11 < min; i11++) {
                pathMeasure.getPosTan((i11 * length) / (min - 1), fArr, null);
                this.f4476a[i11] = fArr[0];
                this.f4477b[i11] = fArr[1];
            }
            if (Math.abs(this.f4476a[0]) <= 1.0E-5d && Math.abs(this.f4477b[0]) <= 1.0E-5d) {
                int i12 = min - 1;
                if (Math.abs(this.f4476a[i12] - 1.0f) <= 1.0E-5d && Math.abs(this.f4477b[i12] - 1.0f) <= 1.0E-5d) {
                    float f10 = 0.0f;
                    int i13 = 0;
                    while (i10 < min) {
                        float[] fArr2 = this.f4476a;
                        int i14 = i13 + 1;
                        float f11 = fArr2[i13];
                        if (f11 >= f10) {
                            fArr2[i10] = f11;
                            i10++;
                            f10 = f11;
                            i13 = i14;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f11);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The Path must start at (0,0) and end at (1,1) start: ");
            sb.append(this.f4476a[0]);
            sb.append(",");
            sb.append(this.f4477b[0]);
            sb.append(" end:");
            int i15 = min - 1;
            sb.append(this.f4476a[i15]);
            sb.append(",");
            sb.append(this.f4477b[i15]);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    private void c(float f10, float f11) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f10, f11, 1.0f, 1.0f);
        b(path);
    }

    private void d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (k.j(xmlPullParser, "pathData")) {
            String i10 = k.i(typedArray, xmlPullParser, "pathData", 4);
            Path e8 = androidx.core.graphics.d.e(i10);
            if (e8 != null) {
                b(e8);
                return;
            }
            throw new InflateException("The path is null, which is created from " + i10);
        } else if (k.j(xmlPullParser, "controlX1")) {
            if (k.j(xmlPullParser, "controlY1")) {
                float f10 = k.f(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
                float f11 = k.f(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
                boolean j10 = k.j(xmlPullParser, "controlX2");
                if (j10 != k.j(xmlPullParser, "controlY2")) {
                    throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
                }
                if (!j10) {
                    c(f10, f11);
                    return;
                } else {
                    a(f10, f11, k.f(typedArray, xmlPullParser, "controlX2", 2, 0.0f), k.f(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
                    return;
                }
            }
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        } else {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        int i10 = 0;
        int length = this.f4476a.length - 1;
        while (length - i10 > 1) {
            int i11 = (i10 + length) / 2;
            if (f10 < this.f4476a[i11]) {
                length = i11;
            } else {
                i10 = i11;
            }
        }
        float[] fArr = this.f4476a;
        float f11 = fArr[length] - fArr[i10];
        if (f11 == 0.0f) {
            return this.f4477b[i10];
        }
        float[] fArr2 = this.f4477b;
        float f12 = fArr2[i10];
        return f12 + (((f10 - fArr[i10]) / f11) * (fArr2[length] - f12));
    }

    public g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray k10 = k.k(resources, theme, attributeSet, a.f4460l);
        d(k10, xmlPullParser);
        k10.recycle();
    }
}
