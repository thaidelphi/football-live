package com.facebook.ads.redexgen.X;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* renamed from: com.facebook.ads.redexgen.X.Jl  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class AsyncTaskC0882Jl extends AsyncTask<String, Void, C0883Jm> {
    public static byte[] A05;
    public static String[] A06 = {"naFNcZuGe", "C9JAYYW4", "8H9N3VrVfLlJ9IUdYMoO", "YylQBw7bkupjVtNcwFivzoGwGcTau", "utPcy8I9vNMcCezdgtn", "ehhspVm5", "7sb5kaLRz1R8p", "m"};
    public static final String A07;
    public static final Set<String> A08;
    public AnonymousClass85 A00;
    public JQ A01;
    public InterfaceC0881Jk A02;
    public Map<String, String> A03;
    public Map<String, String> A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final C0883Jm A00(String... strArr) {
        if (BQ.A02(this)) {
            return null;
        }
        String[] strArr2 = A06;
        if (strArr2[4].length() != strArr2[7].length()) {
            String[] strArr3 = A06;
            strArr3[3] = "OBWBCzNqNMhSgl0vUrcBODbII9DBW";
            strArr3[2] = "nuEeWi2rsMih0JuNdplL";
            try {
                String str = strArr[0];
                if (!TextUtils.isEmpty(str) && !A08.contains(str)) {
                    String A02 = A02(str);
                    if (this.A03 != null && !this.A03.isEmpty()) {
                        for (Map.Entry<String, String> entry : this.A03.entrySet()) {
                            A02 = A03(A02, entry.getKey(), entry.getValue());
                        }
                    }
                    int i10 = 1;
                    while (true) {
                        int i11 = i10 + 1;
                        if (i10 > 2) {
                            return null;
                        }
                        if (A06(A02)) {
                            return new C0883Jm(this.A01);
                        }
                        i10 = i11;
                    }
                }
                return null;
            } catch (Throwable th) {
                BQ.A00(th, this);
                return null;
            }
        }
        throw new RuntimeException();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 103);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{75, 62, 43, 105, 56, 15, 15, 18, 15, 93, 18, 13, 24, 19, 20, 19, 26, 93, 8, 15, 17, 71, 93, 15, 0, 15, 2, 1, 9, 54, 45, 52, 52};
    }

    static {
        A04();
        A07 = AsyncTaskC0882Jl.class.getSimpleName();
        A08 = new HashSet();
        A08.add(A01(0, 1, 15));
        A08.add(A01(29, 4, 63));
    }

    public AsyncTaskC0882Jl(AnonymousClass85 anonymousClass85) {
        this(anonymousClass85, null, null);
    }

    public AsyncTaskC0882Jl(AnonymousClass85 anonymousClass85, Map<String, String> extraData) {
        this(anonymousClass85, extraData, null);
    }

    public AsyncTaskC0882Jl(AnonymousClass85 anonymousClass85, Map<String, String> extraData, Map<String, String> postData) {
        this.A00 = anonymousClass85;
        this.A03 = extraData != null ? new HashMap(extraData) : null;
        this.A04 = postData != null ? new HashMap(postData) : null;
    }

    private String A02(String str) {
        try {
            return A03(str, A01(23, 6, 9), CV.A01(this.A00.A04().A6m()));
        } catch (Exception unused) {
            return str;
        }
    }

    private String A03(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        String A01 = A01(3, 1, 49);
        if (str.contains(A01)) {
            A01 = A01(1, 1, 127);
        }
        StringBuilder append = new StringBuilder().append(str).append(A01).append(str2);
        String prepend = A01(2, 1, 113);
        StringBuilder append2 = append.append(prepend);
        String prepend2 = URLEncoder.encode(str3);
        return append2.append(prepend2).toString();
    }

    private final void A05(C0883Jm response) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            if (this.A02 != null) {
                this.A02.AGK(response);
            }
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    private boolean A06(String str) {
        JQ AG4;
        JR A00 = C0880Jj.A00(this.A00);
        try {
            if (this.A04 == null || this.A04.size() == 0) {
                AG4 = A00.AG4(str, new C0876Jf());
            } else {
                C0876Jf params = new C0876Jf();
                params.A05(this.A04);
                AG4 = A00.AG5(str, params.A08());
            }
            this.A01 = AG4;
        } catch (Exception e8) {
            Log.e(A07, A01(4, 19, 26) + str, e8);
        }
        return this.A01 != null && this.A01.A92() == 200;
    }

    public final void A07(InterfaceC0881Jk interfaceC0881Jk) {
        this.A02 = interfaceC0881Jk;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ C0883Jm doInBackground(String[] strArr) {
        if (BQ.A02(this)) {
            return null;
        }
        try {
            return A00(strArr);
        } catch (Throwable th) {
            BQ.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        if (this.A02 != null) {
            this.A02.AGI();
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(C0883Jm c0883Jm) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A05(c0883Jm);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
