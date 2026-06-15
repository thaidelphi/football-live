package x8;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.n;
/* compiled from: PlatformThreadLocalRandom.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class a extends w8.a {
    @Override // w8.c
    public long e(long j10, long j11) {
        return ThreadLocalRandom.current().nextLong(j10, j11);
    }

    @Override // w8.a
    public Random f() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        n.e(current, "current()");
        return current;
    }
}
