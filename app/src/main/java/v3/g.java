package v3;

import a5.c0;
import a5.t;
import java.nio.ByteBuffer;
import java.util.UUID;
/* compiled from: PsshAtomUtil.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PsshAtomUtil.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final UUID f31834a;

        /* renamed from: b  reason: collision with root package name */
        private final int f31835b;

        /* renamed from: c  reason: collision with root package name */
        private final byte[] f31836c;

        public a(UUID uuid, int i10, byte[] bArr) {
            this.f31834a = uuid;
            this.f31835b = i10;
            this.f31836c = bArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    private static a d(byte[] bArr) {
        c0 c0Var = new c0(bArr);
        if (c0Var.f() < 32) {
            return null;
        }
        c0Var.K(0);
        if (c0Var.n() == c0Var.a() + 4 && c0Var.n() == 1886614376) {
            int c10 = v3.a.c(c0Var.n());
            if (c10 > 1) {
                t.i("PsshAtomUtil", "Unsupported pssh version: " + c10);
                return null;
            }
            UUID uuid = new UUID(c0Var.t(), c0Var.t());
            if (c10 == 1) {
                c0Var.L(c0Var.D() * 16);
            }
            int D = c0Var.D();
            if (D != c0Var.a()) {
                return null;
            }
            byte[] bArr2 = new byte[D];
            c0Var.j(bArr2, 0, D);
            return new a(uuid, c10, bArr2);
        }
        return null;
    }

    public static byte[] e(byte[] bArr, UUID uuid) {
        a d10 = d(bArr);
        if (d10 == null) {
            return null;
        }
        if (uuid.equals(d10.f31834a)) {
            return d10.f31836c;
        }
        t.i("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + d10.f31834a + ".");
        return null;
    }

    public static UUID f(byte[] bArr) {
        a d10 = d(bArr);
        if (d10 == null) {
            return null;
        }
        return d10.f31834a;
    }

    public static int g(byte[] bArr) {
        a d10 = d(bArr);
        if (d10 == null) {
            return -1;
        }
        return d10.f31835b;
    }
}
