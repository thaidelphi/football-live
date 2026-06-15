package c9;

import kotlin.jvm.internal.n;
/* compiled from: DurationUnitJvm.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
class f {
    public static final double a(double d10, e sourceUnit, e targetUnit) {
        n.f(sourceUnit, "sourceUnit");
        n.f(targetUnit, "targetUnit");
        long convert = targetUnit.b().convert(1L, sourceUnit.b());
        return convert > 0 ? d10 * convert : d10 / sourceUnit.b().convert(1L, targetUnit.b());
    }

    public static final long b(long j10, e sourceUnit, e targetUnit) {
        n.f(sourceUnit, "sourceUnit");
        n.f(targetUnit, "targetUnit");
        return targetUnit.b().convert(j10, sourceUnit.b());
    }

    public static final long c(long j10, e sourceUnit, e targetUnit) {
        n.f(sourceUnit, "sourceUnit");
        n.f(targetUnit, "targetUnit");
        return targetUnit.b().convert(j10, sourceUnit.b());
    }
}
