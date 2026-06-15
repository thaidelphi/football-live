package w4;

import a5.c0;
import a5.p0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n3.h2;
/* compiled from: WebvttParserUtil.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f32363a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher a(c0 c0Var) {
        String o10;
        while (true) {
            String o11 = c0Var.o();
            if (o11 == null) {
                return null;
            }
            if (f32363a.matcher(o11).matches()) {
                do {
                    o10 = c0Var.o();
                    if (o10 != null) {
                    }
                } while (!o10.isEmpty());
            } else {
                Matcher matcher = f.f32336a.matcher(o11);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(c0 c0Var) {
        String o10 = c0Var.o();
        return o10 != null && o10.startsWith("WEBVTT");
    }

    public static float c(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) throws NumberFormatException {
        String[] S0 = p0.S0(str, "\\.");
        long j10 = 0;
        for (String str2 : p0.R0(S0[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (S0.length == 2) {
            j11 += Long.parseLong(S0[1]);
        }
        return j11 * 1000;
    }

    public static void e(c0 c0Var) throws h2 {
        int e8 = c0Var.e();
        if (b(c0Var)) {
            return;
        }
        c0Var.K(e8);
        throw h2.a("Expected WEBVTT. Got " + c0Var.o(), null);
    }
}
