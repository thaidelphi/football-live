package z4;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: HttpUtil.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f33499a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f33500b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long a(java.lang.String r9, java.lang.String r10) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r1 = "]"
            java.lang.String r2 = "HttpUtil"
            if (r0 != 0) goto L26
            long r3 = java.lang.Long.parseLong(r9)     // Catch: java.lang.NumberFormatException -> Lf
            goto L28
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Unexpected Content-Length ["
            r0.append(r3)
            r0.append(r9)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            a5.t.c(r2, r0)
        L26:
            r3 = -1
        L28:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto La4
            java.util.regex.Pattern r0 = z4.g0.f33499a
            java.util.regex.Matcher r0 = r0.matcher(r10)
            boolean r5 = r0.matches()
            if (r5 == 0) goto La4
            r5 = 2
            java.lang.String r5 = r0.group(r5)     // Catch: java.lang.NumberFormatException -> L8d
            java.lang.Object r5 = a5.a.e(r5)     // Catch: java.lang.NumberFormatException -> L8d
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.NumberFormatException -> L8d
            long r5 = java.lang.Long.parseLong(r5)     // Catch: java.lang.NumberFormatException -> L8d
            r7 = 1
            java.lang.String r0 = r0.group(r7)     // Catch: java.lang.NumberFormatException -> L8d
            java.lang.Object r0 = a5.a.e(r0)     // Catch: java.lang.NumberFormatException -> L8d
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L8d
            long r7 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L8d
            long r5 = r5 - r7
            r7 = 1
            long r5 = r5 + r7
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L64
            r3 = r5
            goto La4
        L64:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto La4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L8d
            r0.<init>()     // Catch: java.lang.NumberFormatException -> L8d
            java.lang.String r7 = "Inconsistent headers ["
            r0.append(r7)     // Catch: java.lang.NumberFormatException -> L8d
            r0.append(r9)     // Catch: java.lang.NumberFormatException -> L8d
            java.lang.String r9 = "] ["
            r0.append(r9)     // Catch: java.lang.NumberFormatException -> L8d
            r0.append(r10)     // Catch: java.lang.NumberFormatException -> L8d
            r0.append(r1)     // Catch: java.lang.NumberFormatException -> L8d
            java.lang.String r9 = r0.toString()     // Catch: java.lang.NumberFormatException -> L8d
            a5.t.i(r2, r9)     // Catch: java.lang.NumberFormatException -> L8d
            long r9 = java.lang.Math.max(r3, r5)     // Catch: java.lang.NumberFormatException -> L8d
            r3 = r9
            goto La4
        L8d:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Unexpected Content-Range ["
            r9.append(r0)
            r9.append(r10)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            a5.t.c(r2, r9)
        La4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.g0.a(java.lang.String, java.lang.String):long");
    }

    public static long b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f33500b.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) a5.a.e(matcher.group(1)));
        }
        return -1L;
    }
}
