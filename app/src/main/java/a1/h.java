package a1;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;
/* compiled from: PathProperty.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class h<T> extends Property<T, Float> {

    /* renamed from: a  reason: collision with root package name */
    private final Property<T, PointF> f99a;

    /* renamed from: b  reason: collision with root package name */
    private final PathMeasure f100b;

    /* renamed from: c  reason: collision with root package name */
    private final float f101c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f102d;

    /* renamed from: e  reason: collision with root package name */
    private final PointF f103e;

    /* renamed from: f  reason: collision with root package name */
    private float f104f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f102d = new float[2];
        this.f103e = new PointF();
        this.f99a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f100b = pathMeasure;
        this.f101c = pathMeasure.getLength();
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Float get(T t10) {
        return Float.valueOf(this.f104f);
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(T t10, Float f10) {
        this.f104f = f10.floatValue();
        this.f100b.getPosTan(this.f101c * f10.floatValue(), this.f102d, null);
        PointF pointF = this.f103e;
        float[] fArr = this.f102d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f99a.set(t10, pointF);
    }
}
