package r2;

import android.content.Context;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import s2.k;
import w1.f;
/* compiled from: AndroidResourceSignature.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a implements f {

    /* renamed from: b  reason: collision with root package name */
    private final int f30346b;

    /* renamed from: c  reason: collision with root package name */
    private final f f30347c;

    private a(int i10, f fVar) {
        this.f30346b = i10;
        this.f30347c = fVar;
    }

    public static f c(Context context) {
        return new a(context.getResources().getConfiguration().uiMode & 48, b.c(context));
    }

    @Override // w1.f
    public void b(MessageDigest messageDigest) {
        this.f30347c.b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f30346b).array());
    }

    @Override // w1.f
    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f30346b == aVar.f30346b && this.f30347c.equals(aVar.f30347c);
        }
        return false;
    }

    @Override // w1.f
    public int hashCode() {
        return k.o(this.f30347c, this.f30346b);
    }
}
