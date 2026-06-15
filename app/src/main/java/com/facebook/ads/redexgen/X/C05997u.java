package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.7u  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C05997u {
    public static byte[] A02;
    public static String[] A03 = {"hUOGynEtmSUNsKdJkghkOGNAWtryygzy", "wzPRxUupX2XKUl6NSNI9kT750batbohw", "Jhw1FAiFO5yEDnp58HFyVFkAnHcYvwe5", "TOMeOtqGrF4uQ0cY9hasq1ESWlFY5vR9", "yYpnUvpVzVqKhRvrciBHRtLUwNGFzaUs", "hHaB", "31TBXmQRr4tlfWcucEg5Ko3P35yO7", "Q2"};
    public static final String A04;
    public static volatile C05997u A05;
    public final C1899k0 A00;
    public final Map<String, C05967r> A01 = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private Bitmap A02(AnonymousClass85 anonymousClass85, C05967r c05967r, String str) {
        Bitmap A01;
        String str2 = c05967r.A07;
        int i10 = c05967r.A03;
        int i11 = c05967r.A04;
        long currentTimeMillis = System.currentTimeMillis();
        IOException e8 = null;
        String A08 = A08(223, 9, 68);
        boolean startsWith = str2.startsWith(A08);
        String A082 = A08(239, 22, 119);
        if (startsWith || str2.startsWith(A082)) {
            String substring = str2.startsWith(A08) ? str2.substring(A08.length()) : str2.substring(A082.length());
            InputStream inputStream = null;
            try {
                try {
                    inputStream = this.A00.getAssets().open(substring);
                    if (A0C(i10, i11)) {
                        try {
                            A01 = AbstractC06037y.A01(inputStream, i10, i11);
                        } catch (IOException e10) {
                            e = e10;
                            A0B(e);
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            return null;
                        } catch (OutOfMemoryError e11) {
                            e = e11;
                            A0B(e);
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            throw th;
                        }
                    } else {
                        A01 = BitmapFactory.decodeStream(inputStream);
                    }
                    if (inputStream != null) {
                        A0A(inputStream);
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e12) {
                e = e12;
            } catch (OutOfMemoryError e13) {
                e = e13;
            } catch (Throwable th3) {
                th = th3;
            }
        } else if (A0C(i10, i11)) {
            try {
                A01 = A05(str2, i10, i11);
            } catch (IOException e14) {
                e8 = e14;
                A0B(e8);
                A01 = A03(str2);
            }
        } else {
            A01 = A03(str2);
        }
        String th4 = e8 != null ? e8.toString() : null;
        if (A01 == null) {
            C06017w.A03(anonymousClass85, c05967r, str, C06017w.A03, th4, null, null);
            return null;
        }
        long A00 = A00(str2, A01);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (A00 > 0) {
            C06017w.A03(anonymousClass85, c05967r, str, C06017w.A02, th4, Long.valueOf(A00), Long.valueOf(currentTimeMillis2));
            return A01;
        }
        C06017w.A03(anonymousClass85, c05967r, str, C06017w.A01, th4, null, null);
        if (C06419m.A10(anonymousClass85)) {
            return null;
        }
        return A01;
    }

    public static String A08(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 67);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A02 = new byte[]{3, 4, 119, 41, 55, 62, 58, 25, 28, 88, 23, 13, 12, 8, 13, 12, 88, 28, 29, 11, 12, 17, 22, 25, 12, 17, 23, 22, 88, 80, 30, 17, 20, 29, 69, 122, 81, 76, 85, 89, 72, 24, 75, 81, 66, 93, 24, 93, 64, 91, 93, 93, 92, 75, 24, 85, 89, 64, 24, 75, 81, 66, 93, 24, 94, 87, 74, 24, 75, 76, 87, 74, 89, 95, 93, 2, 24, 18, 48, 50, 57, 52, 113, 52, 35, 35, 62, 35, Byte.MAX_VALUE, 113, 19, 56, 37, 60, 48, 33, 113, 56, 34, 113, 63, 36, 61, 61, Byte.MAX_VALUE, 125, 90, 82, 87, 94, 95, 27, 79, 84, 27, 88, 84, 75, 66, 27, 87, 84, 88, 90, 87, 27, 82, 86, 90, 92, 94, 27, 82, 85, 79, 84, 27, 88, 90, 88, 83, 94, 27, 19, 78, 73, 87, 6, 38, 29, 18, 17, 31, 22, 83, 7, 28, 83, 4, 1, 26, 7, 22, 83, 17, 26, 7, 30, 18, 3, 83, 7, 28, 83, 21, 26, 31, 22, 83, 91, 6, 1, 31, 78, 70, 125, 114, 113, Byte.MAX_VALUE, 118, 51, 103, 124, 51, 100, 97, 122, 103, 118, 51, 113, 122, 103, 126, 114, 99, 51, 103, 124, 51, 124, 102, 103, 99, 102, 103, 51, 96, 103, 97, 118, 114, 126, 102, 116, 116, 98, 115, 61, 40, 40, 40, 85, 90, 95, 86, 9, 28, 28, 82, 93, 88, 81, 14, 27, 27, 27, 85, 90, 80, 70, 91, 93, 80, 107, 85, 71, 71, 81, 64, 27, 115, 119, 123, 125, Byte.MAX_VALUE, 10, 9, 7, 2, 42, 49, 52, 49, 48, 40, 49};
    }

    static {
        A09();
        A04 = C05997u.class.getSimpleName();
    }

    public C05997u(C1899k0 c1899k0) {
        this.A00 = c1899k0;
    }

    private int A00(String str, Bitmap bitmap) {
        String A08 = A08(0, 2, 105);
        if (bitmap == null) {
            A0B(null);
            return 0;
        }
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 26));
        ByteArrayOutputStream bOut = null;
        FileOutputStream fileOutputStream = null;
        try {
            bOut = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, bOut);
            int size = bOut.size();
            if (size >= C06419m.A0G(this.A00)) {
                A0B(new Throwable(A08(35, 42, 123) + size));
                return 0;
            }
            fileOutputStream = new FileOutputStream(file);
            bOut.writeTo(fileOutputStream);
            fileOutputStream.flush();
            return size;
        } catch (OutOfMemoryError e8) {
            A0B(e8);
            Log.e(A04, A08(184, 39, 80), e8);
            return 0;
        } catch (FileNotFoundException e10) {
            Log.e(A04, A08(6, 29, 59) + file.getPath() + A08, e10);
            A0B(e10);
            return 0;
        } catch (IOException e11) {
            A0B(e11);
            Log.e(A04, A08(148, 36, 48) + str + A08, e11);
            return 0;
        } finally {
            A0A(bOut);
            A0A(fileOutputStream);
        }
    }

    private final Bitmap A01(AnonymousClass85 anonymousClass85, C05967r c05967r, int i10, int i11, String str) {
        if (C06017w.A06(anonymousClass85) && A08(266, 4, 37).equals(str)) {
            this.A01.put(c05967r.A07, c05967r);
        }
        String str2 = c05967r.A07;
        C06007v c06007v = new C06007v(c05967r.A05, c05967r.A06, A08(261, 5, 89), str, str2);
        File A07 = A07(this.A00);
        StringBuilder append = new StringBuilder().append(str2.hashCode());
        String url = A08(2, 4, 26);
        File file = new File(A07, append.append(url).toString());
        if (!file.exists()) {
            C06017w.A04(anonymousClass85, c06007v, false);
            String url2 = A08(232, 7, 112);
            if (str2.startsWith(url2)) {
                if (A03[4].charAt(22) == 'U') {
                    throw new RuntimeException();
                }
                A03[4] = "1yvOkimt2rWPU4mmWW1HHQmjZRsiMbmk";
                String url3 = A08(239, 22, 119);
                if (!str2.startsWith(url3)) {
                    return A04(str2, i11, i10);
                }
            }
            return A02(anonymousClass85, c05967r, str);
        }
        C06017w.A04(anonymousClass85, c06007v, true);
        try {
            if (A0C(i11, i10)) {
                return AbstractC06037y.A02(file.getCanonicalPath(), i11, i10, this.A00);
            }
            String url4 = file.getCanonicalPath();
            return BitmapFactory.decodeFile(url4);
        } catch (IOException e8) {
            A0B(e8);
            return null;
        }
    }

    private Bitmap A03(String str) {
        byte[] A6s;
        JQ AG4 = C0880Jj.A00(this.A00).AG4(str, new C0876Jf());
        if (AG4 == null || (A6s = AG4.A6s()) == null) {
            return null;
        }
        int length = A6s.length;
        if (A03[4].charAt(22) != 'U') {
            A03[2] = "99IwdndnBnCK07hgvsXqxjXsnHcettbD";
            return BitmapFactory.decodeByteArray(A6s, 0, length);
        }
        throw new RuntimeException();
    }

    private Bitmap A04(String str, int i10, int i11) {
        Bitmap decodeStream;
        int A00;
        try {
            boolean A0C = A0C(i10, i11);
            String A08 = A08(232, 7, 112);
            if (A0C) {
                decodeStream = AbstractC06037y.A02(str.substring(A08.length()), i10, i11, this.A00);
            } else {
                decodeStream = BitmapFactory.decodeStream(new FileInputStream(str.substring(A08.length())), null, null);
            }
            A00 = A00(str, decodeStream);
        } catch (IOException e8) {
            Log.e(A04, A08(105, 43, 120) + str + A08(0, 2, 105), e8);
        }
        if (C06419m.A10(this.A00)) {
            if (A00 <= 0) {
                return null;
            }
            return decodeStream;
        }
        return decodeStream;
    }

    private Bitmap A05(String str, int i10, int i11) throws IOException {
        URL urlObj = new URL(str);
        HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
        connection.setDoInput(true);
        connection.connect();
        InputStream inputStream = connection.getInputStream();
        Bitmap A01 = AbstractC06037y.A01(inputStream, i10, i11);
        A0A(inputStream);
        return A01;
    }

    public static C05997u A06(C1899k0 c1899k0) {
        if (A05 == null) {
            synchronized (C05997u.class) {
                if (A05 == null) {
                    A05 = new C05997u(c1899k0);
                }
            }
        }
        return A05;
    }

    public static File A07(AnonymousClass85 anonymousClass85) {
        return anonymousClass85.getCacheDir();
    }

    public static void A0A(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    private void A0B(Throwable th) {
        String A08 = A08(261, 5, 89);
        if (th != null) {
            this.A00.A08().AAu(A08, AbstractC06048a.A1f, new C06058b(th));
        } else {
            this.A00.A08().AAu(A08, AbstractC06048a.A1f, new C06058b(A08(77, 28, 18)));
        }
    }

    private boolean A0C(int i10, int i11) {
        return i10 > 0 && i11 > 0;
    }

    public final Bitmap A0D(C05967r c05967r) {
        return A01(this.A00, c05967r, c05967r.A04, c05967r.A03, c05967r.A01);
    }

    public final Bitmap A0E(AnonymousClass85 anonymousClass85, String str, int i10, int i11, String str2) {
        C05967r c05967r = this.A01.get(str);
        return (!C06017w.A06(anonymousClass85) || c05967r == null) ? A01(anonymousClass85, new C05967r(str, i10, i11, A08(270, 7, 28), A08(270, 7, 28)), i11, i10, str2) : A01(anonymousClass85, c05967r, i11, i10, str2);
    }

    public final File A0F(String str) {
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 26));
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public final String A0G(String str) {
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 26));
        return file.exists() ? file.getPath() : str;
    }
}
