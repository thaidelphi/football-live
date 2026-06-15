package v3;

import s3.t;
/* compiled from: TrackEncryptionBox.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f31849a;

    /* renamed from: b  reason: collision with root package name */
    public final String f31850b;

    /* renamed from: c  reason: collision with root package name */
    public final t.a f31851c;

    /* renamed from: d  reason: collision with root package name */
    public final int f31852d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f31853e;

    public j(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        a5.a.a((bArr2 == null) ^ (i10 == 0));
        this.f31849a = z10;
        this.f31850b = str;
        this.f31852d = i10;
        this.f31853e = bArr2;
        this.f31851c = new t.a(a(str), bArr, i11, i12);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 2;
            case 2:
            case 3:
                break;
            default:
                a5.t.i("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                break;
        }
        return 1;
    }
}
