package s4;

import android.text.TextUtils;
import com.ironsource.b9;
/* compiled from: SsaDialogueFormat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f30744a;

    /* renamed from: b  reason: collision with root package name */
    public final int f30745b;

    /* renamed from: c  reason: collision with root package name */
    public final int f30746c;

    /* renamed from: d  reason: collision with root package name */
    public final int f30747d;

    /* renamed from: e  reason: collision with root package name */
    public final int f30748e;

    private b(int i10, int i11, int i12, int i13, int i14) {
        this.f30744a = i10;
        this.f30745b = i11;
        this.f30746c = i12;
        this.f30747d = i13;
        this.f30748e = i14;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static b a(String str) {
        char c10;
        a5.a.a(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < split.length; i14++) {
            String e8 = x5.a.e(split[i14].trim());
            e8.hashCode();
            switch (e8.hashCode()) {
                case 100571:
                    if (e8.equals("end")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3556653:
                    if (e8.equals(b9.h.K0)) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109757538:
                    if (e8.equals("start")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109780401:
                    if (e8.equals("style")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    i11 = i14;
                    break;
                case 1:
                    i13 = i14;
                    break;
                case 2:
                    i10 = i14;
                    break;
                case 3:
                    i12 = i14;
                    break;
            }
        }
        if (i10 == -1 || i11 == -1 || i13 == -1) {
            return null;
        }
        return new b(i10, i11, i12, i13, split.length);
    }
}
