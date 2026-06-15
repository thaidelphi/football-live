package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.unity3d.services.core.di.ServiceProvider;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Zb  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1270Zb implements InterfaceC1058Qm {
    public static byte[] A05;
    public InterfaceC1453cf A00;
    public final int A01;
    public final long A02;
    public final Context A03;
    public final TO A04;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 20);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-124, -91, -90, -95, -75, -84, -76, -110, -91, -82, -92, -91, -78, -91, -78, -77, -122, -95, -93, -76, -81, -78, -71, -53, -8, -8, -11, -8, -90, -17, -12, -7, -6, -25, -12, -6, -17, -25, -6, -17, -12, -19, -90, -52, -52, -13, -10, -21, -19, -90, -21, -2, -6, -21, -12, -7, -17, -11, -12, -127, -82, -82, -85, -82, 92, -91, -86, -81, -80, -99, -86, -80, -91, -99, -80, -91, -86, -93, 92, -126, -120, 125, Byte.MAX_VALUE, 92, -95, -76, -80, -95, -86, -81, -91, -85, -86, 112, -99, -99, -102, -99, 75, -108, -103, -98, -97, -116, -103, -97, -108, -116, -97, -108, -103, -110, 75, 122, -101, -96, -98, 75, -112, -93, -97, -112, -103, -98, -108, -102, -103, 126, -85, -85, -88, -85, 89, -94, -89, -84, -83, -102, -89, -83, -94, -102, -83, -94, -89, -96, 89, -113, -119, 114, 89, -98, -79, -83, -98, -89, -84, -94, -88, -89, -115, -80, -94, -91, -90, -91, 97, -121, -89, -82, -79, -90, -88, -126, -74, -91, -86, -80, -109, -90, -81, -91, -90, -77, -90, -77, 111, 115, -106, -120, -117, -116, -117, 71, 115, -112, -119, -115, -109, -120, -118, 104, -100, -117, -112, -106, 121, -116, -107, -117, -116, -103, -116, -103, 85, -47, -12, -26, -23, -22, -23, -91, -47, -18, -25, -12, -11, -6, -8, -58, -6, -23, -18, -12, -41, -22, -13, -23, -22, -9, -22, -9, -77, -40, -5, -19, -16, -15, -16, -84, -40, -11, -18, 2, -4, 4, -30, -11, -16, -15, -5, -34, -15, -6, -16, -15, -2, -15, -2, -70, -12, 0, -2, -65, -8, 0, 0, -8, -3, -10, -65, -14, -1, -11, 3, 0, -6, -11, -65, -10, 9, 0, 1, -3, -14, 10, -10, 3, -61, -65, -10, 9, 5, -65, -9, -9, -2, 1, -10, -8, -65, -41, -9, -2, 1, -10, -8, -46, 6, -11, -6, 0, -29, -10, -1, -11, -10, 3, -10, 3, -64, -52, -54, -117, -60, -52, -52, -60, -55, -62, -117, -66, -53, -63, -49, -52, -58, -63, -117, -62, -43, -52, -51, -55, -66, -42, -62, -49, -113, -117, -62, -43, -47, -117, -61, -55, -66, -64, -117, -87, -58, -65, -61, -55, -66, -64, -98, -46, -63, -58, -52, -81, -62, -53, -63, -62, -49, -62, -49, -116, -104, -106, 87, -112, -104, -104, -112, -107, -114, 87, -118, -105, -115, -101, -104, -110, -115, 87, -114, -95, -104, -103, -107, -118, -94, -114, -101, 91, 87, -114, -95, -99, 87, -104, -103, -98, -100, 87, 117, -110, -117, -104, -103, -98, -100, 106, -98, -115, -110, -104, 123, -114, -105, -115, -114, -101, -114, -101, -67, -55, -57, -120, -63, -55, -55, -63, -58, -65, -120, -69, -56, -66, -52, -55, -61, -66, -120, -65, -46, -55, -54, -58, -69, -45, -65, -52, -116, -120, -65, -46, -50, -120, -48, -54, -109, -120, -90, -61, -68, -48, -54, -46, -80, -61, -66, -65, -55, -84, -65, -56, -66, -65, -52, -65, -52};
    }

    public C1270Zb(Context context) {
        this(context, 0);
    }

    public C1270Zb(Context context, int i10) {
        this(context, null, i10, ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT);
    }

    @Deprecated
    public C1270Zb(Context context, TO to, int i10, long j10) {
        this.A00 = new C1272Zd(this);
        this.A03 = context;
        this.A01 = i10;
        this.A02 = j10;
        this.A04 = to;
    }

    private final void A02(Context context, TO to, long j10, Handler handler, InterfaceC1727h8 interfaceC1727h8, int extensionRendererIndex, ArrayList<InterfaceC1259Yq> arrayList) {
        Class<?> cls;
        Class<?> clazz;
        Class<?> clazz2;
        Class<?> clazz3;
        arrayList.add(new C0T(context, C0954Mg.A0S, new C0951Md(null, false), ZS.A00, j10, to, false, false, handler, interfaceC1727h8, 50, 5, 0, 0, 0));
        if (extensionRendererIndex == 0) {
            return;
        }
        int size = arrayList.size();
        if (extensionRendererIndex == 2) {
            size--;
        }
        try {
            try {
                cls = Class.forName(A00(448, 57, 70));
                clazz = Boolean.TYPE;
                clazz2 = Long.TYPE;
                clazz3 = Integer.TYPE;
            } catch (Exception e8) {
                e = e8;
            }
            try {
                arrayList.add(size, (InterfaceC1259Yq) cls.getConstructor(clazz, clazz2, Handler.class, InterfaceC1727h8.class, clazz3, clazz3).newInstance(true, Long.valueOf(j10), handler, interfaceC1727h8, 50, 5));
                Log.i(A00(0, 23, 44), A00(243, 27, 120));
            } catch (Exception e10) {
                e = e10;
                throw new RuntimeException(A00(127, 33, 37), e);
            }
        } catch (ClassNotFoundException unused) {
        }
    }

    private final void A03(Context context, TO to, RV[] rvArr, Handler handler, InterfaceC1086Rp interfaceC1086Rp, int extensionRendererIndex, ArrayList<InterfaceC1259Yq> arrayList) {
        int extensionRendererIndex2;
        int extensionRendererIndex3;
        String A00 = A00(0, 23, 44);
        arrayList.add(new C0V(context, C0954Mg.A0S, new C0951Md(null, false), ZS.A00, to, false, false, false, handler, interfaceC1086Rp, RN.A02(context), rvArr));
        if (extensionRendererIndex == 0) {
            return;
        }
        int size = arrayList.size();
        if (extensionRendererIndex == 2) {
            size--;
        }
        try {
            extensionRendererIndex2 = size + 1;
            try {
                arrayList.add(size, (InterfaceC1259Yq) Class.forName(A00(389, 59, 21)).getConstructor(Handler.class, InterfaceC1086Rp.class, RV[].class).newInstance(handler, interfaceC1086Rp, rvArr));
                Log.i(A00, A00(215, 28, 113));
            } catch (ClassNotFoundException unused) {
                size = extensionRendererIndex2;
                extensionRendererIndex2 = size;
                Constructor<?> constructor = Class.forName(A00(330, 59, 73)).getConstructor(Handler.class, InterfaceC1086Rp.class, RV[].class);
                extensionRendererIndex3 = extensionRendererIndex2 + 1;
                arrayList.add(extensionRendererIndex2, (InterfaceC1259Yq) constructor.newInstance(handler, interfaceC1086Rp, rvArr));
                Log.i(A00, A00(187, 28, 19));
                try {
                    Constructor<?> constructor2 = Class.forName(A00(270, 60, 125)).getConstructor(Handler.class, InterfaceC1086Rp.class, RV[].class);
                } catch (Exception e8) {
                    e = e8;
                }
                try {
                    arrayList.add(extensionRendererIndex3, (InterfaceC1259Yq) constructor2.newInstance(handler, interfaceC1086Rp, rvArr));
                    Log.i(A00, A00(160, 27, 45));
                } catch (Exception e10) {
                    e = e10;
                    throw new RuntimeException(A00(23, 36, 114), e);
                }
            } catch (Exception e11) {
                e = e11;
                throw new RuntimeException(A00(93, 34, 23), e);
            }
        } catch (ClassNotFoundException unused2) {
        } catch (Exception e12) {
            e = e12;
        }
        try {
            Constructor<?> constructor3 = Class.forName(A00(330, 59, 73)).getConstructor(Handler.class, InterfaceC1086Rp.class, RV[].class);
            extensionRendererIndex3 = extensionRendererIndex2 + 1;
        } catch (ClassNotFoundException unused3) {
        } catch (Exception e13) {
            e = e13;
        }
        try {
            try {
                arrayList.add(extensionRendererIndex2, (InterfaceC1259Yq) constructor3.newInstance(handler, interfaceC1086Rp, rvArr));
                Log.i(A00, A00(187, 28, 19));
            } catch (ClassNotFoundException unused4) {
                extensionRendererIndex2 = extensionRendererIndex3;
                extensionRendererIndex3 = extensionRendererIndex2;
                Constructor<?> constructor22 = Class.forName(A00(270, 60, 125)).getConstructor(Handler.class, InterfaceC1086Rp.class, RV[].class);
                arrayList.add(extensionRendererIndex3, (InterfaceC1259Yq) constructor22.newInstance(handler, interfaceC1086Rp, rvArr));
                Log.i(A00, A00(160, 27, 45));
            } catch (Exception e14) {
                e = e14;
                throw new RuntimeException(A00(59, 34, 40), e);
            }
            Constructor<?> constructor222 = Class.forName(A00(270, 60, 125)).getConstructor(Handler.class, InterfaceC1086Rp.class, RV[].class);
            arrayList.add(extensionRendererIndex3, (InterfaceC1259Yq) constructor222.newInstance(handler, interfaceC1086Rp, rvArr));
            Log.i(A00, A00(160, 27, 45));
        } catch (ClassNotFoundException unused5) {
        }
    }

    private final void A04(Context context, InterfaceC1273Ze interfaceC1273Ze, Looper looper, int i10, ArrayList<InterfaceC1259Yq> arrayList) {
        arrayList.add(new C04250z(interfaceC1273Ze, looper));
    }

    private final void A05(Context context, InterfaceC1460cm interfaceC1460cm, Looper looper, int i10, ArrayList<InterfaceC1259Yq> arrayList) {
        arrayList.add(new C04220v(interfaceC1460cm, looper, this.A00));
    }

    private final RV[] A06() {
        return new RV[0];
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1058Qm
    public final InterfaceC1259Yq[] A5O(Handler handler, InterfaceC1727h8 interfaceC1727h8, InterfaceC1086Rp interfaceC1086Rp, InterfaceC1460cm interfaceC1460cm, InterfaceC1273Ze interfaceC1273Ze, TO to) {
        TO to2 = to;
        if (to2 == null) {
            to2 = this.A04;
        }
        ArrayList<InterfaceC1259Yq> arrayList = new ArrayList<>();
        A02(this.A03, to2, this.A02, handler, interfaceC1727h8, this.A01, arrayList);
        A03(this.A03, to2, A06(), handler, interfaceC1086Rp, this.A01, arrayList);
        A05(this.A03, interfaceC1460cm, handler.getLooper(), this.A01, arrayList);
        A04(this.A03, interfaceC1273Ze, handler.getLooper(), this.A01, arrayList);
        return (InterfaceC1259Yq[]) arrayList.toArray(new InterfaceC1259Yq[arrayList.size()]);
    }
}
