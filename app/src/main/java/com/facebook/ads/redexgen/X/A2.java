package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi;
import java.util.Arrays;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class A2 extends Handler {
    public static byte[] A04;
    public static String[] A05 = {"4udqyVbWZXJvSc0AlbflTWwfFOYrDaDf", "2YLZ8zu95yTf3T209", "2VJPb0Yp69Qd6undQokFBSWI7sS3NGkE", "Nq0QHebF7aCImjCS8", "WfWu3jj6ZslW8HMUv7JinXygwhejXyBb", "C4PEiJW5iwJTin2vYgbWRkUl1o", "sWvNSKALPWxj", "lJrPEKSWvzui7DJNo"};
    public static final String A06;
    public final Context A00;
    public final AudienceNetworkRemoteServiceApi.MessageHandler A01;
    public final AudienceNetworkRemoteServiceApi.PackageVerifier A02;
    public final C1846j9 A03;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 102);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        byte[] bArr = {-8, -16, -13, -5, -16, -14, -66, -53, -53, -56, -37, -59, -49, -37, -62, -47, -54, -54, -63, -56, -37, -56, -53, -61, -61, -63, -64, -13, -12, -14, -1, -31, -28, -1, -23, -28, -1, -21, -27, -7, 17, 18, 16, 29, 0, 19, 12, 2, 10, 3, 29, 9, 3, 23, -48, -47, -49, -36, -48, -62, -49, -45, -58, -64, -62, -36, -62, -43, -47, -49, -66, -48, 21, 22, 20, 33, 21, 7, 20, 24, 11, 5, 7, 33, 21, 6, 13, 33, 24, 7, 20, 21, 11, 17, 16};
        if (A05[5].length() == 23) {
            throw new RuntimeException();
        }
        A05[5] = "AJ3";
        A04 = bArr;
    }

    static {
        A04();
        A06 = A2.class.getSimpleName();
    }

    public A2(Context context, AudienceNetworkRemoteServiceApi.MessageHandler messageHandler, AudienceNetworkRemoteServiceApi.PackageVerifier packageVerifier) {
        super(Looper.getMainLooper());
        this.A00 = context;
        this.A02 = packageVerifier;
        this.A03 = C1846j9.A00();
        this.A01 = messageHandler;
    }

    public static Bundle A00() {
        Bundle bundle = new Bundle();
        bundle.putString(A03(72, 23, 92), A03(0, 6, 92));
        bundle.putString(A03(54, 18, 23), new JSONObject().toString());
        return bundle;
    }

    private C2017ly A01(C2013lu c2013lu, String str) {
        C2017ly c2017ly = new C2017ly(c2013lu, this.A03, str);
        c2017ly.A0G(c2013lu.A0B(), c2013lu.A07());
        return c2017ly;
    }

    private C2014lv A02(C2001li c2001li, String str) {
        C2014lv c2014lv = new C2014lv(c2001li, this.A03, str);
        c2014lv.A0J(c2001li.A05, c2001li.A02, c2001li.A08);
        return c2014lv;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        String str;
        if (BQ.A02(this)) {
            return;
        }
        try {
            if (this.A01 != null && this.A01.handleMessage(msg)) {
                return;
            }
            Messenger messenger = msg.replyTo;
            if (msg.what == 1) {
                if (messenger != null) {
                    C1846j9.A00().A07(2, null, A00(), messenger);
                    return;
                }
                return;
            }
            String callingAppPackage = msg.getData().getString(A03(27, 13, 58));
            if (callingAppPackage == null) {
                return;
            }
            C1900k1 A052 = C05686p.A05(this.A00, callingAppPackage);
            A052.A0F().AIY(msg.getData().getBoolean(A03(6, 21, 22), false));
            if (this.A02 != null) {
                str = this.A02.verifyPackage(this.A00, msg, msg.getData().getString(A03(40, 14, 88)));
            } else {
                str = null;
            }
            if (str == null) {
                if (messenger != null) {
                    C1846j9.A00().A07(20, callingAppPackage, null, messenger);
                }
                A052.A0F().AH2();
                return;
            }
            switch (msg.what) {
                case 1010:
                    if (messenger == null) {
                        return;
                    }
                    C06549z A042 = C1846j9.A00().A04(callingAppPackage);
                    if (A042 == null) {
                        A042 = C1846j9.A00().A05(callingAppPackage, messenger, str);
                    }
                    C2013lu intAdModel = C3X.A04(A052, msg.getData(), str);
                    if (A042.A00 == null) {
                        A042.A00 = A01(intAdModel, callingAppPackage);
                    } else if (A042.A00 instanceof C2017ly) {
                        ((C2017ly) A042.A00).A0G(intAdModel.A0B(), intAdModel.A07());
                    }
                    C1846j9.A00().A07(1011, callingAppPackage, A00(), messenger);
                    return;
                case 1012:
                case 2002:
                    C1846j9.A00().A08(callingAppPackage);
                    return;
                case 2000:
                    if (messenger == null) {
                        return;
                    }
                    C06549z A043 = C1846j9.A00().A04(callingAppPackage);
                    if (A043 == null) {
                        A043 = C1846j9.A00().A05(callingAppPackage, messenger, str);
                    }
                    C2001li A053 = C3X.A05(A052, msg.getData(), str);
                    if (A043.A00 == null) {
                        A043.A00 = A02(A053, callingAppPackage);
                    } else if (A043.A00 instanceof C2014lv) {
                        String adId = A053.A05;
                        ((C2014lv) A043.A00).A0J(adId, A053.A02, A053.A08);
                    }
                    C1846j9.A00().A07(2001, callingAppPackage, A00(), messenger);
                    return;
                case 2003:
                    C3G A03 = C1846j9.A00().A03(callingAppPackage);
                    if (A03 instanceof C2014lv) {
                        RewardData A01 = C3Y.A01(msg.getData());
                        C2014lv c2014lv = (C2014lv) A03;
                        if (A01 != null) {
                            c2014lv.A0I(A01);
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (Throwable th) {
            if (A05[5].length() == 23) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "nIV8RMn07Ah5";
            strArr[1] = "ZacTvu5dUvRq7FGBf";
            BQ.A00(th, this);
        }
    }
}
