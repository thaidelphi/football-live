package p2;

import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import s2.k;
/* compiled from: CustomTarget.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class c<T> implements h<T> {

    /* renamed from: a  reason: collision with root package name */
    private final int f29535a;

    /* renamed from: b  reason: collision with root package name */
    private final int f29536b;

    /* renamed from: c  reason: collision with root package name */
    private o2.c f29537c;

    public c() {
        this(RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);
    }

    @Override // p2.h
    public final void b(g gVar) {
    }

    @Override // p2.h
    public final void c(o2.c cVar) {
        this.f29537c = cVar;
    }

    @Override // p2.h
    public void d(Drawable drawable) {
    }

    @Override // p2.h
    public final o2.c e() {
        return this.f29537c;
    }

    @Override // p2.h
    public final void g(g gVar) {
        gVar.d(this.f29535a, this.f29536b);
    }

    @Override // p2.h
    public void h(Drawable drawable) {
    }

    @Override // l2.m
    public void onDestroy() {
    }

    @Override // l2.m
    public void onStart() {
    }

    @Override // l2.m
    public void onStop() {
    }

    public c(int i10, int i11) {
        if (k.t(i10, i11)) {
            this.f29535a = i10;
            this.f29536b = i11;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i10 + " and height: " + i11);
    }
}
