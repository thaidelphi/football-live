package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.ng  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C2122ng implements C1G<Bitmap> {
    public static byte[] A06;
    public final int A00;
    public final int A01;
    public final String A02 = C2122ng.class.getSimpleName();
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 75);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{-110, -40, -47, -44, 3, 42, 53, 46, 34, 49, -31, 42, 52, -31, 47, 54, 45, 45, -55, -4, -25, -23, -12, -8, -19, -13, -14, -92, -24, -7, -10, -19, -14, -21, -92, -22, -19, -16, -23, -92, -25, -13, -15, -12, -10, -23, -9, -9, -19, -13, -14};
    }

    public C2122ng(int i10, int i11, boolean z10, boolean z11, boolean z12) {
        this.A01 = i10;
        this.A00 = i11;
        this.A05 = z10;
        this.A03 = z11;
        this.A04 = z12;
    }

    public static C1F<Bitmap> A00(Throwable th) {
        return new C1F<>(false, null, th);
    }

    private void A03(File file, Bitmap bitmap) throws IOException {
        if (bitmap == null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream2 = null;
        try {
            ByteArrayOutputStream compressedBitmapOS = new ByteArrayOutputStream();
            byteArrayOutputStream = compressedBitmapOS;
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            if (byteArrayOutputStream.size() >= 3145728) {
                return;
            }
            String str = file.getCanonicalPath() + A01(0, 4, 25);
            File file2 = new File(str);
            file2.createNewFile();
            fileOutputStream = new FileOutputStream(str);
            byteArrayOutputStream.writeTo(fileOutputStream);
            fileOutputStream.flush();
            fileInputStream = new FileInputStream(str);
            fileOutputStream2 = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream2.write(bArr, 0, read);
                } else {
                    file2.delete();
                    return;
                }
            }
        } finally {
            C1Z.A07(byteArrayOutputStream);
            C1Z.A07(fileOutputStream);
            C1Z.A07(fileInputStream);
            C1Z.A07(fileOutputStream2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C1G
    public final C1F<Bitmap> A3n(File file, C1Y c1y) {
        if (!this.A04) {
            return new C1F<>(true, null);
        }
        try {
            Bitmap A03 = C1Z.A03(file.getCanonicalPath(), this.A01, this.A00, this.A05);
            if (A03 != null) {
                return new C1F<>(true, A03);
            }
            c1y.AAo(new C2114nX(A01(4, 14, 118)));
            return A00(null);
        } catch (Throwable t10) {
            file.delete();
            c1y.AAo(t10);
            return A00(t10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C1G
    public final void A53(File file, C1Y c1y) throws C2114nX {
        if (this.A03) {
            try {
                Bitmap bitmap = C1Z.A03(file.getCanonicalPath(), this.A01, this.A00, this.A05);
                if (bitmap != null) {
                    A03(file, bitmap);
                } else {
                    file.delete();
                    throw new C2114nX(A01(4, 14, 118));
                }
            } catch (C2114nX e8) {
                c1y.AAz(e8);
                throw e8;
            } catch (Throwable th) {
                c1y.AAz(th);
                Throwable t10 = new C2114nX(A01(18, 33, 57), th);
                throw t10;
            }
        }
    }
}
