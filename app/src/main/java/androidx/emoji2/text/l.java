package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: MetadataRepo.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final d0.b f3116a;

    /* renamed from: b  reason: collision with root package name */
    private final char[] f3117b;

    /* renamed from: c  reason: collision with root package name */
    private final a f3118c = new a(1024);

    /* renamed from: d  reason: collision with root package name */
    private final Typeface f3119d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MetadataRepo.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final SparseArray<a> f3120a;

        /* renamed from: b  reason: collision with root package name */
        private f f3121b;

        private a() {
            this(1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a a(int i10) {
            SparseArray<a> sparseArray = this.f3120a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final f b() {
            return this.f3121b;
        }

        void c(f fVar, int i10, int i11) {
            a a10 = a(fVar.b(i10));
            if (a10 == null) {
                a10 = new a();
                this.f3120a.put(fVar.b(i10), a10);
            }
            if (i11 > i10) {
                a10.c(fVar, i10 + 1, i11);
            } else {
                a10.f3121b = fVar;
            }
        }

        a(int i10) {
            this.f3120a = new SparseArray<>(i10);
        }
    }

    private l(Typeface typeface, d0.b bVar) {
        this.f3119d = typeface;
        this.f3116a = bVar;
        this.f3117b = new char[bVar.k() * 2];
        a(bVar);
    }

    private void a(d0.b bVar) {
        int k10 = bVar.k();
        for (int i10 = 0; i10 < k10; i10++) {
            f fVar = new f(this, i10);
            Character.toChars(fVar.f(), this.f3117b, i10 * 2);
            h(fVar);
        }
    }

    public static l b(Typeface typeface, ByteBuffer byteBuffer) throws IOException {
        try {
            androidx.core.os.n.a("EmojiCompat.MetadataRepo.create");
            return new l(typeface, k.b(byteBuffer));
        } finally {
            androidx.core.os.n.b();
        }
    }

    public char[] c() {
        return this.f3117b;
    }

    public d0.b d() {
        return this.f3116a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f3116a.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a f() {
        return this.f3118c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Typeface g() {
        return this.f3119d;
    }

    void h(f fVar) {
        androidx.core.util.i.g(fVar, "emoji metadata cannot be null");
        androidx.core.util.i.a(fVar.c() > 0, "invalid metadata codepoint length");
        this.f3118c.c(fVar, 0, fVar.c() - 1);
    }
}
