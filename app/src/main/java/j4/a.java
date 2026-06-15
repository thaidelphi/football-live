package j4;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import z4.s0;
/* compiled from: Aes128DataSource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class a implements z4.l {

    /* renamed from: a  reason: collision with root package name */
    private final z4.l f26934a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f26935b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f26936c;

    /* renamed from: d  reason: collision with root package name */
    private CipherInputStream f26937d;

    public a(z4.l lVar, byte[] bArr, byte[] bArr2) {
        this.f26934a = lVar;
        this.f26935b = bArr;
        this.f26936c = bArr2;
    }

    @Override // z4.i
    public final int b(byte[] bArr, int i10, int i11) throws IOException {
        a5.a.e(this.f26937d);
        int read = this.f26937d.read(bArr, i10, i11);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    @Override // z4.l
    public void close() throws IOException {
        if (this.f26937d != null) {
            this.f26937d = null;
            this.f26934a.close();
        }
    }

    @Override // z4.l
    public final Map<String, List<String>> d() {
        return this.f26934a.d();
    }

    @Override // z4.l
    public final void i(s0 s0Var) {
        a5.a.e(s0Var);
        this.f26934a.i(s0Var);
    }

    @Override // z4.l
    public final long l(z4.p pVar) throws IOException {
        try {
            Cipher o10 = o();
            try {
                o10.init(2, new SecretKeySpec(this.f26935b, "AES"), new IvParameterSpec(this.f26936c));
                z4.n nVar = new z4.n(this.f26934a, pVar);
                this.f26937d = new CipherInputStream(nVar, o10);
                nVar.b();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e8) {
                throw new RuntimeException(e8);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // z4.l
    public final Uri m() {
        return this.f26934a.m();
    }

    protected Cipher o() throws NoSuchPaddingException, NoSuchAlgorithmException {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }
}
