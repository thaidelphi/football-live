package v2;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Log;
import android.util.Property;
import android.view.animation.Interpolator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import x2.f;
/* compiled from: SpriteAnimatorBuilder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private f f31736a;

    /* renamed from: b  reason: collision with root package name */
    private Interpolator f31737b;

    /* renamed from: c  reason: collision with root package name */
    private int f31738c = -1;

    /* renamed from: d  reason: collision with root package name */
    private long f31739d = 2000;

    /* renamed from: e  reason: collision with root package name */
    private int f31740e = 0;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, b> f31741f = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpriteAnimatorBuilder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends b<Float> {
        public a(float[] fArr, Property property, Float[] fArr2) {
            super(fArr, property, fArr2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpriteAnimatorBuilder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b<T> {

        /* renamed from: a  reason: collision with root package name */
        float[] f31743a;

        /* renamed from: b  reason: collision with root package name */
        Property f31744b;

        /* renamed from: c  reason: collision with root package name */
        T[] f31745c;

        public b(float[] fArr, Property property, T[] tArr) {
            this.f31743a = fArr;
            this.f31744b = property;
            this.f31745c = tArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpriteAnimatorBuilder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c extends b<Integer> {
        public c(float[] fArr, Property property, Integer[] numArr) {
            super(fArr, property, numArr);
        }
    }

    public d(f fVar) {
        this.f31736a = fVar;
    }

    private void e(int i10, int i11) {
        if (i10 != i11) {
            throw new IllegalStateException(String.format(Locale.getDefault(), "The fractions.length must equal values.length, fraction.length[%d], values.length[%d]", Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    private void f(float[] fArr, Property property, Float[] fArr2) {
        e(fArr.length, fArr2.length);
        this.f31741f.put(property.getName(), new a(fArr, property, fArr2));
    }

    private void g(float[] fArr, Property property, Integer[] numArr) {
        e(fArr.length, numArr.length);
        this.f31741f.put(property.getName(), new c(fArr, property, numArr));
    }

    public d a(float[] fArr, Integer... numArr) {
        g(fArr, f.D, numArr);
        return this;
    }

    public ObjectAnimator b() {
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[this.f31741f.size()];
        int i10 = 0;
        for (Map.Entry<String, b> entry : this.f31741f.entrySet()) {
            b value = entry.getValue();
            float[] fArr = value.f31743a;
            Keyframe[] keyframeArr = new Keyframe[fArr.length];
            int i11 = this.f31740e;
            float f10 = fArr[i11];
            while (true) {
                int i12 = this.f31740e;
                Object[] objArr = value.f31745c;
                if (i11 < objArr.length + i12) {
                    int i13 = i11 - i12;
                    int length = i11 % objArr.length;
                    float f11 = fArr[length] - f10;
                    if (f11 < 0.0f) {
                        f11 += fArr[fArr.length - 1];
                    }
                    if (value instanceof c) {
                        keyframeArr[i13] = Keyframe.ofInt(f11, ((Integer) objArr[length]).intValue());
                    } else if (value instanceof a) {
                        keyframeArr[i13] = Keyframe.ofFloat(f11, ((Float) objArr[length]).floatValue());
                    } else {
                        keyframeArr[i13] = Keyframe.ofObject(f11, objArr[length]);
                    }
                    i11++;
                }
            }
            propertyValuesHolderArr[i10] = PropertyValuesHolder.ofKeyframe(value.f31744b, keyframeArr);
            i10++;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f31736a, propertyValuesHolderArr);
        ofPropertyValuesHolder.setDuration(this.f31739d);
        ofPropertyValuesHolder.setRepeatCount(this.f31738c);
        ofPropertyValuesHolder.setInterpolator(this.f31737b);
        return ofPropertyValuesHolder;
    }

    public d c(long j10) {
        this.f31739d = j10;
        return this;
    }

    public d d(float... fArr) {
        h(w2.b.a(fArr));
        return this;
    }

    public d h(Interpolator interpolator) {
        this.f31737b = interpolator;
        return this;
    }

    public d i(float[] fArr, Integer... numArr) {
        g(fArr, f.f32402u, numArr);
        return this;
    }

    public d j(float[] fArr, Integer... numArr) {
        g(fArr, f.f32401t, numArr);
        return this;
    }

    public d k(float[] fArr, Integer... numArr) {
        g(fArr, f.f32403v, numArr);
        return this;
    }

    public d l(float[] fArr, Float... fArr2) {
        f(fArr, f.C, fArr2);
        return this;
    }

    public d m(float[] fArr, Float... fArr2) {
        f(fArr, f.B, fArr2);
        return this;
    }

    public d n(int i10) {
        if (i10 < 0) {
            Log.w("SpriteAnimatorBuilder", "startFrame should always be non-negative");
            i10 = 0;
        }
        this.f31740e = i10;
        return this;
    }

    public d o(float[] fArr, Float... fArr2) {
        f(fArr, f.f32406y, fArr2);
        return this;
    }

    public d p(float[] fArr, Float... fArr2) {
        f(fArr, f.f32407z, fArr2);
        return this;
    }
}
