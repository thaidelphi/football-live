package h5;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
/* compiled from: CircularRevealWidget.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface d {

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class b implements TypeEvaluator<e> {

        /* renamed from: b  reason: collision with root package name */
        public static final TypeEvaluator<e> f26221b = new b();

        /* renamed from: a  reason: collision with root package name */
        private final e f26222a = new e();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public e evaluate(float f10, e eVar, e eVar2) {
            this.f26222a.a(o5.a.c(eVar.f26225a, eVar2.f26225a, f10), o5.a.c(eVar.f26226b, eVar2.f26226b, f10), o5.a.c(eVar.f26227c, eVar2.f26227c, f10));
            return this.f26222a;
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class c extends Property<d, e> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<d, e> f26223a = new c("circularReveal");

        private c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public e get(d dVar) {
            return dVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(d dVar, e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: h5.d$d  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class C0295d extends Property<d, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<d, Integer> f26224a = new C0295d("circularRevealScrimColor");

        private C0295d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public float f26225a;

        /* renamed from: b  reason: collision with root package name */
        public float f26226b;

        /* renamed from: c  reason: collision with root package name */
        public float f26227c;

        public void a(float f10, float f11, float f12) {
            this.f26225a = f10;
            this.f26226b = f11;
            this.f26227c = f12;
        }

        private e() {
        }

        public e(float f10, float f11, float f12) {
            this.f26225a = f10;
            this.f26226b = f11;
            this.f26227c = f12;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i10);

    void setRevealInfo(e eVar);
}
