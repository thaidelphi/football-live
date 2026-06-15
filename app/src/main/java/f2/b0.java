package f2;

import android.graphics.Bitmap;
/* compiled from: UnitBitmapDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b0 implements w1.j<Bitmap, Bitmap> {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UnitBitmapDecoder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a implements y1.v<Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        private final Bitmap f25297a;

        a(Bitmap bitmap) {
            this.f25297a = bitmap;
        }

        @Override // y1.v
        public void a() {
        }

        @Override // y1.v
        public Class<Bitmap> b() {
            return Bitmap.class;
        }

        @Override // y1.v
        /* renamed from: c */
        public Bitmap get() {
            return this.f25297a;
        }

        @Override // y1.v
        public int getSize() {
            return s2.k.g(this.f25297a);
        }
    }

    @Override // w1.j
    /* renamed from: c */
    public y1.v<Bitmap> a(Bitmap bitmap, int i10, int i11, w1.h hVar) {
        return new a(bitmap);
    }

    @Override // w1.j
    /* renamed from: d */
    public boolean b(Bitmap bitmap, w1.h hVar) {
        return true;
    }
}
