package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.ironsource.j3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.8c  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C06068c {
    public static AtomicInteger A00;
    public static byte[] A01;
    public static String[] A02 = {"Y", "xyQF3sxjnp2qUSvJDNu5P0iyyc584Vpd", "idh0g523ELVLwEFfu1u5qrhcL3DPrNZC", "UJ0fDp2QsgF1WBSdDofKnf2EwbpjWzp9", "LsjKEz1u6vy", "QA8fX7ramcT9ifSsWPTVo7ChqvJDDBqT", "HHR99srKdCFKOrgMnrhL9AMY8z42dkOr", "PWBGS5sCKwM35N3BbQj09sXNColJxvDn"};
    public static final Object A03;
    public static final String A04;
    public static final Map<String, Integer> A05;
    public static final Set<String> A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C06088e A01(String str, AnonymousClass85 anonymousClass85, Map<String, String> map) {
        C06088e c06088e = null;
        try {
            c06088e = new C06088e(anonymousClass85.A09().A01(), anonymousClass85.A09().A02(), new C8O(str, map, true).A02());
            A0C(c06088e, anonymousClass85);
            return c06088e;
        } catch (Exception unused) {
            return c06088e;
        }
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 106);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static JSONArray A04(AnonymousClass85 anonymousClass85, int i10) {
        C8Z A08;
        JSONArray jSONArray = new JSONArray();
        synchronized (A03) {
            FileInputStream fileInputStream = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            try {
                if (new File(anonymousClass85.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 27), anonymousClass85)).exists()) {
                    fileInputStream = anonymousClass85.openFileInput(ProcessUtils.getProcessSpecificName(A02(281, 9, 27), anonymousClass85));
                    inputStreamReader = new InputStreamReader(fileInputStream);
                    bufferedReader = new BufferedReader(inputStreamReader);
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null || i10 == 0) {
                            break;
                        }
                        JSONObject jSONObject = new JSONObject(readLine);
                        if (!jSONObject.has(A02(260, 7, 82))) {
                            jSONObject.put(A02(260, 7, 82), String.valueOf(0));
                        }
                        String string = jSONObject.getString(A02(343, 2, 110));
                        if (!A06.contains(string)) {
                            int i11 = jSONObject.getInt(A02(260, 7, 82));
                            if (A05.containsKey(string)) {
                                jSONObject.put(A02(260, 7, 82), String.valueOf(A05.get(string)));
                            } else {
                                A0E(string, i11);
                            }
                            jSONArray.put(jSONObject);
                            if (i10 > 0) {
                                i10--;
                            }
                        }
                    }
                }
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e8) {
                        e = e8;
                        A08 = anonymousClass85.A08();
                        A08.A48(e);
                        return jSONArray;
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException | JSONException e10) {
                anonymousClass85.A08().A48(e10);
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e11) {
                        e = e11;
                        A08 = anonymousClass85.A08();
                        A08.A48(e);
                        return jSONArray;
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            }
        }
        return jSONArray;
    }

    public static void A06() {
        A01 = new byte[]{-73, -24, -36, 0, 46, 43, 44, -1, 43, 49, 42, 48, 33, 46, -10, -36, -73, -43, -30, -101, -24, -108, -40, -39, -32, -39, -24, -39, -108, -40, -39, -42, -23, -37, -108, -39, -22, -39, -30, -24, -25, -108, -38, -35, -32, -39, -94, 30, 60, 73, 2, 79, -5, 63, 64, 71, 64, 79, 64, -5, 65, 68, 71, 64, -4, 25, 26, 23, 42, 28, 52, 37, 39, 26, 27, -43, 6, -11, -2, 4, -45, -1, 5, -2, 4, 3, -1, -2, 50, 33, 38, 34, 43, 32, 34, 11, 34, 49, 52, 44, 47, 40, -36, 1, -2, -13, -15, -84, -16, -15, -18, 1, -13, -84, -15, 2, -15, -6, 0, -1, -84, -14, -11, -8, -15, -70, -106, -46, -11, -8, -15, -84, -1, -11, 6, -15, -58, -84, 32, 56, 54, 61, 61, 50, 49, -19, 50, 67, 50, 59, 65, 64, -5, 1, 25, 23, 30, 30, 23, 28, 21, -50, 17, 29, 32, 32, 35, 30, 34, 19, 18, -50, 18, 19, 16, 35, 21, -50, 19, 36, 19, 28, 34, -50, 26, 23, 28, 19, -36, 44, 74, 81, 65, 70, 63, -8, 76, 71, -8, 77, 72, 60, 57, 76, 61, -8, 77, 70, 74, 61, 59, 71, 74, 60, 61, 60, -8, 60, 61, 58, 77, 63, 36, 71, 63, 29, 78, 61, 70, 76, 6, -8, 57, 60, 60, 65, 70, 63, -8, 76, 71, -8, 39, 70, 63, 71, 65, 70, 63, 29, 78, 61, 70, 76, 6, 36, 57, 42, 50, 53, 29, 48, 48, 33, 41, 44, 48, -13, -16, 3, -16, -45, -44, -50, -37, -34, -42, -42, -40, -35, -42, -23, -22, -25, -6, -20, -15, -12, -20, -8, 34, 37, 42, 37, 47, 36, 33, 32, -36, 33, 50, 33, 42, 48, -36, 47, 36, 43, 49, 40, 32, -36, 42, 43, 48, -36, 30, 33, -36, 49, 44, 32, 29, 48, 33, 32, -36, 48, 43, -36, 11, 42, 35, 43, 37, 42, 35, 1, 50, 33, 42, 48, -22, 65, 60, -7, -21, -7, -7, -17, -11, -12, -27, -17, -22, -13, -27, -13, -13, -23, -17, -18, -33, -12, -23, -19, -27, 49, 41, 39, 46, 46, 35, 34, 3, 52, 35, 44, 50, 49, -34, -5, -34, -34, -32, -51, -33, -28, -37, -48, 19, 21, 2, 20, 25, 16, 5, -1, 3, 15, 4, 5, 70, 59, 63, 55, 74, 79, 70, 59};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0G(AnonymousClass85 anonymousClass85) {
        JSONArray jSONArray = new JSONArray();
        synchronized (A03) {
            int i10 = 0;
            FileInputStream fileInputStream = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            FileOutputStream fileOutputStream = null;
            try {
                if (new File(anonymousClass85.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 27), anonymousClass85)).exists()) {
                    fileInputStream = anonymousClass85.openFileInput(ProcessUtils.getProcessSpecificName(A02(281, 9, 27), anonymousClass85));
                    inputStreamReader = new InputStreamReader(fileInputStream);
                    bufferedReader = new BufferedReader(inputStreamReader);
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        JSONObject jSONObject = new JSONObject(readLine);
                        String string = jSONObject.getString(A02(343, 2, 110));
                        if (!A06.contains(string)) {
                            if (A05.containsKey(string)) {
                                Integer num = A05.get(string);
                                Integer valueOf = Integer.valueOf(num != null ? num.intValue() : 0);
                                int A022 = AbstractC06439o.A02(anonymousClass85);
                                if (A022 <= -1 || valueOf.intValue() <= A022 - 1) {
                                    jSONObject.put(A02(260, 7, 82), String.valueOf(valueOf));
                                    jSONArray.put(jSONObject);
                                } else {
                                    A0D(string);
                                    i10++;
                                }
                            } else {
                                jSONArray.put(jSONObject);
                            }
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    int length = jSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        sb.append(jSONArray.getJSONObject(i11).toString()).append('\n');
                    }
                    fileOutputStream = anonymousClass85.openFileOutput(ProcessUtils.getProcessSpecificName(A02(281, 9, 27), anonymousClass85), 0);
                    fileOutputStream.write(sb.toString().getBytes());
                }
                A09(anonymousClass85, A00(anonymousClass85));
                if (i10 > 0) {
                    anonymousClass85.A08().AAu(A02(271, 10, 5), AbstractC06048a.A2Y, new C06058b(A02(138, 15, 99), A02(367, 16, 84) + i10));
                }
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e8) {
                        anonymousClass85.A08().A48(e8);
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                A06.clear();
                A05.clear();
                return true;
            } catch (IOException | JSONException e10) {
                anonymousClass85.A08().A48(e10);
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e11) {
                        anonymousClass85.A08().A48(e11);
                        A06.clear();
                        A05.clear();
                        return false;
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                A06.clear();
                A05.clear();
                return false;
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01fc A[Catch: IOException -> 0x020a, all -> 0x0254, TryCatch #7 {IOException -> 0x020a, blocks: (B:94:0x01ed, B:96:0x01f2, B:98:0x01f7, B:100:0x01fc, B:102:0x0201, B:104:0x0206), top: B:137:0x01ed, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0201 A[Catch: IOException -> 0x020a, all -> 0x0254, TryCatch #7 {IOException -> 0x020a, blocks: (B:94:0x01ed, B:96:0x01f2, B:98:0x01f7, B:100:0x01fc, B:102:0x0201, B:104:0x0206), top: B:137:0x01ed, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0206 A[Catch: IOException -> 0x020a, all -> 0x0254, TRY_LEAVE, TryCatch #7 {IOException -> 0x020a, blocks: (B:94:0x01ed, B:96:0x01f2, B:98:0x01f7, B:100:0x01fc, B:102:0x0201, B:104:0x0206), top: B:137:0x01ed, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0229 A[Catch: IOException -> 0x0241, all -> 0x0254, TryCatch #8 {IOException -> 0x0241, blocks: (B:115:0x0224, B:117:0x0229, B:119:0x022e, B:121:0x0233, B:123:0x0238, B:125:0x023d), top: B:139:0x0224, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x022e A[Catch: IOException -> 0x0241, all -> 0x0254, TryCatch #8 {IOException -> 0x0241, blocks: (B:115:0x0224, B:117:0x0229, B:119:0x022e, B:121:0x0233, B:123:0x0238, B:125:0x023d), top: B:139:0x0224, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0233 A[Catch: IOException -> 0x0241, all -> 0x0254, TryCatch #8 {IOException -> 0x0241, blocks: (B:115:0x0224, B:117:0x0229, B:119:0x022e, B:121:0x0233, B:123:0x0238, B:125:0x023d), top: B:139:0x0224, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0238 A[Catch: IOException -> 0x0241, all -> 0x0254, TryCatch #8 {IOException -> 0x0241, blocks: (B:115:0x0224, B:117:0x0229, B:119:0x022e, B:121:0x0233, B:123:0x0238, B:125:0x023d), top: B:139:0x0224, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x023d A[Catch: IOException -> 0x0241, all -> 0x0254, TRY_LEAVE, TryCatch #8 {IOException -> 0x0241, blocks: (B:115:0x0224, B:117:0x0229, B:119:0x022e, B:121:0x0233, B:123:0x0238, B:125:0x023d), top: B:139:0x0224, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0224 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x005d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f2 A[Catch: IOException -> 0x020a, all -> 0x0254, TryCatch #7 {IOException -> 0x020a, blocks: (B:94:0x01ed, B:96:0x01f2, B:98:0x01f7, B:100:0x01fc, B:102:0x0201, B:104:0x0206), top: B:137:0x01ed, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f7 A[Catch: IOException -> 0x020a, all -> 0x0254, TryCatch #7 {IOException -> 0x020a, blocks: (B:94:0x01ed, B:96:0x01f2, B:98:0x01f7, B:100:0x01fc, B:102:0x0201, B:104:0x0206), top: B:137:0x01ed, outer: #17 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0H(com.facebook.ads.redexgen.X.AnonymousClass85 r17) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C06068c.A0H(com.facebook.ads.redexgen.X.85):boolean");
    }

    static {
        A06();
        A04 = C06068c.class.getName();
        A03 = new Object();
        A06 = Collections.synchronizedSet(new HashSet());
        A05 = Collections.synchronizedMap(new HashMap());
        A00 = new AtomicInteger();
    }

    public static int A00(Context context) {
        return context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 107), context), 0).getInt(A02(75, 10, 38), 0) - A06.size();
    }

    public static JSONArray A03(AnonymousClass85 anonymousClass85) {
        return A04(anonymousClass85, -1);
    }

    public static JSONObject A05(C06088e c06088e) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(A02(343, 2, 110), UUID.randomUUID().toString());
        jSONObject.put(A02(j3.a.b.f17901f, 4, 108), c06088e.A03());
        jSONObject.put(A02(402, 4, 104), C0709Cu.A03(c06088e.A01()));
        jSONObject.put(A02(355, 12, 22), C0709Cu.A03(c06088e.A00()));
        jSONObject.put(A02(345, 10, 28), c06088e.A02());
        jSONObject.put(A02(267, 4, 37), c06088e.A04() != null ? new JSONObject(c06088e.A04()) : new JSONObject());
        jSONObject.put(A02(260, 7, 82), String.valueOf(0));
        return jSONObject;
    }

    public static void A07(Context context) {
        synchronized (A03) {
            File file = new File(context.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 27), context));
            if (file.exists()) {
                file.delete();
            }
            A09(context, 0);
            A06.clear();
            A05.clear();
        }
    }

    public static void A08(Context context) {
        A09(context, context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 107), context), 0).getInt(A02(75, 10, 38), 0) + 1);
    }

    public static void A09(Context context, int i10) {
        int i11 = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 107), context), 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (i10 >= 0) {
            i11 = i10;
        }
        if (A02[1].charAt(3) != 'F') {
            throw new RuntimeException();
        }
        A02[0] = "i";
        edit.putInt(A02(75, 10, 38), i11).apply();
    }

    public static void A0A(AnonymousClass85 anonymousClass85, String str) {
        File file = new File(anonymousClass85.getFilesDir(), str);
        if (file.exists() && !file.delete()) {
            anonymousClass85.A08().A48(new RuntimeException(A02(47, 18, 113)));
        }
    }

    public static void A0B(C1899k0 c1899k0, String str) {
        Integer num = A05.get(str);
        if (num == null) {
            if (c1899k0.A05().AAD()) {
                Log.e(A04, A02(189, 66, 110));
            }
            num = 0;
        } else {
            A05.remove(str);
        }
        Map<String, Integer> map = A05;
        Integer attempt = Integer.valueOf(num.intValue() + 1);
        map.put(str, attempt);
    }

    public static void A0C(C06088e c06088e, AnonymousClass85 anonymousClass85) {
        if (c06088e != null && anonymousClass85 != null) {
            synchronized (A03) {
                try {
                    String processSpecificName = ProcessUtils.getProcessSpecificName(A02(281, 9, 27), anonymousClass85);
                    File file = new File(anonymousClass85.getFilesDir(), processSpecificName);
                    if (file.exists()) {
                        int debugLogFileSizeLimit = AbstractC06439o.A07(anonymousClass85);
                        long length = file.length();
                        if (debugLogFileSizeLimit > 0 && length > debugLogFileSizeLimit) {
                            boolean delete = file.delete();
                            A09(anonymousClass85, 0);
                            A06.clear();
                            A05.clear();
                            if (delete) {
                                Map<String, String> A5Q = anonymousClass85.A04().A5Q();
                                A5Q.put(A02(383, 7, 1), A02(271, 10, 5));
                                A5Q.put(A02(390, 12, 54), String.valueOf((int) IronSourceConstants.IS_CAP_SESSION));
                                A01(A02(102, 36, 34) + length + A02(1, 15, 82) + A00.getAndIncrement(), anonymousClass85, A5Q);
                                return;
                            }
                            String processSpecificName2 = A02(85, 17, 83);
                            Log.e(processSpecificName2, A02(16, 31, 10));
                        }
                    }
                    JSONObject A052 = A05(c06088e);
                    FileOutputStream outputStream = anonymousClass85.openFileOutput(processSpecificName, 32768);
                    outputStream.write((A052.toString() + A02(0, 1, 67)).getBytes());
                    outputStream.close();
                    A08(anonymousClass85);
                } catch (Exception e8) {
                    anonymousClass85.A08().A48(e8);
                }
            }
        }
    }

    public static void A0D(String str) {
        A05.remove(str);
        A06.add(str);
    }

    public static void A0E(String str, int i10) {
        if (!A06.contains(str)) {
            if (A05.containsKey(str)) {
                A05.remove(str);
            }
            A05.put(str, Integer.valueOf(i10));
            return;
        }
        throw new RuntimeException(A02(290, 53, 82));
    }

    public static boolean A0F(AnonymousClass85 anonymousClass85) {
        if (AbstractC06439o.A0O(anonymousClass85)) {
            return A0H(anonymousClass85);
        }
        return A0G(anonymousClass85);
    }

    public static boolean A0I(String str) {
        return A06.contains(str) || A05.containsKey(str);
    }
}
