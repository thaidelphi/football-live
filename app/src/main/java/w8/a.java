package w8;

import java.util.Random;
/* compiled from: PlatformRandom.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class a extends c {
    @Override // w8.c
    public int b(int i10) {
        return d.d(f().nextInt(), i10);
    }

    @Override // w8.c
    public int c() {
        return f().nextInt();
    }

    @Override // w8.c
    public long d() {
        return f().nextLong();
    }

    public abstract Random f();
}
