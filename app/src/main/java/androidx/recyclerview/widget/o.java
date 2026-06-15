package androidx.recyclerview.widget;

import android.view.View;
/* compiled from: ViewBoundsCheck.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class o {

    /* renamed from: a  reason: collision with root package name */
    final b f4129a;

    /* renamed from: b  reason: collision with root package name */
    a f4130b = new a();

    /* compiled from: ViewBoundsCheck.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f4131a = 0;

        /* renamed from: b  reason: collision with root package name */
        int f4132b;

        /* renamed from: c  reason: collision with root package name */
        int f4133c;

        /* renamed from: d  reason: collision with root package name */
        int f4134d;

        /* renamed from: e  reason: collision with root package name */
        int f4135e;

        a() {
        }

        void a(int i10) {
            this.f4131a = i10 | this.f4131a;
        }

        boolean b() {
            int i10 = this.f4131a;
            if ((i10 & 7) == 0 || (i10 & (c(this.f4134d, this.f4132b) << 0)) != 0) {
                int i11 = this.f4131a;
                if ((i11 & 112) == 0 || (i11 & (c(this.f4134d, this.f4133c) << 4)) != 0) {
                    int i12 = this.f4131a;
                    if ((i12 & 1792) == 0 || (i12 & (c(this.f4135e, this.f4132b) << 8)) != 0) {
                        int i13 = this.f4131a;
                        return (i13 & 28672) == 0 || (i13 & (c(this.f4135e, this.f4133c) << 12)) != 0;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        void d() {
            this.f4131a = 0;
        }

        void e(int i10, int i11, int i12, int i13) {
            this.f4132b = i10;
            this.f4133c = i11;
            this.f4134d = i12;
            this.f4135e = i13;
        }
    }

    /* compiled from: ViewBoundsCheck.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    interface b {
        View a(int i10);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(b bVar) {
        this.f4129a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View a(int i10, int i11, int i12, int i13) {
        int c10 = this.f4129a.c();
        int d10 = this.f4129a.d();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View a10 = this.f4129a.a(i10);
            this.f4130b.e(c10, d10, this.f4129a.b(a10), this.f4129a.e(a10));
            if (i12 != 0) {
                this.f4130b.d();
                this.f4130b.a(i12);
                if (this.f4130b.b()) {
                    return a10;
                }
            }
            if (i13 != 0) {
                this.f4130b.d();
                this.f4130b.a(i13);
                if (this.f4130b.b()) {
                    view = a10;
                }
            }
            i10 += i14;
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(View view, int i10) {
        this.f4130b.e(this.f4129a.c(), this.f4129a.d(), this.f4129a.b(view), this.f4129a.e(view));
        if (i10 != 0) {
            this.f4130b.d();
            this.f4130b.a(i10);
            return this.f4130b.b();
        }
        return false;
    }
}
