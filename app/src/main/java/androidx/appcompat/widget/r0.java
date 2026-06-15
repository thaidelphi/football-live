package androidx.appcompat.widget;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: RtlSpacingHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class r0 {

    /* renamed from: a  reason: collision with root package name */
    private int f1719a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f1720b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f1721c = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: d  reason: collision with root package name */
    private int f1722d = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: e  reason: collision with root package name */
    private int f1723e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f1724f = 0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1725g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1726h = false;

    public int a() {
        return this.f1725g ? this.f1719a : this.f1720b;
    }

    public int b() {
        return this.f1719a;
    }

    public int c() {
        return this.f1720b;
    }

    public int d() {
        return this.f1725g ? this.f1720b : this.f1719a;
    }

    public void e(int i10, int i11) {
        this.f1726h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f1723e = i10;
            this.f1719a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1724f = i11;
            this.f1720b = i11;
        }
    }

    public void f(boolean z10) {
        if (z10 == this.f1725g) {
            return;
        }
        this.f1725g = z10;
        if (!this.f1726h) {
            this.f1719a = this.f1723e;
            this.f1720b = this.f1724f;
        } else if (z10) {
            int i10 = this.f1722d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = this.f1723e;
            }
            this.f1719a = i10;
            int i11 = this.f1721c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f1724f;
            }
            this.f1720b = i11;
        } else {
            int i12 = this.f1721c;
            if (i12 == Integer.MIN_VALUE) {
                i12 = this.f1723e;
            }
            this.f1719a = i12;
            int i13 = this.f1722d;
            if (i13 == Integer.MIN_VALUE) {
                i13 = this.f1724f;
            }
            this.f1720b = i13;
        }
    }

    public void g(int i10, int i11) {
        this.f1721c = i10;
        this.f1722d = i11;
        this.f1726h = true;
        if (this.f1725g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f1719a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f1720b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1719a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1720b = i11;
        }
    }
}
