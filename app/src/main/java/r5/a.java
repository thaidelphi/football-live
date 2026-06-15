package r5;

import android.graphics.Typeface;
/* compiled from: CancelableFontCallback.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Typeface f30386a;

    /* renamed from: b  reason: collision with root package name */
    private final InterfaceC0348a f30387b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f30388c;

    /* compiled from: CancelableFontCallback.java */
    /* renamed from: r5.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface InterfaceC0348a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0348a interfaceC0348a, Typeface typeface) {
        this.f30386a = typeface;
        this.f30387b = interfaceC0348a;
    }

    private void d(Typeface typeface) {
        if (this.f30388c) {
            return;
        }
        this.f30387b.a(typeface);
    }

    @Override // r5.f
    public void a(int i10) {
        d(this.f30386a);
    }

    @Override // r5.f
    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }

    public void c() {
        this.f30388c = true;
    }
}
