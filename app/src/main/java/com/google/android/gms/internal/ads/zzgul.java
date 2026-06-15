package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzgul;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzgul<MessageType extends zzgul<MessageType, BuilderType>, BuilderType extends zzguk<MessageType, BuilderType>> implements zzgxv {
    protected int zzq = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T> void zzaQ(Iterable<T> iterable, List<? super T> list) {
        zzguk.zzbd(iterable, list);
    }

    protected static void zzaR(zzgvc zzgvcVar) throws IllegalArgumentException {
        if (!zzgvcVar.zzp()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String zzdF(String str) {
        String name = getClass().getName();
        return "Serializing " + name + " to a " + str + " threw an IOException (should never happen).";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zzaL() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zzaM(zzgyo zzgyoVar) {
        return zzaL();
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public zzgvc zzaN() {
        try {
            int zzaY = zzaY();
            zzgvc zzgvcVar = zzgvc.zzb;
            byte[] bArr = new byte[zzaY];
            int i10 = zzgvp.zzf;
            zzgvl zzgvlVar = new zzgvl(bArr, 0, zzaY);
            zzcY(zzgvlVar);
            zzgvlVar.zzF();
            return new zzguz(bArr);
        } catch (IOException e8) {
            throw new RuntimeException(zzdF("ByteString"), e8);
        }
    }

    public zzgya zzaO() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgyz zzaP() {
        return new zzgyz(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zzaS(int i10) {
        throw new UnsupportedOperationException();
    }

    public void zzaT(OutputStream outputStream) throws IOException {
        int zzaY = zzaY();
        zzgvn zzgvnVar = new zzgvn(outputStream, zzgvp.zzB(zzgvp.zzD(zzaY) + zzaY));
        zzgvnVar.zzu(zzaY);
        zzcY(zzgvnVar);
        zzgvnVar.zzK();
    }

    public void zzaU(OutputStream outputStream) throws IOException {
        zzgvn zzgvnVar = new zzgvn(outputStream, zzgvp.zzB(zzaY()));
        zzcY(zzgvnVar);
        zzgvnVar.zzK();
    }

    public byte[] zzaV() {
        try {
            int zzaY = zzaY();
            byte[] bArr = new byte[zzaY];
            int i10 = zzgvp.zzf;
            zzgvl zzgvlVar = new zzgvl(bArr, 0, zzaY);
            zzcY(zzgvlVar);
            zzgvlVar.zzF();
            return bArr;
        } catch (IOException e8) {
            throw new RuntimeException(zzdF("byte array"), e8);
        }
    }
}
