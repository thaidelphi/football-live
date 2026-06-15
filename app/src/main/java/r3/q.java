package r3;

import a5.p0;
import java.util.UUID;
/* compiled from: FrameworkCryptoConfig.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class q implements q3.b {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f30369d;

    /* renamed from: a  reason: collision with root package name */
    public final UUID f30370a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f30371b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f30372c;

    static {
        boolean z10;
        if ("Amazon".equals(p0.f484c)) {
            String str = p0.f485d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f30369d = z10;
            }
        }
        z10 = false;
        f30369d = z10;
    }

    public q(UUID uuid, byte[] bArr, boolean z10) {
        this.f30370a = uuid;
        this.f30371b = bArr;
        this.f30372c = z10;
    }
}
