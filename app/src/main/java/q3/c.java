package q3;

import a5.p0;
import android.media.MediaCodec;
/* compiled from: CryptoInfo.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f30066a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f30067b;

    /* renamed from: c  reason: collision with root package name */
    public int f30068c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f30069d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f30070e;

    /* renamed from: f  reason: collision with root package name */
    public int f30071f;

    /* renamed from: g  reason: collision with root package name */
    public int f30072g;

    /* renamed from: h  reason: collision with root package name */
    public int f30073h;

    /* renamed from: i  reason: collision with root package name */
    private final MediaCodec.CryptoInfo f30074i;

    /* renamed from: j  reason: collision with root package name */
    private final b f30075j;

    /* compiled from: CryptoInfo.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final MediaCodec.CryptoInfo f30076a;

        /* renamed from: b  reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f30077b;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i10, int i11) {
            this.f30077b.set(i10, i11);
            this.f30076a.setPattern(this.f30077b);
        }

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f30076a = cryptoInfo;
            this.f30077b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f30074i = cryptoInfo;
        this.f30075j = p0.f482a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f30074i;
    }

    public void b(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f30069d == null) {
            int[] iArr = new int[1];
            this.f30069d = iArr;
            this.f30074i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f30069d;
        iArr2[0] = iArr2[0] + i10;
    }

    public void c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f30071f = i10;
        this.f30069d = iArr;
        this.f30070e = iArr2;
        this.f30067b = bArr;
        this.f30066a = bArr2;
        this.f30068c = i11;
        this.f30072g = i12;
        this.f30073h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f30074i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (p0.f482a >= 24) {
            ((b) a5.a.e(this.f30075j)).b(i12, i13);
        }
    }
}
