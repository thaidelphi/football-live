package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: LayoutState.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class f {

    /* renamed from: b  reason: collision with root package name */
    int f4096b;

    /* renamed from: c  reason: collision with root package name */
    int f4097c;

    /* renamed from: d  reason: collision with root package name */
    int f4098d;

    /* renamed from: e  reason: collision with root package name */
    int f4099e;

    /* renamed from: h  reason: collision with root package name */
    boolean f4102h;

    /* renamed from: i  reason: collision with root package name */
    boolean f4103i;

    /* renamed from: a  reason: collision with root package name */
    boolean f4095a = true;

    /* renamed from: f  reason: collision with root package name */
    int f4100f = 0;

    /* renamed from: g  reason: collision with root package name */
    int f4101g = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(RecyclerView.z zVar) {
        int i10 = this.f4097c;
        return i10 >= 0 && i10 < zVar.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View b(RecyclerView.v vVar) {
        View o10 = vVar.o(this.f4097c);
        this.f4097c += this.f4098d;
        return o10;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f4096b + ", mCurrentPosition=" + this.f4097c + ", mItemDirection=" + this.f4098d + ", mLayoutDirection=" + this.f4099e + ", mStartLine=" + this.f4100f + ", mEndLine=" + this.f4101g + '}';
    }
}
