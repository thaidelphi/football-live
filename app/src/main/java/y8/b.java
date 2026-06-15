package y8;

import j8.e0;
import java.util.NoSuchElementException;
/* compiled from: ProgressionIterators.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class b extends e0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f33324a;

    /* renamed from: b  reason: collision with root package name */
    private final int f33325b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f33326c;

    /* renamed from: d  reason: collision with root package name */
    private int f33327d;

    public b(int i10, int i11, int i12) {
        this.f33324a = i12;
        this.f33325b = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f33326c = z10;
        this.f33327d = z10 ? i10 : i11;
    }

    @Override // j8.e0
    public int a() {
        int i10 = this.f33327d;
        if (i10 == this.f33325b) {
            if (this.f33326c) {
                this.f33326c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f33327d = this.f33324a + i10;
        }
        return i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f33326c;
    }
}
