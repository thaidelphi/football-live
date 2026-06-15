package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class SafeParcelReader {

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class ParseException extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ParseException(java.lang.String r3, android.os.Parcel r4) {
            /*
                r2 = this;
                int r0 = r4.dataPosition()
                int r4 = r4.dataSize()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " Parcel: pos="
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = " size="
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    private SafeParcelReader() {
    }

    public static float A(Parcel parcel, int i10) {
        L(parcel, i10, 4);
        return parcel.readFloat();
    }

    public static Float B(Parcel parcel, int i10) {
        int H = H(parcel, i10);
        if (H == 0) {
            return null;
        }
        K(parcel, i10, H, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int C(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder D(Parcel parcel, int i10) {
        int H = H(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + H);
        return readStrongBinder;
    }

    public static int E(Parcel parcel, int i10) {
        L(parcel, i10, 4);
        return parcel.readInt();
    }

    public static long F(Parcel parcel, int i10) {
        L(parcel, i10, 8);
        return parcel.readLong();
    }

    public static Long G(Parcel parcel, int i10) {
        int H = H(parcel, i10);
        if (H == 0) {
            return null;
        }
        K(parcel, i10, H, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int H(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void I(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + H(parcel, i10));
    }

    public static int J(Parcel parcel) {
        int C = C(parcel);
        int H = H(parcel, C);
        int v10 = v(C);
        int dataPosition = parcel.dataPosition();
        if (v10 == 20293) {
            int i10 = H + dataPosition;
            if (i10 < dataPosition || i10 > parcel.dataSize()) {
                throw new ParseException("Size read is invalid start=" + dataPosition + " end=" + i10, parcel);
            }
            return i10;
        }
        throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(C))), parcel);
    }

    private static void K(Parcel parcel, int i10, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        String hexString = Integer.toHexString(i11);
        throw new ParseException("Expected size " + i12 + " got " + i11 + " (0x" + hexString + ")", parcel);
    }

    private static void L(Parcel parcel, int i10, int i11) {
        int H = H(parcel, i10);
        if (H == i11) {
            return;
        }
        String hexString = Integer.toHexString(H);
        throw new ParseException("Expected size " + i11 + " got " + H + " (0x" + hexString + ")", parcel);
    }

    public static BigDecimal a(Parcel parcel, int i10) {
        int H = H(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + H);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public static BigDecimal[] b(Parcel parcel, int i10) {
        int H = H(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i11] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + H);
        return bigDecimalArr;
    }

    public static BigInteger c(Parcel parcel, int i10) {
        int H = H(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + H);
        return new BigInteger(createByteArray);
    }

    public static BigInteger[] d(Parcel parcel, int i10) {
        int H = H(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            bigIntegerArr[i11] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + H);
        return bigIntegerArr;
    }

    public static boolean[] e(Parcel parcel, int i10) {
        int H = H(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + H);
        return createBooleanArray;
    }

    public static Bundle f(Parcel parcel, int i10) {
        int H = H(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + H);
        return readBundle;
    }

    public static byte[] g(Parcel parcel, int i10) {
        int H = H(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + H);
        return createByteArray;
    }

    public static double[] h(Parcel parcel, int i10) {
        int H = H(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + H);
        return createDoubleArray;
    }

    public static float[] i(Parcel parcel, int i10) {
        int H = H(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + H);
        return createFloatArray;
    }

    public static int[] j(Parcel parcel, int i10) {
        int H = H(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + H);
        return createIntArray;
    }

    public static ArrayList<Integer> k(Parcel parcel, int i10) {
        int H = H(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + H);
        return arrayList;
    }

    public static long[] l(Parcel parcel, int i10) {
        int H = H(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + H);
        return createLongArray;
    }

    public static Parcel m(Parcel parcel, int i10) {
        int H = H(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, H);
        parcel.setDataPosition(dataPosition + H);
        return obtain;
    }

    public static Parcel[] n(Parcel parcel, int i10) {
        int H = H(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i11] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i11] = null;
            }
        }
        parcel.setDataPosition(dataPosition + H);
        return parcelArr;
    }

    public static <T extends Parcelable> T o(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int H = H(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + H);
        return createFromParcel;
    }

    public static String p(Parcel parcel, int i10) {
        int H = H(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + H);
        return readString;
    }

    public static String[] q(Parcel parcel, int i10) {
        int H = H(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + H);
        return createStringArray;
    }

    public static ArrayList<String> r(Parcel parcel, int i10) {
        int H = H(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + H);
        return createStringArrayList;
    }

    public static <T> T[] s(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int H = H(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + H);
        return tArr;
    }

    public static <T> ArrayList<T> t(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int H = H(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + H);
        return createTypedArrayList;
    }

    public static void u(Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        throw new ParseException("Overread allowed size end=" + i10, parcel);
    }

    public static int v(int i10) {
        return (char) i10;
    }

    public static boolean w(Parcel parcel, int i10) {
        L(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean x(Parcel parcel, int i10) {
        int H = H(parcel, i10);
        if (H == 0) {
            return null;
        }
        K(parcel, i10, H, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static double y(Parcel parcel, int i10) {
        L(parcel, i10, 8);
        return parcel.readDouble();
    }

    public static Double z(Parcel parcel, int i10) {
        int H = H(parcel, i10);
        if (H == 0) {
            return null;
        }
        K(parcel, i10, H, 8);
        return Double.valueOf(parcel.readDouble());
    }
}
